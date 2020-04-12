package tester;

import java.io.*;

import java.util.*;

//find a minimum value in a BST
//remove a node from a BST

//notes about insert and delete
// you have to update the right or left of a certain node
//changing the local "referenec variable" will have no effect on the tree
//Think about simple cases (3 nodes trees or a single node tree) when you code

class BST {

	static void printer() {
		System.out.println("-------------------------------");
	}

	// left -root- right printing formbb-> depth first traversal printing variation
	static void tree_printer(node anode) {

		if (anode == null)
			return;

		tree_printer(anode.left);
		System.out.println(anode.val);
		tree_printer(anode.right);

	}

	static boolean tree_searcher(node anode, int key) {
		while (anode != null) {
			if (key > anode.val) {
				anode = anode.right;
			} else if (key < anode.val) {
				anode = anode.left;
			} else if (key == anode.val) {
				return true;
			}
		}
		return false;
	}

	// a new node is always inserted as a leaf
	static node insert(node anode, int key) {
		if (anode == null) {
			node newNode = new node(key);
			return newNode;
		}
		if (key > anode.val)
			anode.right = insert(anode.right, key);
		else
			anode.left = insert(anode.left, key);

		return anode; // don't change the non empty (return the same one)
	}

	// depth finder
	static int depthFinder(node anode) {

		if (anode == null)
			return 0;
		else {
			int left_depth = depthFinder(anode.left);
			int right_depth = depthFinder(anode.right);

			if (left_depth >= right_depth)
				return left_depth + 1;
			else
				return right_depth + 1;
		}
	}

	// node deletion
	static node nodeDelete(node anode, int key) {
		if (anode == null)
			return null;
		else {
			// find the node to be deleted

			if (key > anode.val) // right will be changed
				anode.right = nodeDelete(anode.right, key);
			else if (key < anode.val)
				anode.left = nodeDelete(anode.left, key);
			else // equal found!
			{
				// case 0: has no child
				if (anode.right == null && anode.left == null)
					return null;
				// case 2: has one child
				else if (anode.right == null)
					return anode.left;
				else if (anode.left == null)
					return anode.right;
				// case 3: has more than one child
				else {
					// find in order successor: smallest in right subtree
					node root = anode.right;
					while (root.left != null) {
						root = root.left;
					}

					anode.val = root.val;

					nodeDelete(anode.right, root.val);

				}

			}

		}
		return anode;

	}

	public static void main(String args[]) {

		// create a simple BST
		node node1 = new node(1);// root
		node node2 = new node(2);
		node node3 = new node(3);
		node node4 = new node(4);
		node node5 = new node(5);
		node node6 = new node(6);
		node node7 = new node(7);
		node node8 = new node(8);
		node node9 = new node(9);
		node node10 = new node(10);

		node2.left = node1;
		node3.left = node2;
		node3.right = node5;
		node5.left = node4;
		node6.left = node3;
		node6.right = node8;
		node8.left = node7;
		node8.right = node9;
		node9.right = node10;
		// find smallest value (the left most one)
		node root = node6;
		while (root.left != null) {
			root = root.left;
		}
		System.out.println(root.val);
		printer();
		// traversing
		tree_printer(node6);
		printer();

		// search
		System.out.println(tree_searcher(node6, 12));
		printer();
		// insertion
		insert(node6, 11);
		tree_printer(node6);
		printer();
		// find depth
		System.out.println(depthFinder(node6));
		printer();
		// delete a node
		nodeDelete(node6, 7);
		tree_printer(node6);

	}
}

class node {
	node right;
	node left;
	int val;

	node(int val) {
		this.val = val;
	}
}
