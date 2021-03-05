package com.example.demo.worksheetPRograms;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author udaya
 * 
 *         Write a program to pick up the even or odd number in the random
 *         number list
 * 
 * 
 * 
 *         Output: Enter the random numbers: 2,4,5,10,19
 * 
 *         Even :2,4,10
 * 
 *         Odd: 5,19
 *
 */
public class Demoprogram7 {
	public static void main(String[] args) {
		int[] n = { 2, 4, 5, 10, 19 };
	    List evenArr = getEvenNumber(n);
		List oddArr = getOddNumber(n);
		System.out.println("Even No:" + evenArr);
		System.out.println("Odd No:" + oddArr);

	}

	public static List<Integer> getEvenNumber(int[] inparray) {
		ArrayList<Integer> evenArray = new ArrayList<Integer>();
		int j = 0;
		for (int i = 0; i < inparray.length; i++) {
			if (inparray[i] % 2 == 0) {
				evenArray.add(inparray[i]);

			}
		}
		return evenArray;
	}

	public static List<Integer> getOddNumber(int[] inparray) {

		ArrayList<Integer> oddArray = new ArrayList<Integer>();
		int j = 0;
		for (int i = 0; i < inparray.length; i++) {
			if (inparray[i] % 2 != 0) {
				oddArray.add(inparray[i]);

			}
		}
		return oddArray;

	}
}
