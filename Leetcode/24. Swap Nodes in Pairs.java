/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next ==null)
            return head;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        dummy.next = head;
        while(cur.next != null && cur.next.next!=null){
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = cur.next.next;
            cur.next.next = temp;
            
            cur = cur.next.next;
        }
        return dummy.next;
    }
}

//comment
#22 忘记把cur node往后跳