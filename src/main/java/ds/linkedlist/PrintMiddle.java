package ds.linkedlist;

import corelogic.Node;

/**
 * Created by sunilp on 2/18/18.
 */
public class PrintMiddle {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		printMiddle(head);
	}

	private static void printMiddle(Node head) {
		//method1
		Node fastPtr = head;
		Node slowPtr = head;
		while(fastPtr!=null && fastPtr.next!=null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}
		System.out.println("Middle number method 1:"+slowPtr.data);

		//method2
		int count = NodeUtils.getCount(head);
		int middle = count/2;
		for(int i=0;i<middle;i++) {
			head = head.next;
		}
		System.out.println("Middle number method 2:"+head.data);
	}
}
