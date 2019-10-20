package com.challenge.topCoder;

public class Ratio {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 0, -1, -1 };

		float total = arr.length;
		float zeroes = 0;
		float pos = 0;
		float neg = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				pos++;
			else if (arr[i] < 0)
				neg++;
			else
				zeroes++;
		}
		
		System.out.printf("%f\n", pos / total);
		System.out.printf("%f\n", neg / total);
		System.out.printf("%f\n", zeroes / total);

	}
}