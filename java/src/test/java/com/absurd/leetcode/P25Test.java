package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wangwenwei
 * @time 2017/12/12
 */
public class P25Test {
    @Test
    public void reverseKGroup(){
        Assert.assertEquals(P25.reverseKGroup(makeList1(),3),makeList1Result());
    }

    @Test
    public void reverseKGroup2(){
        Assert.assertEquals(P25.reverseKGroup(makeList2(),3),makeList2Result());
    }



    ListNode makeList1(){
        return ListNode.makeListNode(new int[]{1,2,3,4,5});
    }

    ListNode makeList2(){
        return ListNode.makeListNode(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14});
    }

    ListNode makeList1Result(){
        return ListNode.makeListNode(new int[]{3,2,1,4,5});
    }

    ListNode makeList2Result(){
        return ListNode.makeListNode(new int[]{3,2,1,6,5,4,9,8,7,12,11,10,13,14});
    }


}
