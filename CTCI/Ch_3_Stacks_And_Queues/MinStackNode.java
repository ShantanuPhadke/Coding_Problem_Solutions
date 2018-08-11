public class MinStackNode{
	
	public int minValue;
	public MinStackNode next;
	public int value;

	public MinStackNode(int value, MinStackNode next){
		this.value = value;
		this.next = next;
		
		if(next == null){
			this.minValue = this.value;
		}else{
			if(this.value < next.minValue){
				this.minValue = this.value;
			}else{
				this.minValue = next.minValue;
			}
		}
	}

}