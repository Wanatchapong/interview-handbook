package me.interview.exam;

/**
 * Created by wanatchapong on 7/6/2017 AD.
 * Rules: Any number divisible by 3 is replaced by the word "Fizz", any divisible by 5 by the word "Buzz", any divisible by 7 the word "Woof", Numbers divisible by both become "Fizz Buzz"
 * https://en.wikipedia.org/wiki/Fizz_buzz
 */
public class FizzBuzzWoof {

    public static String getFizzBuzzWoof(int n) {
        String output = "";

        for (int i = 1; i <= n; i++) {

            if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                output += i;
            }

            if (i % 3 == 0) {
                output += "Fizz";

            }

            if (i % 5 == 0) {
                output += "Buzz";

            }

            if (i % 7 == 0) {
                output += "Woof";
            }

            if (i < n) {
                output += ", ";
            }
        }

        return output;
    }
}
