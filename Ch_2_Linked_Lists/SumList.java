public class SumList{
	
	public static void main(String [] args){
		SumList self = new SumList();
		ListNode head1 = new ListNode(7, new ListNode(1, new ListNode(6, null)));
		LinkedList list1 = new LinkedList(head1);
		ListNode head2 = new ListNode(5, new ListNode(9, new ListNode(2, null)));
		LinkedList list2 = new LinkedList(head2);
		LinkedList result = self.sumList(list1, list2);

		result.printList();

	}

	public LinkedList sumList(LinkedList list1, LinkedList list2){
		ListNode node1 = list1.head;
		ListNode node2 = list2.head;
		ListNode head = new ListNode();
		LinkedList result = new LinkedList(head);
		int carryOver = 0;

		while(node1 != null && node2 != null){
			int sum = node1.value + node2.value + carryOver;
			int digit = sum%10;
			carryOver = sum/10;
			head.value = digit;

			if(node1.next != null && node2.next != null){
				head.next = new ListNode();
				head = head.next;
			}

			node1 = node1.next;
			node2 = node2.next;
		}
		return result;
	}

}