package com.zouyu.hot100.Q0020;

import java.util.Stack;

/**
 * @author ZouYu 2022/9/27 16:13
 * @version 1.0.0
 */
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false;
            } else if(ch == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                return false;
            } else if(ch == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
