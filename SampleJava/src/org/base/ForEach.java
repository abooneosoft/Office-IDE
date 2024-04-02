package org.base;

public class ForEach {
	
	public static void main(String[] args) {
		String a= "aboobacker siddiq is the good boy";
		String[] split = a.split(" ");
		for(String s : split) {
			System.out.println(s);
		}
		
	}

}
