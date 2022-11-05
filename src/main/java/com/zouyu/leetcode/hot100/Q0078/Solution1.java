package com.zouyu.leetcode.hot100.Q0078;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ZouYu 2022/11/1 10:32
 * @version 1.0.0
 */
public class Solution1 extends Solution{

    private final List<List<Integer>> result = new ArrayList<>();
    @Override
    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0, nums.length, new Stack<>());
        return result;
    }

    private void dfs(int[] nums, int cur, int n, Stack<Integer> res) {
        if (cur == n) {
            result.add(new ArrayList<>(res));
            return;
        }

        res.push(nums[cur]);
        dfs(nums, cur  + 1, n, res);
        res.pop();

        dfs(nums, cur + 1, n, res);
    }
}
