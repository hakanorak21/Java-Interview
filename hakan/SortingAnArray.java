package hakan;

public class SortingAnArray {
	
	public static void main(String[] args) {
		
		int[] arr = {3, 5, 1, 9};
		
		//Sorting in ascending order
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		
		for(int each: arr)
			System.out.print(each+" ");
		
	}

}
