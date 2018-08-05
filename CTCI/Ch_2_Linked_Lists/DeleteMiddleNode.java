public class DeleteMiddleNode{
	
	public static void main(String [] args){
		DeleteMiddleNode self = new DeleteMiddleNode();

		ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
		LinkedList firstList = new LinkedList(head1);
		ListNode middleNode1 = firstList.head.next; //Node with value of 2
		self.deleteMiddleNode(middleNode1);

		firstList.printList(); //Output should be 1 3 4

		ListNode middleNode2 = firstList.head.next; //Node with value of 3
		self.deleteMiddleNode(middleNode2);

		firstList.printList(); //Output should be 1 4
	}

	//Deletes any of the middle nodes in a LinkedList (anything besides)
	//first or last nodes, given only access to that specific node
	public void deleteMiddleNode(ListNode middleNode){
		middleNode.value = middleNode.next.value;
		middleNode.next = middleNode.next.next;
	}

}