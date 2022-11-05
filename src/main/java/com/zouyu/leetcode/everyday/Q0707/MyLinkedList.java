package com.zouyu.leetcode.everyday.Q0707;

/**
 * @author ZouYu 2022/9/23 20:30
 * @version 1.0.0
 */
public class MyLinkedList {

    private final Node head;

    public MyLinkedList() {
        head = new Node(0);
    }

    public int get(int index) {
        Node nodeIndex = head.next;
        for (int i = 0; i < index && nodeIndex != null; i++) {
            nodeIndex = nodeIndex.next;
        }
        if (nodeIndex == null)
            return -1;
        return nodeIndex.getValue();
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head.next;
        head.next = node;
    }

    public void addAtTail(int val) {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = new Node(val);
    }

    public void addAtIndex(int index, int val) {
        Node nodeIndex = head;
        for (int i = 0; i < index && nodeIndex != null; i++) {
            nodeIndex = nodeIndex.next;
        }

        if(nodeIndex != null) {
            Node node = new Node(val);
            node.next = nodeIndex.next;
            nodeIndex.next = node;
        }
    }

    public void deleteAtIndex(int index) {
        Node nodeIndex = head;
        for (int i = 0; i < index && nodeIndex != null; i++) {
            nodeIndex = nodeIndex.next;
        }
        if (nodeIndex != null) {
            Node node = nodeIndex.next;
            if(node != null) {
                nodeIndex.next = node.next;
                node.next = null; // help GC
            }
        }
    }

    public static class Node {
        private int value;

        public Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}

