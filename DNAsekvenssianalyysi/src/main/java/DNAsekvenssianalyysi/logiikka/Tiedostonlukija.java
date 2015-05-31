package DNAsekvenssianalyysi.logiikka;

import java.util.Scanner;
import java.io.*;

public class Tiedostonlukija {

    private String sekvenssi;
    private boolean tiedostoOk;
    private Scanner lukija;

    public Tiedostonlukija(String tiedosto) {
        try {
            this.lukija = new Scanner(new File(tiedosto));
            this.sekvenssi = lueTiedosto();
        } catch (Exception e) {
            this.tiedostoOk = false;
        }
        this.tiedostoOk = true;
    }

    public String lueTiedosto() {
        String luettuSekvenssi = "";
        while (lukija.hasNextLine()) {
            luettuSekvenssi = luettuSekvenssi + lukija.nextLine();
        }
        return luettuSekvenssi;
    }

    public String getSekvenssi() {
        return this.sekvenssi;
    }

    public boolean getTiedostoOk() {
        return this.tiedostoOk;
    }

    public boolean suljeTiedosto() {
        try {
            lukija.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
