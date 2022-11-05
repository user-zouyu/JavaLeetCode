package com.zouyu.leetcode.hot100.Q0001;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author ZouYu 2022/8/20 21:59
 * @version 1.0.0
 */
public class MainTest {

    private static Solution solution;

    @BeforeAll
    static void init() {
        solution = new Solution();
    }

    @Test
    void test() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }

    @Test
    void test2() {
        int[] nums = {3, 2, 4};
        int target = 6;

        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }

}
