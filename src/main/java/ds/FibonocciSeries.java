package ds;

public class FibonocciSeries {

	public static void main(String[] args) {
		printFibonocci(10);
		printNthFibonocci(10);
	}

	private static void printNthFibonocci(int nThFibonocci) {
		int prev=0;int current=1;int next=0;
		for(int i=2;i<nThFibonocci;i++) {
			next = prev+current;
			prev = current;
			current = next;
		}
		System.out.println("nth"+next);
	}

	private static void printFibonocci(int limit) {
		//0,1,1,2,3,5,8,13,21,34,55,89....
		int array[]=new int[limit];
		int prev=0;int current=1;int next=0;
		array[0]=0;array[1]=current;
		for(int i=2;i<limit;i++){
			next = current+prev;
			array[i]=next;
			current=array[i];
			prev=array[i-1];
		}
		for(int a:array){
			System.out.println(a);
		}
	}
}
