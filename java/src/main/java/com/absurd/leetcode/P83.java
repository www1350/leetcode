package com.absurd.leetcode;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * Example 1:
 * Input: 1->1->2
 * Output: 1->2
 * Example 2:
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 * @author wangwenwei
 * @time 2018/7/30
 */
public class P83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode e = head;
        int lastValue = Integer.MIN_VALUE;
        ListNode lastNode = null;

        while (e != null){
            if (e.val == lastValue){
                lastNode.next = e.next;
            }else{
                lastValue = e.val;
                lastNode = e;
            }
            e = e.next;
        }
        return head;
    }
}
