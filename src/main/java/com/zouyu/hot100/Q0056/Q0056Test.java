package com.zouyu.hot100.Q0056;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author ZouYu 2022/11/1 9:03
 * @version 1.0.0
 */
public class Q0056Test {
    private static final Solution solution = new Solution();


    @Test
    void test1() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merge = solution.merge(intervals);
        System.out.println(Arrays.deepToString(merge));
    }

    @Test
    void test2() {
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] merge = solution.merge(intervals);
        System.out.println(Arrays.deepToString(merge));
    }

}
