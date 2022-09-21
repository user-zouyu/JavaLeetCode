package com.zouyu.offer.Q0002;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/9/21 22:01
 * @version 1.0.0
 */
public class MainTest {
    private static Solution solution;

    @BeforeAll
    public static void init() {
        solution = new Solution();
    }

    @Test
    void test() {
        String binary = solution.addBinary("1010", "1000");
        System.out.println(binary);
    }
}
