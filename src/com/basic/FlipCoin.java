package com.basic;

import java.util.Scanner;
import java.util.Random;

class FlipCoin {
	/**
	 * @param args
	 *            Using a random number generator, predict result of flipping of
	 *            coin
	 */
	public static void main(String args[]) {

		System.out.println("**This is Coin Flip Program 02**");

		int flips, i, heads = 0, tails = 0;
		float f, percentheads, percenttails;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of flips");
		flips = scanner.nextInt();
		while (flips < 0) {
			System.out.println("Positive Interger only");
			flips = scanner.nextInt();
		}
		i = 1;
		Random random = new Random();
		while (i <= flips) {
			f = (float) random.nextFloat();
			System.out.println("Random" + f);
			if (f < 0.5)
				tails++;
			else
				heads++;
			i++;
		}
		percentheads = (float) (heads * 100) / flips;
		percenttails = (float) (tails * 100) / flips;
		System.out.println("Heads Percentage" + percentheads);
		System.out.println("Tails Percentage" + percenttails);
		scanner.close();
	}
}
