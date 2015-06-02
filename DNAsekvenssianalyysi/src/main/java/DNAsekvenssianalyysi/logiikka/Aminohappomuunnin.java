
package DNAsekvenssianalyysi.logiikka;

import java.util.*;

public class Aminohappomuunnin {
    
    private String lahettiRna = "";
    private String jaollisuusviesti = "";
    private HashMap aminohappoavain = new HashMap<String, String>();

    public Aminohappomuunnin(String syoteRna) {
        if (onkoRna(syoteRna)) {
            this.lahettiRna = tarkistaRnanJaollisuus(syoteRna);
            this.lahettiRna = this.lahettiRna.toUpperCase();
            taytaAminohappoavain();
        }
    }

    private boolean onkoRna(String syoteRna) {
        String sekvenssi = syoteRna.toUpperCase();

        for (int i = 0; i < sekvenssi.length(); i++) {
            if (sekvenssi.charAt(i) != 'A' && sekvenssi.charAt(i) != 'U'
                    && sekvenssi.charAt(i) != 'C' && sekvenssi.charAt(i) != 'G') {
                return false;
            }
        }
        return true;
    }

    public String tarkistaRnanJaollisuus(String syoteRna) {
        String lahettiRna = "";

        switch (syoteRna.length() % 3) {
            case (0):
                lahettiRna = syoteRna;
                this.jaollisuusviesti = "Tasan";
                break;
            case (1):
                for (int i = 0; i < syoteRna.length() - 1; i++) {
                    lahettiRna = lahettiRna + syoteRna.charAt(i);
                    this.jaollisuusviesti = "Yksi liikaa";
                }
                break;
            case (2):
                for (int i = 0; i < syoteRna.length() - 2; i++) {
                    lahettiRna = lahettiRna + syoteRna.charAt(i);
                    this.jaollisuusviesti = "Kaksi liikaa";
                }
                break;
        }
        return lahettiRna;
    }

    public String getLahettiRna() {
        return this.lahettiRna;
    }

    public String getJaollisuusviesti() {
        return this.jaollisuusviesti;
    }

    public String muutaAminohappoketjuksi() {
        String aminohappo = "";
        String aminohappoketju = "";
        String kodoni = "";

        for (int i = 0; i <= this.lahettiRna.length() - 3; i = i + 3) {
            kodoni = this.lahettiRna.substring(i, i + 3); // substring: lopetuskohta ei tule mukaan
            aminohappo = String.valueOf(aminohappoavain.get(kodoni));
            aminohappoketju = aminohappoketju + aminohappo;
        }
        return aminohappoketju;
    }

    private void taytaAminohappoavain() {
        aminohappoavain.put("UUU", "F");
        aminohappoavain.put("UUC", "F");
        aminohappoavain.put("UUA", "L");
        aminohappoavain.put("UUG", "L");
        aminohappoavain.put("CUU", "L");
        aminohappoavain.put("CUC", "L");
        aminohappoavain.put("CUA", "L");
        aminohappoavain.put("CUG", "L");
        aminohappoavain.put("AUU", "I");
        aminohappoavain.put("AUC", "I");
        aminohappoavain.put("AUA", "I");
        aminohappoavain.put("AUG", "M");
        aminohappoavain.put("GUU", "V");
        aminohappoavain.put("GUC", "V");
        aminohappoavain.put("GUA", "V");
        aminohappoavain.put("GUG", "V");
        aminohappoavain.put("UCU", "S");
        aminohappoavain.put("UCC", "S");
        aminohappoavain.put("UCA", "S");
        aminohappoavain.put("UCG", "S");
        aminohappoavain.put("CCU", "P");
        aminohappoavain.put("CCC", "P");
        aminohappoavain.put("CCA", "P");
        aminohappoavain.put("CCG", "P");
        aminohappoavain.put("ACU", "T");
        aminohappoavain.put("ACC", "T");
        aminohappoavain.put("ACA", "T");
        aminohappoavain.put("ACG", "T");
        aminohappoavain.put("GCU", "A");
        aminohappoavain.put("GCC", "A");
        aminohappoavain.put("GCA", "A");
        aminohappoavain.put("GCG", "A");
        aminohappoavain.put("UAU", "Y");
        aminohappoavain.put("UAC", "Y");
        aminohappoavain.put("UAA", ""); // lopetuskodoni, ei aminohappoa
        aminohappoavain.put("UAG", ""); // lopetuskodoni, ei aminohappoa
        aminohappoavain.put("CAU", "H");
        aminohappoavain.put("CAC", "H");
        aminohappoavain.put("CAA", "Q");
        aminohappoavain.put("CAG", "Q");
        aminohappoavain.put("AAU", "N");
        aminohappoavain.put("AAC", "N");
        aminohappoavain.put("AAA", "K");
        aminohappoavain.put("AAG", "K");
        aminohappoavain.put("GAU", "D");
        aminohappoavain.put("GAC", "D");
        aminohappoavain.put("GAA", "E");
        aminohappoavain.put("GAG", "E");
        aminohappoavain.put("UGU", "C");
        aminohappoavain.put("UGC", "C");
        aminohappoavain.put("UGA", ""); // lopetuskodoni, ei aminohappoa
        aminohappoavain.put("UGG", "W");
        aminohappoavain.put("CGU", "R");
        aminohappoavain.put("CGC", "R");
        aminohappoavain.put("CGA", "R");
        aminohappoavain.put("CGG", "R");
        aminohappoavain.put("AGU", "S");
        aminohappoavain.put("AGC", "S");
        aminohappoavain.put("AGA", "R");
        aminohappoavain.put("AGG", "R");
        aminohappoavain.put("AGG", "R");
        aminohappoavain.put("GGU", "G");
        aminohappoavain.put("GGC", "G");
        aminohappoavain.put("GGA", "G");
        aminohappoavain.put("GGG", "G");

    }
}
