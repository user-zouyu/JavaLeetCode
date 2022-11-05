package com.zouyu.leetcode.hot100.Q0647;

import java.util.Arrays;

/**
 * @author ZouYu 2022/10/20 11:50
 * @version 1.0.0
 */
class Solution {
    public int countSubstrings(String s) {
        int length = s.length();
        if (length == 0) {
            return 0;
        }

        if (length == 1) {
            return 1;
        }

        boolean[][] dp = new boolean[length][length];
        int count = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    dp[i][j] = true;
                    count++;
//                    System.out.println(s.charAt(i));
                } else {
                    if (s.charAt(i) == s.charAt(j)) {
                        if( dp[i - 1][j + 1] || (dp[i - 1][j] && i - j == 1)) {
                            dp[i][j] = true;
                            count++;
//                            System.out.println(s.substring(j, i + 1));
                        }
                    }
                }
            }
//            System.out.println(Arrays.toString(dp[i]));
        }

        return count;
    }

}
