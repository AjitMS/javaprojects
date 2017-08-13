package com.basic;

import java.util.*;

/**
 * @author Ajit Shikalgar
 *
 */
public class StockReport {
	/**
	 * @param args
	 * Driver program to implement Stock maintnance
	 */
	public static void main(String[] args) {
		int n;

		Scanner t = new Scanner(System.in);
		System.out.println("Enter no. of Stocks");
		n = t.nextInt();
		Stock Stock[] = new Stock[n];
		for (int i = 0; i < n; i++) {

			System.out.println("Enter Stock name");
			String name = t.next();

			System.out.println("Enter Stock quantity");
			int quantity = t.nextInt();

			System.out.println("Enter price of each");
			int price = t.nextInt();
			Stock new_Stock = new Stock(name, quantity, price);
			Stock[i] = new_Stock;
		}

		for (int i = 0; i < n; i++) {
			Stock tempStock;
			Portfolio portfolio = new Portfolio();
			tempStock = Stock[i];
			int value = portfolio.catchStock(tempStock);

			System.out.println("Total price of " + tempStock.getName() + " is " + value);
			t.close();
		}

	}
}

class Stock {
	private int quantity, price;
	private String stockName;

	/**
	 * @param name
	 * @param quantity
	 * @param price
	 * A Constructor to set name, quantity, price.
	 */
	public Stock(String name, int quantity, int price) {

		stockName = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		stockName = stockName.toString();

		return stockName;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

}

/**
 * @author Ajit Shikalgar
 *
 */
class Portfolio {

	int totalPrice, quantity, price;

	String stockName;

	/**
	 * Method accepting Stock as parameters
	 * 
	 * @param i
	 * @return total price
	 */
	public int catchStock(Stock i) {
		stockName = i.getName();
		price = i.getPrice();
		quantity = i.getQuantity();

		return totalPrice = quantity * price;
	}
}