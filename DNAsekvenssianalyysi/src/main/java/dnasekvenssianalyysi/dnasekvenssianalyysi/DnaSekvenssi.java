package dnasekvenssianalyysi.dnasekvenssianalyysi;

import javax.swing.*;

public class DnaSekvenssi {

    private String DnaSekvenssi = "";
    private int frekvenssiA = 0;
    private int frekvenssiT = 0;
    private int frekvenssiC = 0;
    private int frekvenssiG = 0;

    public DnaSekvenssi(String syoteSekvenssi) {

        if (onkoDnaSekvenssi(syoteSekvenssi)) {
            DnaSekvenssi = syoteSekvenssi.toUpperCase();
            frekvenssiA = laskeEmasFrekvenssi('A', DnaSekvenssi);
            frekvenssiT = laskeEmasFrekvenssi('T', DnaSekvenssi);
            frekvenssiC = laskeEmasFrekvenssi('C', DnaSekvenssi);
            frekvenssiG = laskeEmasFrekvenssi('G', DnaSekvenssi);
        } else {
            JOptionPane.showMessageDialog(null, "Et syöttänyt DNA-sekvenssiä");
        }
    }

    public boolean onkoDnaSekvenssi(String syoteSekvenssi) {

        String sekvenssi = syoteSekvenssi.toUpperCase();

        for (int i = 0; i < sekvenssi.length(); i++) {
            if (sekvenssi.charAt(i) != 'A' && sekvenssi.charAt(i) != 'T'
                    && sekvenssi.charAt(i) != 'C' && sekvenssi.charAt(i) != 'G') {
                return false;
            }
        }
        return true;
    }

    public int laskeEmasFrekvenssi(char emas, String sekvenssi) {
        int frekvenssilaskuri = 0;

        for (int i = 0; i < sekvenssi.length(); i++) {
            if (sekvenssi.charAt(i) == emas) {
                frekvenssilaskuri = frekvenssilaskuri + 1;
            }
        }
        return frekvenssilaskuri;
    }

    public String getDnaSekvenssi() {
        return this.DnaSekvenssi;
    }

    public int getFrekvenssiA() {
        return this.frekvenssiA;
    }

    public int getFrekvenssiT() {
        return this.frekvenssiT;
    }

    public int getFrekvenssiC() {
        return this.frekvenssiC;
    }

    public int getFrekvenssiG() {
        return this.frekvenssiG;
    }

    public int laskeSekvenssinPituus() {
        return this.DnaSekvenssi.length();
    }

    public double laskeGCOsuus(String sekvenssi) {
        return (1.0 * this.frekvenssiG + this.frekvenssiC) / this.DnaSekvenssi.length()*100;
    }
    
    public String laskePyrimidiiniPuriiniSuhde(){
        return (frekvenssiC+frekvenssiT) + ":" + (frekvenssiA+frekvenssiG);
    }
    
    public String muunnaVastinjuosteeksi(){
        String vastinjuoste = this.DnaSekvenssi.replace("A", "T");
        vastinjuoste = vastinjuoste.replace("T", "A");
        vastinjuoste = vastinjuoste.replace("C", "G");
        vastinjuoste = vastinjuoste.replace("G", "C");
        
        return vastinjuoste;
    }
    
    public String muunnaLahettiRnaksi(){
        String lahettiRna = this.DnaSekvenssi.replace("A", "U");
        lahettiRna = lahettiRna.replace("T", "A");
        lahettiRna = lahettiRna.replace("C", "G");
        lahettiRna = lahettiRna.replace("G", "C");
        
        return lahettiRna;
    }
    
    public String muunnaAminohappoKetjuksi(){
        
    }
}
