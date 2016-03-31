package Integers2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testName() throws Exception {
        App a = new App(10,5);
        assertEquals(5, a.minus());
    }
}
