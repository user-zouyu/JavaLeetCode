package com.zouyu.hot100.Q0055;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/11/1 8:41
 * @version 1.0.0
 */
public class Q0055Test {

    private static final Solution solution = new Solution();

    @Test
    void test() {
        int[] nums = {2, 3, 1, 1, 4};
        boolean canJump = solution.canJump(nums);

        Assertions.assertTrue(canJump);
    }

    @Test
    void test2() {
        int[] nums = {3, 2, 1, 0, 4};
        boolean canJump = solution.canJump(nums);

        Assertions.assertFalse(canJump);
    }

    @Test
    void error() {
        int[] nums = {2, 0, 0};
        boolean canJump = solution.canJump(nums);

        Assertions.assertTrue(canJump);
    }

}
