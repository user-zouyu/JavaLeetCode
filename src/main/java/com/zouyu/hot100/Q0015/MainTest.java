package com.zouyu.hot100.Q0015;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author ZouYu 2022/8/30 20:15
 * @version 1.0.0
 */
public class MainTest {

    private static Solution solution;

    @BeforeAll
    public static void init() {
        solution = new Solution();
    }

    @Test
    void test1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = solution.threeSum(nums);

        System.out.println(lists);
    }

    @Test
    void test2() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> lists = solution.threeSum(nums);

        System.out.println(lists);
    }

    @Test
    void error1() {
        int[] nums = {1, 2, -2, -1};
        List<List<Integer>> lists = solution.threeSum(nums);

        System.out.println(lists);
    }

    @Test
    void error2() {
        int[] nums = {0,0,0,0};

        List<List<Integer>> lists = solution.threeSum(nums);

        System.out.println(lists);

    }

    @Test
    void error3() {
        int[] nums = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};

        List<List<Integer>> lists = solution.threeSum(nums);

        System.out.println(lists);
    }
}
