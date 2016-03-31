package Null;

import junit.framework.Assert;

/**
 * Created by student on 2016/03/07.
 */
public class TestApp {

    public void testName() throws Exception {
        Application t = new Application("Khusela");
        Assert.assertNull(t.test());
    }

    }

