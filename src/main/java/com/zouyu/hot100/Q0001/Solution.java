package com.zouyu.hot100.Q0001;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZouYu 2022/8/20 21:59
 * @version 1.0.0
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return null;
    }
}
