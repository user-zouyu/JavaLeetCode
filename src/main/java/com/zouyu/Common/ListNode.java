package com.zouyu.Common;

/**
 * @author ZouYu 2022/8/20 22:13
 * @version 1.0.0
 */
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        stringBuilder.append(val);
        ListNode nextNode = this.next;
        while (nextNode != null) {
            stringBuilder.append(", ");
            stringBuilder.append(nextNode.val);
            nextNode = nextNode.next;
        }
        stringBuilder.append(" ]");

        return stringBuilder.toString();
    }

    public static ListNode build(int... args) {
        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;
        for (int arg : args) {
            temp.next = new ListNode(arg);
            temp = temp.next;
        }
        return listNode.next;
    }
}
