/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode middle(ListNode A) {
        ListNode slow=A,fast=A;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode curr=head, prev=null;
        while(curr != null) {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
        
    }
    
    public int lPalin(ListNode A) {
        if(A==null) {
            return 1;
        }
        ListNode mid=middle(A);
        ListNode last=reverse(mid);
        ListNode curr=A;
        while(last!=null) {
            if(last.val != curr.val) {
                return 0;
            }
            last=last.next;
            curr=curr.next;
        }
        return 1;
    }
    
}
