public class LinkedList{
	public ListNode head;

	public LinkedList(ListNode head){
		this.head = head;
	}

	//Generic utility function, prints out linked list values
	public void printList(){
		ListNode headCopy = head;
		while(headCopy != null){
			System.out.print(headCopy.value + " ");
			headCopy = headCopy.next;
		}
		System.out.println();
	}

}