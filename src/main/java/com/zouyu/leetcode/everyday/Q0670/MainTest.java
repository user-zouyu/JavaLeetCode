package com.zouyu.leetcode.everyday.Q0670;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/9/14 23:13
 * @version 1.0.0
 */
public class MainTest {

    private static Solution solution;

    @BeforeAll
    public static void init() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        int swap = solution.maximumSwap(8090);

        Assertions.assertEquals(9080, swap);
        System.out.println(swap);
    }


    @Test
    public void test2() {
        int swap = solution.maximumSwap(9973);

        Assertions.assertEquals(9973, swap);
        System.out.println(swap);
    }

}
