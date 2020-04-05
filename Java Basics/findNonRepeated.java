package tester;

import java.io.*;
import java.util.*;
//Finding non repeated number in an array
class findNonRepeated {

	static void printer(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);

		}
	}

	public static void main(String args[]) {

		int a[] = { 1, 3, 5, 3, 2, 2, 5, 7, 8, 1, 8, 1, 6, 9, 9, 10, 10, 7 }; // answer should be 6

		// brute force solution (nested loop) -> bad complexity
		int number = 0;
		int flag = 0;
		for (int i = 0; i < a.length; i++) {
			flag = 0;
			number = a[i];
			for (int j = 0; j < a.length; j++) {
				if (j != i) // not the same element
				{
					if (a[i] == a[j])
						flag = 1;
				}
			}
			if (flag == 0)
				System.out.println(number);
		}
		System.out.println("======================================");

		// method 1: an extra array to store the repetition(array hashing) -> works only
		// if integers are positive since indices can be positive ,extra space required

		int repeated[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			repeated[a[i]]++;
		}
		for (int i = 0; i < a.length; i++) {
			if (repeated[i] == 1)
				System.out.println(i);
		}

		System.out.println("======================================");

		// method 2 use Hasmap (key= number, value=repeated times) -> works for negative, extra space required
		// numbers, extra space required
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) 
			if (map.containsKey(a[i])) {
				map.put(a[i], (map.get(a[i]) + 1));
			} else {
				map.put(a[i], 1);
			}
		
		
		for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
			if (pair.getValue() == 1)
				System.out.println(pair.getKey());
		}
		System.out.println("======================================");

	
	}

}
