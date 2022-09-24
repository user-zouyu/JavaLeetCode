package com.zouyu.everyday.Q1652;

import java.util.Arrays;

/**
 * @author ZouYu 2022/9/24 16:17
 * @version 1.0.0
 */
class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];

        if (k == 0) {
            Arrays.fill(res, 0);
            return res;
        }

        int left;
        int right;
        int length = code.length;
        if(k > 0) {
            left = 1 % length;  // 考虑只有一个元素
            right = (k + 1) % length;
        } else {
            left = ( length + k % length) % length;
            right = 0;
        }

        for (int i = left, j = 0; j < Math.abs(k); i = (i + 1) % length, j++) {
            res[0] += code[i];
        }

        for (int i = 1; i < length; i++) {
            res[i] = res[i - 1] + code[right] - code[left];
            left = (left + 1) % length;
            right = (right + 1) % length;
        }

        return res;
    }
}
