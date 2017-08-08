package com.basic;

import java.util.*;
import java.io.*;

/**
 * @author Ajit Shikalgar
 *
 */
public class UnOrderedList {
	Node head;

	static class Node {
		int data;
		Node next = null;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/**
	 * show entire list through traversing
	 */
	public void show() {
		Node n = head;
		while (n != null) {
			System.out.print(" " + n.data);
			n = n.next;
		}
	}

	/**
	 * @param new_data
	 * Implmentation of addLast to Linked List
	 */
	public void append(int new_data) {
		if (head == null) {
			head = new Node(new_data);
			return;
		}
		Node last = head;
		Node new_Node = new Node(new_data);
		new_Node.next = null;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new_Node;
		return;

	}

	/**
	 * @param new_data
	 * Pushing data to the first
	 */
	public void push(int new_data) {
		if (head == null)
			head = new Node(new_data);
		Node new_Node = new Node(new_data);
		new_Node.next = head.next;
		head = new_Node;
	}

	/**
	* @param data
	* search through entire list through traversing till end
	 * @return false if not found
	 * else return true
	 */
	public boolean search(int data) {
		Node sample = head;
		if (sample.data == data)
			return true;
		while (sample.next != null && sample.data != data)
			sample = sample.next;
		if (sample.data == data)
			return true;
		return false;
	}

	/**
	 * @param del_data
	 * removing a node from list.
	 * can be from first, last, or between nodes.
	 */
	public void remove(int del_data) {

		Node temp = head, prev = null;

		// If head Node itself holds the key to be deleted
		if (temp != null && temp.data == del_data) {
			head = temp.next; // Changed head
			return;
		}

		// Search for the key to be deleted, keep track of the
		// previous Node as we need to change temp.next
		while (temp != null && temp.data != del_data) {
			prev = temp;
			temp = temp.next;
		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the Node from linked list
		prev.next = temp.next;
	}

	/**
	 * @param prev_Node
	 * @param new_data
	 * Method to add node between two nodes
	 */
	public void insertAfter(Node prev_Node, int new_data) {
		if (head == null)
			head = new Node(new_data);
		Node new_Node = new Node(new_data);
		new_Node.next = prev_Node.next;
		prev_Node.next = new_Node;

	}

	/**
	 * function to write the list to the file
	 */
	public void fileWriter() {

		Node n = head;

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/textfiles/linkedlistop.txt"))) {
			String s;
			while (n.next != null) {
				s = Integer.toString(n.data);
				bw.write(s);
				n = n.next;
			}

		} catch (Exception E) {
			System.out.println("File Not Found");
		} finally {
			System.out.println("done");
		}

	}

	public static void main(String args[]) throws Exception {

		Scanner t = new Scanner(System.in);

		int token;
		Scanner sc = new Scanner(new FileReader("src/textfiles/linkedlist.txt"));
		UnOrderedList il = new UnOrderedList();
		int n;

		while (sc.hasNext()) {
			n = sc.nextInt();
			il.append(n);
		}
		System.out.println("Original");
		il.show();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter any Integer");
			token = t.nextInt();
			if (il.search(token) == true)
				il.remove(token);
			else if (il.search(token) == false)
				il.append(token);
			il.fileWriter();

			sc.close();
			il.show();
			System.out.println("Continue Y or N?");
			choice = t.next();
		}
		t.close();
	}
}
