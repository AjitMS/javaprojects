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
		int res = 0;

		// Base case
		if (n <= 1) {
			return 1;
		}
		for (int i = 0; i < n; i++) {
			res += catalan(i) * catalan(n - i - 1);
		}
		return res;
	}

	/**
	 * @param args
	 * driver program to generate no. of tress
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BinaryNumberTrees catalan = new BinaryNumberTrees();
		System.out.println("Enter no. of Nodes");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print(catalan.catalan(i) + " ");

		}
		scanner.close();
	}
}
