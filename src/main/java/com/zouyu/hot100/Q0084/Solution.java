package com.zouyu.hot100.Q0084;

/**
 * @author ZouYu 2022/11/4 14:48
 * @version 1.0.0
 */
class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights.length == 1) {
            return heights[0];
        }

        return dfs(heights, 0, heights.length - 1);
    }

    private int dfs(int[] heights, int left, int right) {
        if (left > right) {
            return 0;
        }

        if (left == right) {
            return heights[left];
        }
        int minIndex = updateMinIndex(heights, left, right);
        int area = Math.max(dfs(heights, left, minIndex - 1), dfs(heights, minIndex + 1, right));

        return Math.max(area, (right - left + 1) * heights[minIndex]);
    }

    private int updateMinIndex(int[] heights, int left, int right) {
        int minIndex = left;

        for (int i = left + 1; i < right + 1; i++) {
            if (heights[minIndex] > heights[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
