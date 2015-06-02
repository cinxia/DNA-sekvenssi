package DNAsekvenssianalyysi.logiikka;

import java.util.Scanner;
import java.io.*;

public class Tiedostonlukija {

    private String sekvenssi;
    private boolean tiedostoOk = true;
    private Scanner lukija;

    public Tiedostonlukija(String tiedosto) {
        try {
            this.lukija = new Scanner(new File(tiedosto));
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
        }
        return "";
    }

    public String getSekvenssi() {
        return this.sekvenssi;
    }

    public boolean getTiedostoOk() {
        return this.tiedostoOk;
    }

}
