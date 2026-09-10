package arrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
	
	 public static void main(String[] args) {

	        int[] numbers = {50, 10, 40, 20, 30};

	        Arrays.sort(numbers);

	        System.out.println("Array Sorted Numerically in Ascending Order:"+ Arrays.toString(numbers));
	        
	        System.out.print("Array Sorted Numerically in descending Order: ");
	        for(int i = numbers.length - 1; i >= 0; i--) {
	            System.out.print(numbers[i]+" "); 
	        }

	        System.out.println();
	        
//	        --------------------------------------------------------------------------------------------------
	        
	        String[] names = {"Banana", "Apple", "Mango", "Cherry"};

	        Arrays.sort(names);

	        System.out.println("Array Sorted Alphabetically in Ascending Order:"+ Arrays.toString(names));
	        
	        Arrays.sort(names, Collections.reverseOrder());
	        System.out.println("Array Sorted Alphabetically in descending Order:"+ Arrays.toString(names));
	    }

}
