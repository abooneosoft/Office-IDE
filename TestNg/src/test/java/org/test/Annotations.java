package org.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
	
	
  @Test
  public void tc01() {
	  System.out.println("test 1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after Methodd");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }
  @Test
  public void tc02() {
	  System.out.println("test 2");
  }

}
