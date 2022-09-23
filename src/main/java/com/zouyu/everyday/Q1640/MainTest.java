package com.zouyu.everyday.Q1640;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/9/23 20:14
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
        int[] arr = {15, 88};
        int[][] pieces = {{15}, {88}};

        boolean canFormArray = solution.canFormArray(arr, pieces);

        System.out.println(canFormArray);

        Assertions.assertTrue(canFormArray);
    }


    @Test
    void test2() {
        int[] arr = {15, 88, 37, 19};
        int[][] pieces = {{15, 88}, {37, 19}};

        boolean canFormArray = solution.canFormArray(arr, pieces);

        System.out.println(canFormArray);

        Assertions.assertTrue(canFormArray);
    }

}
