package com.absurd.leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 * @author wangwenwei
 * @time 2017/12/11
 */
public class P23_4 {

    /***
     * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
     * @param lists
     * @return
     */
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(-1);
        ListNode eNode = head;
        int size = lists.length;
        Queue<ListNode> queue = new PriorityQueue<ListNode>(size, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for(int i=0;i<size;i++){
            if (lists[i] != null)
                queue.offer(lists[i]);
        }
        while ( !queue.isEmpty() ){
            eNode.next = queue.poll();
            eNode = eNode.next;
            if (eNode.next != null) {
                queue.offer(eNode.next);
            }
        }

        return head.next;
    }

}
