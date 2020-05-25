package ersin;

//Create a string that removes dublicates in a string

public class RemoveDublicates {
	
	public static void main(String[] args) {
		
		String str = "ersin ozbenli";

		// option 1 using contains and replace (while loop)
		System.out.println("The string that has the unique characters in " + str + " is " + findUnique1(str));

		// option 2 using contains and charAt (for loop)
		System.out.println("The string that has the unique characters in " + str + " is " + findUnique2(str));
		
		// option 3 using contains and charAt (for loop)
		System.out.println("The string that has the unique characters in " + str + " is " + findUnique3(str));
		
	}
	



	// charAt, replace and contains
	public static String findUnique1(String str) {

		String unique="";
		String tempString;		
		while (str.length()>=1){	
			tempString = "" + str.charAt(0);
			str = str.replace(tempString, "");
			unique += tempString;			
		}		
		return unique;
	}


	// charAt, replace and contains
	public static String findUnique2(String str) {

		String unique="";			
		for (int i = 0; i < str.length(); i++) {
			if (!unique.contains(str.substring(i,i+1))) unique += str.charAt(i);
		}			
		return unique;
	}


	// charAt, replace and contains
	public static String findUnique3(String str) {
		String unique="";	
		while (str.length()>=1){
			unique += str.substring(0,1);	
			str = str.replace(str.substring(0,1), "");
		}		
		return unique;
	}

}

