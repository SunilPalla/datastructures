package ds.linkedlist;

import corelogic.Node;

/**
 * Created by sunilp on 2/18/18.
 */
public class DeleteNode {

	public static void main(String[] args) {
		Node head = NodeUtils.createNode(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		//NodeUtils.printList(deleteStartingNode(head));
		//NodeUtils.printList(deleteEndNode(head));
		NodeUtils.printList(deleteNthNode(head, head.next.next));
	}

	private static Node deleteStartingNode(Node head) {
		Node p = head;
		Node q = head;
		q = p.next;
		head = q;
		p = null;
		return head;
	}

	private static Node deleteEndNode(Node head) {
		Node p = head.next;
		Node q = head;
		while(p.next!=null) {
			p = p.next;
			q = q.next;
			if(p.next==null){
				q.next = null;
			}
		}
		return head;
	}

	private static Node deleteNthNode(Node head,Node nthNode) {
		Node q = head;
		Node p = head.next;

		while(q.next!=null) {
			p = p.next;
			q = q.next;
			if(p.data==nthNode.data){
				q.next = p.next;
				p=null;
			}
		}
		return head;
	}
}
