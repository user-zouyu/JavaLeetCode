package com.zouyu.hot100.Q0032;

import java.util.Arrays;

/**
 * @author ZouYu 2022/10/20 13:32
 * @version 1.0.0
 */
class Solution {

    public int longestValidParentheses(String s) {
        int length = s.length();
        if (length < 2) {
            return 0;
        }

        int max = 0;
        int[] dp = new int[length + 1];

        for (int i = 2; i < length + 1; i++) {
            if (s.charAt(i - 1) == ')') {
                if (s.charAt(i - 2) == '(') {
                    dp[i] = dp[i - 2] + 2;
                } else if (i - dp[i - 1] >= 2 && s.charAt(i - dp[i - 1] - 2) == '(') {
                    dp[i] = dp[i - dp[i - 1] - 2] + dp[i - 1] + 2;
                }
                max = Math.max(max, dp[i]);
            }
        }
//        System.out.println(Arrays.toString(dp));
        return max;
    }
}