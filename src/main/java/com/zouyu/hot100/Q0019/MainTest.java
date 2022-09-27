package com.zouyu.hot100.Q0019;

import com.zouyu.Common.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/9/27 14:42
 * @version 1.0.0
 */
public class MainTest {

    private static Solution solution;

    @BeforeAll
    public static void init() {
        solution = new Solution();
    }


    @Test
    void test_1() {
        ListNode head = ListNode.build(1, 2, 3, 4, 5);
        int n = 5;

        ListNode listNode = solution.removeNthFromEnd(head, n);

        System.out.println(listNode);
    }

    @Test
    void test1() {
        ListNode head = ListNode.build(1, 2);
        int n = 1;

        ListNode listNode = solution.removeNthFromEnd(head, n);

        System.out.println(listNode);
    }

}
