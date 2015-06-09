package DNAsekvenssianalyysi.logiikka;

import java.util.Scanner;
import java.io.*;

/**
 * Luokka lukee DNA-sekvenssin tiedostosta ja tallentaa tiedon lukemisen
 * onnistumisesta.
 */
public class Tiedostonlukija {

    private String sekvenssi;
    private boolean tiedostoOk = true;
    private Scanner lukija;

    /**
     * Konstruktori alustaa tiedostonlukijan ja lukee tiedoston sisällön.
     *
     * @param tiedosto
     */
    public Tiedostonlukija(File tiedosto) {
        try {
            this.lukija = new Scanner(tiedosto);
            this.sekvenssi = lueTiedosto();
        } catch (Exception e) {
            this.tiedostoOk = false;
        }
    }

    private String lueTiedosto() {
        String luettuSekvenssi = "";
        try {
            while (lukija.hasNextLine()) {
                luettuSekvenssi = luettuSekvenssi + lukija.nextLine();
            }
            lukija.close();
            return luettuSekvenssi;
        } catch (Exception e) {
            this.tiedostoOk = false;
            return "";
        }
    }

    public String getSekvenssi() {
        return this.sekvenssi;
    }

    public boolean getTiedostoOk() {
        return this.tiedostoOk;
    }

}
