package com.example.demo.worksheetPRograms;

import java.util.HashMap;
import java.util.Map;

public class DemoApplication9 {
	public static void main(String[] args) {
		String s = "JAVA";
		System.out.println(reverseString(s));
	}

	public static String reverseString(String str) {
		String rs = "";
		String rsValue = "";
		Integer StrWeght = 0;
		Map<String, String> map = new HashMap<String, String>();
		char[] charArray = str.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			rs = rs + charArray[i];
			if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
					|| charArray[i] == 'u' || charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I'
					|| charArray[i] == 'O' || charArray[i] == 'U') {
				StrWeght = StrWeght + 3;
				rsValue = rsValue + "3+";
			} else {
				StrWeght = StrWeght + 6;
				rsValue = rsValue + "6+";
			}
		}
		StringBuilder sb = new StringBuilder(rs + " = " + rsValue);
		sb.replace(sb.length() - 1, sb.length(), "");

		sb = sb.append(" = " + StrWeght);
		return sb.toString();
	}
}
