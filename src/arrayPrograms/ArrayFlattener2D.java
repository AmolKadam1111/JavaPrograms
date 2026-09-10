package arrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener2D {

	public static void main(String[] args) {

		int[][] matrix = { { 9, 5, 7 }, { 6, 2, 1 }, { 8, 3, 2 } };

		List<String> flattenedList = new ArrayList<>();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				String entry = "Value: " + matrix[i][j] + "[Row:" + i + ", Col:" + j + "]";
				flattenedList.add(entry);
			}
		}
		System.out.println("Flattened List with Cordinates :");
		for (String item : flattenedList) {
			System.out.println(item);
		}

	}
}
