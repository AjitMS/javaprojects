package com.basic;

import java.util.Random;
import java.util.Scanner;

public class Gambler {

	public static void main(String args[]) {
		int x, $stake, i = 0, $goal;
		double n = 0.0;
		double pw, pl;

		System.out.println("**Gambler Program 7**");

		Scanner t = new Scanner(System.in);
		System.out.println("What is on Stake, mate?");
		$stake = t.nextInt();
		System.out.println("Cool ! so, What's the goal you wanna meet?");
		$goal = t.nextInt();
		Random rm = new Random();
		while (!($stake == 0 | $stake == $goal)) {
			x = rm.nextInt(50) + 1;

			if (x < 25)
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
		pw = i / n * 100.0;
		pl = 100 - pw;
		System.out.println("No. of wins: " + i + " from total of: " + n);
		System.out.println("percent of wins: " + pw);
		System.out.println("percent of lossess: " + pl);
		t.close();
	}
}
