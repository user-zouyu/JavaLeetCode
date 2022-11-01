package com.zouyu.hot100.Q0055;

/**
 * @author ZouYu 2022/11/1 8:36
 * @version 1.0.0
 */
class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length < 2) {
            return true;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int l = 2;
                int j = i -1;
                for (; j >= 0; j--) {
                    if (nums[j] >= l) {
                        break;
                    }
                    l++;
                }
                if (j == -1 && i != nums.length - 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
