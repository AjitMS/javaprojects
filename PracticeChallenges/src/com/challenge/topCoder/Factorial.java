package com.challenge.topCoder;
import java.util.*;

class Factorial {
	public static void main(String args[]) {
		int i, j, fact = 1;
		int count = 0;
		Scanner t = new Scanner(System.in);
		int n = t.nextInt();// no. of inputs
		int input[] = new int[n];
		for (i = 0; i < n; i++)
			input[i] = t.nextInt();
		int factinput[] = new int[n];
		for (i = 0; i < n; i++) {
			for (j = 1; j <= input[i]; j++)
				fact = fact * j;
			factinput[i] = fact;
			fact = 1;
		}
		for (i = 0; i < n; i++)
			System.out.print(factinput[i]+"\t");
		for (i = 0; i < n; i++) {
			while (factinput[i] >= 10) {

				if (factinput[i] % 10 == 0)
					count++;
				else
					break;
				factinput[i] = factinput[i] / 10;

			}
			System.out.println(count);//count is no. of  zeroes
			count = 0;
			
		}
		t.close();
	}
}
