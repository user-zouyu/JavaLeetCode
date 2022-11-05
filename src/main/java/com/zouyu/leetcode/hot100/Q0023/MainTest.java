package com.zouyu.leetcode.hot100.Q0023;

import com.zouyu.Common.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/10/7 18:18
 * @version 1.0.0
 */
public class MainTest {

    private static Solution solution;

    @BeforeAll
    public static void init() {
         solution = new Solution2();
    }

    @Test
    public void test1() {
        ListNode[] node = {ListNode.build(1, 4, 5), ListNode.build(1, 3, 4), ListNode.build(2, 6)};
        ListNode listNode = solution.mergeKLists(node);
        System.out.println(listNode);

    }
    @Test
    public void test2() {
        ListNode[] node = {ListNode.build(1, 4, 5), null, ListNode.build(2, 6)};
        ListNode listNode = solution.mergeKLists(node);
        System.out.println(listNode);

    }
    @Test
    public void test3() {
        ListNode[] node = {null};
        ListNode listNode = solution.mergeKLists(node);
        System.out.println(listNode);

    }


}
