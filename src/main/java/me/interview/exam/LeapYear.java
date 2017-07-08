package me.interview.exam;

/**
 * Each leap year has 366 days instead of the usual 365, by extending February to 29 days rather than the common 28.
 * Every year that is exactly divisible by 4 is a leap year, except for years that are exactly divisible by 100, but these century years are leap years if they are exactly divisible by 400.
 * For example, the years 1700, 1800, and 1900 were not leap years, but the years 1600 and 2000 were
 * https://en.wikipedia.org/wiki/Leap_year
 */
public final class LeapYear {

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
