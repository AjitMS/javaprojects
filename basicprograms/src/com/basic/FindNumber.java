package com.basic;

import java.util.Scanner;

class FindNumber {
	public static void main(String args[]) {
		int array[], i, n, high, low;
		Scanner t = new Scanner(System.in);
		System.out.println("Enter a number exp to 2 ");
		n = t.nextInt();
		array = new int[n];
		for (i = 0; i < n; i++)
			array[i] = i;
		low = 0;
		high = array[array.length - 1];
		Guess g = new Guess();
		int exp = g.findPower(n);
		g.guessing(high, low, array, exp);
		t.close();

	}
}

/**
 * @author Ajit Shikalgar
 * 
 */
class Guess {
	/**
	 * @param high
	 * @param low
	 * @param a
	 *            A Method to guess the imagined number
	 */

	private int count = 0;

	public void guessing(int high, int low, int a[], int exp) {
		int n,middle;
		count++;

		Scanner t = new Scanner(System.in);
		middle = (high + low + 1) / 2;

		if(low>=middle) {
			System.out.println("You Cheated !");
			t.close();
			return;
		}
		
		
		if (count == exp) {
			System.out.println("Guessed number is " + middle + " !");
			t.close();
			return;
		}
		
		
		else {
			System.out.println("Is number in range of " + low + " to" + middle + " yes");
			n = t.nextInt();
			if (n == 1) {
				high = middle;
				guessing(high, low, a, exp);
			} else {
				low = middle;
				guessing(high, low, a, exp);
			}
		}

		t.close();
	}

	/**
	 * @param n
	 * @return
	 * find the Power
	 */
	
	public int findPower(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 2;
		}
		return count;
	}

}