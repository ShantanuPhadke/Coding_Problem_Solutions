public class StringRotation {
	
	public static void main(String [] args){
		StringRotation self = new StringRotation();
		boolean result1 = self.isRotation("waterbottle", "erbottlewat");
		System.out.println("is erbottlewat a rotation of waterbottle? " + result1);
	}

	//Checks if s2 is a rotation of s1 utilizing only a single
	//call to the function isSubstring(s1,s2)
	public boolean isRotation(String s1, String s2){
		//Implementation #1: Keep taking one char from end of s2, adding 
		//it to the start of s2, and check if altered string == s1. Maximum
		//number of such alterations should equal min(len(s1), len(s2))
		if(s1.length() != s2.length()){
			return false;
		}

		int numAlterations = 0;
		while(numAlterations < s2.length()){
			//Do Alteration
			char lastChar = s2.charAt(s2.length()-1);
			s2 = lastChar + s2.substring(0,s2.length()-1);
			//Do Check
			if(s2.equals(s1)){
				return true;
			}

			numAlterations+=1;
		}

		return false;
	}

	//Helper method, checks if string2 is a substring of string1
	public boolean isSubstring(String string1, String string2){
		if(string2.length() > string1.length()){
			return false;
		}

		int length = string2.length();
		for(int start = 0; start < string1.length(); start++){
			for(int end = start+1; end <= this.min(start+length, string1.length()); end++){
				String currentSubstring = string1.substring(start, end);
				if(currentSubstring.equals(string2)){
					return true;
				}
			}
		}

		return false;

	}

	public int min(int value1, int value2){
		if(value1 <= value2){
			return value1;
		}return value2;
	}

}