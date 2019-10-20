package com.challenge.codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ajit. Problem Statement - https://www.codechef.com/problems/S10E
 *
 * 
 */
public class S10E {

	public static void main(String[] args) throws NumberFormatException, IOException {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int testCases = Integer.parseInt(br.readLine());
			if (testCases < 0 || testCases > 100) {
				// do nothing here
			}
			while (testCases != 0) {
				int noOfDays = Integer.parseInt(br.readLine());
				double[] prices = new double[noOfDays];
				String[] stringArray = br.readLine().split(" ");
				for (int i = 0; i < stringArray.length; i++) {
					prices[i] = Double.parseDouble(stringArray[i]);
				}

				int response = 0;
				if ((response = calculateGoodPriceDays(testCases, noOfDays, prices)) == -1) {
					//
				} else {
					System.out.println(response);
				}
				--testCases;
			}
		} catch (Exception e) {
//			System.out.println(0);
//			e.printStackTrace();
			// do nothing
		}
	}

	public static int calculateGoodPriceDays(int testCases, int noOfDays, double[] prices) {
		if ((noOfDays < 7 || noOfDays > 100))
			return -1;

		for (double price : prices)
			if (price < 350 || price > 750)
				return -1;

		int noOfGoodPriceDays = 0;
		for (int i = 0; i < prices.length; i++) {
			if (i == 0) {
				noOfGoodPriceDays++;
				continue;
			}
			 System.out.println("i = " + i);
			 System.out.println("j = " + ((i - 5) > 0 ? (i - 5) : 0));
			boolean lowPrice = false;
			for (int j = i; j >= ((i - 5) > 0 ? (i - 5) : 0); j--) {
				if (prices[i] < prices[j])
					lowPrice = true;
				else
					lowPrice = false;
			}
			if (lowPrice)
				noOfGoodPriceDays++;
		}
		return noOfGoodPriceDays;
	}
}

// 49
// 8
// 444 555 666 444 555 666 444 555