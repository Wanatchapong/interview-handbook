package me.interview.exam;

import me.interview.exam.exception.NonNegativeIntegerException;

/**
 * The factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n.
 * initially for integer n ≥ 1, and resulting in this fundamental recurrence relation:
 * (n + 1)! = (n + 1) x n!
 *
 * E.g.
 * 5! = 5 x 4!
 * 6! = 6 x 5!
 * 50! = 50 x 49!
 *
 * 0! In order for this recurrence relation to be extended to n=0, it is necessary to define
 * 0! = 1
 * so that
 * 1! = 1 x 0! = 1
 *
 * https://en.wikipedia.org/wiki/Factorial
 */
public final class Factorial {

    private static void assertNonNegativeInteger(int n) throws NonNegativeIntegerException {
        if (n < 0) {
            throw new NonNegativeIntegerException(n);
        }
    }

    public static int forLoop(int n) throws NonNegativeIntegerException {
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

    public static int whileLoop(int n) throws NonNegativeIntegerException {
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

    public static int recursive(int n) throws NonNegativeIntegerException {
        assertNonNegativeInteger(n);

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * recursive(n - 1);
    }
}
