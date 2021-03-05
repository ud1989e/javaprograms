package com.example.demo.worksheetPRograms;

public class DemoProgram4 {

	public static void main(String[] args) {
		String inputString = "ttttttt";
		System.out.println(inputString + "=" + calculateValue(inputString));
	}

	public static String calculateValue(String str) {
		char[] charArray = str.toCharArray(); //convert string to character array
		char prevChar = 0; //keep track of previous character
		int prevValue = 0;//keep track of previous value
		int totalValue = 0;//keep track of Total value
		boolean repeatedChar = false; //flag to keep track of character repeatation.
		
		StringBuilder finalString = new StringBuilder();
		// changes done in this file
		/**
		 * for each char in the string
		 * check if the char == prevChar
		 * if(true)
		 * then
		 *    add total value with previous value
		 *    
		 * 
		 * 
		 * 
		 */
		for (int i = 0; i < charArray.length; i++) { 
			if (charArray[i] == prevChar) {
				totalValue = totalValue + prevValue;
				finalString = finalString.append("(");
				repeatedChar = true;
			} else {
				prevValue = 0;
				repeatedChar = false;
			}
			prevChar = charArray[i];
			if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
					|| charArray[i] == 'u' || charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I'
					|| charArray[i] == 'O' || charArray[i] == 'U') {
				totalValue = totalValue + 5;

				finalString = finalString.append(5 + "+");
				if (repeatedChar) {
					finalString = finalString.append(prevValue);
					finalString.append(")+");
				}
				

				prevValue = prevValue + 5;// previous value calculation

			} else {
				finalString = finalString.append(1 + "+");
				if (repeatedChar) {
					finalString = finalString.append(prevValue);
					finalString.append(")+");
				}
				
				totalValue = totalValue + 1;
				prevValue = prevValue + 1;
				

			}
			
		}
		if (charArray.length > 5) {
			totalValue = totalValue + 5;
			finalString = finalString.append(5 + "+");
		}
		finalString.replace(finalString.length() - 1, finalString.length(), "");
		finalString.append("=" + totalValue);

		return finalString.toString();
	}
	//atatttttaaaaddt
	//5+1+5+1+(1+1)+(1+2)+(1+3)+(1+4)+5+(5+5)+(10+5)+(15+5)+1+(1+1)+1+5
}
