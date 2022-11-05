package com.zouyu.leetcode.hot100.Q0053;

import java.util.Arrays;

/**
 * @author ZouYu 2022/10/31 19:33
 * @version 1.0.0
 */
class Solution {
    public int maxSubArray(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int pre = nums[0];
        int max = pre;

        for (int i = 1; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            max = Math.max(pre, max);
        }

        return max;
    }
}
