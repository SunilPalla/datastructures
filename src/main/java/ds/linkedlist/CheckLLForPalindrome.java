package ds.linkedlist;

import corelogic.Node;

public class CheckLLForPalindrome {
	static Node head1, head2;

	public static void main(String[] args) {
		CheckLLForPalindrome ll = new CheckLLForPalindrome();
		CheckLLForPalindrome.head1 = new Node(1);
		CheckLLForPalindrome.head1.next = new Node(2);
		CheckLLForPalindrome.head1.next.next= new Node(3);
		CheckLLForPalindrome.head1.next.next.next = new Node(2);
		CheckLLForPalindrome.head1.next.next.next.next=new Node(1);

		checkForPalindrome();
	}

	private static void checkForPalindrome() {
		int c = getCount(head1);
		Node midNode = new Node();
		midNode = middleNode(head1);
		NodeUtils.printList(head1);
		Node reversedNode = ReverseNode.reverse(midNode);
		NodeUtils.printList(reversedNode);
		boolean isIdentical = compareLists(head1,reversedNode);
		System.out.println("Is Pallindrome::"+isIdentical);
	}
	
	private static Node middleNode(Node head) {
		Node slowPtr=head;
		Node fastPtr=head;
		while(fastPtr!=null && fastPtr.next!=null){
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
		}
		return slowPtr;
	}

	private static boolean compareLists(Node node, Node reversedNode) {
		while(node!=null && reversedNode!=null){
			if(node.data == reversedNode.data){
				node = node.next;
				reversedNode=reversedNode.next;
			}else{
				return false;
			}
		}
		if(node==null && reversedNode==null)return true;
		return false;
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
