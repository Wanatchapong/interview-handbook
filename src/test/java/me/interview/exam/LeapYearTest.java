package me.interview.exam;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wanatchapong on 7/7/2017 AD.
 */
public class LeapYearTest {

    @Test
    public void leapYear() throws Exception {
        Assert.assertTrue(LeapYear.isLeapYear(1600));
        Assert.assertTrue(LeapYear.isLeapYear(2000));
        Assert.assertTrue(LeapYear.isLeapYear(2004));
    }

    @Test
    public void notLeapYear() throws Exception {
        Assert.assertFalse(LeapYear.isLeapYear(1700));
        Assert.assertFalse(LeapYear.isLeapYear(1800));
        Assert.assertFalse(LeapYear.isLeapYear(1900));
    }
}
