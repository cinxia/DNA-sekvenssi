package DNAsekvenssianalyysi.logiikka; //testiääkkönen

import java.io.*;

public class Tiedostokirjoitin {

    private PrintWriter kirjoitin;
    private boolean luonninOnnistuminen;

    public Tiedostokirjoitin(String tiedostopolku) {
        luonninOnnistuminen = luoKirjoitin(tiedostopolku);

    }

    private boolean luoKirjoitin(String tiedostopolku) {
        try {
            File raportti = new File(tiedostopolku);
            FileWriter fw = new FileWriter(raportti, true);
            BufferedWriter bw = new BufferedWriter(fw);
            this.kirjoitin = new PrintWriter(bw);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean getLuonninOnnistuminen() {
        return this.luonninOnnistuminen;
    }

    public boolean kirjoitaSyoteSekvenssi(String sekvenssi) {
        try {
            this.kirjoitin.append("Syötetty DNA-sekvenssi:" + System.getProperty("line.separator"));
            this.kirjoitin.append(sekvenssi + System.getProperty("line.separator"));
            this.kirjoitin.append(System.getProperty("line.separator"));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean kirjoitaSekvenssinPituus(int pituus) {
        try {
            this.kirjoitin.append("DNA-sekvenssin pituus: " + pituus + System.getProperty("line.separator"));
            this.kirjoitin.append(System.getProperty("line.separator"));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean kirjoitaEmasFrekvenssit(int frekvenssiA, int frekvenssiT,
            int frekvenssiC, int frekvenssiG) {
        try {
            this.kirjoitin.append("Emäsfrekvenssit:" + System.getProperty("line.separator"));
            this.kirjoitin.append("A: " + frekvenssiA + System.getProperty("line.separator"));
            this.kirjoitin.append("T: " + frekvenssiT + System.getProperty("line.separator"));
            this.kirjoitin.append("C: " + frekvenssiC + System.getProperty("line.separator"));
            this.kirjoitin.append("G: " + frekvenssiG + System.getProperty("line.separator"));
            this.kirjoitin.append(System.getProperty("line.separator"));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean kirjoitaGCOsuus(double osuus) {
        try {
            this.kirjoitin.append("GC-osuus: " + osuus + System.getProperty("line.separator"));
            this.kirjoitin.append(System.getProperty("line.separator"));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean kirjoitaPyrimidiiniPuriiniSuhde(String suhdeluku) {
        try {
            this.kirjoitin.append("Pyrimidiini-puriinisuhde: ");
            this.kirjoitin.append(suhdeluku + System.getProperty("line.separator"));
            this.kirjoitin.append(System.getProperty("line.separator"));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean kirjoitaVastinjuoste(String vastinjuoste) {
        try {
            this.kirjoitin.append("Syötetyn DNA-sekvenssin vastinjuoste:"
                    + System.getProperty("line.separator"));
            this.kirjoitin.append(vastinjuoste + System.getProperty("line.separator"));
            this.kirjoitin.append(System.getProperty("line.separator"));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean kirjoitaLahettiRna(String lahettiRna) {
        try {
            this.kirjoitin.append("Syötettyä DNA-sekvenssiä vastaava lähetti-RNA:"
                    + System.getProperty("line.separator"));
            this.kirjoitin.append(lahettiRna + System.getProperty("line.separator"));
            this.kirjoitin.append(System.getProperty("line.separator"));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean kirjoitaJaollisuusviesti(String viesti) {
        try {
            switch (viesti) {
                case ("Tasan"):
                    this.kirjoitin.append("Lähetti-RNA on kolmella jaollinen. "
                            + "Kaikki emäkset on muutettu aminohapoiksi."
                            + System.getProperty("line.separator"));
                    this.kirjoitin.append(System.getProperty("line.separator"));
                    break;
                case ("Yksi liikaa"):
                    this.kirjoitin.append("Lähetti-RNA ei ole kolmella jaollinen. "
                            + "Viimeinen emäs on jätetty pois."
                            + System.getProperty("line.separator"));
                    this.kirjoitin.append(System.getProperty("line.separator"));
                    break;
                case ("Kaksi liikaa"):
                    this.kirjoitin.append("Lähetti-RNA ei ole kolmella jaollinen. "
                            + "Kaksi viimeistä emästä on jätetty pois."
                            + System.getProperty("line.separator"));
                    this.kirjoitin.append(System.getProperty("line.separator"));
                    break;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean kirjoitaAminohappoketju(String ketju) {
        try {
            this.kirjoitin.append("Lähetti-RNA:ta vastaava aminohappoketju:"
                    + System.getProperty("line.separator"));
            this.kirjoitin.append(ketju + System.getProperty("line.separator"));
            this.kirjoitin.append(System.getProperty("line.separator"));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean suljeTiedosto() {
        try {
            this.kirjoitin.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
