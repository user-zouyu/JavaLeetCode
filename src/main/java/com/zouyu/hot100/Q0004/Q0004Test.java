package com.zouyu.hot100.Q0004;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/8/20 23:41
 * @version 1.0.0
 */
public class Q0004Test {

    private static Solution solution;

    @BeforeAll
    public static void init() {
         solution = new Solution();
    }


    @Test
    void test1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(result, 2.0);
    }


    @Test
    void test2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(result, 2.5);
    }

    @Test
    void error1() {
        int[] nums1 = {};
        int[] nums2 = {1};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(result, 1);
    }

    @Test
    void error2() {
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(result, 2);
    }


}
