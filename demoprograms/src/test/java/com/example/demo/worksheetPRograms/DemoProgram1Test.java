package com.example.demo.worksheetPRograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoProgram1Test {
	int a[] = { 5, 6, 8, 7, 2, 3, 5, 4, 6 };
	@Test
	void testUniquePairs() {
		assertEquals("(5,4)(6,3)(7,2)", DemoProgram1.uniquePairs(a, 9));
		assertEquals("(5,7)(6,6)(8,4)", DemoProgram1.uniquePairs(a, 12));
		assertEquals("(5,8)(6,7)", DemoProgram1.uniquePairs(a, 13));
		
	}

}
