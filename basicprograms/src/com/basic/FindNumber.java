package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.basic.utilities.BasicUtilities;

/**
 * @author Ajit Shikalgar
 *
 */
class FindNumber {
	/**
	 * @param args
	 *            driver program to implement recursive findNumber()
	 */
	public static void main(String args[]) throws IOException {
		int array[], i, number, high, low;
		int choice = 1;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		while (choice == 1) {
			System.out.println("Enter a number exp to 2 ");

			number = Integer.parseInt(br.readLine());
			System.out.println("OH so u slected " + number);
			array = new int[number];
			for (i = 0; i < number; i++)
				array[i] = i;
			low = 0;
			high = array[array.length - 1];
			BasicUtilities basic = new BasicUtilities();
			int exp = basic.findPower(number);
			basic.guessing(high, low, array, exp);
			System.out.println("1. Try Again ");
			System.out.println("2. Exit ");
			int decison = Integer.parseInt(br.readLine());
			switch (decison) {
			case 1:
				choice = 1;
				break;

			case 2:
				choice = 0;
				break;
			}
		}

	}
}
