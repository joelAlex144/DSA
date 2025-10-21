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
    public ListNode findPTail(ListNode head){
        ListNode temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        return temp;
    }//returns Second last element in the ll
    public ListNode rearrange(ListNode head,ListNode ptail){
        ListNode tail=ptail.next;
        tail.next=head;
        ptail.next=null;
        head=tail;
        return head;

    }

    public ListNode rotateRight(ListNode head, int k) {
        int i=1;
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        k=k%len;
        while(i<=k){
            ListNode ptail=findPTail(head);
            head=rearrange(head,ptail);
            i++;
        }
        return head;
    }
}



