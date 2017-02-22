package ds;

public class MergeSort {
    private static int[] numbers = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
    private static int[] helper;
    private static int number;

    public static void main(String[] args) {
		sort(numbers);
		for(int eachInt : numbers){
    		System.out.println(eachInt);
    	}
	}
    
    public static void sort(int[] values) {
            number = values.length;
            helper = new int[number];
            mergesort(0, number - 1);
    }

    private static void mergesort(int low, int high) {
    	try{
    		// check if low is smaller then high, if not then the array is sorted
    		if (low < high) {
    			// Get the index of the element which is in the middle
    			int middle = low + (high - low) / 2;
    			// Sort the left side of the array
    			mergesort(low, middle);
    			// Sort the right side of the array
    			mergesort(middle + 1, high);
    			// Combine them both
    			merge(low, middle, high);
    		}
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
    }

    private static void merge(int low, int middle, int high) {

            // Copy both parts into the helper array
            for (int i = low; i <= high; i++) {
                    helper[i] = numbers[i];
            }

            int i = low;
            int j = middle + 1;
            int k = low;
            // Copy the smallest values from either the left or the right side back
            // to the original array
            while (i <= middle && j <= high) {
                    if (helper[i] <= helper[j]) {
                            numbers[k] = helper[i];
                            i++;
                    } else {
                            numbers[k] = helper[j];
                            j++;
                    }
                    k++;
            }
            // Copy the rest of the left side of the array into the target array
            while (i <= middle) {
                    numbers[k] = helper[i];
                    k++;
                    i++;
            }

    }
}
