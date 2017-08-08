package com.basic;


import java.util.*;


public class Vendingmachine {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Enter Amount to get price: ");
		int amount = t.nextInt();
		Change gc = new Change();
		gc.getChange(amount);
		t.close();

	}

}

class Change {
	private int i = 8;
	private int currency[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
	private int temp = 0;

	public void getChange(int money) {

		if (money == 0)
			return;
		int current = currency[i];
		temp = 0;
		while (money >= current & money > 0) {
			temp = money / current;
			System.out
					.println("No. of " + current + " Rupee Notes is: " + temp);
			money = money % current;
		}
		i--;
		getChange(money);
		

	}
}
