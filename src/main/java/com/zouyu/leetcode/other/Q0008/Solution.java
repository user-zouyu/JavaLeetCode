package com.zouyu.leetcode.other.Q0008;

/**
 * @author ZouYu 2022/8/1 20:45
 * @version 1.0.0
 */
class Solution {
    public int myAtoi(String s) {
        int maxLength = String.valueOf(Long.MAX_VALUE).length();
        s = s.trim();

        if (s.length() > maxLength) {
            s = s.substring(0, maxLength - 1);
        }
        int start = 0;

        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            start++;
        }

        int end = start;

        for (; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (ch < '0' || ch > '9') {
                break;
            }
        }

        s = s.substring(0, end);

        long RLong = Long.parseLong(s);
        if (RLong > (long) Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (RLong < (long) Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return Integer.parseInt(s);
    }
}