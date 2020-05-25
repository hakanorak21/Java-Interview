package ersin;

public class FindUniques {

	public static void main(String[] args) {
		
		String str = "AAABBBCCCDEF";
		System.out.println("method 1:   " + m1(str));

	}
	
	
	public static String m1(String str) {
		
		String nstr = "";		
		while(str.length()!=0) {
			String temp = str.substring(0,1);
			str = str.replaceFirst(temp, "");
			if (!str.contains(temp)) 
				nstr += temp;
			else 
				str = str.replace(temp, "");
		}
		return nstr;
	}
}
