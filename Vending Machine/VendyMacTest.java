

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendyMacTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendyMacTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendyMacTest
     */
    public VendyMacTest()
    {
        // initialise instance variables
        x = 0;
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
    public void testFillUp()
    {
        VendyMac scp261 = new VendyMac( 30 );
        scp261.fillUp( 10 );
        assertEquals( scp261.getCanCount(), 40 );
        scp261.fillUp( 999 );
        assertEquals( scp261.getCanCount(), 1039 );
    }
    
    @Test
    public void testInsertToken()
    {
        VendyMac scp261 = new VendyMac();
        scp261.insertToken();
        assertEquals( scp261.getCanCount(), 9 );
        assertEquals( scp261.getTokenCount(), 1 );
        scp261.fillUp( 60 );
        scp261.insertToken();
        assertEquals( scp261.getCanCount(), 68 );
        assertEquals( scp261.getTokenCount(), 2 );
    }
    
}
