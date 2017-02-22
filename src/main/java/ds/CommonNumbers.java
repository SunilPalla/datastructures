package ds;

public class CommonNumbers {

	public static void main(String[] args) {
		commonNumbers();
	}

	private static void commonNumbers() {
		int[] array1 = new int[]{2,4,7,8};
		int[] array2 = new int[]{7,5,6,2};

		if(array1.length>=array2.length){
			findCommon(array1,array2);
		}else{
			findCommon(array2,array1);
		}
		
	}

	private static void findCommon(int[] arr, int[] arr1) {
		int[] finalarray=new int[4];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr1.length;j++){
				if(arr[i]==arr1[j]){
					finalarray[i]=arr[i];
				}
			}
		}
		
		for(int a:finalarray){
			System.out.println(a);
		}
	}
}
