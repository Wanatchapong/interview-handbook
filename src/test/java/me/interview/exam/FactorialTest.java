package me.interview.exam;

import me.interview.exam.exception.NonNegativeIntegerException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wanatchapong on 7/9/2017 AD.
 */
public class FactorialTest {

    @Test
    public void calculateByForLoop() throws NonNegativeIntegerException {
        Assert.assertEquals(120, Factorial.calculateByForLoop(5));
    }

    @Test
    public void calculateByWhileLoop() throws Exception {
        Assert.assertEquals(120, Factorial.calculateByWhileLoop(5));
    }

    @Test
    public void calculateByRecursive() throws Exception {
        Assert.assertEquals(120, Factorial.calculateByRecursive(5));
    }

    @Test(expected = NonNegativeIntegerException.class)
    public void whenInputNegativeIntegerShouldBeThrowNonNegativeIntegerException() throws Exception {
        Factorial.calculateByForLoop(-1);
    }

    @Test
    public void whenInputZeroShouldBeReturnOne() throws Exception {
        Assert.assertEquals(1, Factorial.calculateByForLoop(0));
    }
}
