
package DNAsekvenssianalyysi.logiikka;


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
        }

    }

    private boolean onkoDnaSekvenssi(String syoteSekvenssi) {

        String sekvenssi = syoteSekvenssi.toUpperCase();
        if (syoteSekvenssi.length() == 0) {
            return false;
        }
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

    public double laskeGCOsuus() {
        if (this.DnaSekvenssi.length() == 0) {
            return 0;
        } else {
            return (1.0 * this.frekvenssiG + this.frekvenssiC) / this.DnaSekvenssi.length();
        }
    }

    public String laskePyrimidiiniPuriiniSuhde() {
        return (frekvenssiC + frekvenssiT) + ":" + (frekvenssiA + frekvenssiG);
    }

    public String muunnaVastinjuosteeksi() {
        String vastinjuoste = "";

        for (int i = 0; i < this.DnaSekvenssi.length(); i++) {
            switch (this.DnaSekvenssi.charAt(i)) {
                case 'A':
                    vastinjuoste = vastinjuoste + "T";
                    break;
                case 'T':
                    vastinjuoste = vastinjuoste + "A";
                    break;
                case 'C':
                    vastinjuoste = vastinjuoste + "G";
                    break;
                case 'G':
                    vastinjuoste = vastinjuoste + "C";
            }
        }

        return vastinjuoste;
    }

    public String muunnaLahettiRnaksi() {
        String lahettiRna = "";

        for (int i = 0; i < this.DnaSekvenssi.length(); i++) {
            switch (this.DnaSekvenssi.charAt(i)) {
                case 'A':
                    lahettiRna = lahettiRna + "U";
                    break;
                case 'T':
                    lahettiRna = lahettiRna + "A";
                    break;
                case 'C':
                    lahettiRna = lahettiRna + "G";
                    break;
                case 'G':
                    lahettiRna = lahettiRna + "C";
            }
        }

        return lahettiRna;
    }
}
