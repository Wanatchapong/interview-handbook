package me.interview.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by wanatchapong on 6/26/2017 AD.
 */
public final class MaxDuplicateCharacter {

    private static Map<Character, Integer> getDuplicateCounts(String s) {
        Map<Character, Integer> dupCounts = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (dupCounts.containsKey(c)) {
                dupCounts.put(c, dupCounts.get(c) + 1);
            } else {
                dupCounts.put(c, 1);
            }
        }
        return dupCounts;
    }

    private static Map<Character, Integer> getMaxDuplicateCounts(Map<Character, Integer> dupCounts) {
        Map<Character, Integer> maxDupCounts = new HashMap<>();
        int maxCount = 0;
        for (Map.Entry<Character, Integer> c : dupCounts.entrySet()) {
            if (c.getValue() >= maxCount) {

                // put the max duplicate count to map
                if (!maxDupCounts.containsKey(c.getKey())) {
                    maxDupCounts.put(c.getKey(), c.getValue());
                    maxCount = c.getValue();
                }

                // remove key of value less than max count
                Iterator<Map.Entry<Character, Integer>> it = maxDupCounts.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue() < maxCount) {
                        it.remove();
                    }
                }
            }
        }

        return maxDupCounts;
    }

    public static String getMaxDuplicateCharAsString(String s) {
        Map<Character, Integer> dupCounts = getDuplicateCounts(s);
        Map<Character, Integer> maxDupCounts = getMaxDuplicateCounts(dupCounts);

        String result = "";
        for (Map.Entry<Character, Integer> maxDup : maxDupCounts.entrySet()) {
            for (int i = 0; i < maxDup.getValue(); i++) {
                result += maxDup.getKey();
            }
        }
        return result;
    }
}
