package com.zouyu.leetcode.hot100.Q0084;

import java.util.ArrayDeque;

/**
 * @author ZouYu 2022/11/5 11:31
 * @version 1.0.0
 */
public class SolutionStack extends Solution {
    @Override
    @SuppressWarnings("all")
    public int largestRectangleArea(int[] heights) {
        int ans = 0;

        int[] height = new int[heights.length + 2];

        System.arraycopy(heights, 0, height, 1, heights.length);

        ArrayDeque<Integer> stk = new ArrayDeque<>();

        for (int i = 0; i < height.length; i++) {
            while (!stk.isEmpty() && height[stk.peek()] > height[i]) {
                Integer top = stk.pop();

                int curWidth = i - stk.peek() - 1;

                int curHeight = height[top];

                ans = Math.max(ans, curWidth * curHeight);
            }
            stk.push(i);
        }

        return ans;
    }
}
