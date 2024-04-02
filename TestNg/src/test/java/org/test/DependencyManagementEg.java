package org.test;

import org.testng.annotations.Test;

public class DependencyManagementEg {

	@Test(priority=-2)
	public void fbSignUp() {
		System.out.println("Sign up Page");
	}
	@Test(priority=-1)
	public void signedUp() {
		System.out.println("Signed up with credentials");
	}
	@Test(priority=0)
	public void fbLogin() {
		System.out.println("Login Page");
	}
	
	@Test(priority=1,dependsOnMethods = "fbLogin")
	public void userName() {
		System.out.println("username entered");
	}
	@Test(priority=2,dependsOnMethods ="userName",enabled=true)
	public void pass() {
		System.out.println("password entered");
	}
	@Test(priority=3,dependsOnMethods ="pass")
	public void fbHome() {
		System.out.println("Home Page");
	}
}
