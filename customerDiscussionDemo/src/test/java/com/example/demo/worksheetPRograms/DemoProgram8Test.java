package com.example.demo.worksheetPRograms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class DemoProgram8Test {


	@Test
	void testProcessString() {
	
		assertEquals("vowel count:5 consonent count:6 consonent weight:36 vowel weight:15", DemoProgram8.processString("Udaya Basrur"));
		// uaaau dybsrr
		// vowel 5
		// con 6
		// count 5*3 =15
		// count 6*6 = 36
		//vowel count:5 consonent count:6 consonent weight:15 vowel weight:36
	}

}
