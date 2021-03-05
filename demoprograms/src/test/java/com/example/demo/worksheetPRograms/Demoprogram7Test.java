package com.example.demo.worksheetPRograms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Demoprogram7Test {
	int[] n = { 2, 4, 5, 10, 19 };
	ArrayList<Integer> EarrL = new ArrayList<Integer>();
	ArrayList<Integer> OarrL = new ArrayList<Integer>();

	@Test
	void testGetEvenNumber() {
		EarrL.add(2);
		EarrL.add(4);
		EarrL.add(10);
		assertEquals(EarrL, Demoprogram7.getEvenNumber(n));
	}

	@Test
	void testGetOddNumber() {
		OarrL.add(5);
		OarrL.add(19);

		assertEquals(OarrL, Demoprogram7.getOddNumber(n));
	}

}
