package com.example.demo.worksheetPRograms;

public class DemoProgram2 {
	public static void main(String[] args) {
		System.out.println(displayPattern());

	}

	public static String displayPattern() {
		int n = 100;
		String outputText = "";
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0)
				outputText += " FizzBuzz " + " ";
			else if (i % 5 == 0)
				outputText += " Buzz " + " ";
			else if (i % 3 == 0)
				outputText += " Fizz " + " ";
			else
				outputText += i + " ";
		
		}
		return  outputText;
	}
}
