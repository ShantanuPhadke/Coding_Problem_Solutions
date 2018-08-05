import java.util.*;

public class CheckPermutation{
	public static void main(String [] args){
		CheckPermutation self = new CheckPermutation();

		boolean value1 = self.checkPermutation("abc", "cba");
		boolean value2 = self.checkPermutation("aaba", "baa");

		System.out.println("Result for input1 = \"abc\", input2 = \"cba\" (Expected Output = true): " + value1);
		System.out.println("Result for input1 = \"aaba\", input2 = \"baa\" (Expected Output = false): " + value2);
	}

	public boolean checkPermutation(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}

		HashMap<Character, Integer> strCounts = characterCounts(str1);
		for(int index = 0; index < str1.length(); index++){
			char current = str1.charAt(index);
			int currentCount = strCounts.get(current);
			strCounts.put(current, currentCount-1);
		}

		for(Character c : strCounts.keySet()){
			int currentCount = strCounts.get(c);
			if(currentCount > 0){
				return false;
			}
		}
		return true;
	}

	public HashMap<Character, Integer> characterCounts(String str){
		HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
		for(int index = 0; index < str.length(); index++){
			char current = str.charAt(index);
			if(!counts.keySet().contains(current)){
				counts.put(current, 1);
			}else{
				int currentCount = counts.get(current);
				counts.put(current, currentCount+1);
			}
		}
		return counts;
	}

	//Hint #1   -
	//Hint #84  -
	//Hint #122 -
	//Hint #131 - 
}