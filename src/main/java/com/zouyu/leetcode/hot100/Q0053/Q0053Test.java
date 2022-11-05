package com.zouyu.leetcode.hot100.Q0053;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/10/31 19:43
 * @version 1.0.0
 */
public class Q0053Test {

    private static final Solution solution = new Solution();

    @Test
    void test() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSubArray = solution.maxSubArray(nums);

        Assertions.assertEquals(maxSubArray, 6);
        System.out.println(maxSubArray);
    }

    @Test
    void test1() {
        int[] nums = {5, 4, -1, 7, 8};

        int maxSubArray = solution.maxSubArray(nums);


        Assertions.assertEquals(maxSubArray, 23);
        System.out.println(maxSubArray);
    }

    @Test
    void test2() {
        int[] nums = {1};

        int maxSubArray = solution.maxSubArray(nums);


        Assertions.assertEquals(maxSubArray, 1);
        System.out.println(maxSubArray);
    }

    @Test
    void error1() {
        int[] nums = {-2, -1};

        int maxSubArray = solution.maxSubArray(nums);


        Assertions.assertEquals(maxSubArray, -1);
        System.out.println(maxSubArray);
    }

    @Test
    void error2() {
        int[] nums = {1, 2, -1, -2, 2, 1, -2, 1, 4, -5, 4};

        int maxSubArray = solution.maxSubArray(nums);


        Assertions.assertEquals(maxSubArray, 6);
        System.out.println(maxSubArray);
    }

}
