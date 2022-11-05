package com.zouyu.leetcode.hot100.Q0072;

import java.util.Arrays;

/**
 * @author ZouYu 2022/11/5 12:15
 * @version 1.0.0
 */
class Solution {
    public int minDistance(String word1, String word2) {
        // 空串 全部删除
        if (word2.length() == 0) {
            return word1.length();
        }
        int[][] df = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 1; i < word1.length() + 1; i++) {
            df[i][0] = i;
        }

        for (int i = 1; i < word2.length() + 1; i++) {
            df[0][i] = i;
        }

        for (int i = 1; i < word1.length() + 1; i++) {
            for (int j = 1; j < word2.length() + 1; j++) {
                int left = df[i][j - 1] + 1;
                int down = df[i - 1][j] + 1;
                int left_down = df[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                    left_down++;
                }

                df[i][j] = Math.min(left_down, Math.min(left, down));
            }
        }

//        Arrays.stream(df).forEach(e -> {
//            System.out.println(Arrays.toString(e));
//        });
        return df[word1.length()][word2.length()];
    }
}
