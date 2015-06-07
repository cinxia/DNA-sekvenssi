package DNAsekvenssianalyysi.logiikka;

/**
 * Luokka ohjaa tiedoston lukemista ja kirjoittamista sekä DNA-sekvenssin analysointia.
 */
public class Ohjausolio {

    private DnaSekvenssi dna;
    private Tiedostokirjoitin kirjoitin;
    private boolean tiedostonLukuOk = true;
    private boolean tiedostonLuontiOk;

    /**
     * Konstruktori lukee ja tallentaa DNA-sekvenssin.
     * 
     * @param syote
     * @param luettavaTiedosto
     * @param kirjoitettavaTiedosto 
     */
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

    /**
     * Metodi tarkistaa onko DNA-sekvenssiin tallennettu jotakin.
     * @return onko tallennettu
     */
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

    /**
     * Metodi käskee kirjoittamaan tiedostoon syötetyn DNA-sekvenssin.
     * 
     * @return onnistuiko
     */
    public boolean lisaaSyoteSekvenssi() {
        return this.kirjoitin.kirjoitaSyoteSekvenssi(this.dna.getDnaSekvenssi());
    }

    /**
     * Metodi käskee kirjoittamaan tiedostoon sekvenssin pituuden.
     * 
     * @return onnistuiko
     */
    public boolean lisaaSekvenssinPituus() {
        return this.kirjoitin.kirjoitaSekvenssinPituus(this.dna.laskeSekvenssinPituus());
    }

    /**
     * Metodi käskee kirjoittamaan tiedostoon emäsfrekvenssit.
     * 
     * @return onnistuiko
     */
    public boolean lisaaEmasFrekvenssit() {
        return this.kirjoitin.kirjoitaEmasFrekvenssit(this.dna.getFrekvenssiA(),
                this.dna.getFrekvenssiT(), this.dna.getFrekvenssiC(), this.dna.getFrekvenssiG());
    }

    /**
     * Metodi käskee kirjoittamaan tiedostoon GC-osuuden.
     * 
     * @return onnistuiko
     */
    public boolean lisaaGCOsuus() {
        return this.kirjoitin.kirjoitaGCOsuus(this.dna.laskeGCOsuus());
    }

    /**
     * Metodi käskee kirjoittamaan tiedostoon pyrimidiini-puriinisuhteen.
     * 
     * @return onnistuiko
     */
    public boolean lisaaPyrimidiiniPuriiniSuhde() {
        return this.kirjoitin.kirjoitaPyrimidiiniPuriiniSuhde(this.dna.laskePyrimidiiniPuriiniSuhde());
    }

    /**
     * Metodi käskee kirjoittamaan tiedostoon vastinjuosteen.
     * 
     * @return onnistuiko
     */
    public boolean lisaaVastinjuoste() {
        return this.kirjoitin.kirjoitaVastinjuoste(this.dna.muunnaVastinjuosteeksi());
    }

    /**
     * Metodi käskee kirjoittamaan tiedostoon DNA-sekvenssiä vastaavaan lähetti-RNA:n.
     * 
     * @return onnistuiko
     */
    public boolean lisaaLahettiRna() {
        return this.kirjoitin.kirjoitaLahettiRna(this.dna.muunnaLahettiRnaksi());
    }

    /**
     * Metodi käskee kirjoittamaan tiedostoon lähetti-RNA:ta vastaavan aminohappoketjun ja 
     * tiedon lähetti-RNA:n jaollisuudesta.
     * 
     * @return onnistuiko
     */
    public boolean lisaaAminohappoketju() {
        Aminohappomuunnin muunnin = new Aminohappomuunnin(dna.muunnaLahettiRnaksi());
        if (!this.kirjoitin.kirjoitaJaollisuusviesti(muunnin.getJaollisuusviesti())) {
            return false;
        } else {
            return this.kirjoitin.kirjoitaAminohappoketju(muunnin.muutaAminohappoketjuksi());
        }
    }

    /**
     * Metodi sulkee tiedostokirjoittimen.
     * 
     * @return onnistuiko
     */
    public boolean suljeKirjoitin() {
        return this.kirjoitin.suljeTiedosto();
    }

}
