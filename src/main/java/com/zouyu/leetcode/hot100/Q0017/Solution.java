package com.zouyu.leetcode.hot100.Q0017;

import java.util.*;

/**
 * @author ZouYu 2022/9/27 14:00
 * @version 1.0.0
 */
class Solution {

    private static final Map<Integer, String> map = new HashMap<>();

    static {
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }

    public List<String> letterCombinations(String digits) {

        ArrayList<String> res = new ArrayList<>();
        if (digits.length() > 0) {
            String s0 = map.get(digits.charAt(0) - '0');
            for (int i = 0; i < s0.length(); i++) {
                if (digits.length() > 1) {
                    String s1 = map.get(digits.charAt(1) - '0');
                    for (int j = 0; j < s1.length(); j++) {
                        if (digits.length() > 2) {
                            String s2 = map.get(digits.charAt(2) - '0');
                            for (int k = 0; k < s2.length(); k++) {
                                if (digits.length() > 3) {
                                    String s3 = map.get(digits.charAt(3) - '0');
                                    for (int l = 0; l < s3.length(); l++) {
                                        res.add(new String(new byte[]{(byte) s0.charAt(i), (byte) s1.charAt(j), (byte) s2.charAt(k), (byte) s3.charAt(l)}));
                                    }
                                } else {
                                    res.add(new String(new byte[]{(byte) s0.charAt(i), (byte) s1.charAt(j), (byte) s2.charAt(k)}));
                                }
                            }
                        } else {
                            res.add(new String(new byte[]{(byte) s0.charAt(i), (byte) s1.charAt(j)}));
                        }
                    }
                } else {
                    res.add(new String(new byte[]{(byte) s0.charAt(i)}));
                }
            }
        }

        return res;
    }
}