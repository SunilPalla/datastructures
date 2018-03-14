package ds;

/**
 * Created by sunilp on 2/22/18.
 */
public class SecondLastElement {
	private static Integer arr[] = new Integer[]{2,3,1,4,6};
	public static void main(String[] args) {
		secondLastElementMethod2(arr);
		secondLastElementMethod3(arr);
		secondLastElement(arr);
	}

	private static void secondLastElementMethod3(Integer[] arr) {
		int i=0;
		int[] temp = new int[]{};
		while(true) {
			temp[i] = arr[i];
		}
	}

	private static void secondLastElementMethod2(Integer[] arr) {
		int length = arr.length;
		int ele = arr[length-2];
		System.out.println("method 2"+ele);
	}

	private static void secondLastElement(Integer[] arr) {
		int i = 0;
		while(true) {
			try {
				if(arr[i+1] == null) {
					System.out.println("arr"+arr[i]);
					System.exit(0);
				}
				i++;
			}catch (ArrayIndexOutOfBoundsException are) {
				System.out.println("arr"+arr[i-1]);
				System.exit(0);
			}
		}

	}

}
