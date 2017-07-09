package me.interview.exam;

import me.interview.exam.exception.NonNegativeIntegerException;

/**
 * The factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n.
 * (n + 1)! = (n + 1) x n!
 * E.g. 5! = 5 x 4!
 * 0! In order for this recurrence relation to be extended to n=0, it is necessary to define
 * 0! = 1
 * so that
 * 1! = 1 x 0! = 1
 * https://en.wikipedia.org/wiki/Factorial
 */
public final class Factorial {

    private static void assertNonNegativeInteger(int n) throws NonNegativeIntegerException {
        if (n < 0) {
            throw new NonNegativeIntegerException(n);
        }
    }

    public static int calculateByForLoop(int n) throws NonNegativeIntegerException {
        assertNonNegativeInteger(n);

        if (n == 0) {
            return 1;
        }

        int value = n;
        for (int i = (n - 1); i >= 1; i--) {
            value *= i;
        }
        return value;
    }

    public static int calculateByWhileLoop(int n) throws NonNegativeIntegerException {
        assertNonNegativeInteger(n);

        if (n == 0) {
            return 1;
        }

        int value = n, i = n - 1;
        while (i >= 1) {
            value *= i;
            i--;
        }
        return value;
    }

    public static int calculateByRecursive(int n) throws NonNegativeIntegerException {
        assertNonNegativeInteger(n);

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * calculateByForLoop(n - 1);
    }
}
