public class BinaryTreeNode{
	public int value;
	public BinaryTreeNode left;
	public BinaryTreeNode right;

	public BinaryTreeNode(){
		this.value = 0;
		this.left = null;
		this.right = null;
	}

	public BinaryTreeNode(int value, BinaryTreeNode left, BinaryTreeNode right){
		this.value = value;
		this.left = left;
		this.right = right;
	}

}