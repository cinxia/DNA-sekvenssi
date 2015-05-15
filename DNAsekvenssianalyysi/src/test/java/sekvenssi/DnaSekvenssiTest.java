package sekvenssi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DnaSekvenssiTest {

    public DnaSekvenssiTest() {
    }
    static DnaSekvenssi ketjuIsoilla;
    static DnaSekvenssi ketjuTyhja;
    static DnaSekvenssi ketjuNumero;
    static DnaSekvenssi ketjuPienilla;
    static DnaSekvenssi ketjuMuuMerkki;

    @Before
    public void setUp() {
        ketjuIsoilla = new DnaSekvenssi("AATTCG");
        ketjuTyhja = new DnaSekvenssi("");
        ketjuNumero = new DnaSekvenssi("AA4T");
        ketjuPienilla = new DnaSekvenssi("ttacc");
        ketjuMuuMerkki = new DnaSekvenssi("abc");
    }

    @Test
    public void konstruktoriHyvaksyySekvenssinIsoilla() {
        assertEquals("AATTCG", ketjuIsoilla.getDnaSekvenssi());
    }

    @Test
    public void konstruktoriHyvaksyySekvenssinPienilla() {
        assertEquals("TTACC", ketjuPienilla.getDnaSekvenssi());
    }

    @Test
    public void konstruktoriHyvaksyySekvenssinTyhjalla() {
        assertEquals("", ketjuTyhja.getDnaSekvenssi());
    }

    @Test
    public void konstruktoriHylkaaSekvenssinNumerolla() {
        assertEquals("", ketjuNumero.getDnaSekvenssi());
    }

    @Test
    public void konstruktoriHylkaaSekvenssinMuullaMerkilla() {
        assertEquals("", ketjuMuuMerkki.getDnaSekvenssi());
    }

    @Test
    public void laskeEmasfrekvenssiToimiiKunPositiivinen() {
        assertEquals(2, ketjuIsoilla.getFrekvenssiA());
    }
    
    @Test
    public void laskeEmasFrekvenssiToimiiKunNolla(){
        assertEquals(0, ketjuPienilla.getFrekvenssiG());
    }
    
    @Test
    public void laskeEmasFrekvenssiKunSekvenssiOnTyhja(){
        assertEquals(0, ketjuTyhja.getFrekvenssiT());
    }
    
    @Test
    public void laskeSekvenssinPituusToimii(){
        assertEquals(6, ketjuIsoilla.laskeSekvenssinPituus());
    }
    
    @Test
    public void laskeSekvenssinPituusKunSeOnNolla(){
        assertEquals(0, ketjuTyhja.laskeSekvenssinPituus());
    }
    
    
}
