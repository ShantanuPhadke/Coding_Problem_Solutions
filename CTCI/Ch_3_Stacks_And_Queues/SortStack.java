import java.util.Stack;

public class SortStack{

	private Stack<Integer> mainStack;
	private Stack<Integer> temporaryStack;
	
	public SortStack(){
		this.mainStack = new Stack<Integer>();
		this.temporaryStack = new Stack<Integer>();
	}

	public void push(int value){
		if(mainStack.empty()){
			mainStack.push(value);
		}else{
			while(!mainStack.empty() && mainStack.peek() < value){
				temporaryStack.push(mainStack.pop());
			}

			mainStack.push(value);

			while(!temporaryStack.empty()){
				mainStack.push(temporaryStack.pop());
			}
		}
	}

	public int pop(){
		return mainStack.pop();
	}

	public int peek(){
		return mainStack.peek();
	}

	public boolean isEmpty(){
		return mainStack.empty();
	}

}