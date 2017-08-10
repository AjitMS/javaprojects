package com.basic;

import java.util.*;
import java.io.*;

/**
 * @author Ajit Shikalgar
 * 
 */
public class OrderedList {
	Node head;

	public class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;

		}
	}

	/**
	 * @param data
	 *            A method called to add integers in a sorted fashion
	 */
	public void addSort(int data) {
		Node add = new Node(data);
		Node temp;
		if (head == null || head.data >= add.data) {
			add.next = head;
			head = add;
		} else {
			temp = head;
			while (temp.next != null && temp.next.data < add.data) {
				temp = temp.next;
			}
			add.next = temp.next;
			temp.next = add;
			System.out.println("Added");
			return;
		}

	}

	/**
	 * A Method required to reduce efforts of printing lists.
	 */
	public void showList() {
		if (head == null) {
			System.out.println("Empty List");
			return;
		} else {
			Node n = head;
			while (n != null) {
				System.out.print(" " + n.data);
				n = n.next;
			}
			return;
		}

	}

	/**
	 * A Method that returns whether a data element exists or not in the list
	 * 
	 * @param data
	 * @return boolean
	 */
	public boolean search(int data) {
		if (head == null)
			return false;
		Node sample = head;
		while (sample.next != null & sample.data != data) {
			sample = sample.next;
		}
		if (sample.next == null)
			return false;
		return true;
	}

	/**
	 * A Method that facilitates removal of data in sorted fashion
	 * 
	 * @param del_data
	 */
	public void removeSort(int del_data) {

		Node temp = head, prev = null;

		if (temp != null && temp.data == del_data) {
			head = temp.next;
			return;
		}

		while (temp != null && temp.data != del_data) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null)
			return;

		prev.next = temp.next;
	}

	/**
	 * Function to facilitate Writing of list to file
	 */
	public void fileWriter() {
		Node n = head;
		String s;
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/textfiles/OrderedListop.txt"))) {

			while (n.next != null) {

				s = Integer.toString(n.data);
				bw.write(s);
				n = n.next;
			}

		} catch (Exception E) {
			System.out.println("IOException");
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int token;
		Scanner fileScanner = new Scanner(new FileReader("src/textfiles/orderedlist.txt"));
		OrderedList orderedList = new OrderedList();

		int n;

		while (fileScanner.hasNext()) {
			n = fileScanner.nextInt();
			orderedList.addSort(n);
		}
		System.out.println("Original List in Text File is: out of: ");
		orderedList.showList();
		System.out.println("");
		String choice = "y";
		while (choice == "y") {
			System.out.println("Enter an Integer you wish to remove/Add ");
			token = scanner.nextInt();
			if (orderedList.search(token) == true) {
				orderedList.removeSort(token);
				System.out.println("Removed Successfullly !!!");
			} else if (orderedList.search(token) == false) {
				orderedList.addSort(token);
				System.out.println("Added Successfully !!!");
			}

			orderedList.fileWriter();
			orderedList.showList();
			System.out.println();
			System.out.println("1. Continue");

			System.out.println("2. Exit ");

			int decision = scanner.nextInt();
			switch (decision) {
			case 1:
				choice = "y";
				break;
			case 2:
				choice = "n";
				break;

			}

		}
		scanner.close();
		fileScanner.close();
	}

}
