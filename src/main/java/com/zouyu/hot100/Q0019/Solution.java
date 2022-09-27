package com.zouyu.hot100.Q0019;

import com.zouyu.Common.ListNode;

/**
 * @author ZouYu 2022/9/27 14:41
 * @version 1.0.0
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = slow;

        while (n > 0 && fast != null) {
            fast = fast.next;
            n--;
        }

        ListNode next = null;
        while (fast != null) {
            fast = fast.next;
            next = slow;
            slow = slow.next;
        }
        if (next == null) {
            head = head.next;
            slow.next = null; // help GC
        } else {
            ListNode tmp = next.next;
            next.next = next.next.next;
            tmp.next = null; // help GC
        }
        return head;
    }
}
