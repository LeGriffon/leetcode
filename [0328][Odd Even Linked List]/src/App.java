public class App {
    public static void main(String[] args) throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution obj = new Solution();
        ListNode result = obj.oddEvenList(head);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
