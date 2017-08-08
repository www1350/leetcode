package com.absurd.leetcode;

/**
 * https://leetcode.com/problems/reverse-linked-list/description/
 * Created by wangwenwei on 17/8/8.
 */
public class P206 {

    /***
     * Reverse a singly linked list.
     * Hint:
     * A linked list can be reversed either iteratively or recursively. Could you implement both?
     *null   A    ->B ->C->D
     * a   head b
     *null   A     -> B    ->   C -> D
     * a   head    b
     * A    B     -> C->D
     * a    head b
     *
     * A     <- B         C   ->   D
     *          a       head b
     * A     <- B    <-   C   D
     *                    a  head  b
     * A     <- B    <-   C  <-  D
     *                          a       head   b
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        //最关键的其实是两部分。一部分是反转后的头节点，一部分是反转前的头节点，
        //a代表反转后头节点，初始是null    需要一个临时指针b，指向反转前的第二个节点以防止更改关联后失去了反转前的链路
        ListNode a = null;
        ListNode  b =head;

        while(b!=null){
            b = head.next;
            head.next = a;
            a = head;
            head = b;
        }
        return a;
    }


      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
          public static  void toAll(ListNode head){
              while (head!=null){
                  System.out.printf(head.val+"");
                  head = head.next;
              }
              System.out.println();
          }
      }

}
