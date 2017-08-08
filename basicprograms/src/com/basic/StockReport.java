package com.basic;

import java.util.*;

public class StockReport {
	public static void main(String[] args) {
		int n;

		Scanner t = new Scanner(System.in);
		System.out.println("Enter no. of Stocks");
		n = t.nextInt();
		Stock Stock[] = new Stock[n];
		for (int i = 0; i < n; i++) {

			System.out.println("Enter Stock name");
			String s = t.next();

			System.out.println("Enter Stock quantity");
			int number = t.nextInt();

			System.out.println("Enter price of each");
			int pr = t.nextInt();
			Stock new_Stock = new Stock(s, number, pr);
			Stock[i] = new_Stock;
		}

		for (int i = 0; i < n; i++) {
			Stock tempStock;
			Portfolio pf = new Portfolio();
			tempStock = Stock[i];
			int value = pf.catchStock(tempStock);

			System.out.println("Total price of " + tempStock.getname() + " is " + value);
			t.close();
		}

	}
}

class Stock {
	private int quantity, price;
	private String Stockname;

	/**
	 * @param name
	 * @param quantity
	 * @param price
	 * A Constructor to set name, quantity, price.
	 */
	public Stock(String name, int quantity, int price) {

		Stockname = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getname() {
		Stockname = Stockname.toString();

		return Stockname;
	}

	public int getprice() {
		return price;
	}

	public int getquantity() {
		return quantity;
	}

}

/**
 * @author Ajit Shikalgar
 *
 */
class Portfolio {

	int totalprice, quantity, price;

	String stockname;

	/**
	 * Method accepting Stock as parameters
	 * 
	 * @param i
	 * @return total price
	 */
	public int catchStock(Stock i) {
		stockname = i.getname();
		price = i.getprice();
		quantity = i.getquantity();

		return totalprice = quantity * price;
	}
}