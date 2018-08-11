public class StackMinTester{

	public static void main(String [] args){
		StackMin stack = new StackMin();

		for(int element = 10; element >= 0; element--){
			stack.push(element);
		}

		System.out.println("Original Minimum Element: " + stack.min());

		for(int iteration = 0; iteration < 10; iteration++){
			System.out.println("Current Element Popped: " + stack.pop());
			System.out.println("Current Minimum Element: " + stack.min());
		}

	}

}