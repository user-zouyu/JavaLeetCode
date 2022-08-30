package com.zouyu.hot100.Q0654;

import com.zouyu.Common.TreeNode;

/**
 * @author ZouYu 2022/8/20 21:10
 * @version 1.0.0
 */
public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructTree(nums, 0, nums.length);
    }

    public TreeNode constructTree(int[] nums, int start, int end) {
        if(start >= end) {
            return null;
        }
        int index = start;
        for (int i = start + 1; i < end; i++) {
            if(nums[index] < nums[i]) {
                index = i;
            }
        }
        return new TreeNode(nums[index], constructTree(nums, start, index), constructTree(nums, index + 1, end));
    }
}
