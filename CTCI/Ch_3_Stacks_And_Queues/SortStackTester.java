public class SortStackTester{

	public static void main(String [] arg){
		SortStack sortStack1 = new SortStack();
		sortStack1.push(1);
		sortStack1.push(2);
		sortStack1.push(5);
		sortStack1.push(4);
		sortStack1.push(3);
		sortStack1.push(6);

		System.out.println("The following series of pop() calls should result in values being returned in order: ");
		while(!sortStack1.isEmpty()){
			System.out.println(sortStack1.pop());
		}
	}

}