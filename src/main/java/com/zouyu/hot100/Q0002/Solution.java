package com.zouyu.hot100.Q0002;

import com.zouyu.Common.ListNode;

/**
 * @author ZouYu 2022/8/20 22:12
 * @version 1.0.0
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int flag = 0;
        while (l1 != null && l2 != null) {

            flag = flag + l1.val + l2.val;
            temp.next = new ListNode(flag % 10);
            flag /= 10;

            l1 = l1.next;
            l2 = l2.next;
            temp = temp.next;
        }

        while (l1 != null) {
            flag = l1.val + flag;
            temp.next = new ListNode(flag % 10);
            flag = flag / 10;

            l1 = l1.next;
            temp = temp.next;
        }

        while (l2 != null) {
            flag = l2.val + flag;
            temp.next = new ListNode(flag % 10);
            flag = flag / 10;

            l2 = l2.next;
            temp = temp.next;
        }

        if (flag > 0) {
            temp.next = new ListNode(flag);
        }
        return result.next;
    }
}
