/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int sz=0;
        while(temp !=null){
            temp=temp.next;
            sz++;
        }
        if(n>sz){
            return null;
        }
        if(sz==n){
            return head.next;
        }
        temp=head;
        for(int i=0;i<=sz-n-2;i++)
        {
            temp=temp.next;
        }
        while(true){
            if(sz-1==sz-n){
                if(sz==1){
                    return null;
                }
                temp.next=null;
                return head;
            }

            ListNode nxt=temp.next.next;
            temp.next=nxt;
            return head;

        }
    }
}