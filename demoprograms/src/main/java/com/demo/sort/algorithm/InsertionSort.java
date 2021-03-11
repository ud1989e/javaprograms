package com.demo.sort.algorithm;

public class InsertionSort {
	/**
	 * Insertion sort is a simple sorting algorithm that works similar to the way
	 * you sort playing cards in your hands. The array is virtually split into a
	 * sorted and an unsorted part. Values from the unsorted part are picked and
	 * placed at the correct position in the sorted part. Algorithm To sort an array
	 * of size n in ascending order: 1: Iterate from arr[1] to arr[n] over the
	 * array. 2: Compare the current element (key) to its predecessor. 3: If the key
	 * element is smaller than its predecessor, compare it to the elements before.
	 * Move the greater elements one position up to make space for the swapped
	 * element.
	 */
	public void insertionSort(int arr[], int n) {
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = key;
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
		InsertionSort ob = new InsertionSort();
		int arr[] = { 10, 1, 2, 9, 8, 7, 6, 5, 2, 3, 67 };
		ob.insertionSort(arr, arr.length);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

}
