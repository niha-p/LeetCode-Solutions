/*
https://leetcode.com/problems/add-two-numbers/
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
public class AddTwoNumbersList {
    
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode ret=new ListNode(0);
        ListNode temp1=l1,temp2=l2;
        ListNode ans=ret;
        int a=0,b=0,carry=0;
        while(temp1!=null || temp2!=null)
        {
            if(temp1!=null)
                a=temp1.val;
            else
                a=0;
            if(temp2!=null)
                b=temp2.val;
            else
                b=0;
            int sum=a+b+carry;
            ListNode t=new ListNode(sum%10);
            ans.next=t;
            ans=ans.next;
            if(sum>9)
                carry=1;
            else carry=0;   
            if(temp1!=null)
                temp1=temp1.next;
            
            if(temp2!=null)
                temp2=temp2.next;    
        }
        
        if (carry>=1)
        {
            ListNode g=new ListNode(1);
            ans.next=g;
        }
        return ret.next;
    }
}