public class BST{
	public BSTNode root;

	public BST(){
		this.root = null;
	}

	public BST(BSTNode root){
		this.root = root;
	}

	public void insert(int newValue){
		if(root == null){
			root = new BSTNode(newValue, null, null);
			return;
		}
		root.insert(newValue);
	}

	public void inOrderTraversal(){
		if(root != null){
			root.inOrderTraversal();
		}
		System.out.println();
	}

	public int height(){
		if(root != null){
			return root.height();
		}return 0;
	}
}