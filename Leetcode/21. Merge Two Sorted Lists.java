/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
            return null;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
        ListNode dummy= new ListNode(0);
        ListNode cur = dummy;
        while(l1 != null && l2 != null){
            if(l1.val >= l2.val){
                cur.next = l2;
                l2 = l2.next;
            }else{
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }
        
        if(l1 == null){
            cur.next = l2;
        }
        if(l2 == null){
            cur.next = l1;
        }
        
        return dummy.next;
        
    }
}


Error:
#12 把&& 写成了 ||
#20 写成了.next