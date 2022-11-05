package com.zouyu.leetcode.hot100.Q0042;

/**
 * @author ZouYu 2022/10/18 11:04
 * @version 1.0.0
 */
class Solution {
    public int trap(int[] height) {

        int areas = 0;
        int length = height.length;
        int left = 0;
        int right = length - 1;

        while (left + 1 < length && height[left] < height[left + 1]) {
            left++;
        }

        while (right - 1 > 0 && height[right - 1] > height[right]) {
            right--;
        }


        while (left <= right) {
            if (height[left] < height[right]) {
                int preLeft = left;
                do {
                    left++;
                } while (left <= right && height[left] <= height[preLeft]);


                areas += (left - preLeft - 1) * Math.min(height[left], height[preLeft]);
                preLeft++;
                while (preLeft < left) {
                    areas -= height[preLeft];
                    preLeft++;
                }
            } else {
                int preRight = right;
                do {
                    right--;
                } while (left <= right && height[right] <= height[preRight]);

                areas += (preRight - right - 1) * Math.min(height[left], height[preRight]);
                preRight--;
                while (preRight > right) {
                    areas -= height[preRight];
                    preRight--;
                }
            }
        }

        return areas;
    }
}
