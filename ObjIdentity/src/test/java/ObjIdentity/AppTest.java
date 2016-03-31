package ObjIdentity;

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
        Book a = new Book("Witney's Kiss");
        Book b =  new Book("Java, How to program by Detel");
        assertTrue(b.equals(a));

    }


}
