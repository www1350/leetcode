package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wangwenwei
 * @time 2017/12/12
 */
public class P23_3Test {
    @Test
    public void mergeKLists(){
        Assert.assertEquals(P23_3.mergeKLists(makeList1()),makeList1Result());
        Assert.assertEquals(makeList2Result(),ListNode.reverse(makeList1Result()));
    }


    ListNode[] makeList1(){
        ListNode[] list = new ListNode[3];
        list[0] = ListNode.makeListNode(new int[]{1,2,7});

        list[1] = ListNode.makeListNode(new int[]{3,6,8});
        list[2] = ListNode.makeListNode(new int[]{4,5,9});
        return list;
    }

    ListNode makeList1Result(){
        return ListNode.makeListNode(new int[]{1,2,3,4,5,6,7,8,9});
    }

    ListNode makeList2Result(){
        return ListNode.makeListNode(new int[]{9,8,7,6,5,4,3,2,1});
    }

}
