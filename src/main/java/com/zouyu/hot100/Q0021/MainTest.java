package com.zouyu.hot100.Q0021;

import com.zouyu.Common.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/9/27 18:09
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
        ListNode list1 = ListNode.build(1, 2, 3);
        ListNode list2 = ListNode.build(2, 3, 4);

        ListNode mergeTwoLists = solution.mergeTwoLists(list1, list2);

        System.out.println(mergeTwoLists);
    }
}
