package ersin;

import java.util.ArrayList;
import java.util.Arrays;

public class SortDescending {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 8, 4, 1, 9, -2 };
		int arr2[] = { 3, 5, 8, 4, 1, 9, -2 };

		bubbleSort(arr);
		Sort(arr2);
		// print the sorted array
		System.out.println("Buble sort:  " + Arrays.toString(arr));
		System.out.println("Muhtar sort: " + Arrays.toString(arr2));

	}



	// Function to perform bubble sort on arr[]
	public static void bubbleSort(int arr[])
	{
		// (arr.length - 1) pass
		for (int k = 0; k < arr.length - 1; k++)
		{
			// last k items are already sorted, so inner loop can
			// avoid looking at the last k items
			for (int i = 0; i < arr.length - 1 - k; i++) {
				if (arr[i] < arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}

			// the algorithm can be stopped if the inner loop
			// didn’t do any swap
		}
	}


	public static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}







	public static int[] Sort(int[] a) {

		ArrayList<Integer> list=new ArrayList<Integer>();

		for(int each: a)

			list.add(each);



		for(int i=0; i < a.length; i++) {

			a[i] = findMax(list);

			list.remove(Integer.valueOf(a[i]));

		}

		return a;

	}

	public static int findMax(ArrayList<Integer> a) {

		int max =Integer.MIN_VALUE;

		for(int each: a)

			max = Math.max(max, each);

		return max;

	}

}
