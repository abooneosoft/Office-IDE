package suite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GroupEg {

	@Test(groups = {"color"})
	public void red() {
		System.out.println("color red");
	}
	@Test(groups = {"color"})
	public void blue() {
		System.out.println("color blue");
	}
	@Test(groups = {"color"})
	public void yellow() {
		System.out.println("color yellow");
	}
	@Test(groups = {"flower"})
	@Parameters("Sunflower")
	public void sunflower(String name) {
		System.out.println("flower 3"+name);
	}
	@Test(groups = {"color"})
	public void purple() {
		System.out.println("color purple");
	}
	@Test(groups = {"flower"})
	@Parameters("Lilly")
	public void lilly(String name) {
		System.out.println("flower 1"+name);
	}
	@Test(groups = {"flower"})
	@Parameters("Rose")
	public void rose(String name) {
		System.out.println("flower 2"+name);
	}
	@Test(groups = {"flower"})
	public void lotus() {
		System.out.println("flower");
	}
	@Test(groups = {"vegetable"})
	public void tomato() {
		System.out.println("Vegetable 1");
	}
	@Test(groups = {"vegetable"})
	public void onion() {
		System.out.println("Vegetable 2");
	}
	@Test(groups = {"vegetable"})
	public void potato() {
		System.out.println("Vegetable 3");
	}
}
