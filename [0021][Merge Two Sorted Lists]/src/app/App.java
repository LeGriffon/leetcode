package app;

import Solution.*;

public class App {
    public static void main(String[] args) throws Exception {
        Solution obj = new Solution();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode result = obj.mergeTwoLists(l1, l2);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}