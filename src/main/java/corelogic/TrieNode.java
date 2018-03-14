package corelogic;

import java.util.HashMap;

/**
 * Created by sunilp on 2/26/18.
 */
public class TrieNode {
	// Each Trie Node contains a Map 'child'
	// where each alphabet points to a Trie
	// Node.
	public HashMap<Character,TrieNode> child;

	// 'isLast' is true if the node represents
	// end of a contact
	public boolean isLast;

	// Default Constructor
	public TrieNode()
	{
		child = new HashMap<Character,TrieNode>();

		// Initialize all the Trie nodes with NULL
		for (char i = 'a'; i <= 'z'; i++)
			child.put(i,null);

		isLast = false;
	}
}
