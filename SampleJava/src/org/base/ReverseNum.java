package org.base;



public class ReverseNum{
 

	public static void main(String[] args) {
		int a = 432801;
		
		int rev=0;
		int rem=0;
		while(a!=0) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println(rev);
	}

	
	
	 
	
}
