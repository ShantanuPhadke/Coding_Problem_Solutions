//Transforms sorted array to a binary search tree with minimum height
public class MinimalTree{

	public static void main(String [] args){
		MinimalTree self = new MinimalTree();
		int [] sorted = {1,2,3,4,5,6,7,8};
		BST minimal1 = self.minimalTree(0, sorted.length-1, sorted);
		minimal1.inOrderTraversal();
		System.out.println(minimal1.height());
		System.out.println();
	}
	//Hints #19,73,116
	public BST minimalTree(int start, int end, int [] sorted){
		BSTNode root = minimalTreeHelper(start, end, sorted);
		return new BST(root);
	}

	public BSTNode minimalTreeHelper(int start, int end, int [] sorted){
		if(start > end){
			return null;
		}
		int middle = (start+end)/2;
		BSTNode node = new BSTNode();
		node.value = sorted[middle];
		node.left = minimalTreeHelper(start, middle-1, sorted);
		node.right = minimalTreeHelper(middle+1, end, sorted);
		return node;
	}

}