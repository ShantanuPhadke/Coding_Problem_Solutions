import java.util.*;

public class StringCompression{

	public static void main(String [] args){
		StringCompression self = new StringCompression();
		String compressedString = self.stringCompression("aabcccccaaa");
		System.out.println("Output for Input of \"aabcccccaaa\": " + compressedString);
	}

	public String stringCompression(String original){
		String compressed = new String();
		int index = 0;
		while(index < original.length()){
			int currentCount = 1;
			char current = original.charAt(index);
			while(index < original.length()-1 && current == original.charAt(index+1)){
				index++;
				currentCount++;
			}
			String currentInfo = current+""+currentCount;
			compressed+=currentInfo;
			index++;
		}
		return compressed;
	}

}