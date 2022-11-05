package com.zouyu.leetcode.hot100.Q0075;

/**
 * @author ZouYu 2022/11/5 12:52
 * @version 1.0.0
 */
public class Solution1 extends Solution {

    @Override
    public void sortColors(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        int left = 0;

        int right = nums.length - 1;

        for (int i = 0; i < right; i++) {
            if (nums[i] == 2 ) {
                while (nums[right] == 2) {
                    right--;
                }

                if (right - 1 != i) {
                    int temp = nums[i];
                    nums[i] = nums[right];
                    nums[right] = temp;
                }
            } else if (nums[i] == 0) {
                while (nums[left] == 0) {
                    left++;
                }
                if (left - 1 != i) {
                    int temp = nums[i];
                    nums[i] = nums[left];
                    nums[left] = temp;
                }
            }
        }
    }
}
