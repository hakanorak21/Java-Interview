package ersin;

import java.util.Arrays;

public class SameLetters {

	public static void main(String[] args) {
		String str1 = "abacdaaabbbcadd";
		String str2 = "caabd";
				
		System.out.println("method 1:  " + m1(str1, str2));
		System.out.println("with arrays: " + same(str1, str2));

	}
	
	
	public static boolean m1(String str1, String str2) {
		
		while(str1.length()!=0 && str2.length()!=0) {
			str2 = str2.replace(str1.substring(0,1), "");
			str1 = str1.replace(str1.substring(0,1), "");			
		}
		return str1.length()==str2.length();	
	}
	
	//Array solution
	public static boolean same(String a, String b) {
		char[] ch1 = a.toCharArray(); 
		char[] ch2 = b.toCharArray();
		Arrays.sort(ch1); 
		Arrays.sort(ch2);
		String a1="", a2=""; 
		for(char each: ch1) {
			if(!a1.contains(""+each))
				a1 += each;
		}
			
		for(char each: ch2) {
			if(!a2.contains(""+each))
				a2 += each;
		}
			
		return a1.equals(a2) ; 
	}

}
