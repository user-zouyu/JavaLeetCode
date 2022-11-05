package com.zouyu.leetcode.hot100.Q0005;

/**
 * @author ZouYu 2022/8/30 18:49
 * @version 1.0.0
 */
class Solution {
    public String longestPalindrome1(String s) {

        if (s.length() < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int left = i - 1;
            int right = i + 1;
            if (s.charAt(i) == s.charAt(i + 1)) {
                right++;
                if(maxLen < 2) {
                    maxLen = 2;
                    begin = i;
                }
            }
            while (left >= 0 && right < s.length()) {
                if (s.charAt(left) == s.charAt(right)) {
                    if (right - left + 1 > maxLen) {
                        maxLen = right - left + 1;
                        begin = left;
                    }
                } else {
                    break;
                }
                left--;
                right++;
            }

            left = i - 1;
            right = i + 1;
            while (left >= 0 && right < s.length()) {
                if (s.charAt(left) == s.charAt(right)  ) {
                    if (right - left + 1 > maxLen) {
                        maxLen = right - left + 1;
                        begin = left;
                    }
                } else {
                    break;
                }
                left--;
                right++;
            }
        }

        return s.substring(begin, begin + maxLen);
    }

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }

        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (i - j  < 2) {
                        dp[j][i] = true;
                    } else {
                        dp[j][i] = dp[j + 1][i - 1];
                    }
                }

                if (dp[j][i] &&  i - j + 1 > maxLen) {
                    maxLen = i - j + 1;
                    begin = j;
                }
            }
        }

        return s.substring(begin, begin + maxLen);
    }
}
