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
    public boolean hasCycle(ListNode head) {
        ListNode left = head;
        ListNode right = head;

        while(right != null && right.next != null){
           right = right.next.next;
           left = left.next;
           
           if(right == left) return true;
        }
        return false;
    }
}
