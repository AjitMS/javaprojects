package com.challenge.topCoder;
class shit{
	public static void main(String args[]){
		int n=1000, count = 0;
		while(n>1)
			if(n%10==0){
				count++;
				n = n/10;
			}
			System.out.println(count);


	}
}