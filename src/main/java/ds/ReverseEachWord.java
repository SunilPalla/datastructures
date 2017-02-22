package ds;

import java.util.Scanner;

public class ReverseEachWord {
	public static void main(String[] args) {
		/*//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++)
		{
			String s=sc.nextLine();
			reverseEachWord(s);
		}
		sc.close();*/
		//input - i.like.this.program.very.much
		//output - i.ekil.siht.margorp.yrev.hcum
		//input - my.name.is
		//output - ym.eman.si
		String s=" i.like.this.program.very.much";
		reverseEachWord(s);
		
	}

	private static void reverseEachWord(String str) {
		//step1: tokenise with dot(.)
		String[] splittedStr = str.split("\\.");
		String resultStr="";
		String eachString="";
		for(int i=0;i<splittedStr.length;i++){
			eachString = splittedStr[i];
			resultStr+=reverse(eachString).concat(".");
		}
		if(resultStr.endsWith(".")){
			resultStr = resultStr.substring(0,resultStr.length()-1);
		}
		System.out.println(resultStr);
	}

	private static String reverse(String eachString) {
		String resultStr="";
		for(int i=eachString.length();i>0;i--){
			resultStr+=eachString.charAt(i-1);
		}
		return resultStr;
	}
}
