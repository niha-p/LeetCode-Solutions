/*
https://leetcode.com/problems/remove-duplicates-from-sorted-list/
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        return null;
        ListNode f=head;
        while(f.next!=null)
        {
            if(f.val==f.next.val)
            {
                ListNode q=f.next.next;
                f.next=q;
                //f.next.next=null;
            }
            else
            f=f.next;
        }
        return head;
    }
}