package Solution;

public class Solution{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null && l2 != null) return l2;
        if(l1 != null && l2 == null) return l1;
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        ListNode p = l1, q = l2;

        while(p != null && q != null) {
            if(p.val < q.val) {
                node.next = p;
                p = p.next;
            }
            else {
                node.next = q;
                q = q.next;
            }
            node = node.next;
        }
        if(p == null && q != null) {
            node.next = q;
        }
        else if(p != null && q == null) {
            node.next = p;
        }
        return dummy.next;
    }
}