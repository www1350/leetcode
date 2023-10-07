package com.absurd.leetcode;

/**
 * https://leetcode.com/problems/reverse-nodes-in-k-group/description/
 * @author wangwenwei
 * @time 2017/12/16
 */
public class P25 {
    /***
     * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

     k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

     You may not alter the values in the nodes, only nodes itself may be changed.

     Only constant memory is allowed.

     For example,
     Given this linked list: 1->2->3->4->5

     For k = 2, you should return: 2->1->4->3->5

     For k = 3, you should return: 3->2->1->4->5
     * @param head
     * @param k
     * @return
     */
    public static ListNode reverseKGroup(ListNode head, int k) {
        int length = getLength(head);
        ListNode result = new ListNode(-1);
        ListNode resultTmp = result;
        for(;length>=k;length-=k){
            ListNode pHead = null;
            for(int i=0;i<k;i++){
                ListNode cur = head.next;
                head.next = pHead;
                pHead = head;
                head = cur;
            }
            resultTmp.next = pHead;
            while (resultTmp.next !=null){ resultTmp = resultTmp.next;}
        }
        resultTmp.next = head;
        return result.next;
    }

    public static int getLength(ListNode head){
        ListNode tmp = head;
        int i=0;
        while (tmp != null) {
            tmp = tmp.next;
            i++;
        }
        return i;
    }
}
