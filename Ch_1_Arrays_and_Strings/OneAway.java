import java.util.*;

public class OneAway{

	public static void main(String [] args){
		OneAway self = new OneAway();
		boolean result1 = self.oneAway("pale","ple");
		System.out.println("Output for Inputs \"pale\" and \"ple\": " + result1);
	}

	public boolean oneAway(String str1, String str2){
		HashMap<Character, Integer> counts1 = charCounts(str1);
		HashMap<Character, Integer> counts2 = charCounts(str2);
		//Insert = One of the characters will have a count that is one more than the count of
		//the character in the other String
		for(Character c : counts1.keySet()){
			
		}
		//Delete = One of the characters will have a count that is one less than the count of
		//the character in the other string
		//Replace = Total count of one of the characters is one less than in the other string's 
		//HashMap, while the count of another one of the characters is one more than in the
		//other string's HashMap.
	}

	public HashMap<Character, Integer> charCounts(String str){
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
}