package com.zouyu.everyday.Q0707;

import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/9/23 20:31
 * @version 1.0.0
 */
public class MainTest {
    @Test
    void test() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
        int val = linkedList.get(1);//返回2
        System.out.println(val);
        linkedList.deleteAtIndex(3);  //现在链表是1-> 3
        val = linkedList.get(1);//返回3

        System.out.println(val);

    }

    // ["MyLinkedList","addAtHead","get","addAtHead","addAtHead","deleteAtIndex","addAtHead","get","get","get","addAtHead","deleteAtIndex"]
    //  [ [], [4], [1], [1], [5], [3], [7], [3], [3],[3],[1],[4]]

}
