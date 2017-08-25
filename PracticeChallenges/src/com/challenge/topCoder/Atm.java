package com.challenge.topCoder;
import java.util.*;

class Atm {
	public static void main(String args[]) {
		Scanner t = new Scanner(System.in);
		float x; // x is current balance. y is withdrawal amount.
		int y;

		y = t.nextInt();
		x = t.nextFloat();

		if (x > 0 && x <= 2000)//current balance is positive and less than  2000
			if (y >= 0 && y < 2000)//withdrawal is positive and greater than 2000
				if (y % 5 == 0 && x > y) {   // withdrawal if divisible by 5
					x = (float) (x - y) - 0.50f;//deduct 0.5 service charge
					System.out.printf("%.2f", x);//print out new balance
				} else
					System.out.println(x);// else print out load balance
		t.close();
	}
}