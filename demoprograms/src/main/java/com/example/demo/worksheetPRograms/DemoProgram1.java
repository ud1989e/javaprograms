package com.example.demo.worksheetPRograms;

import java.util.HashMap;

public class DemoProgram1 {
	public static void main(String[] args) {
		/*
		 * Find uniqe pairs from a given integer array whose sum is equal to given
		 * number.
		 * 
		 * [5,6,8,7,2,3,5,4,6]
		 * 
		 * given 9 pairs are [7,2], [5,4], [3, 6]
		 * 
		 * 
		 */
		int n = 12;
		int a[] = { 5, 6, 8, 7, 2, 3, 5, 4, 6 };
		System.out.println(uniquePairs(a, n));

	}

	public static String uniquePairs(int[] array, int n) {
		StringBuilder uniquerPair = new StringBuilder();
		HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == n) {
					if (maps.containsKey(array[i]) && maps.containsValue(array[j])
							|| maps.containsKey(array[j]) && maps.containsValue(array[i])) {
						continue;
					} else {
						maps.put(array[i], array[j]);
					}
				}
			}

		}
		maps.forEach((k, v) -> {
			uniquerPair.append("(" + k + "," + v + ")");
		});

		return uniquerPair.toString();
	}
}
