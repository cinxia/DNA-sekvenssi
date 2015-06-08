package DNAsekvenssianalyysi.logiikka;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class OhjausolioTest {

    public OhjausolioTest() {
    }

    Ohjausolio ohjaajaSyote;
    Ohjausolio ohjaajaVirheellinenSyote;
    Ohjausolio ohjaajaTyhjaSyote;
    Ohjausolio ohjaajaTiedosto;
    Ohjausolio ohjaajaVaaraTiedosto;
    Ohjausolio ohjaajaTyhjaTiedosto;

    @Before
    public void setUp() {
        File raportti = new File("F:\\testiraportti.txt");
        File lukutiedosto = new File("F:\\testisekvenssi.txt");
        File olematonTiedosto = new File("F:\\tiedostoaEIole.txt");
        File tyhjaTiedosto = new File("F:\\tiedostotyhja.txt");
        ohjaajaSyote = new Ohjausolio("AAATTCCGGG", null, raportti);
        ohjaajaVirheellinenSyote = new Ohjausolio("eiOleDNA", null, raportti);
        ohjaajaTyhjaSyote = new Ohjausolio("", null, raportti);
        ohjaajaTiedosto = new Ohjausolio("", lukutiedosto, raportti);
        ohjaajaVaaraTiedosto = new Ohjausolio("", olematonTiedosto, raportti);
        ohjaajaTyhjaTiedosto = new Ohjausolio("", tyhjaTiedosto, raportti);
    }

    @Test
    public void dnaSekvenssiKunnossaToimiiKunSyotteesta() {
        assertTrue(ohjaajaSyote.dnaSekvenssiKunnossa());
    }

    @Test
    public void dnaSekvnessiKunnossaToimiiKunVirheellinenSyote() {
        assertTrue(!ohjaajaVirheellinenSyote.dnaSekvenssiKunnossa());
    }

    @Test
    public void dnaSekvenssiKunnossaToimiiKunTyhjaSyote() {
        assertTrue(!ohjaajaTyhjaSyote.dnaSekvenssiKunnossa());
    }

    @Test
    public void dnaSekvenssiKunnossaToimiiKunTiedostosta() {
        assertTrue(ohjaajaTiedosto.dnaSekvenssiKunnossa());
    }

    @Test
    public void dnaSekvenssiKunnossaToimiiKunVaarastaTiedostosta() {
        assertTrue(!ohjaajaVaaraTiedosto.dnaSekvenssiKunnossa());
    }

    @Test
    public void dnaSekvenssiKunnossaToimiiKunTiedostoTyhja() {
        assertTrue(!ohjaajaTyhjaTiedosto.dnaSekvenssiKunnossa());
    }

    @Test
    public void lisaaSyoteSekvenssiToimii() {
        assertTrue(ohjaajaSyote.lisaaSyoteSekvenssi());
    }

    @Test
    public void lisaaSekvenssinPituusToimii() {
        assertTrue(ohjaajaSyote.lisaaSekvenssinPituus());
    }

    @Test
    public void lisaaEmasFrekvenssitToimii() {
        assertTrue(ohjaajaSyote.lisaaEmasFrekvenssit());
    }

    @Test
    public void lisaaGCOsuusToimii() {
        assertTrue(ohjaajaSyote.lisaaGCOsuus());
    }

    @Test
    public void lisaaPyrimidiiniPuriiniSuhdeToimii() {
        assertTrue(ohjaajaSyote.lisaaPyrimidiiniPuriiniSuhde());
    }

    @Test
    public void lisaaVastinjuosteToimii() {
        assertTrue(ohjaajaSyote.lisaaVastinjuoste());
    }

    @Test
    public void lisaaLahettiRnaToimii() {
        assertTrue(ohjaajaSyote.lisaaLahettiRna());
    }

    @Test
    public void lisaaAminohappoketjuToimii() {
        assertTrue(ohjaajaSyote.lisaaAminohappoketju());
    }

    @Test
    public void suljeKirjoitinToimii() {
        assertTrue(ohjaajaSyote.suljeKirjoitin());
    }
}
