package me.interview.exam;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wanatchapong on 7/15/2017 AD.
 */
public class FibonacciTest {

    @Test
    public void sequenceOf() throws Exception {
        Assert.assertArrayEquals(
                new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55},
                Fibonacci.sequenceOf(11));
    }

    @Test
    public void theRecurrenceYieldsTheEquations() throws Exception {
        // F2 = F1 + F0
        // F3 = F2 + F1
        // F4 = F3 + F2
        Assert.assertEquals(
                Fibonacci.sumSequenceOf(2),
                (Fibonacci.sumSequenceOf(1) + Fibonacci.sumSequenceOf(0)));

        Assert.assertEquals(
                Fibonacci.sumSequenceOf(3),
                (Fibonacci.sumSequenceOf(2) + Fibonacci.sumSequenceOf(1)));

        Assert.assertEquals(
                Fibonacci.sumSequenceOf(4),
                (Fibonacci.sumSequenceOf(3) + Fibonacci.sumSequenceOf(2)));
    }
}
