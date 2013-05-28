package org.qsoft.training.org.qsoft.training.tdd;

import org.qsoft.training.MathService;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 5/28/13
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class MathClassJunitTest1 {
    private MathService mathService;

    @Before
    public void setUp() {
        mathService = new MathService();
    }

    @Test
    public void testEmptyString() {
        System.out.println("Test with string = null or empty");
        assertEquals(0, mathService.methodAdd(""));
    }

    @Test
    public void testWithString() {
        System.out.println("Test testWithString()");
        assertEquals(5, mathService.methodAdd("1,2,2"));
    }
    @Test
    public void testWithStringFail() {
        System.out.println("Test testWithString()");
        assertEquals(6, mathService.methodAdd("1,2,3"));
    }
}
