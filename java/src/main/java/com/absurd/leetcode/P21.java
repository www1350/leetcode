package com.absurd.leetcode;

/**
 * 21. Merge Two Sorted Lists
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

 Example:

 Input: 1->2->4, 1->3->4
 Output: 1->1->2->3->4->4
 * @author wangwenwei
 * @time 2018/7/31
 */
public class P21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);
        ListNode e = preHead;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                e.next = l1;
                l1 = l1.next;
            } else{
                e.next = l2;
                l2 = l2.next;
            }
            e = e.next;
        }
        while (l1 != null){
            e.next = l1;
            l1 = l1.next;
            e = e.next;
        }

        while (l2 != null){
            e.next = l2;
            l2 = l2.next;
            e = e.next;
        }

        return preHead.next;

    }
}
