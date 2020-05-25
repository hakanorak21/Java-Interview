package ersin;

public class CharFrequency {

	public static void main(String[] args) {
		
		String str = "AAABBCDD";

		System.out.print("method 1:  ");
		m1(str);

	}


	public static String m1(String str) {
		String nstr = "";
		while (str.length()!=0) {
			int size = str.length();
			String temp = str.substring(0,1);
			str = str.replace(temp, "");
			int freq = size - str.length();
			nstr += temp + freq;
		}
		System.out.println(nstr);
		return nstr;
	}

}
