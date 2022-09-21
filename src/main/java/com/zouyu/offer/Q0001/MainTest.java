package com.zouyu.offer.Q0001;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/9/21 21:21
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
        int div = solution.div(-10000, 4);
        System.out.println(div);
    }
}
