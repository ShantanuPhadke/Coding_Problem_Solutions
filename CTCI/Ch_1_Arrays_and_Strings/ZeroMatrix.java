public class ZeroMatrix{
	
	public static void main (String [] args){
		ZeroMatrix self = new ZeroMatrix();

		int [][] sample1 = new int[2][2];
		sample1[0][0] = 1;
		sample1[0][1] = 0;
		sample1[1][1] = 1;
		sample1[1][0] = 1;
		int [][] modified = self.zeroMatrix(sample1);

		for(int row = 0; row < modified.length; row++){
			for(int col = 0; col < modified[row].length; col++){
				System.out.print(sample1[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	//Approach #1: With Helper Method
	public int [][] zeroMatrix(int [][] original){
		for(int row = 0; row < original.length; row++){
			for(int col = 0; col < original[row].length; col++){
				if(original[row][col] == 0){
					return setZeros(row, col, original);
				}
			}
		}
		return original;
	}

	public int [][] setZeros(int row, int col, int [][] original){
		for(int currCol = 0; currCol < original[row].length; currCol++){
			original[row][currCol] = 0;
		}

		for(int currRow = 0; currRow < original.length; currRow++){
			original[currRow][col] = 0;
		}
		return original;
	}



}