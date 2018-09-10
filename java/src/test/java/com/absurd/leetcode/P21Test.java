package com.absurd.leetcode;

import org.junit.Test;

/**
 * @author wangwenwei
 * @time 2018/7/31
 */
public class P21Test {
    P21 p21 = new P21();
    @Test
    public void mergeTwoLists(){
        ListNode l1 = new ListNode(1);
        makeL1(l1);
        ListNode l2 = new ListNode(1);
        makeL2(l2);
        ListNode result = p21.mergeTwoLists(l1,l2);
        System.out.println(result.toString());

    }

    private void makeL2(ListNode l2) {
        ListNode e = l2;
        e.next = new ListNode(3);
        e = e.next;
        e.next = new ListNode(4);
    }

    private void makeL1(ListNode l1) {
        ListNode e = l1;
        e.next = new ListNode(2);
        e = e.next;
        e.next = new ListNode(4);
    }
}
