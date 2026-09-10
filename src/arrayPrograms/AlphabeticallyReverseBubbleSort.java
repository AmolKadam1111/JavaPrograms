package arrayPrograms;

public class AlphabeticallyReverseBubbleSort {
	
	public static void main(String[] args) {

        String[] arr = {"Banana", "Apple", "Mango", "Cherry"};

        // Reverse Bubble Sort
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j].compareTo(arr[j + 1]) < 0) {  // Swap for descending
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Strings Sorted in Descending Order:");
        for(String str : arr) {
            System.out.print(str + " ");
        }
    }

}
