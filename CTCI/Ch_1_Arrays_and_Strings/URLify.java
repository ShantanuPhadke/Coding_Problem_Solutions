import java.util.*;
public class URLify{
	public static void main(String [] args){
		URLify self = new URLify();
		String str = "Mr John Smith    ";
		String urlString1 = self.urlify(str.toCharArray(), 13);
		System.out.println("URL String 1 (Expected \"Mr%20John%20Smith\"): " + urlString1);
	}

	//Hint #53  -
	//Hint #118 -

	public String urlify(char [] original, int originalLength){
		String urlString = "";
		char [] modified = new char[original.length];
		int modifiedIndex = 0;
		for(int originalIndex = 0; originalIndex < originalLength; originalIndex++){
			char current = original[originalIndex];
			if(current == ' '){
				modified[modifiedIndex] = '%';
				modified[modifiedIndex+1] = '2';
				modified[modifiedIndex+2] = '0';
				modifiedIndex+=3;
			}else{
				modified[modifiedIndex] = current;
				modifiedIndex++;
			}
		}
		
		for(int index = 0; index < modified.length; index++){
			char current = modified[index];
			urlString+=current;
		}
		return urlString;
	}
}