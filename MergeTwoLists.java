/*
https://leetcode.com/problems/merge-two-sorted-lists/
*/

/**
 * Definition for singly-linked list.
 */ 
 public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
/* SOLUTION */ 
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode first=new ListNode(-99);
        ListNode remember=first;
        while(l1!=null && l2!=null)
        {
        if(l1.val<l2.val)
        {
            first.next=l1;
            l1=l1.next;
        }
        else
        {
            first.next=l2;
            l2=l2.next;
        }
        first=first.next;
        }
        
        if(l1==null)
        {
            first.next=l2;
        }
        if(l2==null)
        {
            first.next=l1;
        }
        return remember.next;
    }
 
}
