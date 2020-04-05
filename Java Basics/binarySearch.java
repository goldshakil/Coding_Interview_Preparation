package tester;

import java.io.*;

import java.util.*;

//array should be sorted
class binarySearch {

	static int binarySearch(int a[], int left, int right, int val) {

		if (right >= left) {
			int mid = (right+left) / 2;
			if (val == a[mid]) {
				return mid;
			} 
			else if (val > a[mid]) {
				return binarySearch(a, mid + 1, right, val);
			} else {
				return binarySearch(a, left, mid - 1, val);
			}
		}

		return -1; // not found
	}

	public static void main(String args[]) {

		int a[] = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(binarySearch(a, 0, a.length-1, 12));

	}
}
