package app;

public class App {
    public static void main(String[] args) throws Exception {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        Solution obj = new Solution();
        boolean result = obj.hasCycle(head);
        System.out.println(result);
    }
}