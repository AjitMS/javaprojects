package com.challenge.topCoder;
import java.util.*;

class lead {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		int n = t.nextInt();// no. of rounds
		int i, winner = 0, max;
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = t.nextInt();
			b[i] = t.nextInt();
		}

		int a1[] = new int[n];
		a1[0] = 0;
		int b1[] = new int[n];
		b1[0] = 0;

		for (i = 0; i < n; i++) {
			a1[i] = a1[i] + a[i];
			b1[i] = b1[i] + b[i];
		}

		for (i = 0; i < n; i++) {
			if (a1[i] > b1[i]) {
				c[i] = a1[i] - b1[i];
			} else {
				c[i] = b1[i] - a1[i];
			}

		}
		max = c[0];
		for (i = 0; i < n; i++)
			if (c[i] > max)
				max = c[i];

		for (i = 0; i < n; i++) {
			if (a1[i] > b1[i]) {
				winner = 1;
				if (c[i] == max)
					break;
			} else {
				winner = 2;
				if (c[i] == max)
					break;
			}

		}

		System.out.print(winner + "\t");
		System.out.println(max);
		t.close();
	}
}