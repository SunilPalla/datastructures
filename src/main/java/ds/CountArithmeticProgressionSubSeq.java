package ds;

import java.util.Scanner;

public class CountArithmeticProgressionSubSeq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while (t-->0) {
		    int n = sc.nextInt();
		    int[] vals = new int[n];
		    for (int k = 0; k < n; k++) 
		        vals[k] = sc.nextInt();
		    		    
		    System.out.println(solve(vals, n));
		}
	}

	private static char[] solve(int[] vals, int n) {

		int defaultCnt=1;
		int count=0;
		int[] temparray=new int[n];
		for(int i=0;i<vals.length;i++){
			for(int j=i+1;j<vals.length;j++){
				temparray[i]=vals[i];
				temparray[j]=vals[j];
			}
			count++;
		}
		return null;
	}
}
