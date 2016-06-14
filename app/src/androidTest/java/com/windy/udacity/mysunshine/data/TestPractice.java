package com.windy.udacity.mysunshine.data;

import android.test.AndroidTestCase;

public class TestPractice extends AndroidTestCase {
    /*
        This gets run before every test.
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testThatDemonstratesAssertions() throws Throwable {
        int a = 5;
        int b = 3;
        int c = 5;
        int d = 10;

        assertEquals("X should be equal", a, c);
        // assertTrue(String , condition); condition的期望值应该是 true ，符合、则测试通过，不符合、则显示String
        assertTrue("Y should be true", d > a);
        // assertFalse(String , condition); condition的期望值应该是 false ，符合、则测试通过，不符合、则显示String
        assertFalse("Z should be false", a == b);

        if (b > d) {
            fail("XX should never happen");
        }
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
