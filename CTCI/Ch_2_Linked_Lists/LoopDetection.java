public class LoopDetection{
	
	public static void main(String [] args){
		LoopDetection self = new LoopDetection();

		ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, null)));
		LinkedList list1 = new LinkedList(head1);
		list1.head.next.next.next = list1.head.next;
		boolean result1 = self.hasLoop(list1);
		System.out.println(result1);

		ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, null)));
		LinkedList list2 = new LinkedList(head2);
		boolean result2 = self.hasLoop(list2);
		System.out.println(result2);

		ListNode result3 = self.loopDetection(list1);
		System.out.println(result3.value);
	}

	//Slight alteration of the algorithm below:
	//Phase 1 is detecting if the LinkedList list has a loop
	//Phase 2 is detecting the starting ListNode of the loop
		//Reset one of the nodes back to the head of the LinkedList
		//Move both pointer one node at a time now
		//The ListNode at which both pointer meet is the starting node
		//for the loop.
	public ListNode loopDetection(LinkedList list){
		ListNode meetingNode = this.startFastNode(list);
		if(meetingNode == null){
			return null;
		}
		ListNode node2 = list.head;
		while(!meetingNode.equals(node2)){
			meetingNode = meetingNode.next;
			node2 = node2.next;
		}
		return meetingNode;
	}

	public ListNode startFastNode(LinkedList list){
		ListNode slowNode = list.head;
		ListNode fastNode = list.head;
		while(slowNode != null && fastNode.next != null){
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
			if(slowNode.equals(fastNode)){
				return slowNode;
			}
		}
		return null;
	}

	//Solving easier problem of detecting whether or not a LinkedList
	//has a loop, using Floyd Cycle detection
	//Floyd Cycle Detection involves one fast pointer and one slow pointer
	//The fast pointer moves by 2 each time while the slow pointer moves 
	//by one each time. If the two pointers meet at any time, then the 
	//LinkedList has a cycle.
	public boolean hasLoop(LinkedList list){
		ListNode slowNode = list.head;
		ListNode fastNode = list.head;
		while(slowNode != null && fastNode.next != null){
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
			if(slowNode.equals(fastNode)){
				return true;
			}
		}
		return false;
	}

}