public class Intersection{

	public static void main(String [] args){
		Intersection self = new Intersection();
		//Hints #20,45,55,65,76,93,111,120,129

		//Just checking if basic intersection detection is working
		ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
		LinkedList list1 = new LinkedList(head1);
		ListNode head2 = new ListNode(0, new ListNode(1, new ListNode(2, head1.next.next)));
		LinkedList list2 = new LinkedList(head2);
		boolean result1 = self.intersect(list1, list2); //Should be true
		System.out.println(result1);

		ListNode head3 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
		LinkedList list3 = new LinkedList(head3);
		ListNode head4 = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null))))));
		LinkedList list4 = new LinkedList(head4);
		boolean result2 = self.intersect(list3, list4); //Should be false
		System.out.println(result2);

		ListNode intersection1 = self.intersection(list1, list2);
		LinkedList intersectionList1 = new LinkedList(intersection1);
		ListNode intersection2 = self.intersection(list3, list4);
		LinkedList intersectionList2 = new LinkedList(intersection2);
		intersectionList1.printList();
		intersectionList2.printList();
	}

	//Returns the ListNode at the beginning of the intersection of two 
	//Linkedlists otherwise returns null
	public ListNode intersection(LinkedList list1, LinkedList list2){
		ListNode node1 = list1.head;
		ListNode node2 = list2.head;
		//Runtime: O(len(list1)+len(list2)), Space: O(1)

		//Find out the size of the two lists
		int list1Size = 0;
		int list2Size = 0;

		ListNode node1Copy = node1;
		while(node1Copy != null){
			list1Size+=1;
			node1Copy = node1Copy.next;
		}

		ListNode node2Copy = node2;
		while(node2Copy != null){
			list2Size+=1;
			node2Copy = node2Copy.next;
		}

		//Take difference of sizes + find out what is the longer list
		int sizeDiff = list1Size - list2Size;
		ListNode nodeLongerList = node2;
		ListNode nodeShorterList = node1;
		if(sizeDiff > 0){ //Means list1 is longer than list2
			nodeLongerList = node1;
			nodeShorterList = node2;
		}
		sizeDiff = Math.abs(sizeDiff);

		//Now that we know the longer list, go to the sizeDiff^{th} node
		//in the longer list, and then advance by one node in both the 
		//shorter and longer lists till we hit a node of intersection, or 
		//reach the end of the lists
		int index = 0;
		while(index < sizeDiff){
			nodeLongerList = nodeLongerList.next;
			index+=1;
		}

		while(nodeShorterList != null && nodeLongerList != null && !nodeLongerList.equals(nodeShorterList)){
			nodeShorterList = nodeShorterList.next;
			nodeLongerList = nodeLongerList.next;
		}
		return nodeShorterList;
	}

	//Hint #55: First focus on just identifying an intersection
	public boolean intersect(LinkedList list1, LinkedList list2){
		//Just go to the end of both lists and see if that node is the same
		// If it is return true
		// If it isn't return false
		ListNode node1 = list1.head;
		ListNode node2 = list2.head;

		while(node1.next != null){
			node1 = node1.next;
		}

		while(node2.next != null){
			node2 = node2.next;
		}

		if(node1.equals(node2)){
			return true;
		}
		return false;
	}

}