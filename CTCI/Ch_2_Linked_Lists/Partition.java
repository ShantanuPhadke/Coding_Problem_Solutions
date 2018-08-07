public class Partition{
	
	public static void main(String [] args){
		Partition self = new Partition();

		ListNode head1 = new ListNode(3, new ListNode(5, new ListNode(8, new ListNode(5, new ListNode(10, new ListNode(2, new ListNode(1, null)))))));
		LinkedList list1 = new LinkedList(head1);
		LinkedList modified1 = self.partition(list1, 5);
		modified1.printList();
	}

	public LinkedList partition(LinkedList list, int target){
		ListNode node = list.head;
		while(node != null){
			if(node.value >= target){
				ListNode node2 = node.next;
				while(node2 != null){
					if(node2.value < target){
						//Swap node and node2 values
						int temp = node.value;
						node.value = node2.value;
						node2.value = temp;
					}
					node2 = node2.next;
				}
			}
			node = node.next;
		}
		return list;
	}

}