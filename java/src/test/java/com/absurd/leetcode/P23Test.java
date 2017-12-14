package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wangwenwei
 * @time 2017/12/12
 */
public class P23Test {
    @Test
    public void mergeKLists(){
        Assert.assertEquals(P23.mergeKLists(makeList1()),makeList1Result());
    }


    P23.ListNode[] makeList1(){
        P23.ListNode[] list = new P23.ListNode[3];
        list[0] = P23.ListNode.makeListNode(new int[]{1,2,7});

        list[1] = P23.ListNode.makeListNode(new int[]{3,6,8});
        list[2] = P23.ListNode.makeListNode(new int[]{4,5,9});
        return list;
    }

    P23.ListNode makeList1Result(){
        return P23.ListNode.makeListNode(new int[]{1,2,3,4,5,6,7,8,9});
    }

}
