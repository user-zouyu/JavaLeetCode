package com.zouyu.everyday.Q17_09;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/9/28 18:42
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
        int magicNumber = solution.getKthMagicNumber(4);
        System.out.println(magicNumber);
    }
}
