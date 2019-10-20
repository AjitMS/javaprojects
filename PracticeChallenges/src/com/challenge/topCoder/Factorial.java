package com.challenge.topCoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Factorial {
//	public static void main(String args[]) {
//		int i, j, fact = 1;
//		int count = 0;
//		Scanner t = new Scanner(System.in);
//		int n = t.nextInt();// no. of inputs
//		int input[] = new int[n];
//		for (i = 0; i < n; i++)
//			input[i] = t.nextInt();
//		int factinput[] = new int[n];
//		for (i = 0; i < n; i++) {
//			for (j = 1; j <= input[i]; j++)
//				fact = fact * j;
//			factinput[i] = fact;
//			fact = 1;
//		}
//		for (i = 0; i < n; i++)
//			System.out.print(factinput[i]+"\t");
//		for (i = 0; i < n; i++) {
//			while (factinput[i] >= 10) {
//
//				if (factinput[i] % 10 == 0)
//					count++;
//				else
//					break;
//				factinput[i] = factinput[i] / 10;
//
//			}
//			System.out.println(count);//count is no. of  zeroes
//			count = 0;
//			
//		}
//		t.close();
//	}
public static void main(String[] args) {
	
	diagonalSum();
	
	List<Integer> a = new ArrayList<>();
	List<Integer> b = new ArrayList<>();
	
	a.add(5);
	a.add(6);
	a.add(7);
	b.add(3);
	b.add(6);
	b.add(10);
	
	System.out.println(compareTriplets(a, b));
}	
		static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	        
	        int scoreA = 0;
	        int scoreB = 0;
	        
	   for(int i = 0; i< a.size(); i++)
			   if(a.get(i) > b.get(i))
				   scoreA++;
			   else if(a.get(i) < b.get(i))
				   scoreB++;
			   
	   Math.pow(10, 10);

	        List<Integer> results = new ArrayList<>();
	        results.add(scoreA);
	        results.add(scoreB);
	        
	        return results;
	        
	        
	    }
		
		
		
		static void diagonalSum(){
			int arr[][] = {{1,2,4,5},
						   {3,4,4,5},
						   {2,5,4,5},
						   {9,8,4,5}};
			
			int length = arr.length;
	        
	        int ltr = 0;
	        int rtl = 0;
	        
	        for(int i=0; i<length;i++)
	            for( int j= length-1; j>=0; j--){
	                if(i==j){
	                    ltr = ltr + arr[i][j];
	                }
	                
	                if(i+j==length-1)
	                    rtl = rtl + arr[i][j];
	            }
	        
	        
	        
	        System.out.println(ltr);
	        System.out.println(rtl);
	        
		System.out.println((ltr - rtl)<0?(ltr - rtl):(ltr - rtl));	
		}
	
	}

