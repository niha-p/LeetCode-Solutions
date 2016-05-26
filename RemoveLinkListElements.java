/*
https://leetcode.com/problems/remove-linked-list-elements/
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
 public class RemoveLinkListElements {
    public ListNode removeElements(ListNode head, int val) {
      
         while (head!=null && head.val==val)
         head=head.next;
         if (head==null)
            return null;
        ListNode f=head;
        while(f.next!=null)
        {
            if(f.next.val==val)
            {
                ListNode q=f.next.next;
                f.next=q;
            }
            else
                f=f.next;
        }
        return head;
    }
}