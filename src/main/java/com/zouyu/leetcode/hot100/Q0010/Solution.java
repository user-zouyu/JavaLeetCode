package com.zouyu.leetcode.hot100.Q0010;

import java.util.Arrays;

/**
 * @author ZouYu 2022/9/23 19:18
 * @version 1.0.0
 */
class Solution {
    public boolean isMatch(String s, String p) {
        if (p.length() == 0 || p.charAt(0) == '*') {
            return false;
        }
        int p_length = p.length() + 1;
        int s_length = s.length() + 1;
        boolean[][] df = new boolean[s_length][p_length];

        df[0][0] = true;
        for (int i = 2; i < p_length; i++) {
            if(p.charAt(i - 1) == '*') {
                df[0][i] = df[0][i - 2];
            }
        }

        for (int i = 1; i < s_length; i++) {
            for (int j = 1; j < p_length; j++) {
                char cp = p.charAt(j - 1);
                if (cp == '*' && (df[i][j - 2] || (df[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')))) {
                    df[i][j] = true;
                    continue;
                }
                if (cp == s.charAt(i - 1) || cp == '.') {
                    df[i][j] = df[i - 1][j - 1];
                }
            }
        }
//        Arrays.stream(df).forEach(v -> {
//            System.out.println(Arrays.toString(v));
//        });
        return df[s_length - 1][p_length - 1];
    }
}
