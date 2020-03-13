package Solution;

import java.util.*;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        Queue<ListNode> pq = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode l1, ListNode l2) {
                return l1.val - l2.val;
            }
        });
        for(ListNode n : lists) {
            if(n != null) {
                pq.add(n);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(!pq.isEmpty()) {
            ListNode node = pq.poll();
            curr.next = node;
            if(node.next != null) {
                pq.add(node.next);
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}