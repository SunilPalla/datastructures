package ds;

public class QuickSort {
	private static Integer elements[] = new Integer[]{50,6,7,10,12,18};
	public static void main(String[] args) {
		quicksort();
		for(int l:elements){
            System.out.print(l);
            System.out.print(" ");
        }
		nThLargest(3,elements);
	}

	private static void nThLargest(int i, Integer[] elements) {
		int nth = elements[elements.length-i];
		System.out.println("nth largest"+nth);
	}

	private static void quicksort() {
		int length = elements.length;
		System.out.println(length);
		sort(0,length-1);		
	}

	private static void sort(int lowerIndex, int higherIndex) {
		int i=lowerIndex;int j=higherIndex;
		int pivot = elements[lowerIndex+(higherIndex-lowerIndex)/2];
		
		while(i<=j){
			while(elements[i]<pivot){
				i++;
			}
			while(elements[j]>pivot){
				j--;
			}
			if(i<=j){
				exchangeNumbers(i,j);
				i++;
				j--;
			}
		}
		
		if(lowerIndex<j){
			sort(lowerIndex,j);
		}
		if(higherIndex>i){
			sort(i,higherIndex);
		}
	}

	private static void exchangeNumbers(int i, int j) {
		int temp = elements[i];
		elements[i]=elements[j];
		elements[j]=temp;
	}
}
