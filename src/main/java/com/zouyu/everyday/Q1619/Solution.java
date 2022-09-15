package com.zouyu.everyday.Q1619;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZouYu 2022/9/14 22:42
 * @version 1.0.0
 */
class Solution {
    public double trimMean(int[] arr) {

        int sum = Arrays.stream(arr)
                .sorted()
                .skip(arr.length / 20)
                .limit((arr.length * 9L) / 10)
                .sum();

        return (double) sum / (double) ((arr.length * 9L) / 10);
    }
}
