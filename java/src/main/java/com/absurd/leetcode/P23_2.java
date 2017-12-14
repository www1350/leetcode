package com.absurd.leetcode;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 * @author wangwenwei
 * @time 2017/12/11
 */
public class P23_2 {

    /***
     * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
     * @param lists
     * @return
     */
    public static ListNode mergeKLists(ListNode[] lists) {
        return null;
    }

    public static class ListNode {
      int val;
      ListNode next;
      public ListNode(int val) {
          this.val = val;
      }
      protected boolean canEqual(Object other) {
            return other instanceof ListNode;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == this) {
                return true;
            } else if(!(obj instanceof ListNode)) {
                return false;
            }else{
                ListNode other = (ListNode)obj;
                if(!other.canEqual(this)) {
                    return false;
                } else {
                    ListNode my = this;
                    while(my != null || other !=null){
                        if (my == null || other ==null) return false;
                        if (my.val != other.val) return false;
                        other = other.next;
                        my = my.next;
                    }
                    return true;
                }
            }
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }

        public static ListNode makeListNode(int[] numbers){
          ListNode head = new ListNode(-1);
          ListNode e = head;
          for(int i=0;i<numbers.length;i++){
              e.next =  new ListNode(numbers[i]);
              e = e.next;
          }
          return head.next;
      }
    }
}
