package DNAsekvenssianalyysi.logiikka;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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
        ohjaajaSyote = new Ohjausolio("AAATTCCGGG", "", "F:\\testiraportti.txt");
        ohjaajaVirheellinenSyote = new Ohjausolio("eiOleDNA", "", "F:\\testiraportti.txt");
        ohjaajaTyhjaSyote = new Ohjausolio("", "", "F:\\testiraportti.txt");
        ohjaajaTiedosto = new Ohjausolio("", "F:\\testisekvenssi.txt", "F:\\testiraportti.txt");
        ohjaajaVaaraTiedosto = new Ohjausolio("", "F:\\tiedostoaEiOle.txt", "F:\\testiraportti.txt");
        ohjaajaTyhjaTiedosto = new Ohjausolio("", "F:\\tiedostotyhja.txt", "F:\\testiraportti.txt");
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
