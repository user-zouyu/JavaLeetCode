package com.zouyu.leetcode.hot100.Q0034;

/**
 * @author ZouYu 2022/10/17 21:59
 * @version 1.0.0
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] == target) {
                int l = middle;
                while (l - 1 >= 0 && nums[l - 1] == target) {
                    l--;
                }
                int r = middle;
                while (r + 1 < nums.length && nums[r + 1] == target) {
                    r++;
                }
                return new int[]{l, r};
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }


        return new int[]{-1, -1};
    }
}
