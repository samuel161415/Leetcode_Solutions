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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode current=lists[i];
             while(current!=null){
         pq.add(current.val);
         current=current.next;  }
        }
        ListNode head=null;
       while(pq.size()>0){
            ListNode node=new ListNode();
           node.val=pq.remove();
           node.next=null;
            if(head==null) head=node;
        else{
            ListNode current=head;
            while(current.next!=null){
                current=current.next; }
            current.next=node;  }
           }
       
        return head;
    }
}