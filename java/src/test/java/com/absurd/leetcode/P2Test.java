package com.absurd.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.arrayContaining;
import static org.junit.Assert.assertThat;


/**
 * Created by Administrator on 2016/10/23.
 */
public class P2Test {
    @Test
    public void addTwoNumbersSolution(){
        P2 p2 = new P2();
        int a[] = {2,4,3,5,7,8,5};
        int b[] = {5,6,4,7,9,5,1};
//        int a[]={5};
//        int b[]={5};
        P2.ListNode l1 =   p2.new ListNode(-1);
        P2.ListNode e1 = l1;
        P2.ListNode l2 =  p2.new ListNode(-1);
        P2.ListNode e2 = l2;
        for(int ae:a){
            e1.next = p2.new ListNode(ae) ;
            e1=e1.next;
        }
        for(int ae:b){
            e2.next = p2.new ListNode(ae) ;
            e2=e2.next;
        }


        P2.ListNode res = p2.addTwoNumbers(l1.next,l2.next);

        List resList = new ArrayList<>();
        while(res!=null){
            resList.add(res.val);
            res=res.next;
        }
        assertThat(resList, is(equalTo(Arrays.asList(7, 0, 8, 2, 7, 4, 7))));
    }
}
