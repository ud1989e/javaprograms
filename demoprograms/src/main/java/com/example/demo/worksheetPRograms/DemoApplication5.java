package com.example.demo.worksheetPRograms;

/**
 * 
 * @author udaya Generate a properly formatted equation for a set of natural
 *         numbers between 1 and 100 that are divisible by 3 or 5, including the
 *         sum. For example, using the bounds of 1 and 10, the answer would be
 *         3+5+6+9=23.
 *
 */
public class DemoApplication5 {

	public static void main(String[] args) {
		System.out.println(genarateEquation());
	}

	public static String genarateEquation() {
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
				sb.append(i + "+");
			}
		}
		sb.replace(sb.length() - 1, sb.length(), "");
		sb.append("=" + sum);
		return sb.toString();
	}

}
