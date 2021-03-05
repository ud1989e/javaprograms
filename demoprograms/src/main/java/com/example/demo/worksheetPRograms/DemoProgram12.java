package com.example.demo.worksheetPRograms;

public class DemoProgram12 {
	public static void main(String[] args) {

		String inputString = "aaaaavvvvdffsdfsfsdfdsfdsfsfwegggsfgsdfdsfsdfdsfdsfsdfsdfsdfasfefsggsdfsd";
		// use divide and concur technique to reverse the given string
		System.out.println(reverseString(inputString));
	}

	public static String reverseString(String str) {

		String leftStr = "";
		String rightStr = "";
		if (str.length() <= 1) {
			return str;
		}
		leftStr = str.substring(0, str.length() / 2);
		rightStr = str.substring((str.length() / 2), str.length());
		return reverseString(rightStr) + reverseString(leftStr);
	}
}
