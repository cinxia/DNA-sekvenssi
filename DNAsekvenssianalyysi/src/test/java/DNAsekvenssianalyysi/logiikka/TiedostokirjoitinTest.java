package DNAsekvenssianalyysi.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TiedostokirjoitinTest {

    Tiedostokirjoitin testikirjoitin;

    public TiedostokirjoitinTest() {
    }

    @Before
    public void setUp() {
        testikirjoitin = new Tiedostokirjoitin("F:\\testiraportti.txt");
    }

    @Test
    public void luoKirjoitinToimiiKunTiedostopolkuOikein() {
        assertTrue(testikirjoitin.getLuonninOnnistuminen());
    }

    @Test
    public void kirjoitaSyoteSekvenssiToimii() {
        assertTrue(testikirjoitin.kirjoitaSyoteSekvenssi("AATTCCG"));
    }

    @Test
    public void kirjoitaSekvenssinPituusToimii() {
        assertTrue(testikirjoitin.kirjoitaSekvenssinPituus(15));
    }

    @Test
    public void kirjoitaEmasfrekvenssitToimii() {
        assertTrue(testikirjoitin.kirjoitaEmasFrekvenssit(12, 4, 1, 0));
    }

    @Test
    public void kirjoitaGCOsuusToimii() {
        assertTrue(testikirjoitin.kirjoitaGCOsuus(0.75));
    }

    @Test
    public void kirjoitaPyrimidiinPuriiniSuhdeToimii() {
        assertTrue(testikirjoitin.kirjoitaPyrimidiiniPuriiniSuhde("3:7"));
    }

    @Test
    public void kirjoitaVastinjuosteToimii() {
        assertTrue(testikirjoitin.kirjoitaVastinjuoste("TTAAGGC"));
    }

    @Test
    public void kirjoitaLahettiRnaToimii() {
        assertTrue(testikirjoitin.kirjoitaLahettiRna("AUAUACGC"));

    }

    @Test
    public void kirjoitaJaollisuusviestiToimiiKunTasan() {
        assertTrue(testikirjoitin.kirjoitaJaollisuusviesti("Tasan"));
    }

    @Test
    public void kirjoitaJaollisuusviestiToimiiKunYksiLiikaa() {
        assertTrue(testikirjoitin.kirjoitaJaollisuusviesti("Yksi liikaa"));
    }

    @Test
    public void kirjoitaJaollisuusviestiToimiiKunKaksiLiikaa() {
        assertTrue(testikirjoitin.kirjoitaJaollisuusviesti("Kaksi liikaa"));
    }

    @Test
    public void kirjoitaAminohappoketjuToimii() {
        assertTrue(testikirjoitin.kirjoitaAminohappoketju("MLT"));
    }
    
    @Test
    public void suljeTiedostoToimii(){
        assertTrue(testikirjoitin.suljeTiedosto());
    }
    
    
    @Test
    public void kokoOperaatiotoimii(){
        Tiedostokirjoitin kakkoskirjoitin = new Tiedostokirjoitin("F:\\testiraporttitoinen.txt");
        kakkoskirjoitin.kirjoitaSyoteSekvenssi("ATCG");
        kakkoskirjoitin.suljeTiedosto();
    }
    

}
