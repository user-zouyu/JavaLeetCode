package com.zouyu.hot100.Q0023;

import com.zouyu.Common.ListNode;

import java.util.AbstractQueue;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author ZouYu 2022/10/7 13:40
 * @version 1.0.0
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) {
            return null;
        }
        QueueNode listNodes = new QueueNode(lists);
        ListNode root = new ListNode(0);
        ListNode temp = root;
        while (listNodes.size() > 0) {
            temp.next = listNodes.poll();
            temp = temp.next;
        }
        return root.next;
    }

    public static class QueueNode extends AbstractQueue<ListNode> {
        private final Object[] queue;
        private int size = 0;

        private final Comparator<ListNode> comparator = (o1, o2) -> {
            if(o1.val < o2.val) {
                return -1;
            } else if (o1.val > o2.val) {
                return 1;
            }
            return 0;
        };

        public QueueNode(int initialCapacity) {
            if (initialCapacity < 1)
                throw new IllegalArgumentException();
            this.queue = new Object[initialCapacity];

        }

        public QueueNode(ListNode[] listNodes) {
            size = 0;
            this.queue = new Object[listNodes.length];
            for (ListNode listNode : listNodes) {
                this.offer(listNode);
            }
        }

        @Override
        public Iterator<ListNode> iterator() {
            throw new UnsupportedOperationException("iterator");
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public boolean offer(ListNode e) {
            if (e == null)
                return false;
            int i = size;
            if (i >= queue.length)
                throw new IndexOutOfBoundsException("超过最大容量");
            size = i + 1;
            if (i == 0)
                queue[0] = e;
            else
                siftUp(i, e);
            return true;
        }

        @Override
        public ListNode peek() {
            return (size == 0) ? null : (ListNode) queue[0];
        }

        @Override
        public ListNode poll() {
            if (size == 0)
                return null;
            ListNode result = (ListNode) queue[0];
            ListNode x;
            if (result.next == null) {
                int s = --size;
                x = (ListNode) queue[s];
                queue[s] = null;
            } else {
                x = result.next;
            }
            result.next = null;
            siftDown(x);
            return result;
        }

        private void siftUp(int k, ListNode x) {
            siftUpUsingComparator(k, x);
        }

        private void siftUpUsingComparator(int k, ListNode x) {
            while (k > 0) {
                int parent = (k - 1) >>> 1;
                Object e = queue[parent];
                if (comparator.compare(x, (ListNode) e) >= 0)
                    break;
                queue[k] = e;
                k = parent;
            }
            queue[k] = x;
        }

        private void siftDown(ListNode x) {
            siftDownUsingComparator(0, x);
        }

        private void siftDownUsingComparator(int k, ListNode x) {
            int half = size >>> 1;
            while (k < half) {
                int child = (k << 1) + 1;
                Object c = queue[child];
                int right = child + 1;
                if (right < size &&
                        comparator.compare((ListNode) c, (ListNode) queue[right]) > 0)
                    c = queue[child = right];
                if (comparator.compare(x, (ListNode) c) <= 0)
                    break;
                queue[k] = c;
                k = child;
            }
            queue[k] = x;
        }

    }
}