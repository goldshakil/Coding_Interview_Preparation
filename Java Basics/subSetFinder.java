package tester;

import java.io.*;

import java.util.*;


//find power set (a set of all possible sets) -> arrangement doesn't matter
class subSetFinder {
	// https://www.geeksforgeeks.org/finding-all-subsets-of-a-given-set-in-java/

	public static void main(String args[]) {

		// check whether the bit is 1 or not

		char set[] = { 'a', 'b', 'c', 'd' };

		// 0-> 0000 -> {}
		// 1-> 0001-> {a}

		for (int i = 0; i < Math.pow(2, set.length); i++) {
			int position = 0; // to get the position of the bit -> this position is also index to choose
								// from the original set
			int number = i;

			System.out.print((i + 1) + " :{");
			while (number != 0) {
				int bit = number & 1; //get the right most bit
				if (bit == 1)
					System.out.printf("%c", set[position]);

				number = number >> 1;
				position++;
			}
			System.out.println("}");
		}
	}
}
