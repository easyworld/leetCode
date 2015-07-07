package leetCode;

public class Add_Two_Numbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode head = new ListNode(0);
		ListNode tail = head;
		while (l1 != null || l2 != null || carry != 0) {
			carry += (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
			tail.next = new ListNode(carry % 10);
			carry /= 10;
			tail = tail.next;
			l1 = (l1 == null ? null : l1.next);
			l2 = (l2 == null ? null : l2.next);
		}
		return head.next;
	}

	public static void test(String s) {
		s = "FUCK";
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		// l1.next = new ListNode(4);
		// l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode re = addTwoNumbers(l1, l2);
		for (ListNode l = re; l != null; l = l.next) {
			System.out.println(l.val);
		}
	}
}
