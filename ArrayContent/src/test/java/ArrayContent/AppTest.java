package ArrayContent;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    int[] MyArray = {27, 3, 12, 5, 14,37 };

    public void testName() throws Exception {
        assertEquals(3, MyArray[1]);

    }
}
