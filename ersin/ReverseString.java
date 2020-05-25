package ersin;

//Functions to reverse a given string by Ersin


import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.lang.Character;

public class ReverseString {

	public static void main(String[] args) {

		String testString = "Ersin Ozbenli";

		// option 1
		ReverseString revStr = new ReverseString();
		String result1 = revStr.reverseString(testString);
		System.out.println(result1);


		// option 2
		String result2 = revStr.reverseString2(testString);
		System.out.println(result2);


		// option 3
		char[] result3 = new char[5];
		char[] testString2 = {'E', 'r', 's', 'i', 'n', '\0', 'O', 'z', 'b', 'e', 'n', 'l', 'i'};	
		int size = testString2.length;
		result3 = revStr.reverseString3(testString2, size);
		System.out.println(result3);

		// option 4
		String result4 = revStr.reverseString4(testString);
		System.out.println(result4);

		// option 5
		String result5 = revStr.reverseString5(testString);
		System.out.println(result5);
		
		
		// option 5
		revStr.reverseString6(testString);

	}



	// Option 1 : Not the beset way
	public String reverseString(String string) {
		String newString = "";
		for(int i=string.length()-1; i>=0; i--) {
			newString += string.charAt(i); 
		}
		return newString;
	}



	// Option 2 : A better way by using the StringBuilder
	public String reverseString2(String string) {
		String newString = new StringBuilder(string).reverse().toString();
		return newString;
	}


	// Option 3 : Using char arrays
	public char[] reverseString3(char[] string, int size) {

		char[] newString = new char[size];
		int index=0;
		for(int i=size-1; i>=0; i--) {
			newString[index] = string[i];
			index++;
		}

		return newString;
	}

	// Option 4 : Using ArrayList
	public String reverseString4(String string) {
		ArrayList<Character> arrList = new ArrayList<>();
		String reverse="";
		for (char c: string.toCharArray()) {
			arrList.add(c);
		}
		Collections.reverse(arrList);  // so far the string was converted to an array list and reversed

		Object[] arrList2 = arrList.toArray();

		for (int i=0; i<arrList2.length; i++) {
			reverse += arrList2[i];  // here we converted the array list back to a string
		}
		return reverse;
	}



	// Option 5 : Using ArrayList
	public String reverseString5(String string) {
		ArrayList<Character> arrList = new ArrayList<>();
		for (char c: string.toCharArray()) {
			arrList.add(c);
		}
		Collections.reverse(arrList);  // so far the string was converted to an array list and reversed

		return arrList.stream().map(String::valueOf).collect(Collectors.joining());
	}



	// Option 6 : Use StringBuilder
	public void reverseString6(String str) {

		char chars[] = str.toCharArray();  // converted to character array and printed in reverse order

		for(int i= chars.length-1; i>=0; i--) {

			System.out.print(chars[i]);

		}

	}

}
