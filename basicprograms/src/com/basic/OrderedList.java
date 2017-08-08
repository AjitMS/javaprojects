package com.basic;


import java.util.*;
import java.io.*;

/**
 * @author Ajit Shikalgar
 * 
 */
public class OrderedList {
	node head;

	public class node {
		int data;
		node next;

		node(int d) {
			data = d;

		}
	}

	/**
	 * @param data
	 *            A method called to add integers in a sorted fashion
	 */
	public void addsort(int data) {
		node add = new node(data);
		node temp;
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
	public void show() {
		if (head == null) {
			System.out.println("Empty List");
			return;
		} else {
			node n = head;
			while (n.next != null) {
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
		node sample = head;
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
	public void removesort(int del_data) {

		node temp = head, prev = null;

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
	public void filewriter() {
		node n = head;
		String s;
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(
				"src/textfiles/OrderedListop.txt"))) {

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
		Scanner t = new Scanner(System.in);
		int token;
		Scanner sc = new Scanner(
				new FileReader("src/textfiles/orderedlist.txt"));
		OrderedList il = new OrderedList();

		int n;

		while (sc.hasNext()) {
			n = sc.nextInt();
			il.addsort(n);
		}
		System.out.println("Original List in Text File is: ");
		il.show();
		System.out.println("");
		String choice = "y";
		while (choice == "y") {
			System.out.println("Enter an Integer you wish to remove/Add ");
			token = t.nextInt();
			if (il.search(token) == true) {
				il.removesort(token);
				System.out.println("Removed Successfullly !!!");
			} else if (il.search(token) == false) {
				il.addsort(token);
				System.out.println("Added Successfully !!!");
			}
			
			
			il.filewriter();
			il.show();
		
		}
		t.close();
		sc.close();
	}

}
