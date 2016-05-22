/*
https://leetcode.com/problems/remove-nth-node-from-end-of-list/
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        ListNode first=head;
        int size=1;
        while(head.next!=null)
        {   head=head.next;
            size++;
        }
        if (size==1)
          return null;
        if(size==n)
        {
            first=first.next;
            return first;
        }
        
        int x=size-n;
        int k=0;
        int y=x-1;
        head=first;
        while(y!=0)//(k<x-1)
        {
            head=head.next;
            //k++;
            y--;
        }
        if(head==first)//(k==0)
            {
            head.next=head.next.next;
            //first=head;
            return head;
            }
        ListNode q=head;
        if(q!=null)
        {
        ListNode z=head.next;
        q.next=z.next;
        z.next=null;
        }
        return first;
    }
}