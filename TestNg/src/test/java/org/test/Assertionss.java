package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertionss {

	String name = "aboo";
	
	@Test
	public void checkAssert1() {
		Assert.assertEquals(name, "aboo");
		System.out.print("Geeks for  Geeks");
	}
	@Test
	public void checkAssert2() {
		Assert.assertNotEquals(name, "bob");
	}
	SoftAssert sa = new SoftAssert();
	
}
