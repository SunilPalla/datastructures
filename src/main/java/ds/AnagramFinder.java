package ds;

public class AnagramFinder {

	private static String anagramStr1="listen  ";
	private static String anagramStr2="silent";

	public static void main(String[] args) {
		isAnagram();
	}

	private static boolean isAnagram() {
		anagramStr1 = anagramStr1.replaceAll("\\s", "");
		anagramStr2 = anagramStr2.replaceAll("\\s", "");
		if(anagramStr1.length()!=anagramStr2.length()){
			System.out.println("Words are not anagrams");
			return false;
		}
		if(anagramStr1==anagramStr2){
			System.out.println("Words are anagram by default");
			return true;
		}
		int counter=0;
		int[] counts = new int[26];
		for(int i=0;i<anagramStr1.length();i++){
			for(int j=0;j<anagramStr2.length();j++){
				if(anagramStr1.charAt(i)==anagramStr2.charAt(j)){
					counts[counter]++;
					break;
				}
				counter=0;
			}
		}
		for (int i = 0; i<anagramStr1.length(); i++){
			if (counts[i] != 0)
				System.out.println("Words are anagrams");
				return true;
		}
		return false;
	}
}
