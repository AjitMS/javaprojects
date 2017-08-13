package com.basic;

import java.util.*;

/**
 * @author Ajit Shikalgar
 *
 */
public class Vendingmachine {

	/**
	 * driver function to implement getChange
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean decision = true;
		while(decision) {
		System.out.println("Enter Amount to get price: ");
		int amount = scanner.nextInt();
		Change change = new Change();
		change.getChange(amount);
		System.out.println("1. Try Again ");
		System.out.println("2. Exit ");
		int choice = scanner.nextInt();
		if(choice == 1)
			decision = true;
		else decision = false;
		}
		scanner.close();

	}

}

/**
 * @author Ajit Shikalgar
 *
 */
class Change {
	private int i = 8;
	private int currency[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
	private int temp = 0;

	/**
	 * @param money
	 *            using recursion getting least amount of currency units to be
	 *            returned to the user by basic comparision
	 */
	public void getChange(int money) {

		if (money == 0)
			return;
		int current = currency[i];
		temp = 0;
		while (money >= current & money > 0) {
			temp = money / current;
			System.out.println("No. of " + current + " Rupee Notes is: " + temp);
			money = money % current;
		}
		i--;
		getChange(money);

	}
}
