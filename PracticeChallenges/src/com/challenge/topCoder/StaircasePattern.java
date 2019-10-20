package com.challenge.topCoder;

public class StaircasePattern {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i < n; i++) {
			
			System.out.println();
			for (int j = n - (i + 1); j > 0; j--) {
				System.out.print("_");
			}
			
			for (int j = 0; j <= i; j++)
				System.out.print("#");
		}
	}
}