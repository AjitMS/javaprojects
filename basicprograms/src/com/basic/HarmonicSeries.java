package com.basic;

import java.util.Scanner;

public class HarmonicSeries {

	/**
	 * @param args
	 * simple harmonic value calculator
	 */
	public static void main(String args[]) {
		double initial;
		double harmonicnumber;
		Scanner t = new Scanner(System.in);

		System.out.println("**Harmonic Series Program 5**");

		System.out.println("Enter value");
		initial = t.nextDouble();
		while (initial == 0) {
			System.out.println("Enter value greater than 0");
			initial = t.nextInt();
		}
		harmonicnumber = harmonic(initial);
		System.out.println("Harmonic value is " + harmonicnumber);
		t.close();
	}

	public static double reciprocal(double x) {
		if (x == 1)
			return 1.0;
		else
			return (1 / x);
	}

	public static double harmonic(double y) {
		if (y == 1)
			return 1.0;
		else
			return reciprocal(y) + harmonic(y - 1);
	}
}
