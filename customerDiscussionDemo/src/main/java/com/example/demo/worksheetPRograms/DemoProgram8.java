package com.example.demo.worksheetPRograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 1.
 * 
 * Write a program to Program to Check that in an given string how many Vowel
 * and Consonant are present and have to calculate the values,
 * 
 * Vowels value :3
 * 
 * Consonants value : 6
 * 
 * 
 * @author udaya
 *
 */
public class DemoProgram8 {
	public static void main(String[] args) {

		String s = "Udaya Basrur";
		 /*map.entrySet().stream()
	      // ...
	      .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue())); */
		System.out.println(processString(s).toString()); 

	}

	public static String processString(String s) {
		int vcount = 0, ccount = 0 ;
		Map<String, Integer> charValSum = new HashMap<String, Integer>();
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vcount++;

			}

			else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				ccount++;

			}
		}
        StringBuilder sb = new StringBuilder();
        sb.append("vowel count:"+ vcount+" "+ "consonent count:"+ccount + " "+"consonent weight:" +ccount * 6+" "+"vowel weight:"+vcount * 3);
		return sb.toString();

	}

}