package arrayPrograms;

public class AlphabeticallyBubbleSort {

	public static void main(String[] args) {

        String[] arr = {"Banana", "Apple", "Mango", "Cherry"};

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                
                if(arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Strings:");
        for(String str : arr) {
            System.out.print(str + " ");
        }
    }
}
