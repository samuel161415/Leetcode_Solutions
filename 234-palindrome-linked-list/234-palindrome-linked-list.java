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
    public boolean isPalindrome(ListNode head) {
        ListNode last=head;
        List<Integer> list=new ArrayList<>();
        
        while(last!=null){
            list.add(last.val);
            last=last.next;
        }
        int end=list.size()-1;
        int start=0;
        while(start<end){
            if(list.get(start)!=list.get(end)) return false;
            start++;
            end--;
        }
        return true;
        
    }
}