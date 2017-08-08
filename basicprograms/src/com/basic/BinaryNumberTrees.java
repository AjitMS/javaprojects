package com.basic;


import java.util.*;

/**
 * @author Ajit Shikalgar
 *
 */
public class BinaryNumberTrees {

	// A recursive function to find nth catalan number

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

	public static void main(String[] args) {
		Scanner t= new Scanner(System.in);
		BinaryNumberTrees cn = new BinaryNumberTrees();
		System.out.println("Enter no. of Nodes");
		int n = t.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print(cn.catalan(i) + " ");
			t.close();
		}
	}
}
