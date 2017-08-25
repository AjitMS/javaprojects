package com.challenge.topCoder;

import java.util.*;

class Diam {
	public static void main(String args[]) {

		int n, i, j;
		System.out.println("Enter no. max nodes per row");
		Scanner t = new Scanner(System.in);
		n = t.nextInt();
		for (i = 0; i < n; i++) {
			for (j = n; j > i / 2; j--)
				System.out.print(" ");
			for (j = 0; j <= i; j++) {
				System.out.print("*\t");

			}
			System.out.println("");
		}

		for (i = 0; i < n; i++) {
			for (j = n; j > i / 2; j--)
				System.out.print(" ");
			for (j = n; j > i + 1; j--) {
				System.out.print("*\t");

			}
			System.out.println("");
		}
		t.close();
	}
}