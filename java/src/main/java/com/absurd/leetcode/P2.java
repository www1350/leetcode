package com.absurd.leetcode;

/**
 * <a>https://leetcode.com/problems/add-two-numbers</a>
 * Created by Administrator on 2016/10/23.
 */
public class P2 {
    /***
     * You are given two linked lists representing two non-negative numbers.
     * The digits are stored in reverse order and each of their nodes contain a single digit.
     * Add the two numbers and return it as a linked list.
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * 243+465=708
     * 2+4+0=7->0
     * 4+6+0=0->1
     * 3+4+1=8->0
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int pre = 0;

        ListNode head =  new ListNode(-1);
        ListNode e = head;
        while(l1!=null||l2!=null){
            int v1=0;
            int v2=0;
            v1= l1==null ? 0 : l1.val;
            v2= l2==null ? 0 : l2.val;
            int temp =  v1+v2+pre;
            pre = temp / 10 ;
            e.next = new  ListNode(temp % 10) ;
            e=e.next;
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
        }
        if( pre > 0 )
            e.next = new  ListNode(1) ;

        return head.next;

    }

  public  class  ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
