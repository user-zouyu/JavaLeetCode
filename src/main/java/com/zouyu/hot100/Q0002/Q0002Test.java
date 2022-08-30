package com.zouyu.hot100.Q0002;

import com.zouyu.Common.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/8/20 22:12
 * @version 1.0.0
 */
public class Q0002Test {

    private static Solution solution;

    @BeforeAll
    public static void init() {
        solution = new Solution();
    }

    @Test
    void test1() {
        ListNode l1 = ListNode.build(2, 4, 3);
        ListNode l2 = ListNode.build(5, 6, 4);
        ListNode listNode = solution.addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }

    @Test
    void test2() {
        ListNode l1 = ListNode.build(9, 9, 9, 9, 9, 9, 9);
        ListNode l2 = ListNode.build(9, 9, 9, 9);

        ListNode listNode = solution.addTwoNumbers(l1, l2);

        System.out.println(listNode);
    }

}
