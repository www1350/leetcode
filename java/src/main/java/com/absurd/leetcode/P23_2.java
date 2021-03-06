package com.absurd.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;
/**
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 * @author wangwenwei
 * @time 2017/12/11
 */
public class P23_2 {

    /***
     * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
     * @param lists
     * @return
     */
    public static ListNode mergeKLists(ListNode[] lists) {
        Queue<Integer> queue = new PriorityQueue();
        for(int i=0;i<lists.length;i++){
            ListNode tmp =  lists[i];
            while(tmp !=null){
                queue.add(tmp.val);
                tmp = tmp.next;
            }
        }
        ListNode head = new ListNode(-1);
        ListNode e = head;
        while (!queue.isEmpty()){
            Integer a =  queue.poll();
            e.next = new ListNode(a);
            e = e.next;
        }
        return head.next;
    }

}
