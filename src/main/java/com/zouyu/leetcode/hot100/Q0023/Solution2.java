package com.zouyu.leetcode.hot100.Q0023;

import com.zouyu.Common.ListNode;

/**
 * @author ZouYu 2022/10/7 18:50
 * @version 1.0.0
 */
public class Solution2 extends Solution {
    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }
        for (int times = 1; times < lists.length; times = times * 2) {
            for (int i = 0; i + times < lists.length; i += times * 2) {
                lists[i] = mergeTwoList(lists[i], lists[i + times]);
                lists[i + times] = null;
            }
        }

        return lists[0];
    }

    public ListNode mergeTwoList(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;

        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        tail.next = list1 != null ? list1 : list2;
        return head.next;
    }

}
