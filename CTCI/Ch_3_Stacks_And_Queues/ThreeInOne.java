public class ThreeInOne{

	private int [] myArray;
	//Current starting index of each of the three Stacks
	private int stack1Start;
	private int stack2Start;
	private int stack3Start;
	//Current sizes of each of the three stacks
	private int stack1Size;
	private int stack2Size;
	private int stack3Size;

	public ThreeInOne(){
		myArray = new int[0];

		stack1Start = 0;
		stack1Size = 0;

		stack2Start = stack1Size;
		stack2Size = 0;

		stack3Start = stack1Size+stack2Size;
		stack3Size = 0;
	}

	public void pushStack1(int value){
		stack1Size+=1;
		stack2Start++;
		stack3Start++;
		myArray = fillArray(myArray, stack1Start+stack1Size-1, value);
	}

	public Integer popStack1(){
		if(stack1Size > 0){
			int returnValue = myArray[stack1Start+stack1Size-1];
			myArray = popValue(myArray, stack1Start+stack1Size-1);
			stack1Size--;
			stack2Start--;
			stack3Start--;
			return returnValue;
		}
		return null;
	}

	public void pushStack2(int value){
		stack2Size++;
		stack3Start++;
		myArray = fillArray(myArray, stack2Start+stack2Size-1, value);
	}

	public Integer popStack2(){
		if(stack2Size > 0){
			int returnValue = myArray[stack1Start+stack1Size-1];
			myArray = popValue(myArray, stack1Start+stack1Size-1);
			stack2Size--;
			stack3Start--;
			return returnValue;
		}
		return null;
	}

	public void pushStack3(int value){
		stack3Size++;
		myArray = fillArray(myArray, stack3Start+stack3Size-1, value);
	}

	public Integer popStack3(){
		if(stack3Size > 0){
			int returnValue = myArray[stack3Start+stack3Size-1];
			myArray = popValue(myArray, stack3Start+stack3Size-1);
			stack3Size--;
			return returnValue;
		}
		return null;
	}


	public int [] fillArray(int [] original, int newIndex, int newValue){
		int [] newArray = new int[original.length+1];
		for(int index = 0; index < original.length; index++){
			if(index < newIndex){
				newArray[index] = original[index];
			}else if(index > newIndex){
				newArray[index+1] = original[index];
			}
		}
		newArray[newIndex] = newValue;
		return newArray;
	}

	public int [] popValue(int [] original, int index){
		int [] newArray = new int[original.length-1];
		for(int position = 0; position < original.length; position++){
			if(position < index){
				newArray[position] = original[position];
			}else if(position > index){
				newArray[position-1] = original[position];
			}
		}
		return newArray;
	}

	public void printArrayState(){
		for(int pos = 0; pos < myArray.length; pos++){
			System.out.print(myArray[pos] + " ");
		}System.out.println();
	}

}