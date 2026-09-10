package arrayPrograms;

public class BinarySearch {
	
	
    public static void main(String[] args) {

//    	Find Number is present In given Array & on which index
    	
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int target = 60;

        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (numbers[mid] == target) {
                System.out.println("Number " + target + " found at index: " + mid);
                return;
            } 
            else if (numbers[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        System.out.println("Number " + target + " not found in array.");
    }

}
