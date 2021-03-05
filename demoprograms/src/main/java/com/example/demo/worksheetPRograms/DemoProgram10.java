package com.example.demo.worksheetPRograms;

import java.util.Scanner;

public class DemoProgram10 {
	public static void main(String[] args) {
		int vcount=0,ccount=0;
		String s;
		System.out.println("Enter String:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		s=s.toLowerCase();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vcount++;
			}
		
		else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
			ccount++;
			
		}
}
		System.out.println("No of Vowels:"+vcount);
		System.out.println("No of consonants:"+ccount);
}
}
