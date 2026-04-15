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
    public void reorderList(ListNode head) {
         if(head==null || head.next==null)
            return;
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
        }

        //reverse
        ListNode current = slow.next;
        ListNode previous = null;
        slow.next=null;

        while (current!=null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        ListNode second = previous;
        ListNode first = head;

        //merge
        while(second!=null){
            ListNode nextOfFirst = first.next;
            ListNode nextofSecond = second.next;

            first.next = second;
            second.next = nextOfFirst;

            first = nextOfFirst;
            second = nextofSecond;

        }

    }
}
