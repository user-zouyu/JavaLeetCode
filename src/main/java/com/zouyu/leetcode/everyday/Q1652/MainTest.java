package com.zouyu.leetcode.everyday.Q1652;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author ZouYu 2022/9/24 16:28
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
        int[] code = {1};
        int k = 3;
        int[] decrypt = solution.decrypt(code, k);
        System.out.println(Arrays.toString(decrypt));
    }

    @Test
    void test2() {
        int[] code = {1, 2, 3, 4};
        int k = 0;
        int[] decrypt = solution.decrypt(code, k);
        System.out.println(Arrays.toString(decrypt));
    }

    @Test
    void test3() {
        int[] code = {1, 2, 3, 4};
        int k = 2;
        int[] decrypt = solution.decrypt(code, k);
        System.out.println(Arrays.toString(decrypt));
    }

    @Test
    void test4() {
        int[] code = {1, 2, 3, 4};
        int k = -2;
        int[] decrypt = solution.decrypt(code, k);
        System.out.println(Arrays.toString(decrypt));
    }

}
