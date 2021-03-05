package com.example.demo.worksheetPRograms;



public class DemoProgram11 	 { 
public static int sum(int N,int X,int Y)  
	{  
		/*
		 * Find the sum of numbers that are divisible by 3 upto N. Denote it by S1.
		 * Find the sum of numbers that are divisible by 5 upto N. Denote it by S2.
		 * Find the sum of numbers that are divisible by 15(3*5) upto N. Denote it by S3.
		 * final answer will be S1 + S2 – S3.
		 */
	    int S1, S2, S3;  
	  
	    S1 = ((N / 3)) * (2 * 3 + (N / 3 - 1) * 3) / 2;  
	    S2 = ((N / 5)) * (2 * 5 + (N / 5 - 1) * 5) / 2;  
	    S3 = ((N / 15)) * (2 * 15 + (N / 15 - 1) * 15) / 2;  
	  
	    return S1 + S2 - S3;  
	}  
	  
	// Driver code  
	 public static void main (String[] args) { 
	    int N = 10;
	    int X=3;
	    int Y=5;
	  
	    System.out.print(sum(N,X,Y));  
	} 
	  
	}
