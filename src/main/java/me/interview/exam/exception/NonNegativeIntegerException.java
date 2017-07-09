package me.interview.exam.exception;

/**
 * Created by wanatchapong on 7/9/2017 AD.
 */
public class NonNegativeIntegerException extends Exception {

    public NonNegativeIntegerException(int number) {
        super("Non-negative integer by " + number);
    }
}
