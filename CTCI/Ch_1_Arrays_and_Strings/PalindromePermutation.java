import java.util.*;
public class PalindromePermutation{

	public static void main(String [] args){
		PalindromePermutation self = new PalindromePermutation();
		boolean result1 = self.palindromePermutation("Tact Coa");
		System.out.println("Result for input = \"Tact Coa\" (Should be true): " + result1);
	}

	//Implementation #1: Without seeing any hints
	//Runtime: O(n), where n = 
	//Storage: 
	//Plan: A palindrome can be of odd length or even length. Even length palindromes 
	//have to have counts of 2 for each of the characters in the given String. An odd 
	//length palindrome can have at max one "unmatched" character.
	public boolean palindromePermutation(String permutation){
		int numUnmatchedChars = 0;
		HashMap<Character, Integer> counts = getCounts(permutation.replaceAll(" ", "").toLowerCase());
		for(Character c : counts.keySet()){
			numUnmatchedChars+=(counts.get(c)%2);
		}
		if(numUnmatchedChars <= 1){
			return true;
		}return false;
	}

	public HashMap<Character, Integer> getCounts(String permutation){
		HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
		for(int index = 0; index < permutation.length(); index++){
			char current = permutation.charAt(index);
			if(!charCounts.keySet().contains(current)){
				charCounts.put(current, 1);
			}else{
				int currentCount = charCounts.get(current);
				charCounts.put(current, currentCount+1);
			}
		}
		return charCounts;
	}
}