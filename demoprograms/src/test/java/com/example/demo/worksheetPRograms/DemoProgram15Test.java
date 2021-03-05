package com.example.demo.worksheetPRograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoProgram15Test {
	String[] inpStrArray = { "udaya","vijay" };
	@Test
	void testCalculateStringWait() {
		assertEquals(119, DemoProgram15.calculateStringWait(inpStrArray));
	}
	//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
	//a b c d e f g h i j  k   l  m  n  o  p  q  r  s t  u   v  w  x  y  z
	//21+4+1+25+1+22+9+10+1+25 =>119

}
