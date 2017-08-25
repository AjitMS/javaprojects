package com.challenge.topCoder;
import java.util.*;

class turbosort {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		int n;
		n = t.nextInt();
		int unsort[] = new int[n];
		for (int i = 0; i < n; i++)
			unsort[i] = t.nextInt();
		Arrays.sort(unsort);
		for (int i = 0; i < n; i++)
			System.out.println(unsort[i]);
		t.close();

	}
}