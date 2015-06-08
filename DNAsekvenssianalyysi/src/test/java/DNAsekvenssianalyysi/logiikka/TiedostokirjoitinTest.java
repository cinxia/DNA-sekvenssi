package DNAsekvenssianalyysi.logiikka;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class TiedostokirjoitinTest {

    Tiedostokirjoitin testikirjoitin;

    public TiedostokirjoitinTest() {
    }

    @Before
    public void setUp() {
        File raporttitiedosto = new File("F:\\testiraportti.txt");
        testikirjoitin = new Tiedostokirjoitin(raporttitiedosto);
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
        Tiedostokirjoitin kakkoskirjoitin = new Tiedostokirjoitin(new File("F:\\testiraporttitoinen.txt"));
        kakkoskirjoitin.kirjoitaSyoteSekvenssi("ATCGG");
        kakkoskirjoitin.kirjoitaSekvenssinPituus(5);
        kakkoskirjoitin.kirjoitaEmasFrekvenssit(1, 1, 1, 2);
        kakkoskirjoitin.kirjoitaGCOsuus(0.45);
        kakkoskirjoitin.kirjoitaPyrimidiiniPuriiniSuhde("3:4");
        kakkoskirjoitin.kirjoitaVastinjuoste("TAAACCG");
        kakkoskirjoitin.kirjoitaLahettiRna("AAUGC");
        kakkoskirjoitin.kirjoitaJaollisuusviesti("Kaksi liikaa");
        kakkoskirjoitin.kirjoitaAminohappoketju("MTL");
        kakkoskirjoitin.suljeTiedosto();
    }
    

}
