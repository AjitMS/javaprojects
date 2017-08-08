package com.basic;

import java.util.*;

/**
 * @author Ajit Shikalgar
 *
 */
class Cashcounter {
	int first, array[], length, size, last;

	/**
	 * Constructor with initial values setting
	 * 
	 * @param size
	 */
	public Cashcounter(int size) {
		first = 0;

		array = new int[size];
		length = array.length;
		this.size = size;
		last = first - 1;
	}

	/**
	 * @param data
	 *            Add function to add data to queue
	 */
	public void add(int data) {
		if (last == size - 1) {
			System.out.println("Queue Full Already");
			return;
		} else {
			length++;
			last++;
			array[last] = data;
			return;
		}

	}

	/**
	 * @param none
	 *            Remove function to facilitate deletion from queue
	 */
	public void remove() {
		if (first > last) {
			System.out.println("Queue Empty Already");
			return;
		} else {
			length--;
			first++;
		}

	}

	public boolean isEmpty() {
		if (first > last)
			return true;
		return false;
	}

	/**
	 * @param args
	 *            driver function to implement cash counter always maintain grand
	 *            total >0, deny invalid transactions.
	 */
	public static void main(String[] args) {

		int balance = 10000000;
		String choice = "y";
		Random random;
		Scanner scanner = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter no. of People in Queue ");
			int people = scanner.nextInt();
			Cashcounter cashCounter = new Cashcounter(people);
			random = new Random();
			for (int i = 0; i < people; i++) {
				boolean action = true; // True for Deposit, False for Withdraw
				int temp = random.nextInt(100000) + 1;
				System.out.println("Enter whether Withdraw or Deposit for person " + (i + 1));
				String purpose = scanner.next();// whether to deposit or withdraw
				if (purpose.equalsIgnoreCase("deposit"))
					action = true;
				else if (purpose.equalsIgnoreCase("withdraw"))
					action = false;
				else
					System.out.println("Wrong Keyword. Try Again ");

				Customer customer = new Customer(temp, action);
				System.out.println("Enter Amount to " + purpose);
				int money = scanner.nextInt();
				cashCounter.add(money);
				if (purpose.equalsIgnoreCase("withdraw")) {

					if (money > customer.getBal()) {
						System.out.println("Action Denied ! Insufficent Balance");
						continue;
					}

					else {
						System.out.println("Your old Bal. before " + purpose + " is " + customer.getBal());
						customer.setBal(customer.getBal() - money);
						System.out.println("Your New Bal. after " + purpose + " is" + customer.getBal());
					}
				}
				if (purpose.equalsIgnoreCase("deposit")) {
					System.out.println("Your old Bal. before " + purpose + " is " + customer.getBal());
					customer.setBal(customer.getBal() + money);
					System.out.println("Your New Bal. after " + purpose + " is" + customer.getBal());
				}

				if (balance >= 0) {

					if (action == true) {
						balance = balance + money;

					} else
						balance = balance - money;

					System.out.println("Balance available " + balance);
					cashCounter.remove();
				}

				else if (balance < 10000000) {
					System.out.println("So Sorry. No more Transactions for the day");
					break;
				}
			}

			if (cashCounter.isEmpty())
				System.out.println("Transaction is carried out succesfullly !");
			System.out.println("Begin Again Y or N ?");
			choice = scanner.next();
		}
		scanner.close();
	}

}

/**
 * @author Ajit Shikalgar Customer class containing info about customer
 *
 */
class Customer {

	int bal;
	boolean deposit, withdraw, j, temp;

	/**
	 * @param n
	 * @param action
	 *            Setter constructor for customer
	 */
	public Customer(int n, boolean action) {
		bal = n;
		if (action == true) {
			deposit = true;
			withdraw = false;
		} else {
			deposit = false;
			withdraw = true;
		}
	}

	public void setBal(int n) {
		bal = n;
	}

	public int getBal() {
		return bal;
	}

}
