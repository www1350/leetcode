package com.absurd.leetcode;


/**
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 * @author wangwenwei
 * @time 2017/12/11
 */
public class P23 {

    /***
     * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
     * @param lists
     * @return
     */
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(-1);
        ListNode ea = head;

        while (true) {
            int idx = -1;
            int tmp = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) {
                    continue;
                }
                if (lists[i].val < tmp) {
                    idx = i;
                    tmp = lists[i].val;
                }
            }
            if (idx < 0) break;
            ea.next = lists[idx];
            lists[idx] = lists[idx].next;
            ea = ea.next;
            ea.next = null;
        }
        return head.next;
    }


}
