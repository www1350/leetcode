package com.absurd.leetcode;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii/description/
 * Created by wangwenwei on 17/8/9.
 */
public class P92 {
    /***
     * Reverse a linked list from position m to n. Do it in-place and in one-pass.

     For example:
     Given 1->2->3->4->5->NULL, m = 2 and n = 4,

     return 1->4->3->2->5->NULL.

     Note:
     Given m, n satisfy the following condition:
     1 ? m ? n ? length of list.


     * @param head
     * @param m
     * @param n
     * @return
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode e = head;
        ListNode mNode = head;
        ListNode nNode = head;
        ListNode mmNode = null;
        for(int i=1;i<=n;i++){
            if (i == m-1) mmNode = e;
            if (i == m)  mNode = e;
            if (i == n)  nNode = e;
            e = e.next;
        }
        ListNode npNode = e;
        nNode.next = null;


        ListNode a = npNode;
        ListNode  b = mNode;

        while(b!=null){
            b = mNode.next;
            mNode.next = a;
            a = mNode;
            mNode = b;
        }
        if (mmNode == null ) return nNode;

        mmNode.next = nNode;
        return head;
    }
}
