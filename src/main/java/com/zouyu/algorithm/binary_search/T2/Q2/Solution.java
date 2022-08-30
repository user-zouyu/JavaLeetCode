package com.zouyu.algorithm.binary_search.T2.Q2;

/**
 * @author ZouYu 2022/8/21 13:19
 * @version 1.0.0
 */
class Solution {
    public int findPeakElement(int[] nums) {
        // 去除边界
        if(nums.length > 1 && nums[0] > nums[1]) {
            return nums[0];
        }
        if(nums.length > 1 && nums[nums.length- 1] > nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        int left = 1;
        int right = nums.length - 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                return mid;
            } else if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
