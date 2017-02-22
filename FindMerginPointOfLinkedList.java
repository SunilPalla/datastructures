package ds;

import corelogic.Node;

public class FindMerginPointOfLinkedList {
	static Node head1, head2;

	/*function to get the intersection point of two linked
    lists head1 and head2 */
	int getNode() {
		int c1 = getCount(head1);
		int c2 = getCount(head2);
		int d;

		if (c1 > c2) {
			d = c1 - c2;
			return _getIntesectionNode(d, head1, head2);
		} else {
			d = c2 - c1;
			return _getIntesectionNode(d, head2, head1);
		}
	}
	/* function to get the intersection point of two linked
    lists head1 and head2 where head1 has d more nodes than
    head2 */
	int _getIntesectionNode(int d, Node node1, Node node2) {
		int i;
		Node current1 = node1;
		Node current2 = node2;
		for (i = 0; i < d; i++) {
			if (current1 == null) {
				return -1;
			}
			current1 = current1.next;
		}
		while (current1 != null && current2 != null) {
			if (current1.data == current2.data) {
				return current1.data;
			}
			current1 = current1.next;
			current2 = current2.next;
		}

		return -1;
	}

	/*Takes head pointer of the linked list and
   returns the count of nodes in the list */
	int getCount(Node node) {
		Node current = node;
		int count = 0;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}

	public static void main(String[] args) {
		FindMerginPointOfLinkedList list = new FindMerginPointOfLinkedList();

		// creating first linked list
		list.head1 = new Node(3);
		list.head1.next = new Node(6);
		list.head1.next.next = new Node(15);
		list.head1.next.next.next = new Node(15);
		list.head1.next.next.next.next = new Node(30);

		// creating second linked list
		list.head2 = new Node(10);
		list.head2.next = new Node(15);
		list.head2.next.next = new Node(30);

		System.out.println("The node of intersection is " + list.getNode());
		//System.out.println("The merge point is " + list.getMergePoint());
	}
	
	private int getMergePoint() {
		int c1 = getCount(head1);
		int c2 = getCount(head2);
		if(c1>c2){
			return mergePoint(c1,c2,head1,head2);
		}else{
			return mergePoint(c1,c2,head2,head1);
		}
	}
	private int mergePoint(int head1diff,int head2diff,Node head1, Node head2) {
		for(int i=0;i<head1diff;i++){
			Node current=head2;
			for(int j=0;j<head2diff;j++){
				if(head1.data==current.data){
					return head1.data;
				}
				current=current.next;
			}
			head1=head1.next;
		}
		return 0;
	}
}
