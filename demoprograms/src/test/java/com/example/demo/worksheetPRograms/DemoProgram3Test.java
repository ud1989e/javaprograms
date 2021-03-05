package com.example.demo.worksheetPRograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoProgram3Test {

	@Test
	void testSum() {
		//16 3 5
		
		//S1 ->3 +6 +9 +12 +15->45
		//S2 ->5 +10 +15-->30
		//S3 ->15
		//45+30-15->60
		
		assertEquals("16=30+15-15=30", DemoProgram3.sum(16, 3, 5));
		//assertEquals("10=3+5+6+9+10=33", DemoProgram3.sum(10, 3, 5));
		//assertEquals("10=3+5+6+9+10=225", DemoProgram3.sum(30, 3, 5));
	}

}
