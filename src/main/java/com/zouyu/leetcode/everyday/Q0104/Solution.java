package com.zouyu.leetcode.everyday.Q0104;

/**
 * @author ZouYu 2022/9/27 12:25
 * @version 1.0.0
 */
class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        int[] hash = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            hash[s1.charAt(i)]++;
            hash[s2.charAt(i)]--;
        }

        for (int i : hash) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
