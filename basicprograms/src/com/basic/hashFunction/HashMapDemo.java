package com.basic.hashFunction;

import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo {
	Map<Integer, List<Integer>> map;
	HashFunctionManager manager = new HashFunctionManager();

	public static void main(String[] args) {

		int option;
		String choice = "y";

		HashMapDemo demoapp = new HashMapDemo();
		try (Scanner t = new Scanner(System.in)) {
			// Keep Running till user opts to quit
			while (choice.equalsIgnoreCase("y")) {
				System.out.println("Please Select any One from below ");
				System.out.println("1.Insert/Search ");
				System.out.println("2.Display HasMap");
				option = t.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter Value to insert into HashMap");
					int i = t.nextInt();

					try {
						demoapp.insert(i);
					} catch (Exception E) {
						System.out.println(E);
						E.printStackTrace();
					}
					System.out.println("Do you want to Continue ? Y or N ? ");
					choice = t.next();

					break;
				case 2:
					try {
						demoapp.display();
					} catch (Exception E) {
						System.out.println(E);
					}
					System.out.println("Do you want to Continue ? Y or N ? ");
					choice = t.next();
					break;
				default:
					System.out.println("Please enter a proper Input ");

				}
			}

		}
	}

	private void insert(int n) throws Exception {
		manager.insert(n);
	}

	private void display() throws Exception {
		map = manager.getmap();
		// Formatting Output
		for (Entry<Integer, List<Integer>> entry : map.entrySet()) {
			System.out.printf("Slot %d: ", entry.getKey());
			List<Integer> list = entry.getValue();
			for (Integer i : list) {
				System.out.printf("%d ", i);
			}
			System.out.println();
		}
	}

}