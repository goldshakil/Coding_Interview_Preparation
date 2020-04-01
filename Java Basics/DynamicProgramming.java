package tester;

import java.util.*;
import java.io.*;

/*Typically, all the problems that require to maximize or minimize certain quantity
or counting problems that say to count the arrangements under certain condition or certain probability 
problems can be solved by using Dynamic Programming.
*/
class DynamicProgramming {
	// Dynamic Programming is only a technique to make recursion faster
	// No overlapping subproblems
	// easier to code
	
	static int Memo_Table[]=new int[20]; //for memoized solution
	public static void printer() {
		System.out.println("-------------------------------------");
	}
	//Memoization Technique in Dynamic Programming
	// we don't fill the table iteratively but recursively
	public static int fibonacci(int n) {
		int result = 0;
		
		if(Memo_Table[n]!=0)// the results have been already computed
		{
			return Memo_Table[n];
		}
		else if (n == 1 || n == 2)
			result = 1;
		else {
			result = fibonacci(n - 1) + fibonacci(n - 2);
		}
		Memo_Table[n]=result;
		return result;

	}
	
	//Bottom -Up Tehcnique in Dynamic Programming: Not a recursive solution
	//here we fill the table not recursively but from bottom to top
	// from smallest n to largest n
	static int fib_btmup(int n)
	{
		int Memo_Table[]=new int [n+2];
		Memo_Table[1]=1;
		Memo_Table[2]=1;
		
		for(int i=3;i<=n;i++)
		{
			Memo_Table[i]=Memo_Table[i-1]+Memo_Table[i-2];
		//	System.out.println(Memo_Table[i]);
		}
		
		return Memo_Table[n];
	}

	public static void main(String args[]) {

		System.out.println(fibonacci(5));
		printer();
		for(int i=0;i<Memo_Table.length;i++)
		{
			System.out.printf("%d ",Memo_Table[i]);
		}
		System.out.println();
		printer();
		System.out.println(fib_btmup(5));
		
	}

}
