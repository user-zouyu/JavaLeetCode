package com.zouyu.hot100.Q0006;

/**
 * @author ZouYu 2022/8/30 19:36
 * @version 1.0.0
 */
class Solution {
    public String convert(String s, int numRows) {
        if (s.length() <= 1 || numRows <= 1) {
            return s;
        }
        int width = numRows * 2 - 2;
        int row = 0;
        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();
        while (row < numRows) {
            int left = row;
            while (left < s.length()) {
                result.append(s.charAt(left));
                left = left + width;

                if (left - row * 2 < s.length() && row > 0 && row < numRows - 1) {
                    result.append(s.charAt(left - row * 2));
                }
            }
            row++;
        }

        return result.toString();
    }
}
