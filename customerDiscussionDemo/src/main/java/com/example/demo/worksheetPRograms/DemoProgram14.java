package com.example.demo.worksheetPRograms;

import java.util.*;

class DemoProgram14 {
	public static void main(String[] args) {
		// Program 6:
		// Write a program to find nth element from backside of LinkedList
		List<Integer> someNumbers = new LinkedList<Integer>();
		int index = 0;
		someNumbers.add(1);
		someNumbers.add(23);
		someNumbers.add(3);
		index = findNthElement(someNumbers, 3);
		if (index > -1) {
			System.out.println("Element Found at " + index + " position!!");
		} else {
			System.out.println("Element Not Found!!!");
		}
	}

	public static int findNthElement(List<Integer> numLinkedList, int n) {
		ListIterator<Integer> iterator = numLinkedList.listIterator(numLinkedList.size());
		int index = 0;
		while (iterator.hasPrevious()) {
			index = iterator.previousIndex();
			if ((int) iterator.previous() == n) {
				return index;
			}

		}
		return -1;
	}
}
