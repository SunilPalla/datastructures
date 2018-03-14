package ds.linkedlist;

import corelogic.Node;

/**
 * Created by sunilp on 2/19/18.
 */
public class FindLoop {
	public static void main(String[] args) {
		Node head = NodeUtils.createNode(1);
		head.next = NodeUtils.createNode(2);
		head.next.next = NodeUtils.createNode(3);
		head.next.next.next = NodeUtils.createNode(4);
		head.next.next.next.next = head.next.next;
		System.out.println(findLoop(head));
	}

	private static int findLoop(Node head) {
		Node fastPtr = head;
		Node slowPtr = head;
		Node  ptr1;
		Node  ptr2;
		boolean loopfound=false;
		int k=1,i=0;

		while(fastPtr!=null && fastPtr.next!=null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(slowPtr==fastPtr) {
				loopfound=true; break;
			}
		}
		if(loopfound){
			ptr1  = fastPtr;
			while(ptr1.next != slowPtr){
				ptr1 = ptr1.next;
				k++;
			}
			ptr2 = head;

			ptr1  = head;
			for(i=0; i<k; i++){
				ptr2 = ptr2.next;
			}
			while(ptr1 != ptr2){
				ptr1  = ptr1.next;
				ptr2 =  ptr2.next;
			}
			return ptr1.data;
		}
		return 0;
	}
}
