package ds;

/**
 * Created by sunilp on 2/22/18.
 */
public class BinarySearch {
	private static int[] arr = new int[]{1,2,3,5,6,7};
	static int searchEle = 5;
	public static void main(String[] args) {
		System.out.println(""+binarySearch(arr,0,arr.length-1,searchEle));
	}

	private static int binarySearch(int[] arr, int l, int r, int searchEle) {

		if (r>=l)
		{
			int mid = l + (r - l)/2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == searchEle)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > searchEle)
				return binarySearch(arr, l, mid-1, searchEle);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid+1, r, searchEle);
		}

		// We reach here when element is not present
		//  in array
		return -1;

	}
}
