import java.util.*;

public class Palindrome{
	
	public static void main(String [] args){
		Palindrome self = new Palindrome();
		ListNode head1 = new ListNode(1, new ListNode(0, new ListNode(1, null)));
		LinkedList list1 = new LinkedList(head1);
		boolean result1 = self.isPalindrome(list1);
		System.out.println(result1);

		ListNode head2 = new ListNode(1, new ListNode(0, new ListNode(1, new ListNode(0, null))));
		LinkedList list2 = new LinkedList(head2);
		boolean result2 = self.isPalindrome(list2);
		System.out.println(result2);	
	}

	//Checks if the inputted LinkedList represents a palindrome
	//Utilizes the helper function 
	public boolean isPalindrome(LinkedList list){
		Stack<Integer> lifo = new Stack<Integer>();
		ArrayList<Integer> fifo = new ArrayList<Integer>();
		ListNode head = list.head;

		while(head != null){
			lifo.push(head.value);
			fifo.add(head.value);
			head = head.next;
		}

		while(!lifo.empty() && fifo.size() > 0){
			int value1 = lifo.pop();
			int value2 = fifo.remove(0);
			if(value1 != value2){
				return false;
			}
		}

		return true;
	}

}