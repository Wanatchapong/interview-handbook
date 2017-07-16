package me.interview.exam;

import me.interview.exam.exception.NonNegativeIntegerException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wanatchapong on 7/9/2017 AD.
 */
public class FactorialTest {

    @Test
    public void forLoop() throws NonNegativeIntegerException {
        Assert.assertEquals(120, Factorial.forLoop(5));
    }

    @Test
    public void whileLoop() throws Exception {
        Assert.assertEquals(120, Factorial.whileLoop(5));
    }

    @Test
    public void recursive() throws Exception {
        Assert.assertEquals(120, Factorial.recursive(5));
    }

    @Test
    public void verifyTheory() throws Exception {
        // 5! = 5 x 4!
        Assert.assertEquals(Factorial.forLoop(5), (5 * Factorial.forLoop(4)));
    }

    @Test(expected = NonNegativeIntegerException.class)
    public void whenInputNegativeIntegerShouldBeThrowNonNegativeIntegerException() throws Exception {
        Factorial.forLoop(-1);
    }

    @Test
    public void whenInputZeroShouldBeReturnOne() throws Exception {
        Assert.assertEquals(1, Factorial.forLoop(0));
    }
}
