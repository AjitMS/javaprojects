package com.challenge.codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Ajit. Problem Statement - https://www.codechef.com/problems/EXUNA
 *
 */
public class EXUNA {

	// public static void main1(String[] args) {
	// System.out.println(10009 % 13);
	// System.out.println(13 % 1001);
	// }

	public static void main(String[] args) throws IOException {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			long totalTestCases = 0l;
			long noOfTestCases = Long.parseLong(br.readLine());
			if (noOfTestCases < 0 || noOfTestCases > 5000000) {
				return;
			}
			totalTestCases = +totalTestCases;
			if (totalTestCases > 10000000) {
				return;
			}
			while (noOfTestCases != 0) {
				int sizeOfArray = Integer.parseInt(br.readLine());
				if (sizeOfArray < 2 || sizeOfArray > 5000000) {
					return;
				}

				long[] array = new long[sizeOfArray];
				String[] stringArray = br.readLine().split(" ");
				for (int i = 0; i < stringArray.length; i++) {
					array[i] = Long.parseLong(stringArray[i]);
					if (array[i] > Math.pow(10, 9))
						return;
				}
				Arrays.sort(array);
				if (!isDistinct(array)) {
					return;
				}
				System.out.println(calcMaxMod(array));
				--noOfTestCases;
			}
		} catch (NumberFormatException e) {
			// e.printStackTrace();
		}
	}

	public static long calcMaxMod(long[] array) {
		// long maxMod = -1l;
		// long mod;
		// for (int i = array.length - 1; i >= 0; --i) {
		// long ultimate = array[i];
		// long penultimate = (i - 1)>=0? array[i -1] :ultimate;
		// }

		// return maxMod;
		return array[array.length - 2];
	}

	public static boolean isDistinct(long[] array) {
		for (int i = 0; i < array.length; i++) {
			if ((i + 1) == array.length) {
				return true;
			}
			if (array[i] == array[i + 1])
				return false;
		}
		return false;
	}
}
