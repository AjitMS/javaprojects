package com.basic.utilities;

import java.util.Scanner;

public class BasicUtilities {

	public static boolean anagram(String a, String b) {
		int i, j;
		for (i = 0; i < a.length(); i++)
			for (j = 0; j < b.length(); j++) {
				if (a.length() == 0 || b.length() == 0)
					return false;
				if (a.length() != b.length())
					return false;
				if (a.charAt(i) != b.charAt(j))
					return false;
			}
		return true;
	}

	public static int powerOf2(int x) {
		if (x == 0)
			return 1;
		if (x == 1)
			return 2;
		return 2 * powerOf2(x - 1);
	}

	public static boolean isPrime(int x) {
		int count = 0;
		for (int j = 1; j < x; j++)
			if (x % j == 0)
				count++;
		if (count == 1)
			return true;
		return false;
	}

	/**
	 * @param high
	 * @param low
	 * @param a
	 *            A Method to guess the imagined number
	 */

	private static int count = 0;

	public void guessing(int high, int low, int a[], int exp) {
		int n, middle;
		count++;
System.out.println("Trial: "+count+" Total:  "+exp);
		Scanner t = new Scanner(System.in);
		middle = (high + low + 1) / 2;

		if (low >= middle) {
			System.out.println("You Cheated !");
			count = 0;
			return;
		}

		if (count == exp) {
			System.out.println("Guessed number is " + middle + " !");
			count = 0;
			return;
		}

		else {
			System.out.println("Is your number in range of " + low + " to" + middle + " ?");
			n = t.nextInt();
			if (n == 1) {
				high = middle;
				guessing(high, low, a, exp);
			} else {
				low = middle;
				guessing(high, low, a, exp);
			}
		}

		
	}

	/**
	 * @param n
	 * @return find the Power
	 */

	public  int findPower(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 2;
		}
		return count;
	}
}
