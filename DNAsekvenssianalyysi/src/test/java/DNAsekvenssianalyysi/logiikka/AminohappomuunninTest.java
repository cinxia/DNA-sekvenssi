
package DNAsekvenssianalyysi.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AminohappomuunninTest {

    public AminohappomuunninTest() {
    }

    static Aminohappomuunnin lahettiRnaIsoillaTasan;
    static Aminohappomuunnin lahettiRnaIsoillaLiikaa;
    static Aminohappomuunnin lahettiRnaPienilla;
    static Aminohappomuunnin lahettiRnaTyhja;
    static Aminohappomuunnin lahettiRnaMuumerkki;

    @Before
    public void setUp() {
        lahettiRnaIsoillaTasan = new Aminohappomuunnin("AAAUAUGGC");
        lahettiRnaIsoillaLiikaa = new Aminohappomuunnin("AUACG");
        lahettiRnaPienilla = new Aminohappomuunnin("uuacgc");
        lahettiRnaTyhja = new Aminohappomuunnin("");
        lahettiRnaMuumerkki = new Aminohappomuunnin("AUUGCb");
    }

    @Test
    public void KonstruktoriToimiiKunLahettiRnaIsoillaJaTasan() {
        assertEquals("AAAUAUGGC", lahettiRnaIsoillaTasan.getLahettiRna());
    }

    @Test
    public void KonstruktoriToimiiKunLahettiRnaIsoillaJaEiTasan() {
        assertEquals("AUA", lahettiRnaIsoillaLiikaa.getLahettiRna());
    }

    @Test
    public void KonstruktoriToimiiKunLahettiRnaPienilla() {
        assertEquals("UUACGC", lahettiRnaPienilla.getLahettiRna());
    }

    @Test
    public void KonstruktoriToimiiKunLhaettiRnaTyhja() {
        assertEquals("", lahettiRnaTyhja.getLahettiRna());
    }

    @Test
    public void KonstruktoriHylkaaKunLahettiRnassaMuuMerkki() {
        assertEquals("", lahettiRnaMuumerkki.getLahettiRna());
    }

    @Test
    public void TarkistaRnanJaollisuusToimiiKunTasan() {
        assertEquals("Tasan", lahettiRnaIsoillaTasan.getJaollisuusviesti());
    }

    @Test
    public void TarkistaRnanJaollisuusToimiiKunYksiLiikaa() {
        Aminohappomuunnin lahettiRnaIsoillaYksiLiikaa = new Aminohappomuunnin("AAAC");
        assertEquals("Yksi liikaa", lahettiRnaIsoillaYksiLiikaa.getJaollisuusviesti());
    }

    @Test
    public void TarkistaRnanJaollisuusToimiiKunKaksiLiikaa() {
        assertEquals("Kaksi liikaa", lahettiRnaIsoillaLiikaa.getJaollisuusviesti());
    }

    @Test
    public void MuutaAminohappoketjuksiToimii() {
        assertEquals("LysTyrGly", lahettiRnaIsoillaTasan.muutaAminohappoketjuksi());
    }
}
