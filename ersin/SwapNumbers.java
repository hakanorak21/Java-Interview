package ersin;

//Swap numbers with and without using a temp variable

public class SwapNumbers {

	public static void main(String[] args) {
		swap1(10, 56);
		swap2(10, 56);
		swap3(10, 56);

	}


	// Option 1: without temp 
	public static void swap1(int x, int y) {
		y = x + y - (x = y);		
		System.out.println("X is : " + x);
		System.out.println("Y is : " + y);
	}

	// Option 2: without temp 
	public static void swap2(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;		
		System.out.println("X is : " + x);
		System.out.println("Y is : " + y);
	}


	// Option 3: with temp 
	public static void swap3(int x, int y) {
		int temp = x;
		x = y;
		y = temp;		
		System.out.println("X is : " + x);
		System.out.println("Y is : " + y);
	}

}

