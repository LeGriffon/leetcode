class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution {
	/*
	 * Since n may be a large number compared to the length of list. So we need to
	 * know the length of linked list.After that, move the list after the (l-n%l )th
	 * node to the front to finish the rotation. Ex: {1,2,3} k=2 Move the list after
	 * the 1st node to the front Ex: {1,2,3} k=5, In this case Move the list after
	 * (3-5%3=1)st node to the front. So the code has three parts. 1) Get the length
	 * 2) Move to the (l-n%l)th node 3)Do the rotation
	 */
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null || k == 0) {
			return head;
		}
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode fast = dummy;
		ListNode slow = dummy;

		int length;
		for (length = 0; fast.next != null; length++) {
			fast = fast.next;
		}

		for (int j = length - k % length; j > 0; j--) {
			slow = slow.next;
		}

		fast.next = dummy.next;
		dummy.next = slow.next;
		slow.next = null;

		return dummy.next;
	}
}
