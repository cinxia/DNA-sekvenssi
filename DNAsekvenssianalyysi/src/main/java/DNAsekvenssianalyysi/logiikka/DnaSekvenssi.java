
package DNAsekvenssianalyysi.logiikka;

/**
 *Luokka sisältää yhden DNA-sekvenssin ja tiedot sen emäsfrekvensseistä sekä
 * metodeja DNA-sekvenssin analysoimiseen.
 */
public class DnaSekvenssi {
    
    private String DnaSekvenssi = "";
    private int frekvenssiA = 0;
    private int frekvenssiT = 0;
    private int frekvenssiC = 0;
    private int frekvenssiG = 0;

    /**
     * Konstruktori tallentaa parametrina annetun DNA-sekvenssin,
     * jos se on DNA-sekvenssi.
     * 
     * @param syoteSekvenssi 
     */
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

    /**
     * Metodilaskee parametriksi annetun emäksen frekvenssin toisena
     * parametrina annetusta DNA-sekvenssistä.
     * 
     * @param emas
     * @param sekvenssi
     * @return frekvenssi
     */
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

    /**
     * Metodi laskee ja palauttaa DNA-sekvenssin pituuden.
     *  
     * @return sekvenssin pituus
     */
    public int laskeSekvenssinPituus() {
        return this.DnaSekvenssi.length();
    }

    /**
     * Metodi laskee ja palauttaa G- ja C-nukleotidien osuuden.
     *  
     * @return GC-osuus
     */
    public double laskeGCOsuus() {
        if (this.DnaSekvenssi.length() == 0) {
            return 0;
        } else {
            return (1.0 * this.frekvenssiG + this.frekvenssiC) / this.DnaSekvenssi.length();
        }
    }

    /**
     * Metodi laskee ja palauttaa pyrimidiinien (C, T) ja puriinien (A, G) välisen suhdeluvun.
     * 
     * @return suhdeluku
     */
    public String laskePyrimidiiniPuriiniSuhde() {
        return (frekvenssiC + frekvenssiT) + ":" + (frekvenssiA + frekvenssiG);
    }

    /**
     * Metodi muuttaa DNA-sekvenssin vastinjuosteensa mukaiseksi DNA-sekvenssiksi ja 
     * palauttaa uuden sekvenssin.
     * 
     * @return vastinjuoste
     */
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

    /**
     * Metodi muuttaa DNA-sekvenssin sitä vastaavaksi lähetti-RNA-ketjuksi.
     * 
     * @return lähetti-RNA-ketju
     */
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
