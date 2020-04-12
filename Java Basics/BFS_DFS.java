package tester;

import java.io.*;

import java.util.*;

class BFS_DFS {

	static void printer() {
		System.out.println("-------------------------------");
	}

// DFS IS mark as visited and visit univisited
// remember that DFS is just a traversal thing -> the printing can be inorder postoder preorder (for a binary tree)
// BFS is generally for traversing simple things (tree)	
	// check explnation in the word file
	static ArrayList<node> visited = new ArrayList<node>();
	static ArrayList<node> GraphVertices = new ArrayList<node>(); // stores all graph vertices

	// Iterative implementation -> works for any any graph (inlcuding trees)
	static void DFS(node root) {
		// use a stack
		// visited list
		Stack<node> stack = new Stack<node>();
		// push the root to the stack
		stack.push(root);
		while (!stack.isEmpty()) {
			node current = stack.pop();
			if (!visited.contains(current)) { // undiscovered
				visited.add(current); // mark it as visited
				System.out.println(current.val);

				// push its univsited children to the stack
				for (int i = 0; i < current.children.size(); i++) {
					if (!visited.contains(current.children.get(i)))
						stack.push(current.children.get(i));
				}
				// mark the current as visited
			}
		}

	}

	static void DFS_recursive(node current) {
		visited.add(current); // mark it as visited
		System.out.println(current.val);
		//visit children who are not visited
		for (int i = 0; i < current.children.size(); i++) {
			if (!visited.contains(current.children.get(i))) 
				DFS_recursive(current.children.get(i));
		
		}

	}

	static void DFS_helper() {
		for (int i = 0; i < GraphVertices.size(); i++) {
			if (!visited.contains(GraphVertices.get(i))) // for every not visited node apply DFS
			{
				DFS(GraphVertices.get(i)); // iterative
				//DFS_recursive(GraphVertices.get(i));// Recursive DFS
			}
		}

	}

	// not really important
	static void BFS(node root) {

		// use a stack
		// visited list
		Queue<node> queue = new LinkedList<node>();
		// push the root to the stack
		queue.add(root);
		while (!queue.isEmpty()) {
			node current = queue.poll();
			if (!visited.contains(current)) { // undiscovered
				visited.add(current); // mark it as visited
				System.out.println(current.val);

				// push its univsited children to the stack
				for (int i = 0; i < current.children.size(); i++) {
					if (!visited.contains(current.children.get(i)))
						queue.add(current.children.get(i));
				}
				// mark the current as visited
			}
		}

	}

	public static void main(String args[]) {

		// creating a simple tree/graph
		node a = new node('A');
		node b = new node('B');
		node c = new node('C');
		node d = new node('D');
		node e = new node('E');
		node f = new node('F');
		node g = new node('G');
		node h = new node('H');
		node i = new node('I');
		node j = new node('J');
		node k = new node('K');

		a.children.add(b);
		a.children.add(c);

		b.children.add(d);
		b.children.add(e);

		d.children.add(h);

		e.children.add(i);
		e.children.add(j);

		c.children.add(f);
		c.children.add(g);

		f.children.add(k);

		GraphVertices.add(a);
		GraphVertices.add(b);
		GraphVertices.add(c);
		GraphVertices.add(d);
		GraphVertices.add(e);
		GraphVertices.add(f);
		GraphVertices.add(g);
		GraphVertices.add(h);
		GraphVertices.add(i);
		GraphVertices.add(j);
		GraphVertices.add(k);

		DFS_helper(); // apply DFS to every node

		printer();
		// BFS(a);

	}
}

class node {

	char val;
	ArrayList<node> children = new ArrayList<node>(); // children= neighbours

	node(char val) {
		this.val = val;
	}
}
