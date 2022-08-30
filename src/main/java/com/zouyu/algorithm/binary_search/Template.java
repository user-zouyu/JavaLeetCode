package com.zouyu.algorithm.binary_search;

/**
 * @author ZouYu 2022/8/21 12:35
 * @version 1.0.0
 */
public class Template {
    public int binarySearch_1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int binarySearch_2(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = left;
            }
        }
        if(left != nums.length && nums[left] == target) {
            return left;
        }
        return -1;
    }

    public int binarySearch_3(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = left - 1;
            }
        }

        if(nums[left] == target) {
            return left;
        } else if (nums[right] == target) {
            return right;
        }
        return -1;
    }
}
