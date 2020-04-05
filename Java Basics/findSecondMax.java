package tester;

import java.io.*;
import java.util.*;

//find second maximum number
class findSecondMax {

	static void printer(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);

		}
		System.out.println();
	}

	public static void main(String args[]) {

		int a[] = { 1, 3, 5, 3, 2, 2, 5, 7, 8, 1, 8, 1, 6, 9, 9, 10, 7 }; // answer should be 6
		Arrays.parallelSort(a);
		printer(a);
		for(int i=a.length-1;i>=1;i--)
		{
			if(a[i]!=a[i-1])
			{
				System.out.println(a[i-1]);
				break;
			}
			
		}
	}

}
