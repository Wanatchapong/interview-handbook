package me.interview.exam;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wanatchapong on 6/26/2017 AD.
 */
public class PrimeNumberTest {

    @Test
    public void primeNumber() throws Exception {
        Assert.assertTrue(PrimeNumber.isPrime(2));
        Assert.assertTrue(PrimeNumber.isPrime(3));
        Assert.assertTrue(PrimeNumber.isPrime(5));
        Assert.assertTrue(PrimeNumber.isPrime(7));
        Assert.assertTrue(PrimeNumber.isPrime(11));
        Assert.assertTrue(PrimeNumber.isPrime(13));
    }

    @Test
    public void notPrimeNumber() throws Exception {
        Assert.assertFalse(PrimeNumber.isPrime(4));
        Assert.assertFalse(PrimeNumber.isPrime(6));
        Assert.assertFalse(PrimeNumber.isPrime(8));
        Assert.assertFalse(PrimeNumber.isPrime(9));
        Assert.assertFalse(PrimeNumber.isPrime(10));
    }

    @Test
    public void printPrimeNumberInOneHundred() throws Exception {
        for (int i = 2; i <= 100; i++) {
            if (PrimeNumber.isPrimeFaster(i)) {
                System.out.println(i + " is prime number");
            }
        }
    }
}
