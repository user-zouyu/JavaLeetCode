package com.zouyu.leetcode.hot100.Q0075;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/11/5 12:47
 * @version 1.0.0
 */
public class Q0075Test {

    private static final Solution solution = new Solution1();

    @Test
    void test1() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] result = {0, 0, 1, 1, 2, 2};
        solution.sortColors(nums);
//        System.out.println(Arrays.toString(nums));
        Assertions.assertArrayEquals(nums, result);
    }

}
