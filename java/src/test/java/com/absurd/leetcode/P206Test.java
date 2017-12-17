package com.absurd.leetcode;

import org.junit.Test;

/**
 * Created by wangwenwei on 17/8/8.
 */
public class P206Test {
    @Test
    public void reverseList(){
        P206 p = new P206();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        System.out.println(head.toString());
        System.out.println(p.reverseList(head));
    }
}
