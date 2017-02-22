package ds;

public class BubbleSort {
	private static int[] array = new int[]{2,7,4,1,5,3};
	public static void main(String[] args) {
		try{
			bubbleSort();
			for(int eachInt : array){
				System.out.println(eachInt);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private static void bubbleSort() {
		for(int i=0;i<=array.length;i++){
			for(int j=0;j<array.length-2;j++){
				if(array[i]>array[j+1]){
					int temp=0;
					temp=array[i];
					array[i]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

}
