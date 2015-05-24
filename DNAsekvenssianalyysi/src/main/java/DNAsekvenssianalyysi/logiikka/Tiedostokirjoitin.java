package DNAsekvenssianalyysi.logiikka;

import java.io.*;

public class Tiedostokirjoitin {

    private PrintWriter kirjoitin;
    
    // konstruktori vaatii vielä korjaamista
    public Tiedostokirjoitin(String tiedostopolku) {
        alustaKirjoitin(tiedostopolku);

    }
    
    private boolean alustaKirjoitin(String tiedostopolku){
        try{
        File raportti = new File(tiedostopolku);
        FileWriter fw = new FileWriter(raportti, true);
        BufferedWriter bw = new BufferedWriter(fw);
        this.kirjoitin = new PrintWriter(bw);
        }
        catch (Exception e){
            return false;
        }
        return true;
    }

    public boolean kirjoitaSyoteSekvenssi(String sekvenssi) {
        try {
            this.kirjoitin.append("Syötetty DNA-sekvenssi:\n");
            this.kirjoitin.append(sekvenssi);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean kirjoitaSekvenssinPituus(int pituus){
        try{
            this.kirjoitin.append("DNA-sekvenssin pituus: "+ pituus);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
    
    public boolean kirjoitaEmasFrekvenssit(int frekvenssiA, int frekvenssiT,
            int frekvenssiC, int frekvenssiG){
        try{
            this.kirjoitin.append("Emäsfrekvenssit:\n");
            this.kirjoitin.append("A: "+ frekvenssiA);
            this.kirjoitin.append("T: " + frekvenssiT);
            this.kirjoitin.append("C: " + frekvenssiC);
            this.kirjoitin.append("G: "+ frekvenssiG);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
    
    public boolean kirjoitaGCOsuus(double osuus){
        try{
            this.kirjoitin.append("GC-osuus: "+ osuus);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
    
    public boolean kirjoitaPyrimidiiniPuriiniSuhde(String suhdeluku){
        try{
            this.kirjoitin.append("Pyrimidiini-puriinisuhde: ");
            this.kirjoitin.append(suhdeluku);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
    
    public boolean kirjoitaVastinjuoste(String vastinjuoste){
        try{
            this.kirjoitin.append("Syötetyn DNA-sekvenssin vastinjuoste:\n");
            this.kirjoitin.append(vastinjuoste);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
    
    public boolean kirjoitaLahettiRna(String lahettiRna){
        try{
            this.kirjoitin.append("Syötettyä DNA-sekvenssiä vastaava lähetti-RNA\n");
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
    
    public boolean kirjoitaJaollisuusviesti(String viesti){
        try{
            switch(viesti){
                case("Tasan"):
                    this.kirjoitin.append("Lähetti-RNA on kolmella jaollinen. "
                            + "Kaikki emäkset on muutettu aminohapoiksi.");
                    break;
                case("Yksi liikaa"):
                    this.kirjoitin.append("Lähetti-RNA ei ole kolmella jaollinen. "
                            + "Viimeinen emäs on jätetty pois.");
                    break;
                case("Kaksi liikaa"):
                    this.kirjoitin.append("Lähetti-RNA ei ole kolmella jaollinen. "
                            + "Kaksi viimeistä emästä on jätetty pois.");
                    break;
            }}
            catch(Exception e){
                    return false;
                    }
        return true;
    }
    
    public boolean kirjoitaAminohappoketju(String ketju){
        try{
            this.kirjoitin.append("Lähetti-RNA:ta vastaava aminohappoketju:\n");
            this.kirjoitin.append(ketju);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
    
    public boolean suljeTiedosto(){
        try{
            this.kirjoitin.close();
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
    
    
}
