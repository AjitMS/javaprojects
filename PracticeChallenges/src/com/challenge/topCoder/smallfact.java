package com.challenge.topCoder;
import java.util.*;

class smallfact {
	public static void main(String args[]) {
		int i, j, fact = 1;
		Scanner t = new Scanner(System.in);
		int n = t.nextInt();// no. of inputs

		if (n > 1 && n <= 100) {

			int input[] = new int[n];
			for (i = 0; i < n; i++) {
				input[i] = t.nextInt();
			}

			int factinput[] = new int[n];
			for (i = 0; i < n; i++)
				if (input[i] >= 1 && input[i] <= 100) {
					for (i = 0; i < n; i++) {
						for (j = 1; j <= input[i]; j++)

							fact = fact * j;
						factinput[i] = fact;
						fact = 1;
						
					}
				}

			for (i = 0; i < n; i++)

				System.out.println(factinput[i]);

		}
		t.close();
	}

}
