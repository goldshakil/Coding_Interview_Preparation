package tester;

import java.io.*;

import java.util.*;

class BFS_DFS {

	static void printer() {
		System.out.println("-------------------------------");
	}

// remember that DFS is just a traversal thing -> the printing can be inorder postoder preorder 
	static boolean DFS(node root, char k) {
		// use a stack
		// visited list
		Stack<node> stack = new Stack<node>();
		ArrayList<node> visited = new ArrayList<node>();

		// push the root to the stack
		stack.push(root);
		while (!stack.isEmpty()) {
			
			
			node current = stack.pop();
			while(visited.contains(current)) //if it is already visited pop another one
			{
				current = stack.pop();
			}
			
			System.out.println(current.val);
			if (current.val == k)
				return true;
			else {
				// push its children to the stack
				for (int i = 0; i < current.children.size(); i++) {
					stack.push(current.children.get(i));
				}
				//mark the current as visited
				visited.add(current);

			}

		}
		return false;

	}
	
	static boolean BFS(node root, char k) {
		// use a stack
		// visited list
		Queue<node> queue = new LinkedList<node>();
		ArrayList<node> visited = new ArrayList<node>();

		// push the root to the stack
		queue.add(root);
		while (!queue.isEmpty()) {
			
			
			node current = queue.poll();
			while(visited.contains(current)) //if it is already visited pop another one
			{
				current = queue.poll();
			}
			
			System.out.println(current.val);
			if (current.val == k)
				return true;
			else {
				// push its children to the stack
				for (int i = 0; i < current.children.size(); i++) {
					queue.add(current.children.get(i));
				}
				//mark the current as visited
				visited.add(current);

			}

		}
		return false;

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
		
		DFS(a,'j');
		
		printer();
		BFS(a,'j');

	}
}

class node {

	char val;
	ArrayList<node> children = new ArrayList<node>();

	node(char val) {
		this.val = val;
	}
}
