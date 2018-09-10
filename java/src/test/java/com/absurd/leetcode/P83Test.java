package com.absurd.leetcode;

import org.junit.Test;

/**
 * @author wangwenwei
 * @time 2018/7/30
 */
public class P83Test {
    P83 p83 = new P83();
    @Test
    public void deleteDuplicates(){
        ListNode head = new ListNode(3);
        ListNode listNode = head;
        listNode.next = new ListNode(3);
        listNode = listNode.next;
        listNode.next = new ListNode(4);
        listNode = listNode.next;
        listNode.next = new ListNode(5);
        listNode = listNode.next;
        listNode.next = new ListNode(6);
        listNode = listNode.next;
        listNode.next = new ListNode(6);
        ListNode resultNode = p83.deleteDuplicates(head);
        System.out.println(resultNode.toString());

    }
}
