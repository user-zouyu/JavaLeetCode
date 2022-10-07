package com.zouyu.other.QInputString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ZouYu 2022/10/6 20:40
 * @version 1.0.0
 */
public class Solution {

    public static int test(String str) {
        int length = str.length();
        if (length <= 3) {
            return length;
        }
        int step = 3;
        String copy = "";
        for (int i = 3; i < length;) {
            int maxLen = 1;
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    for (int l = j + 1, r = i + 1; l < i && r < length;) {
                        if (str.charAt(l) == str.charAt(r)) {
                            l++;
                            r++;
                            if(maxLen < r - i) {
                                maxLen = r - i;
                                flag = true;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            String substring = str.substring(i, i + maxLen);
            if (flag && !copy.equals(substring)) {
                step++;
                copy = substring;
            }
            i += maxLen;
            step++;
        }
        return step;
    }

    @SuppressWarnings("all")
    public static int test1(String str) {
        int length = str.length();
        if(length <= 2) {
            return length;
        }
        Set[] copy = new Set[length];
        int[][] dp = new int[length][length];
        int[] min = new int[length];

        // Init
        for (int i = 0; i < length; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            dp[i][i] = i + 1;
            min[i] = i + 1;
            copy[i] = new HashSet<>();
        }

        // 跟新
        // dp
        for (int i = 2; i < length; i++) {

            for (int j = i + 1; j < length && j < i * 2; j++) {

                String sub = str.substring(i, j + 1);
                int index = str.indexOf(sub);
                if (index != -1 && index + sub.length() - 2 < i) {

                    // 更新 dp
                    if (copy[i - 1].contains(sub)) { // 已经 copy
                        dp[i][j] = min[i - 1] + 1;
                    } else { // 没有 copy
                        dp[i][j] = min[i - 1] + 2;
                    }

                    // 跟新裁剪版
                    if (min[j] > dp[i][j]) { // 发现最短步骤，清楚裁剪版并加入最短步骤的裁剪版
                        min[j] = dp[i][j];
                        copy[j].clear();
                        copy[j].add(sub);
                    } else if (min[j] == dp[i][j]) { // 存入裁剪版
                        copy[j].add(sub);
                    }
                }
            }
        }

        return min[length - 1];
    }

    @SuppressWarnings("all")
    public static int test2(String str) {
        int length = str.length();
        if(length <= 2) {
            return length;
        }
        Set[] copy = new Set[length];
        int[] min = new int[length];

        // Init
        for (int i = 0; i < length; i++) {
            min[i] = i + 1;
            copy[i] = new HashSet<>();
        }

        // 跟新
        // dp
        for (int i = 2; i < length; i++) {

            for (int j = i + 1; j < length && j < i * 2; j++) {

                String sub = str.substring(i, j + 1);
                int index = str.indexOf(sub);
                if (index != -1 && index + sub.length() - 2 < i) {

                    // 更新 dp
                    int next = Integer.MAX_VALUE;
                    if (copy[i - 1].contains(sub)) { // 已经 copy
                        next = min[i - 1] + 1;
                    } else { // 没有 copy
                        next = min[i - 1] + 2;
                    }

                    // 跟新裁剪版
                    if (min[j] > next) { // 发现最短步骤，清楚裁剪版并加入最短步骤的裁剪版
                        min[j] = next;
                        copy[j].clear();
                        copy[j].add(sub);
                    } else if (min[j] == next) { // 存入裁剪版
                        copy[j].add(sub);
                    }
                }
            }
        }

        return min[length - 1];
    }

    public static void main(String[] args) {
        int abcabab = test2("abcabab");
        System.out.println(abcabab);
        int aaaaaaaaaaa = test2("aaaaaaaaaaa");
        System.out.println(aaaaaaaaaaa);
    }
}
