package tester;

import java.io.*;
import java.util.*;

class removeEven {

	static void printer(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {

		int a[] = { 1, 3, 5, 72, 6, 22, 2, 10, 2, 1, 6, 7, 23, 23, 1, 2, 20 };
		int a2[] = new int[a.length];

		int tracker = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				a2[tracker] = a[i];
				tracker++;
			}
		}
		
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i]+" ");
			
		
		}
		
		

	}

}
