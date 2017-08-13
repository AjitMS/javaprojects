package com.basic;

import java.util.Scanner;
import com.basic.utilities.BasicUtilities;

/**
 * @author Ajit Shikalgar
 *
 */
public class PrimeFactors {

	/**
	 * @param args
	 * method to find prime numbers that are factors of given numebers as well
	 */
	public static void main(String args[]) {
		int number, i;
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("**Prime Factors Program 6**");

		while (true) {
			System.out.println("Enter number");
			number = scanner.nextInt();

			for (i = 1; i <= number; i++)
				if (number % i == 0)
					if (BasicUtilities.isPrime(i))

						System.out.println(i);
		scanner.close();
		}
	}

	
}