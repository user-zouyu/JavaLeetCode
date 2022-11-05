package com.zouyu.leetcode.hot100.Q0032;

import java.util.Stack;

/**
 * @author ZouYu 2022/10/20 17:56
 * @version 1.0.0
 */
class Solution2 extends Solution {

    public int longestValidParentheses(String s) {
        int length = s.length();
        if (length < 2) {
            return 0;
        }

        int max = 0;
        Stack<Integer> stack = new Stack<>();

        stack.push(-1);
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
//        System.out.println(Arrays.toString(dp));
        return max;
    }
}
