package hakan;

public class FrequencyOfCharacters {

	/**
	Write a return method that can find the frequency of characters
	Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
	*/
	
	public static String FrequencyOfCharacters(String str){
	
		String unique = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			if(!unique.contains(str.substring(i, i+1))) {
				unique += str.substring(i, i+1);
				int count = 0;
				for(int j = i; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j))
						count++;
				}
				unique += count;
			}
			
		}
	
		return unique;
	}
	
	public static void main(String[] args) {
		
		String str1 = FrequencyOfCharacters("AAABBCDD");
		System.out.println(str1);
	}
	
}
