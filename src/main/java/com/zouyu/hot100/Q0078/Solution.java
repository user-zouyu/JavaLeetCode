package com.zouyu.hot100.Q0078;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZouYu 2022/11/1 10:24
 * @version 1.0.0
 */
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int length = nums.length;
        int mask = 1 << length;

        ArrayList<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < mask; i++) {
            ArrayList<Integer> r = new ArrayList<>();
            for (int j = 0; j < length; j++) {
                if ((i & (1 << j)) > 0) {
                    r.add(nums[j]);
                }
            }
            res.add(r);
        }

        return res;
    }
}