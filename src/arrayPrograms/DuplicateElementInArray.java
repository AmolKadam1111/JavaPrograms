package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {


		int [] arr = { 3, 4, 7, 1, 5, 2, 4, 1, 7};
		
		System.out.print("Duplicate elements are: ");

		Set<Integer> s = new HashSet<>();
		for(int no : arr) {
			boolean b = s.add(no);
			if(b==false) {
				System.out.print(no+" ");
			}
		}
	}

}
