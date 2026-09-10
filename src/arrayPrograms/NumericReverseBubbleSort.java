package arrayPrograms;

public class NumericReverseBubbleSort {
	
	public static void main(String[] args) {

        int[] arr = {50, 10, 40, 20, 30};

        // Reverse Bubble Sort
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] < arr[j + 1]) {  // Swap for descending
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Numbers Sorted in Descending Order:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

}
