package com.basic;

import java.util.*;

/**
 * @author Ajit Shikalgar
 *
 */
public class BinaryNumberTrees {

	/**
	 * @param n
	 * @return Recursive Function to implement nth Catalan Number.
	 */
	int catalan(int n) {
		int result = 0;

		// Base case
		if (n <= 1) {
			return 1;
		}
		for (int i = 0; i < n; i++) {
			result += catalan(i) * catalan(n - i - 1);
		}
		return result;
	}

	/**
	 * @param args
	 *            driver program to generate no. of tress
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BinaryNumberTrees catalan = new BinaryNumberTrees();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter no. of Nodes");
			int nodes = scanner.nextInt();
			for (int i = 0; i < nodes; i++) {
				System.out.print(catalan.catalan(i) + " ");
			}
			System.out.println();
			System.out.println("Continue Y or N ?");
			choice = scanner.next();
		}
		scanner.close();
	}
}
