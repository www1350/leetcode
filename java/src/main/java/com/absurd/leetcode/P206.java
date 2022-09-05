package com.absurd.leetcode;

/**
 * https://leetcode.com/problems/reverse-linked-list/description/
 * Created by wangwenwei on 17/8/8.
 */
public class P206 {

    /***
     * Reverse a singly linked list.
     * Hint:
     * A linked list can be reversed either iteratively or recursively. Could you implement both?
     *null   A    ->B ->C->D
     * pre   head cur
     *null <- A     -> B    ->   C -> D
     * pre   head    cur
     * A    B     -> C->D
     * pre    head cur
     *
     * A     <- B         C   ->   D
     *          pre       head cur
     * A     <- B    <-   C   D
     *                    pre  head  cur
     * A     <- B    <-   C  <-  D
     *                          pre       head   cur
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        //最关键的其实是两部分。一部分是反转后的头节点，一部分是反转前的头节点，
        //pre代表反转后头节点，初始是null    需要一个临时指针cur，指向反转前的第二个节点以防止更改关联后失去了反转前的链路
        ListNode pre = null;
        ListNode  cur =head;

        while(cur!=null){
            cur = head.next;
            head.next = pre;
            pre = head;
            head = cur;
        }
        return pre;
    }

}
