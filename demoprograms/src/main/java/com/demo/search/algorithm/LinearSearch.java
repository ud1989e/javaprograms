package com.demo.search.algorithm;

public class LinearSearch {
	/**
	 * //time complexity o(n)
	algorithm
	Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
	If x matches with an element, return the index.
	If x doesn’t match with any of elements, return -1.
	 */
	
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int a = 17;
		int position = linearSearch(x, a);
		if (position > -1) {
			System.out.println("Element found in " + position + " position!!");
		} else {
			System.out.println("Element Not Found!!!!");
		}

	}

	public static int linearSearch(int[] a, int element) {
		int i = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] == element) {
				return i;
			}
		}
		return -1;
	}
}
