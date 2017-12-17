package com.absurd.leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 * @author wangwenwei
 * @time 2017/12/11
 */
public class P23_3 {

    /***
     * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
     * @param lists
     * @return
     */
    public static ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode tmp =  lists[i];
            while(tmp !=null){
                list.add(tmp.val);
                tmp = tmp.next;
            }
        }
        ListNode head = new ListNode(-1);
        ListNode e = head;
        Collections.sort(list);
        for (Integer a :list){
            e.next = new ListNode(a);
            e = e.next;
        }
        return head.next;
    }
}
