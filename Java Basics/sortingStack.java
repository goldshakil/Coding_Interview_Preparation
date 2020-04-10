package tester;

import java.io.*;

import java.util.*;

/Sorting values in a stack

class sortingStack {

	static void printer() {
		System.out.println("-------------------------------");
	}

	public static void main(String args[]) {
		// sort values in a stack using an extra memory

		// 1. using another stack -> O(n) space and O(n^2) time
		// https://www.geeksforgeeks.org/sort-stack-using-temporary-stack/

		// 2.using an arraylist -> O(n) space and O(nlgn) time (sorting time)
		Stack<Integer> stack1 = new Stack<Integer>();
		stack1.push(-1);
		stack1.push(12);
		stack1.push(12);
		stack1.push(-11);
		stack1.push(5);
		stack1.push(9);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (!stack1.empty()) {
			list.add(stack1.pop());
		}
		// System.out.println(list);
		Collections.sort(list); // -> sorting that takesn O(nlgn)
		// System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			stack1.push(list.get(i));
		}
		System.out.println(stack1);

	}
}
