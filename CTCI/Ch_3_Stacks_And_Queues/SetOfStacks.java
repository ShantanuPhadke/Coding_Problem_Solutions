//SetOfStacks is a Data Structure that simulates a series of
//Stacks that are each filled up till their capacity. The push
//and pop methods work just like they work for normal Stacks.
import java.util.*;
public class SetOfStacks{
	
	private int capacity;
	private ArrayList<Stack<Integer>> setOfStacks;
	private ArrayList<Integer> stackSizes;

	public SetOfStacks(int capacity){
		this.capacity = capacity;
		this.setOfStacks = new ArrayList<Stack<Integer>>();
		this.setOfStacks.add(new Stack<Integer>());
		this.stackSizes = new ArrayList<Integer>();
		this.stackSizes.add(0);
	}

	public void push(int value){
		Stack<Integer> currentStack;
		int currentStackSize = stackSizes.get(stackSizes.size()-1);
		if(currentStackSize < capacity){
			//Means there is still space in the current Stack we are 
			//adding into.
			currentStack = setOfStacks.get(setOfStacks.size()-1);
			currentStack.push(value);
			stackSizes.set(stackSizes.size()-1, currentStackSize+1);
		}else{
			//Means we need to add in a new Stack to the end of our
			//ArrayList of Stacks
			currentStack = new Stack<Integer>();
			currentStack.push(value);
			setOfStacks.add(currentStack);
			stackSizes.add(1);
		}
	}

	public int pop(){
		//Get the last Stack in setOfStacks and then pop() from that one
		Stack<Integer> currentStack = setOfStacks.get(setOfStacks.size()-1);
		int poppedValue = currentStack.pop();
		int currentStackSize = stackSizes.get(stackSizes.size()-1);
		stackSizes.set(stackSizes.size()-1, currentStackSize-1);
		if(stackSizes.get(stackSizes.size()-1) == 0 && setOfStacks.size() > 1){
			stackSizes.remove(stackSizes.size()-1);
			setOfStacks.remove(setOfStacks.size()-1);
		}
		return poppedValue;
	}

	public int popAt(int index){
		//Pops at the inputted Stack index
		Stack<Integer> popStack = setOfStacks.get(index);
		int poppedValue = popStack.pop();
		int popStackSize = stackSizes.get(index);
		stackSizes.set(index, popStackSize-1);
		if(stackSizes.get(index) == 0 && setOfStacks.size() > 1){
			stackSizes.remove(index);
			setOfStacks.remove(index);
		}
		return poppedValue;
	}

}