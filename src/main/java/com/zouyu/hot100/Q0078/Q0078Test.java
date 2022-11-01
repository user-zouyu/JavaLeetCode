package com.zouyu.hot100.Q0078;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author ZouYu 2022/11/1 10:28
 * @version 1.0.0
 */
public class Q0078Test {

    private static final Solution solution = new Solution1();

    @Test
    void test1() {
        int[] nums = {1, 2, 3};

        List<List<Integer>> subsets = solution.subsets(nums);

        subsets.forEach(System.out::println);
    }
}