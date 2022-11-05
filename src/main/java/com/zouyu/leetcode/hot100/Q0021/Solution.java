package com.zouyu.leetcode.hot100.Q0021;

import com.zouyu.Common.ListNode;

/**
 * @author ZouYu 2022/9/27 18:04
 * @version 1.0.0
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode head = new ListNode(0);
        ListNode next = head;
        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                next.next = list1;
                list1 = list1.next;
            } else {
                next.next = list2;
                list2 = list2.next;
            }
            next = next.next;
        }

        while (list1 != null) {
            next.next = list1;
            list1 = list1.next;
            next = next.next;
        }

        while (list2 != null) {
            next.next = list2;
            list2 = list2.next;
            next = next.next;
        }

        return head.next;
    }
}
