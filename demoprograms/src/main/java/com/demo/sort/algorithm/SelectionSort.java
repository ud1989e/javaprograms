package com.demo.sort.algorithm;

public class SelectionSort {

	/**
	 * arr[] = 64 25 12 22 11
	 * 
	 * // Find the minimum element in arr[0...4] // and place it at beginning 11 25
	 * 12 22 64
	 * 
	 * // Find the minimum element in arr[1...4] // and place it at beginning of
	 * arr[1...4] 11 12 25 22 64
	 * 
	 * // Find the minimum element in arr[2...4] // and place it at beginning of
	 * arr[2...4] 11 12 22 25 64
	 * 
	 * // Find the minimum element in arr[3...4] // and place it at beginning of
	 * arr[3...4] 11 12 22 25 64
	 */
	public void selectionSort(int[] a) {
		int length = a.length;
		for (int i = 0; i < length - 1; i++) {
			int min_a = i;
			for (int j = i + 1; j < length; j++) {
				if (a[j] < a[min_a]) {
					min_a = j;
				}
			}
			int temp = a[min_a];
			a[min_a] = a[i];
			a[i] = temp;

		}
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver code to test above
	public static void main(String args[]) {
		SelectionSort ob = new SelectionSort();
		int arr[] = { 10, 1, 2, 9, 8, 7, 6, 5, 2, 3, 67 };
		ob.selectionSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

}
