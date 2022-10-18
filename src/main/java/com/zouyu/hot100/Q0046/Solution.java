package com.zouyu.hot100.Q0046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author ZouYu 2022/10/18 12:29
 * @version 1.0.0
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }

        int length = nums.length;
        backtrack(length, output, res, 0);
        return res;
    }

    public void backtrack(int length, List<Integer> output, List<List<Integer>> res, int first) {
        if (first == length) {
            res.add(new ArrayList<>(output));
        }

        for (int i = first; i < length; i++) {
            Collections.swap(output, first, i);
            backtrack(length, output, res, first + 1);
            Collections.swap(output, first, i);
        }
    }
}

