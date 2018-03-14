package ds.linkedlist;

import corelogic.Node;

public class RemoveDupFromSortedLL {
	static Node head1;
	public static void main(String[] args) {
		RemoveDupFromSortedLL ll = new RemoveDupFromSortedLL();
		RemoveDupFromSortedLL.head1=new Node(11);
		RemoveDupFromSortedLL.head1.next=new Node(11);
		RemoveDupFromSortedLL.head1.next.next=new Node(23);
		RemoveDupFromSortedLL.head1.next.next.next=new Node(23);
		RemoveDupFromSortedLL.head1.next.next.next.next=new Node(30);

		Node current=head1;
		while(head1.next!=null){
			if(head1.data == head1.next.data){
				head1.next = head1.next.next;
			}else {
				head1 = head1.next;
			}
			//ReverseNode.printList(current);
		}
		NodeUtils.printList(current);
	}

	static int getCount(Node node) {
		Node current = node;
		int count = 0;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}
}
