package hakan;

import java.util.Arrays;

//Moving zeros to the end

public class AppleInterviewQuestion {
	
	public static void main(String[] args) {
		
		int[] nums = {0, 0, 8, 0, 5, 9, 2};
		int count = 0;
		
		for(int i=0; i<nums.length; i++) 
			if(nums[i] != 0)
				nums[count++] = nums[i];
		
		while(count<nums.length) 
			nums[count++] = 0;
		
		
		for(int i=0; i < nums.length; i++)
		System.out.print(nums[i]+" ");
		System.out.println();
		System.out.println(Arrays.toString(nums));
			
	}

}
