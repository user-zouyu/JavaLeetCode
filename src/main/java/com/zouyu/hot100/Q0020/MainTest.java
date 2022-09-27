package com.zouyu.hot100.Q0020;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/9/27 16:21
 * @version 1.0.0
 */
public class MainTest {

    private static Solution solution;

    @BeforeAll
    public static void init() {
        solution = new Solution();
    }


    @Test
    void test_1() {
        String str = "(){}{}[]";
        Assertions.assertTrue(solution.isValid(str)
        );
    }
    @Test
    void error1() {
        String str = "]";
        Assertions.assertFalse(solution.isValid(str)
        );
    }


}
