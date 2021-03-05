package com.example.demo.worksheetPRograms;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

class DemoProgram13Test {
	String testStr = "aaaaabbbbccccddddaaaaeeeeffffffffffffffffffff";
	@Test
	void testCompress() throws IOException {
		byte[] op = DemoProgram13.compress(testStr);
		System.out.println("original data length " + testStr.length() + ",  compressed data length " + op.length);
		byte[] org = DemoProgram13.decompress(op);
		System.out.println(org.length);
		System.out.println(new String(org, StandardCharsets.UTF_8));
		assertEquals(45, org.length);
		assertEquals("aaaaabbbbccccddddaaaaeeeeffffffffffffffffffff", DemoProgram13.convertByteToString(org));
	}

}
