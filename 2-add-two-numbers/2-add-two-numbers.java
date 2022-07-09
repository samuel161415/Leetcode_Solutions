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
import java.util.*;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      return helper(l1,l2,new ListNode(),0);
        
}
    public ListNode helper(ListNode l1,ListNode l2,ListNode node,int carry){
        if(l1==null&&l2==null){
            if(carry!=0) {
                node.val=carry;
                node.next=null;
            }
            else return null;
          
        }
        else if(l1!=null&&l2!=null){
          
            node.val=(l1.val+l2.val+carry)%10;
           node.next=helper(l1.next,l2.next,new ListNode(),(l1.val+l2.val+carry)/10);
        }
        else if(l1!=null&&l2==null){
            node.val=(l1.val+carry)%10;
            node.next=helper(l1.next,null,new ListNode(),(l1.val+carry)/10);
            }
        else {
            node.val=(l2.val+carry)%10;
         node.next=helper(null,l2.next,new ListNode(),(l2.val+carry)/10);
            }
        return node;
    }
}