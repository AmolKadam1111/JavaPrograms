package arrayPrograms;

import java.util.Arrays;

public class KthLargestElementInArray {

	public static void main(String[] args) {

		int[] arr = { 99, 13, 5, 12, 15, 3, 9, 25, 67, 75 };

		int k = 4;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

			if (i == k - 1) {
				System.out.println(k + "th largest element is: " + arr[i]);
				break;
			}
		}

//		Alternate way to find Kth largest element
		int[] arr1 = { 99, 13, 5, 12, 15, 3, 9, 25, 67, 75 };
		int k1 = 4;

		Arrays.sort(arr1); // ascending

		System.out.println(k1 + "th largest element is: " + arr1[arr1.length - k1]);
	}
}
