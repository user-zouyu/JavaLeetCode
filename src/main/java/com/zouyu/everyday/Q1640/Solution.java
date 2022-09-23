package com.zouyu.everyday.Q1640;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZouYu 2022/9/23 20:13
 * @version 1.0.0
 */
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int[] piece : pieces) {
            map.put(piece[0], piece);
        }

        for (int i = 0; i < arr.length; i++) {
            int[] ints = map.get(arr[i]);
            if(ints == null) {
                return false;
            }

            for (int j = 1; j < ints.length; j++) {
                if(arr[i + 1] != ints[j]) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}
