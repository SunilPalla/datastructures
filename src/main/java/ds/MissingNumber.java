package ds;

import java.util.Arrays;
import java.util.BitSet;

/**
 * Created by sunilp on 2/15/18.
 */
public class MissingNumber {
	static int[] i = {1,2,3,5};
	public static void main(String[] args) {
		findMissingNumber(i);
		printMissingNumber(i,10);
	}

	private static void findMissingNumber(int[] arr) {
		int sum = 0;
		int idx = -1;
		for (int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}

		// the total sum of numbers between 1 and arr.length.
		int total = arr.length*((arr.length+1)/2);
		int missing = total-sum;
		//System.out.println("missing number is: " + missing);
	}

	private static void printMissingNumber(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);
		for (int number : numbers) {
			bitSet.set(number - 1);
		}
		System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers), count);
		int lastMissingIndex = 0;
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}
}
