package com.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * @author bridgelabz3
 *
 */
public class Gambler {

	/**
	 * @param args
	 *            Gambler simulator with 1 unit increment till goal reaches OR user
	 *            goes broke
	 */
	public static void main(String args[]) {
		int random, $stake=1, i = 0, $goal=0;
		double n = 0.0;
		double percentWin, percentLoss;

		System.out.println("**Gambler Program 7**");

		String choice = "y";
		Scanner scanner = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {

			
			while ($goal <= $stake) {
				System.out.println("Make sure your Goals Higher than current Stake");
				System.out.println("What is on Stake, mate?");
				$stake = scanner.nextInt();
				System.out.println("Cool ! so, What's the goal you wanna meet?");
				$goal = scanner.nextInt();
			}

			Random rm = new Random();
			while (!($stake == 0 | $stake == $goal)) {
				random = rm.nextInt(50) + 1;

				if (random <= 25)
					$stake--;// lossess
				else {
					$stake++;// wins
					i++;

				}
				n++;

			}
			if ($stake == 0)
				System.out.println("Sorry for your loss");
			else
				System.out.println("You owe me a Saporro's Space Barley Beer !");
			percentWin = i / n * 100.0;
			percentLoss = 100 - percentWin;
			System.out.println("No. of wins: " + i + " from total of: " + n);
			System.out.println("percent of wins: " + percentWin);
			System.out.println("percent of lossess: " + percentLoss);
			System.out.println("Play Again Y or N ?");

			choice = scanner.next();
			System.out.println(choice);
		}
		scanner.close();
	}
}
