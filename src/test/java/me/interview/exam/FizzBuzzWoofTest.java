package me.interview.exam;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzWoofTest {

    @Test
    public void getFizzBuzzWoof() throws Exception {
        Assert.assertEquals(
                "1, 2, Fizz, 4, Buzz, Fizz, Woof, 8, Fizz, Buzz, 11, Fizz, 13, Woof, FizzBuzz, 16, 17, Fizz, 19, Buzz, FizzWoof, 22, 23, Fizz, Buzz, 26, Fizz, Woof, 29, FizzBuzz",
                FizzBuzzWoof.getFizzBuzzWoof(30));
    }
}
