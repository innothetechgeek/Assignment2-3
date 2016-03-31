package False;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testName() throws Exception {

        AppA a = new AppA("Khusela");
        assertFalse(a.test() == false);

    }
}
