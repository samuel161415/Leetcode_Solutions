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
   
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int min=Integer.MAX_VALUE;
        ListNode c1=list1;
        ListNode c2=list2;
        ListNode start=new ListNode(0);
        ListNode c=start;
        while(c1!=null||c2!=null){
           if(c1==null&&c2!=null){
               c.next=c2;
               c2=c2.next;
                   }
            else if(c1!=null&&c2==null){
                c.next=c1;
                c1=c1.next;
                           }
            else{
                if(c1.val<=c2.val){
                    c.next=c1;
                    c1=c1.next;
                }
                else{
                    c.next=c2;
                    c2=c2.next;
                }
            }
            c=c.next;
        }
        return start.next;
        }
}