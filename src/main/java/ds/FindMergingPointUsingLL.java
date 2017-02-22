package ds;

import java.util.Iterator;
import java.util.LinkedList;

public class FindMergingPointUsingLL {

	static LinkedList<String> list1 = new LinkedList<String>();
	static LinkedList<String> list2 = new LinkedList<String>();
	static int count=0;
	static{
		list1.add("3");
		list1.add("6");
		list1.add("15");
		list1.add("15");
		list1.add("30");
		
		list2.add("10");
		list2.add("12");
		list2.add("35");
	}
	public static void main(String[] args) {
		findMergingPoint();
		if(count==0){
			System.out.println("There is no merging point");
		}
	}
	private static void findMergingPoint() {
		
		for (Iterator iterator = list1.iterator(); iterator.hasNext();) {
			String list1Element = (String) iterator.next();
			
			for (Iterator iterator2 = list2.iterator(); iterator2.hasNext();) {
				String list2Element = (String) iterator2.next();
				
				if(list1Element.equalsIgnoreCase(list2Element)){
					System.out.println("Merging point is ::"+list1Element);
					count++;
					return;
				}
			}
		}
	}
}
