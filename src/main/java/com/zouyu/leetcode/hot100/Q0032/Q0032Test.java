package com.zouyu.leetcode.hot100.Q0032;

import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/10/20 13:32
 * @version 1.0.0
 */
public class Q0032Test {

    private static final Solution solution = new Solution2();

    @Test
    void test1() {
        int i = solution.longestValidParentheses(")()(()()");
        System.out.println(i);
    }

}
