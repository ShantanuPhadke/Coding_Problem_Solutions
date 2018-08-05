import java.util.*;
public class RemoveDups{
	public static void main(String [] args){
		RemoveDups self = new RemoveDups();
		ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(3, null)))))));
		LinkedList firstList = new LinkedList(head);
		LinkedList modified = self.removeDups(firstList);
		ListNode node = modified.head;
		
		firstList.printList();

		ListNode head2 = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, null)))))))));
		LinkedList secondList = new LinkedList(head2);
		LinkedList modified2 = self.removeDups(secondList);
		ListNode node2 = modified2.head;
		
		secondList.printList();
	}

	//Remove up all duplicates from an unsorted LinkedList
	//Using extra space
	public LinkedList removeDups(LinkedList list){
		ListNode node = list.head;
		ArrayList<Integer> seen = new ArrayList<Integer>();
		while(node.next != null){
			seen.add(node.value);
			ListNode node2 = node.next;
			if(seen.indexOf(node2.value) > -1){
				node.next = node2.next;
				node2 = node.next;
			}else{
				node = node.next;
				node2 = node2.next;
			}
		}
		return list;
	}

	//Removes all duplicates from an unsorted LinkedList
	//Using No extra space
	public LinkedList removeDups2(LinkedList list){
		ListNode outerNode = list.head;
		int outerIndex = 0;
		while(outerNode != null){
			int outerValue = outerNode.value;
			ListNode innerNode = list.head;
			int innerIndex = 0;
			while(innerNode.next != null){
				int innerValue = innerNode.next.value;
				if(innerValue == outerValue && outerIndex != innerIndex){
					innerNode.next = innerNode.next.next;
				}
				innerNode = innerNode.next;
				innerIndex+=1;
			}
		}
		return list;
	}

}