package org.base;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the String to reverse:");
		String nextLine = a.nextLine();
		String reverse="";
		for (int i = nextLine.length()-1; i>=0; i--) {
			char charAt = nextLine.charAt(i);	
			reverse = reverse+charAt;
		}
		System.out.println(reverse);
		StringBuffer buff = new StringBuffer(nextLine);
		String string = buff.reverse().toString();
		System.out.println(string);
		
	}
	
	
}
