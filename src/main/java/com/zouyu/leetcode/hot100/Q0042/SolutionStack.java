package com.zouyu.leetcode.hot100.Q0042;

import java.util.ArrayDeque;

/**
 * @author ZouYu 2022/11/5 11:31
 * @version 1.0.0
 */
public class SolutionStack extends Solution {
    @Override
    public int trap(int[] height) {
        int ans = 0;

        ArrayDeque<Integer> stk = new ArrayDeque<>();

        for (int i = 0; i < height.length; i++) {
            while (!stk.isEmpty() && height[stk.peek()] < height[i]) {
                int top = stk.pop();

                int curHeight;
                int curWidth;
                if (stk.isEmpty()) {
                    curHeight = 0;
                    curWidth = 0;
                } else {
                    curHeight = Math.min(height[stk.peek()], height[i]) - height[top];
                    curWidth = i - stk.peek() - 1;
                }


                ans = ans + curHeight * curWidth;
            }
            stk.push(i);
        }

        return ans;
    }
}
