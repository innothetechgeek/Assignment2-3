package NONNULLNESS;

import junit.framework.Assert;
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
        Application t = new Application("Khusela");
        Assert.assertNotNull(t.test());
    }



}
