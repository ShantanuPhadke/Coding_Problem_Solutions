public class KthToLast{

	public static void main(String [] args){
		KthToLast self = new KthToLast();

		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
		LinkedList firstList = new LinkedList(head);
		ListNode firstToEnd = self.kthToLast(firstList, 1);
		ListNode secondToEnd = self.kthToLast(firstList, 2);
		ListNode thirdToEnd = self.kthToLast(firstList, 3);
		System.out.println(firstToEnd.value);
		System.out.println(secondToEnd.value);
		System.out.println(thirdToEnd.value);
	}

	public ListNode kthToLast(LinkedList input, int k){
		ListNode node = input.head;
		ListNode kthNode = input.head;

		int count = 0;
		while(count < k){
			kthNode = kthNode.next;
			count++;
		}

		while(kthNode != null){
			node = node.next;
			kthNode = kthNode.next;
		}

		return node;
	}

}