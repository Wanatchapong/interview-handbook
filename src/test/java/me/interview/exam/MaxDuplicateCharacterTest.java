package me.interview.exam;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wanatchapong on 6/26/2017 AD.
 */
public class MaxDuplicateCharacterTest {

    @Test
    public void printMaxDuplicateCharAsString() throws Exception {
        Assert.assertEquals("aaaaabbbbb", MaxDuplicateCharacter.getMaxDuplicateCharAsString("aabbaabbcacbcc"));
        Assert.assertEquals("cccccc", MaxDuplicateCharacter.getMaxDuplicateCharAsString("aabbaabbcccbccac"));
    }
}
