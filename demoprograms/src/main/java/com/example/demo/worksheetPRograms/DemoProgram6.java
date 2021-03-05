package com.example.demo.worksheetPRograms;

/**
 * Write a program that scores and displays with the following rules:
 * 
 * 
 * Using a list of integers from 1 - 100.
 * 
 * - For multiples of 3 add 2 points.
 * 
 * - For multiples of 5 add 3 points.
 * 
 * Make sure to show the scores that are made as well as the total.
 * 
 * The output should be 2 + 3 + 2 + 2 + 3 + ... = sum Be sure to write a unit
 * test that proves the program is correct
 */
public class DemoProgram6 {
	public static void main(String[] args) {
		System.out.println(dispalyScores());
	}

	public static String dispalyScores() {
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum = sum + 2;
				sb.append(2 + "+");
			}
			if (i % 5 == 0) {
				sum = sum + 3;
				sb.append(3 + "+");
			}
		}
		sb.replace(sb.length() - 1, sb.length(), "");
		sb.append("=" + sum);
		return sb.toString();
	}

}
