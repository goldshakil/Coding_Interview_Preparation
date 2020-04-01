package tester;

import java.util.*;
import java.io.*;

class sets {
	public static void printer() {
		System.out.println("-------------------------------------");
	}

	public static void main(String args[]) {
		// hashset has the best performance betweent the sets types
		// https://javaconceptoftheday.com/hashset-vs-linkedhashset-vs-treeset-in-java/

		// main idea of sets that they don't allow any duplicate values
		Set<String> set = new HashSet<String>();
		set.add("Dahab");
		set.add("Henry");
		set.add("Dahab");
		// second dahab is not added
		System.out.println(set);

	}

}
