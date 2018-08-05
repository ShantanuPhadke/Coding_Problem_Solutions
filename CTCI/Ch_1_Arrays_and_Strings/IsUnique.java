import java.util.*;

public class IsUnique{

	public static void main(String [] args){
		IsUnique self = new IsUnique();

		boolean isUnique1 = self.isUniqueHint3("cba");
		boolean isUnique2 = self.isUniqueHint3("cbaa");

		System.out.println("Result for input = \"cba\" (Expected Output = true): " + isUnique1);
		System.out.println("Result for input = \"cbaa\" (Expected Output = false): " + isUnique2);
	}

	//Implementation #1: With an additional Data-Structure
	//Runtime: O(n), where n = input.length()
	//Storage: O(n)
	//Plan: Store each of the characters in a HashSet, and each time we are
	//adding in a new character into this HashSet, check if the HashSet has
	//this character in it already.
	HashSet<Character> chars = new HashSet<Character>();
	public boolean isUnique(String input){
		for(int index = 0; index < input.length(); index++){
			char currentChar = input.charAt(index);
			if(chars.contains(currentChar)){
				return false;
			}else{
				chars.add(currentChar);
			}
		}
		return true;
	}

	//Implementation #2: Without an additional Data-Structure
	//Runtime: O(n^2), where n = input.length()
	//Storage: O(1), since no additional data structures used
	//Plan: We iterate through the String in an outer for loop, select the
	//current character, iterate through the same String again in an inner
	//for loop, check if the two indices are the same, if they are not check
	//if the two characters are the same, if they are, then return false. If
	//we reach the end of the two loops, return true.
	public boolean isUniqueNoDataStructures(String input){
		for(int index1 = 0; index1 < input.length(); index1++){
			char currentChar1 = input.charAt(index1);
			for(int index2 = 0; index2 < input.length(); index2++){
				char currentChar2 = input.charAt(index2);
				if(index2 != index1){
					if(currentChar1 == currentChar2){
						return false;
					}
				}
			}
		}
		return true;
	}

	//Hint #44: 1.1 - Try a Hash Table. => Very similar to what I did in
	//Implementation #1.

	//Hint #117: 1.1 - Could a bit vector be useful? => Need to research more
	//on this.

	//Hint #132: 1.1 - Can you solve it in O(N log N) time? What might
	//a solution like that look like? => Seems like a mergesort!
	//Plan: (Step 1): Carry out a mergesort to sort out the inputted String
	//(Step 2): Go through the sorted String and see if any adjacent
	// elements are equal.
	public boolean isUniqueHint3(String input){
		char [] characters = input.toCharArray();
		Arrays.sort(characters);
		for(int index = 0; index < characters.length-1; index++){
			char firstChar = characters[index];
			char secondChar = characters[index+1];
			if(firstChar == secondChar){
				return false;
			}
		}
		return true;
	}
}