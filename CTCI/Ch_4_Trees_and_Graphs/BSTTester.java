public class BSTTester{
	public static void main(String [] args){
		BST tree1 = new BST();
		tree1.insert(8);
		tree1.insert(4);
		tree1.insert(10);
		tree1.insert(20);
		tree1.insert(2);
		tree1.insert(6);
		tree1.inOrderTraversal();
	}
}