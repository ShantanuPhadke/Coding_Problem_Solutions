public class ThreeInOneTester{
	
	public static void main(String [] args){
		ThreeInOne testStacks = new ThreeInOne();
		testStacks.pushStack1(1);
		testStacks.pushStack1(2);
		testStacks.pushStack1(3);

		testStacks.pushStack2(4);
		testStacks.pushStack2(5);

		testStacks.pushStack3(6);

		testStacks.printArrayState();
		System.out.println(testStacks.popStack1());
		testStacks.printArrayState();
		System.out.println(testStacks.popStack2());
		testStacks.printArrayState();
		System.out.println(testStacks.popStack3());
		testStacks.printArrayState();
		System.out.println(testStacks.popStack3());
		testStacks.printArrayState();
		System.out.println(testStacks.popStack2());
		testStacks.printArrayState();
		System.out.println(testStacks.popStack2());
		testStacks.printArrayState();
		System.out.println(testStacks.popStack1());
		testStacks.printArrayState();
		System.out.println(testStacks.popStack1());
		testStacks.printArrayState();
		System.out.println(testStacks.popStack1());
		testStacks.printArrayState();
	}

}