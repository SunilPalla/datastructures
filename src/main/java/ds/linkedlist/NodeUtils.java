package ds.linkedlist;

import corelogic.Node;

/**
 * Created by sunilp on 2/18/18.
 */
public class NodeUtils {

	/*Takes head pointer of the linked list and
   returns the count of nodes in the list */
	public static int getCount(Node node) {
		Node current = node;
		int count = 0;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}

	// prints content of double linked list
	public static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static Node createNode(int value) {
		Node head = new Node(value);
		return head;
	}
}
