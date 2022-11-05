package com.zouyu.leetcode.hot100.Q0075;

/**
 * @author ZouYu 2022/11/5 12:41
 * @version 1.0.0
 */
class Solution {
    public void sortColors(int[] nums) {
        if (nums.length < 2) {
            return;
        }

        int[] colorMap = new int[3];
        for (int num : nums) {
            colorMap[num] ++;
        }

        int idx = 0;
        for (int i = 0; i < colorMap.length; i++) {
            int num = colorMap[i];
            for (int j = 0; j < num; j++) {
                nums[idx] = i;
                idx++;
            }
        }
    }
}
