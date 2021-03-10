package com.demo.search.algorithm;

public class BinarySearch {
//time complexity
//algorithm
	/*
	 * Compare x with the middle element. If x matches with middle element, we
	 * return the mid index. Else If x is greater than the mid element, then x can
	 * only lie in right half subarray after the mid element. So we recur for right
	 * half. Else (x is smaller) recur for the left half.
	 */

	public static int binarySearch(int[] a, int l, int r, int x) {

		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (x == a[mid]) {
				return mid;
			}
			if (x > a[mid]) {
				return binarySearch(a, mid + 1, r, x);
			}
			if (x < a[mid]) {
				return binarySearch(a, l, mid - 1, x);
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		// precondition elements must be in sorted order
		int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int a = 17;
		int position = binarySearch(x, 0, x.length - 1, a);
		if (position > -1) {
			System.out.println("Element found in " + position + " position!!");
		} else {
			System.out.println("Element Not Found!!!!");
		}
	}

}
