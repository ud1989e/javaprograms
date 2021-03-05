package com.example.demo.worksheetPRograms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class DemoProgram14Test {
 List<Integer> list = new LinkedList<Integer>();
 
 
	@Test
	void testFindNthElement() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		assertEquals(4, DemoProgram14.findNthElement(list, 5));
	}

}
