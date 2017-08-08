package com.absurd.leetcode;

import org.junit.Test;

/**
 * Created by wangwenwei on 17/8/8.
 */
public class P206Test {
    @Test
    public void reverseList(){
        P206 p = new P206();
        P206.ListNode head = new P206.ListNode(1);
        head.next = new P206.ListNode(2);
        P206.ListNode.toAll(head);
        P206.ListNode.toAll(p.reverseList(head));
    }
}
