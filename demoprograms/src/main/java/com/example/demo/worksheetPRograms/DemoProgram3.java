package com.example.demo.worksheetPRograms;

public class DemoProgram3 {
	public static String sum(int n, int x, int y) {
		/*
		 * Find the sum of numbers that are divisible by 3 upto N. Denote it by S1. Find
		 * the sum of numbers that are divisible by 5 upto N. Denote it by S2. Find the
		 * sum of numbers that are divisible by 15(3*5) upto N. Denote it by S3. final
		 * answer will be S1 + S2 – S3.
		 */
		int s1 = 0, s2 = 0, s3 = 0, s4 = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(n + "=");
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				s3 = s3 + i;
				
			}
			else if (i % 3 == 0) {
				s1 = s1 + i;
				
			}
			else if (i % 5 == 0) {
				s2 = s2 + i;
				
			}
		
			
		}
		s4 = s1 + s2 - s3;
		sb.append(s1+"+"+ s2 + "-" +s3 +"=" +s4);
		return sb.toString();
	}

	// Driver code
	public static void main(String[] args) {
		int n = 16;
		int x = 3;
		int y = 5;
		// 10 = 3 + 5 + 6 + 9 + 10 = 33
		System.out.print(sum(n, x, y));
	}

}