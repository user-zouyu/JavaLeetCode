package com.zouyu.leetcode.hot100.Q0039;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ZouYu 2022/10/17 22:31
 * @version 1.0.0
 */
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0) {
            return Collections.emptyList();
        }
        Set<List<Integer>> lists = new HashSet<>();
        dfs(candidates, target, 0, new Stack<>(), lists);

        return lists.stream().map(ArrayList::new).collect(Collectors.toList());
    }

    public void dfs(int[] candidates, int target, int current, Stack<Integer> stack, Set<List<Integer>> res) {
        for (int candidate : candidates) {
            int total = candidate + current;
            if (total < target) {
                stack.push(candidate);
                dfs(candidates, target, total, stack, res);
                stack.pop();
            } else if (total == target) {
                stack.push(candidate);
                res.add(new ArrayList<>(stack).stream().sorted().collect(Collectors.toList()));
                stack.pop();
            }
        }
    }
}
