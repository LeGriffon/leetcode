public class App {
    public static void main(String[] args) throws Exception {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 2;
        Solution obj = new Solution();
        ListNode result = obj.reverseKGroup(head, k);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
