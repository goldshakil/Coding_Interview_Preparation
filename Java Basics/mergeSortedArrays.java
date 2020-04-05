package tester;

import java.io.*;
import java.util.*;

class mergeSortedArrays {

	static void printer(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);

		}
	}

	public static void main(String args[]) {

		int a[] = { 1, 3, 5, 7, 9, 10 };
		int a2[] = { -1, 2, 4, 5, 12,14,18 };

		int mergedArray[] = new int[(a.length + a2.length)];
		int aTracker = 0;
		int a2Tracker = 0;
		int mergeTracker = 0;
		while (aTracker < a.length && a2Tracker < a2.length) {

			if (a[aTracker] <= a2[a2Tracker]) {
				mergedArray[mergeTracker] = a[aTracker];
				aTracker++;
				mergeTracker++;
			} else {
				mergedArray[mergeTracker] = a2[a2Tracker];
				a2Tracker++;
				mergeTracker++;
			}
		}
		
		while(aTracker < a.length )
		{
			mergedArray[mergeTracker] = a[aTracker];
			aTracker++;
			mergeTracker++;
		}
		while(a2Tracker < a2.length )
		{
			mergedArray[mergeTracker] = a2[a2Tracker];
			a2Tracker++;
			mergeTracker++;
			
		}
		
		
		printer(mergedArray);

	}

}
