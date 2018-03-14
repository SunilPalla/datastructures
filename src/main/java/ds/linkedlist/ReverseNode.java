package ds.linkedlist;

import corelogic.Node;

public class ReverseNode {
	static Node node;
	public static void main(String[] args) {
		ReverseNode.node=new Node(1);
		ReverseNode.node.next=new Node(2);
		ReverseNode.node.next.next=new Node(3);
		ReverseNode.node.next.next.next=new Node(2);
		ReverseNode.node.next.next.next.next=new Node(5);

		NodeUtils.printList(ReverseNode.node);
		
		Node reverse = reverse(node);

		NodeUtils.printList(reverse);
	}

	public static Node reverse(Node head) {
		Node currentNode=head;
		Node prevNode=null;
		Node nextNode;
		while(currentNode!=null){
			nextNode = currentNode.next;
			currentNode.next=prevNode;//delinking here with next node
			prevNode = currentNode;
			currentNode = nextNode;
		}
		head=prevNode;
		return head;
	}
	

}
