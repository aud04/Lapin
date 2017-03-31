package TestLapin;



import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classe.Lapin;
import Classe.Lapinou;

/**
 * The test class LapinTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LapinTest
{
    /**
     * Default constructor for test class LapinTest
     */
    public LapinTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testAge()
    {
        Lapin lapin1 = new Lapin(2, "Bidule");
        assertEquals(lapin1.getAge(),2);
        lapin1.setAge(4);
        assertEquals(lapin1.getAge(),4);
    }
    
    @Test
    public void testPrenom()
    {
        Lapin lapin11 = new Lapin(2, "Bidule");
        assertEquals(lapin11.getNom(),"Bidule");
        lapin11.setNom("Bidule2");
        assertEquals(lapin11.getNom(),"Bidule2");
    }
    
    @Test
    public void testEnfant()
    {
    	Lapin lapin2 = new Lapin(0, "Bidule");
        assertEquals("Bidule est un enfant", lapin2.typeAge());
        lapin2.setAge(5);
        assertEquals(lapin2.getAge(),5);
    }

    @Test
    public void testAdulte()
    {
        Lapin lapin3 = new Lapin(2, "Bidule");
        assertEquals("Bidule est un adulte", lapin3.typeAge());
    }
    
    @Test
    public void testLapinou()
    {
        Lapin lapin4 = new Lapin(2, "Bidule");
        Lapinou lapinou2=new Lapinou(lapin4,2,"Truc");
        lapinou2.setAge(1);
        lapinou2.setMaman(lapin4);
        lapinou2.setPrenom("Truc2");
        assertEquals(lapinou2.getAge(),1);
        assertEquals(lapinou2.getMaman(),lapin4);
        assertEquals(lapinou2.getPrenom(),"Truc2");
    }
    
    @Test
    public void testPortee(){
    	
    	Lapin lapinou = new Lapin(2, "Bidule");
    	assertEquals(lapinou.getPortee().size(),0);
    	lapinou.unePortee(5);
    	checkPortee(lapinou);
    	lapinou.setPortee(new ArrayList<>());
    	assertEquals(lapinou.getPortee().size(),0);
    	
    }

	private void checkPortee(Lapin lapinou) {
		assertEquals(lapinou.getPortee().size(),5);
    	assertEquals(lapinou.getPortee().get(1).getAge(),0);
	}
}

