package Rough;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksSteps {

	@After(order=1)
	public void afterScenario1() {

		System.out.println("order 1 will execute after");
		System.out.println("Take screenshot");
		System.out.println("minimize");
	}
	
	@After(order=0)
	public void afterScenario() {

		System.out.println("This @after have to execute before every scenario");
		System.out.println("Take screenshot");
		System.out.println("close browser");
	}
	@Before(order=0)
	public void atBefore() {

		System.out.println("Intializing Browser");
		System.out.println("Maximize window");
	}
	@Before(order=1)
	public void atBefore1() {

		System.out.println("load url");
		System.out.println("Screenshot");
	}


	
	

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	}

	@When("I complete action")
	public void i_complete_action() {
	}

	@When("some other action")
	public void some_other_action() {
	}

	@When("yet another action")
	public void yet_another_action() {
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	}

	@Given("I want to write a step with name")
	public void i_want_to_write_a_step_with_name() {
	}

	@When("I check for the value in step")
	public void i_check_for_the_value_in_step() {
	}
	@When("We can add the value")
	public void we_can_add_the_value() {
	}

	@Then("I verify the status in step")
	public void i_verify_the_status_in_step() {
	}
}
