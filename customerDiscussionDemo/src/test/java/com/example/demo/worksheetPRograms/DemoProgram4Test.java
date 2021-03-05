package com.example.demo.worksheetPRograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoProgram4Test {

	@Test
	void testCalculateValue() {
		assertEquals("5+(5+5)+(5+10)=30", DemoProgram4.calculateValue("aaa"));
		//assertEquals(30, DemoProgram4.calculateValue("BALLOON"));
		//assertEquals(27, DemoProgram4.calculateValue("KANNADDA"));
		//assertEquals(228, DemoProgram4.calculateValue("aaaaeeeeiiiooouuuuzdfzldfhlzjhf"));

	}

}
