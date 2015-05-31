package DNAsekvenssianalyysi.logiikka;

public class Ohjausolio {

    private DnaSekvenssi dna;
    private Tiedostokirjoitin kirjoitin;
    private boolean tiedostonLukuOk;
    private boolean tiedostonLuontiOk;

    public Ohjausolio(String syote, String luettavaTiedosto, String kirjoitettavaTiedosto) {

        if (syote == "") {
            this.dna = new DnaSekvenssi(lueSekvenssiTiedostosta(luettavaTiedosto));
        } else {
            this.dna = new DnaSekvenssi(syote);
        }

        this.kirjoitin = new Tiedostokirjoitin(kirjoitettavaTiedosto);
        this.tiedostonLuontiOk = kirjoitin.getLuonninOnnistuminen();
    }

    private String lueSekvenssiTiedostosta(String tiedosto) {
        Tiedostonlukija lukija = new Tiedostonlukija(tiedosto);
        if (!lukija.getTiedostoOk()) {
            this.tiedostonLukuOk = false;
            return "";
        } else {
            this.tiedostonLukuOk = true;
            return lukija.getSekvenssi();
        }
    }

    public boolean dnaSekvenssiKunnossa() {
        if (this.dna.getDnaSekvenssi() == "") {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean getTiedostonLuontiOk(){
        return this.tiedostonLuontiOk;
    }
    
    public boolean getTiedostonLukuOk(){
        return this.tiedostonLukuOk;
    }

    public boolean lisaaSyoteSekvenssi() {
        return this.kirjoitin.kirjoitaSyoteSekvenssi(this.dna.getDnaSekvenssi());
    }

    public boolean lisaaSekvenssinPituus() {
        return this.kirjoitin.kirjoitaSekvenssinPituus(this.dna.laskeSekvenssinPituus());
    }

    public boolean lisaaEmasFrekvenssit() {
        return this.kirjoitin.kirjoitaEmasFrekvenssit(this.dna.getFrekvenssiA(),
                this.dna.getFrekvenssiT(), this.dna.getFrekvenssiC(), this.dna.getFrekvenssiG());
    }

    public boolean lisaaGCOsuus() {
        return this.kirjoitin.kirjoitaGCOsuus(this.dna.laskeGCOsuus());
    }

    public boolean lisaaPyrimidiiniPuriiniSuhde() {
        return this.kirjoitin.kirjoitaPyrimidiiniPuriiniSuhde(this.dna.laskePyrimidiiniPuriiniSuhde());
    }

    public boolean lisaaVastinjuoste() {
        return this.kirjoitin.kirjoitaVastinjuoste(this.dna.muunnaVastinjuosteeksi());
    }

    public boolean lisaaLahettiRna() {
        return this.kirjoitin.kirjoitaLahettiRna(this.dna.muunnaLahettiRnaksi());
    }

    public boolean lisaaAminohappoketju() {
        Aminohappomuunnin muunnin = new Aminohappomuunnin(dna.muunnaLahettiRnaksi());
        if (!this.kirjoitin.kirjoitaJaollisuusviesti(muunnin.getJaollisuusviesti())) {
            return false;
        } else {
            return this.kirjoitin.kirjoitaAminohappoketju(muunnin.muutaAminohappoketjuksi());
        }
    }

    public boolean suljeKirjoitin() {
        return this.kirjoitin.suljeTiedosto();
    }

}
