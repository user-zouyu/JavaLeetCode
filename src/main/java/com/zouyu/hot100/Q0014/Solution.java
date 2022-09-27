package com.zouyu.hot100.Q0014;

import java.util.Arrays;

/**
 * @author ZouYu 2022/9/27 13:47
 * @version 1.0.0
 */
class Solution {
    public int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            if(maxArea < area) {
                maxArea = area;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
