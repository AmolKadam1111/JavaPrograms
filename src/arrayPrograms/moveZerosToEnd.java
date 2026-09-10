package arrayPrograms;

import java.util.Arrays;

public class moveZerosToEnd {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 0, 20, 0, 30, 40, 50, 0};
		System.out.println("Original Array: " +Arrays.toString(arr));
		
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while(count < arr.length) {
			arr[count++]=0;
		}
		
		System.out.println("Modified Array: " +Arrays.toString(arr));
	}

}
