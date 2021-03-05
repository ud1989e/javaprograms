package com.example.demo.worksheetPRograms;

import java.util.Map;
import java.util.TreeMap;

public class DemoProgram15 {

	public static void main(String[] args) {
		/*
		 * Input: string[] inputs= {“Jhon”, “Matt”, “Kan”, “abhinav”, “mohit”}, input =
		 * “abhinav” Output: 228 Sum of alphabetical values of “abhinav” = 1 + 2 + 8 + 9
		 * + 14 + 1 + 22 = 57
		 * 
		 * 1. Find the input place in array 2. add the sum of input in alphabetical
		 * order 3. multiply inputarray number with sum of input
		 * 
		 * Please write the test cases with 100% coverag
		 * 
		 */
		int totalWeight = 0;
		String[] inpStrArray = { "Jhon", "Matt", "Kan", "abhinav", "mohit" };
		totalWeight = calculateStringWait(inpStrArray);
		System.out.println("Total weight=" +totalWeight);
	}
	
	public static int calculateStringWait(String[] strArray) {
		Map<Character, Integer> alphabetWeight = new TreeMap<Character, Integer>();
		int suptotalVal = 0;
		StringBuilder sbb = new StringBuilder();
		alphabetWeight.put('A', 1);
		alphabetWeight.put('B', 2);
		alphabetWeight.put('C', 3);
		alphabetWeight.put('D', 4);
		alphabetWeight.put('E', 5);
		alphabetWeight.put('F', 6);
		alphabetWeight.put('G', 7);
		alphabetWeight.put('H', 8);
		alphabetWeight.put('I', 9);
		alphabetWeight.put('J', 10);
		alphabetWeight.put('K', 11);
		alphabetWeight.put('L', 12);
		alphabetWeight.put('M', 13);
		alphabetWeight.put('N', 14);
		alphabetWeight.put('O', 15);
		alphabetWeight.put('P', 16);
		alphabetWeight.put('Q', 17);
		alphabetWeight.put('R', 18);
		alphabetWeight.put('S', 19);
		alphabetWeight.put('T', 20);
		alphabetWeight.put('U', 21);
		alphabetWeight.put('V', 22);
		alphabetWeight.put('W', 23);
		alphabetWeight.put('X', 24);
		alphabetWeight.put('Y', 25);
		alphabetWeight.put('Z', 26);
		for (int i = 0; i < strArray.length; i++) {

			char[] stringWeight = strArray[i].toUpperCase().toCharArray();
			StringBuilder sb = new StringBuilder();
			sb.append(strArray[i] + "=");
			int totalVal = 0;
			for (int j = 0; j < stringWeight.length; j++) {

				int val = alphabetWeight.get(stringWeight[j]);
				sb.append(val + "+");
				totalVal = totalVal + val;
			}
			sb.replace(sb.length() - 1, sb.length(), "");
			sb.append("=" + totalVal);
			suptotalVal = suptotalVal + totalVal;
			sbb.append(totalVal+"+");
			System.out.println(sb);

		}
		sbb.replace(sbb.length() - 1, sbb.length(), "");
		sbb.append("="+suptotalVal);
		
		return suptotalVal;
		
		
	}

}
