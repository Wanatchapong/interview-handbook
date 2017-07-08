package me.interview.exam;

/**
 * A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 * A natural number greater than 1 that is not a prime number is called a composite number
 * https://en.wikipedia.org/wiki/Prime_number
 */
public final class PrimeNumber {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeFaster(int n) {
        // fast even test
        if (n > 2 && (n & 1) == 0) {
            return false;
        }

        // odd factors (up to n^0.5)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
