package org.base;

public class Fibo {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		for(int i =2;i<=5;i++) {
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		}
		
		 
	}
}
