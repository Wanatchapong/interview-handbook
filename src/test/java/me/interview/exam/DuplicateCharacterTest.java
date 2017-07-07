package me.interview.exam;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wanatchapong on 6/26/2017 AD.
 */
public class DuplicateCharacterTest {

    @Test
    public void printMaxDuplicateCharAsString() throws Exception {
        Assert.assertEquals("aaaaabbbbb", DuplicateCharacter.getMaxDuplicateCharAsString("aabbaabbcacbcc"));
        Assert.assertEquals("cccccc", DuplicateCharacter.getMaxDuplicateCharAsString("aabbaabbcccbccac"));
    }
}
