package com.absurd.leetcode;

import org.junit.Test;

/**
 * Created by wangwenwei on 2017/8/22.
 */
public class P92Test {
    @Test
    public void reverseList(){
        P92 p = new P92();
        int[] arr =  {1,2,3,4,5};
//        int[] arr = {3,5};
        ListNode head = ListNode.makeListNode(arr);
        ListNode e =  p.reverseBetween(head,1,5);
        System.out.println();
    }
}
