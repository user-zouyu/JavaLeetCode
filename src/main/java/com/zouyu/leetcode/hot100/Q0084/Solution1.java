package com.zouyu.leetcode.hot100.Q0084;

import java.util.ArrayDeque;

public class Solution1 extends Solution {

    @Override
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return heights[0];
        }

        int ans = 0;

        ArrayDeque<Integer> stk = new ArrayDeque<>();
        stk.push(-1);
        for (int i = 0; i < heights.length; i++) {
            while (!stk.isEmpty() && heights[stk.peek()] > heights[i]) {
                Integer top = stk.pop();
                while (!stk.isEmpty() && heights[top] == heights[stk.peek()]) {
                    stk.pop();
                }

                int curWidth;

                if (stk.isEmpty()) {
                    curWidth = i;
                } else {
                    curWidth = i - stk.peek() - 1;
                }

                ans = Math.max(ans, curWidth * heights[top]);
            }
            stk.push(i);
        }

        while (!stk.isEmpty()) {
            Integer top = stk.pop();
            while (!stk.isEmpty() && heights[top] == heights[stk.peek()]) {
                stk.pop();
            }

            int curWidth;

            if (stk.isEmpty()) {
                curWidth = len;
            } else {
                curWidth = len - stk.peek() - 1;
            }

            ans = Math.max(ans, curWidth * heights[top]);
        }

        return ans;
    }
}


