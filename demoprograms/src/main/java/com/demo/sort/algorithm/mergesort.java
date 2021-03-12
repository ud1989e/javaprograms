package com.demo.sort.algorithm;

public class mergesort {
	/**
	 * MergeSort(arr[], l, r) If r > l 1. Find the middle point to divide the array
	 * into two halves: middle m = l+ (r-l)/2 2. Call mergeSort for first half: Call
	 * mergeSort(arr, l, m) 3. Call mergeSort for second half: Call mergeSort(arr,
	 * m+1, r) 4. Merge the two halves sorted in step 2 and 3: Call merge(arr, l, m,
	 * r)
	 */
	public void merge(int arr[], int l, int m, int r) {
		// calculate n1 and n2
		int n1 = m - l + 1;
		int n2 = r - m;

		int a1[] = new int[n1];
		int a2[] = new int[n2];
		// populate a1 and a2 array

		for (int i = 0; i < n1; i++) {
			a1[i] = arr[l + i];
		}
		for (int j = 0; j < n2; j++) {
			a2[j] = arr[m + 1 + j];
		}
		/* Merge the temp arrays */
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (a1[i] <= a2[j]) {
				arr[k] = a1[i];
				i++;
			} else {
				arr[k] = a2[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = a1[i];
			k++;
			i++;
		}
		while (j < n2) {
			arr[k] = a2[j];
			k++;
			j++;
		}

	}

	public void mergesortMethod(int a[], int l, int r) {
		if (l < r) {
			int m = l + (r - l) / 2;
			mergesortMethod(a, l, m);
			mergesortMethod(a, m + 1, r);
			merge(a, l, m, r);
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
		mergesort ob = new mergesort();
		int arr[] = {58,52,154,25,8,65,254,7,48,75,45,87,4,14,52,58,74,5,45,65,58,474 };
		ob.mergesortMethod(arr, 0, arr.length - 1);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}

}
