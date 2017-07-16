package me.interview.exam;

/**
 * the Fibonacci numbers are the numbers in the following integer sequence, called the Fibonacci sequence,
 * and characterized by the fact that every number after the first two is the sum of the two preceding ones:
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 * Often, especially in modern usage, the sequence is extended by one more initial term:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 * The sequence Fn of Fibonacci numbers is defined by the recurrence relation:
 * Fn = Fn-1 + Fn-2,
 * F0 = 0, F1 = 1, F2 = 1
 * https://en.wikipedia.org/wiki/Fibonacci_number
 */
public final class Fibonacci {

    public static int[] sequenceOf(int numbers) {
        if (numbers <= 0) {
            return new int[]{0};
        }

        if (numbers == 1) {
            return new int[]{0, 1};
        }

        int[] sequences = new int[numbers];
        sequences[0] = 0;
        sequences[1] = 1;
        for (int n = 2; n < numbers; n++) {
            sequences[n] = sequences[n - 1] + sequences[n - 2];
        }
        return sequences;
    }

    public static int sumSequenceOf(int numbers) {
        int[] sequences = sequenceOf(numbers);
        int sum = 0;
        for (int seq : sequences) {
            sum += seq;
        }
        return sum;
    }
}
