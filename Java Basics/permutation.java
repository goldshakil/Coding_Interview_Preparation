package tester;

import java.io.*;

import java.util.*;

//Permutation -> different arrangements using all elements -> arrangement number
//n characters-> n! permutations
//https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
class permutation {

	static void permutation(String a, int left, int right) {

		if (left == right)
			System.out.println(a);

		for (int i = left; i < a.length(); i++) {

			// do swapping
			char array[] = a.toCharArray();
			char temp = array[left];
			array[left] = array[i];
			array[i] = temp;
			a = String.valueOf(array);

			// go down the tree
			permutation(a, left + 1, right);

			// backtrack

			temp = array[left];
			array[left] = array[i];
			array[i] = temp;
			a = String.valueOf(array);

		}

	}

	public static void main(String args[]) {

		String a = "ABCD";
		permutation(a, 0, a.length() - 1);

	}
}
