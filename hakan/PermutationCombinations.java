package hakan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PermutationCombinations {

	/*
	 * Given an array of 3 characters print all permutation combinations 
	 * from the given characters
	 */
	
	public static void main(String[] args) {
//		String str = "abc";
//		char[] ch = str.toCharArray();
//		printPermutation(ch);
//		permutations("abc");
		String str = "abcd";
        char[] chs = str.toCharArray();
        permute(str,0,str.length()-1);
		
	}
	
//	public static void printPermutation(char[] ch) {
//
//		for(String s: permutation(ch))
//
//			System.out.println(Arrays.toString( s.toCharArray( ) )  );
//
//	}
//
//	public static Set<String> permutation(char[] ch) {
//
//		String str = Arrays.toString(ch).replace(", ", "").
//				replace("[", "").replace("]", "");
//
//		Set<String> set = new LinkedHashSet<>();
//
//		if (str.length() == 1)
//
//			set.add(str);
//
//		else
//
//			for (int i=0; i<str.length(); i++){
//
//				String a3 = str.substring(0, i)+ str.substring(i+1);
//
//				char[] ch2 = a3.toCharArray();
//
//				for (String permutation: permutation(ch2))
//
//					set.add(str.charAt(i) + permutation);
//			}
//
//		return set;
//
//	}

//	//YouTube guy
//	public static ArrayList<String> permutations(String s){
//		ArrayList<String> result = new ArrayList<String>();
//		permutations("", s, result);
//		return result;
//		
//	}
//	
//	private static void permutations(String prefix, String suffix, List<String> results) {
//		
//		if(suffix.length() == 0) {
//			results.add(prefix);
//		
//		}else {
//			for(int i=0; i < suffix.length(); i++) {
//				permutations(prefix + suffix.charAt(i),
//							 suffix.substring(0, i) + suffix.substring(i+1), 
//							 results); 
//														 
//			}
//		}		
//	}
	
	//Ersin
	public static void permute(String chosenPermutation, int startIndex, int endIndex){
        
		if(startIndex==endIndex) {
            System.out.println(chosenPermutation);
        } else {
            for (int i = startIndex; i <= endIndex; i++) {
                chosenPermutation=swapLetters(chosenPermutation,startIndex,i);
                permute(chosenPermutation,startIndex+1,endIndex);
                chosenPermutation=swapLetters(chosenPermutation,startIndex,i);
            }
        }
    }
    public static String swapLetters(String str, int index1, int index2){
        char[] charArray = str.toCharArray();
        char temp = charArray[index1] ;
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;
        return String.valueOf(charArray);
    }
}
