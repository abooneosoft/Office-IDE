package org.test;

import org.testng.annotations.Test;

public class Test2 {
//op-4,1,Started,3,2 (why because testNg by default it will run by method name alphabetical order)
	//so by using priority we can set orderly by numerical order
	
	@Test(priority=1,enabled=false)
	public void start() {
		System.out.println("Started");
	}
	@Test(priority=2)
	public void one() {
		System.out.println(1);
	}
	@Test(priority=3)
	private void two() {
		System.out.println(2);
	}
	@Test(priority=4)
	private void three() {
		System.out.println(3);
	}
	@Test(priority=5)
	private void four() {
		System.out.println(4);
	}
	@Test(priority=0)
	public void zero() {
		System.out.println(0);
	}
	
}
