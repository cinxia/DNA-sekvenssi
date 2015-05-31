package DNAsekvenssianalyysi.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TiedostonlukijaTest {

    Tiedostonlukija testilukija;

    public TiedostonlukijaTest() {
    }

    @Before
    public void setUp() {
        testilukija = new Tiedostonlukija("F:\\testisekvenssi.txt");
    }

    @Test
    public void konstruktoriToimiiOikein() {
        assertEquals("AATTTCCCGGGG", testilukija.getSekvenssi());
    }

    @Test
    public void suljeTiedostoToimii() {
        assertTrue(testilukija.suljeTiedosto());
    }

    @Test
    public void kokoOperaatioToimii() {
        Tiedostonlukija toinenTestilukija = new Tiedostonlukija("F:\\testisekvenssi.txt");
        toinenTestilukija.suljeTiedosto();
        System.out.println(toinenTestilukija.getSekvenssi());
    }

}
