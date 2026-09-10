package arrayPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class KthLargestWordInArray {

	public static void main(String[] args) {

		int k =2;

		String [] s = {"Amol", "Sagar", "Aniket", "Geeta", "Gitanjali", 
				"Sourabh", "Chandrashekhar", "Raj", "Gopal"};
		
		Arrays.sort(s, Comparator.comparingInt(String::length)
				.thenComparing(Comparator.naturalOrder()));
		
		System.out.println(Arrays.toString(s));	
		
		System.out.println(s[k]);	

	}

}
