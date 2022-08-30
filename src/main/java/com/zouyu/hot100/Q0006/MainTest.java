package com.zouyu.hot100.Q0006;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/8/30 19:44
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
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String convert = solution.convert(s, numRows);
        Assertions.assertEquals("PAHNAPLSIIGYIR", convert);
//        P   A   H   N
//        A P L S I I G
//        Y   I   R
    }

    @Test
    void test2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;

        String convert = solution.convert(s, numRows);

        Assertions.assertEquals("PINALSIGYAHRPI", convert);
//        P     I    N
//        A   L S  I G
//        Y A   H R
//        P     I
    }


}
