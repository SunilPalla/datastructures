package ds.linkedlist;

import corelogic.Node;
import ds.linkedlist.NodeUtils;

/**
 * Created by sunilp on 2/15/18.
 */
public class AddNode {

	public static void main(String[] args) {
		Node head = addNode(10);
		retriveNode(head);
		modifyNode(head);
		deleteNode(head);
	}

	private static Node addNode(int value) {
		Node head = new Node(value);
		NodeUtils.printList(head);
		return head;
	}

	private static void retriveNode(Node head) {
		System.out.println("data"+head.data);
	}

	private static void modifyNode(Node head) {
		head.data = 20;
		NodeUtils.printList(head);
	}

	private static void deleteNode(Node head) {
		head = null;
		NodeUtils.printList(head);
	}
}
