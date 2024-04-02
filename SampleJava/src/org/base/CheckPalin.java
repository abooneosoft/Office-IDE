package org.base;

public class CheckPalin {
	
	public static void main(String[] args) {
		
		String a = "asdf";
		String rev ="";
		for (int i = a.length()-1; i>=0; i--) {
			rev= rev+a.charAt(i);			
		}

		System.out.println(rev);
		if (rev.equals(a)) {
			System.out.println("Its Palindrome");			
		}else {
			System.out.println("Its not Palindrome");
		}
	}

}
