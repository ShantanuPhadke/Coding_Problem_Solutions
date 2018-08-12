public class StackMin{

	//LinkedList of MinStackNodes where each node will keep track of the 
	//minimum value "under" each node
	public MinStackNode head;

	public StackMin(){
		this.head = null;
	}

	public void push(int value){
		if(head == null){
			head = new MinStackNode(value, null);
		}else{
			MinStackNode newHead = new MinStackNode(value, head);
			
			head = newHead;
		}
	}

	public int pop(){
		MinStackNode oldHead = head;
		MinStackNode newHead = oldHead.next;
		oldHead.next = null;
		head = newHead;
		return oldHead.value;
	}

	public int min(){
		return head.minValue;
	}

}