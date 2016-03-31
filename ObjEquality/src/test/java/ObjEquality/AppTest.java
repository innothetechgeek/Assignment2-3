package ObjEquality;

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
        ObjEquality object1 = new ObjEquality("Innocent");
        ObjEquality object2 = new ObjEquality("Innocent");
        ObjEquality t = new ObjEquality();
        assertTrue(t.compare(object1,object2));

    }
}
