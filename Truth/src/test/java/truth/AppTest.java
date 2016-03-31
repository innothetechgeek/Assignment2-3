package truth;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testName() throws Exception {
        String name = "Khusela";
        testApp t = new testApp(name);

        Assert.assertTrue(t.test());


    }
}
