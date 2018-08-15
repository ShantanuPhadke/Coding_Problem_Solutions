public class BSTNode{
	public int value;
	public BSTNode left;
	public BSTNode right;

	public BSTNode(){
		this.value = 0;
		this.left = null;
		this.right = null;
	}

	public BSTNode(int value, BSTNode left, BSTNode right){
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public void insert(int newValue){
		if(newValue <= value){
			//Go down the left branch
			if(left != null){
				left.insert(newValue);
			}else{
				left = new BSTNode(newValue, null, null);
			}
		}else{
			//Go down the right branch
			if(right != null){
				right.insert(newValue);
			}else{
				right = new BSTNode(newValue, null, null);
			}
		}
	}

	public void inOrderTraversal(){
		if(left != null){
			left.inOrderTraversal();
		}
		System.out.print(value + " ");
		if(right != null){
			right.inOrderTraversal();
		}
	}

	public int height(){
		if(left != null && right == null){
			return 1+left.height();
		}else if(right != null && left == null){
			return 1+right.height();
		}else if(right != null && left != null){
			return 1+this.max(left.height(), right.height());
		}else{
			return 1;
		}
	}

	private int max(int value1, int value2){
		if(value1 >= value2){
			return value1;
		}return value2;
	}
}