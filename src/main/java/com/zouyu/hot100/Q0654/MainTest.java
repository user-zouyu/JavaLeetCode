package com.zouyu.hot100.Q0654;

import com.zouyu.Common.BTreePrinter;
import com.zouyu.Common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/8/20 21:09
 * @version 1.0.0
 */
public class MainTest {

    @Test
    void test() {
        int[] nums = {3, 2, 1, 6, 0, 5};

        Solution solution = new Solution();

        TreeNode treeNode = solution.constructMaximumBinaryTree(nums);

        BTreePrinter.printNode(treeNode);
    }

    @Test
    void test2() {
        int[] nums = {4, 5, 3, 8, 0, 2, 6, 1};

        Solution solution = new Solution();

        TreeNode treeNode = solution.constructMaximumBinaryTree(nums);

        BTreePrinter.printNode(treeNode);
    }
}
