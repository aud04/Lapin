package TestLapin;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classe.Cage;
import Classe.Lapin;

/**
 * The test class CageTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CageTest
{
    private Lapin lapin1;
    private Cage cage1;

    /**
     * Default constructor for test class CageTest
     */
    public CageTest()
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
        lapin1 = new Lapin(2, "Bidule");
        cage1 = new Cage(lapin1, 5);
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
    public void testManger()
    {
        Lapin lapin1=new Lapin(2,"Chouette");
        cage1.manger(2);
        assertEquals(3, cage1.getFoin());
        cage1.setFoin(10);
        assertEquals(10, cage1.getFoin());
        cage1.setLapin(lapin1);
        assertEquals(cage1.getLapin(),lapin1);
    }
}

