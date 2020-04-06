package tester;

import java.io.*;

import java.util.*;
 // Find the two prime numbers that add up to an even number
class arrayFunction {

	static boolean checkPrime(int number) {
		int flag = 0; // 0 -> odd 1 -> even
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			return false;
		else
			return true;
	}

	static ArrayList<Integer> prime_numberGenerator() {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 2; i < 10000; i++) // generate all possible prime numbers
		{
			if (checkPrime(i)) {
				list.add(i);
			}
		}
		return list;
	}

	static pair findPair(int number, ArrayList<Integer> primeList) {
		pair answer = new pair();
		int i = 0;
		int j = primeList.size() - 1;
		while (j >= i) {

			if ((primeList.get(i) + primeList.get(j)) > number) {
				j--;
			} else if ((primeList.get(i) + primeList.get(j)) < number) {
				i++;
			} else if ((primeList.get(i) + primeList.get(j)) == number) {

				answer.val1 = primeList.get(i);
				answer.val2 = primeList.get(j);
				j--;
				i++;
			}
		}
		return answer;

	}

	// driver function
	public static void main(String args[]) {
		ArrayList<Integer> primeList = prime_numberGenerator();// this takes O(n^2)

		Scanner sc = new Scanner(System.in);
		int totalNumbers = sc.nextInt();
		// This loop has O(n^2) complexity --> n for getting input and n for finding the pair
		for (int i = 0; i < totalNumbers; i++) {
			int number = sc.nextInt();
			pair answer = findPair(number, primeList);
			System.out.printf("%d %d\n", answer.val1, answer.val2);

		}

	}
}

class pair {
	Integer val1;
	Integer val2;

}
