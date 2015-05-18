package sekvenssi;

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

    public boolean onkoRna(String syoteRna) {
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
        aminohappoavain.put("UUU", "Phe");
        aminohappoavain.put("UUC", "Phe");
        aminohappoavain.put("UUA", "Leu");
        aminohappoavain.put("UUG", "Leu");
        aminohappoavain.put("CUU", "Leu");
        aminohappoavain.put("CUC", "Leu");
        aminohappoavain.put("CUA", "Leu");
        aminohappoavain.put("CUG", "Leu");
        aminohappoavain.put("AUU", "Ile");
        aminohappoavain.put("AUC", "Ile");
        aminohappoavain.put("AUA", "Ile");
        aminohappoavain.put("AUG", "Met");
        aminohappoavain.put("GUU", "Val");
        aminohappoavain.put("GUC", "Val");
        aminohappoavain.put("GUA", "Val");
        aminohappoavain.put("GUG", "Val");
        aminohappoavain.put("UCU", "Ser");
        aminohappoavain.put("UCC", "Ser");
        aminohappoavain.put("UCA", "Ser");
        aminohappoavain.put("UCG", "Ser");
        aminohappoavain.put("CCU", "Pro");
        aminohappoavain.put("CCC", "Pro");
        aminohappoavain.put("CCA", "Pro");
        aminohappoavain.put("CCG", "Pro");
        aminohappoavain.put("ACU", "Thr");
        aminohappoavain.put("ACC", "Thr");
        aminohappoavain.put("ACA", "Thr");
        aminohappoavain.put("ACG", "Thr");
        aminohappoavain.put("GCU", "Ala");
        aminohappoavain.put("GCC", "Ala");
        aminohappoavain.put("GCA", "Ala");
        aminohappoavain.put("GCG", "Ala");
        aminohappoavain.put("UAU", "Tyr");
        aminohappoavain.put("UAC", "Tyr");
        aminohappoavain.put("UAA", ""); // lopetuskodoni, ei aminohappoa
        aminohappoavain.put("UAG", ""); // lopetuskodoni, ei aminohappoa
        aminohappoavain.put("CAU", "His");
        aminohappoavain.put("CAC", "His");
        aminohappoavain.put("CAA", "Gln");
        aminohappoavain.put("CAG", "Gln");
        aminohappoavain.put("AAU", "Asn");
        aminohappoavain.put("AAC", "Asn");
        aminohappoavain.put("AAA", "Lys");
        aminohappoavain.put("AAG", "Lys");
        aminohappoavain.put("GAU", "Asp");
        aminohappoavain.put("GAC", "Asp");
        aminohappoavain.put("GAA", "Glu");
        aminohappoavain.put("GAG", "Glu");
        aminohappoavain.put("UGU", "Cys");
        aminohappoavain.put("UGC", "Cys");
        aminohappoavain.put("UGA", ""); // lopetuskodoni, ei aminohappoa
        aminohappoavain.put("UGG", "Trp");
        aminohappoavain.put("CGU", "Arg");
        aminohappoavain.put("CGC", "Arg");
        aminohappoavain.put("CGA", "Arg");
        aminohappoavain.put("CGG", "Arg");
        aminohappoavain.put("AGU", "Ser");
        aminohappoavain.put("AGC", "Ser");
        aminohappoavain.put("AGA", "Arg");
        aminohappoavain.put("AGG", "Arg");
        aminohappoavain.put("AGG", "Arg");
        aminohappoavain.put("GGU", "Gly");
        aminohappoavain.put("GGC", "Gly");
        aminohappoavain.put("GGA", "Gly");
        aminohappoavain.put("GGG", "Gly");

    }
}
