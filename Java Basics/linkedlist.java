package tester;

import java.io.*;

import java.util.*;

//Linked list training

class linkedlist {

	static void printer() {
		System.out.println("----------------------------------");
	}

	public static void main(String args[]) {
//creating linked list
		node a = new node(2);
		node b = new node(4);
		node c = new node(8);
		node d = new node(16);
		node e = new node(32);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		printer();

//traversing a linked list and finding its length
		node head = a;
		int counter = 0;
		while (head != null) {
			counter++;
			System.out.println(head.value);
			head = head.next;
		}
		System.out.println("size: " + counter);
		printer();

//finding the middle: you need the length
		head = a;
		int i = 0;
		while (true) {

			if (i == counter / 2) {
				System.out.println("middle value:" + head.value);
				break;
			}
			i++;
			head = head.next;
		}
		printer();
//finding the middle value using two pointers
		head = a;
		node head2 = a; // traverse as double the speed
		while (true) {
			head2 = head2.next;
			if (head2 != null) {
				head2 = head2.next;
			} else {
				break;
			}
			head = head.next;
		}
		System.out.println("middle value:" + head.value);
		printer();
//reverse a linked list using an extra space (O(n) space) -> uncomment this part
		/*
		head = a;
		ArrayList<node> list = new ArrayList<node>(); //list of the reference variables
		while (head != null) {
			list.add(head);
			head = head.next;
		}
		for (int i1 = list.size() - 1; i1 >= 0; i1--) {
			if (i1 != 0) {
				list.get(i1).next = list.get(i1 - 1);
			} else {
				list.get(i1).next = null;
			}
		}
		//return head -> head of reversed list
		head = list.get(list.size() - 1);
		while (head != null) {
			System.out.println(head.value);
			head = head.next;
		}
		*/
		
//reversing a linked list in O(1) space and linear time -> very similar to fibonacci
		node current=a;
		node next;
		node previous=null;
		while(current!=null)
		{
			next=current.next; //like a temp variable
			current.next=previous;
			
			previous=current;
			current=next;
		}
		head=previous;
		while (head != null) {
			System.out.println(head.value);
			head = head.next;
		}
		

	}
}

class node {
	int value;
	node next;

	node(int value) {
		this.value = value;
	}
}
