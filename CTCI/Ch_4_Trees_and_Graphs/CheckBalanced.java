public class CheckBalanced{
	
	public static void main(String [] args){
		CheckBalanced self = new CheckBalanced();
		BinaryTreeNode root1 = new BinaryTreeNode(4, null, null);
		root1.left = new BinaryTreeNode(3, null, null);
		root1.left.left = new BinaryTreeNode(2, null, null);
		BinaryTree tree1 = new BinaryTree(root1);
		boolean result1 = self.checkBalanced(tree1);
		System.out.println("Result 1 (Should be false): " + result1);

		root1.right = new BinaryTreeNode(7, null, null);
		root1.right.right = new BinaryTreeNode(10, null, null);
		root1.right.left = new BinaryTreeNode(5, null, null);
		boolean result2 = self.checkBalanced(tree1);
		System.out.println("Result 2 (Should be true): " + result2);
	}

	public boolean checkBalanced(BinaryTree tree){
		BinaryTreeNode root = tree.root;
		if(root != null){
			return checkBalancedHelper(root);
		}return true; // Technically if root is null it is balanced
	}

	public boolean checkBalancedHelper(BinaryTreeNode treeNode){
		if(treeNode.left != null && treeNode.right != null){
			return checkBalancedHelper(treeNode.left) && checkBalancedHelper(treeNode.right);
		}else{
			if(treeNode.left == null && treeNode.right != null){
				if(treeNode.right.right != null || treeNode.right.left != null){
					return false;
				}return true;
			}else if(treeNode.right == null && treeNode.left != null){
				if(treeNode.left.right != null || treeNode.left.left != null){
					return false;
				}return true;
			}
			return true;
		}
	}

}