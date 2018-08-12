public class SetOfStacksTester{
	
	public static void main(String [] args){
		SetOfStacks stacks = new SetOfStacks(5);
		//Testing the push() and pop() methods
		for(int iteration = 0; iteration < 12; iteration++){
			stacks.push(iteration);
		}
		System.out.println("The following pops should be in descending order from 11 to 0:");
		for(int iteration = 0; iteration < 12; iteration++){
			System.out.println(stacks.pop()); 
		}

		//Testing the popAt(int index) method
		for(int iteration = 0; iteration < 12; iteration++){
			stacks.push(iteration);
		}

		System.out.println("Expecting 11: " + stacks.popAt(2));
		System.out.println("Expecting 9: " + stacks.popAt(1));
		System.out.println("Expecting 4: " + stacks.popAt(0));
	}

}