package com.zouyu.leetcode.hot100.Q0031;

import java.util.Arrays;

/**
 * @author ZouYu 2022/10/7 19:23
 * @version 1.0.0
 */
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        if (nums.length == 2) {
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
            return;
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[i] < nums[j]) {
                        swap(nums, i, j);
                        break;
                    }
                }
                tran(nums, i + 1, nums.length - 1);
                return;
            }
        }

        tran(nums, 0, nums.length - 1);

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void tran(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }


    public void nextPermutation1(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        if (nums.length == 2) {
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
            return;
        }
        int length = nums.length;
        for (int i = length - 2; i >= 0; i--) {
            int index = -1;
            for (int j = length - 1; j > i; j--) {
                if (nums[i] < nums[j] && (index == -1 || nums[index] > nums[j])) {
                    index = j;
                }
            }
            if (index != -1) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                Arrays.sort(nums, i + 1, length);
                return;
            }
        }

        int lastIndex = nums.length - 1;
        for (int i = 0; i < nums.length / 2 ; i++) {
            int temp = nums[i];
            nums[i] = nums[lastIndex - i];
            nums[lastIndex - i] = temp;
        }
    }
}
