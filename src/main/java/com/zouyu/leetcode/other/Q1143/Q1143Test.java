package com.zouyu.leetcode.other.Q1143;

import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/10/19 21:37
 * @version 1.0.0
 */
public class Q1143Test {

    private static final Solution solution = new Solution();


    @Test
    public void test() {
        int subsequence = solution.longestCommonSubsequence("bsbininm", "jmjkbkjkv");
        System.out.println(subsequence);
    }

    @Test
    public void test2() {
        int subsequence = solution.longestCommonSubsequence("if (text1.charAt(i - 1) == text2.charAt(j - 1) && dp[i - 1][j - 1] == dp[i - 1][j]) {",
                "if (texdt1.cdfharAt(i - df1) ==f dftext2.charAt(j - 1f) && fddp[i - 1][j - 1] == dp[i - 1][j]) {");
        System.out.println(subsequence);
    }

}
