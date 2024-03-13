package org.steps;

import org.base.BaseClass;
import org.pages.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion extends BaseClass{
	PageObjectManager page = new PageObjectManager();

	@Given("User is on adactin page")
	public void user_is_on_adactin_page() {
		launchBrowser("chrome");
		loadUrl("https://adactinhotelapp.com/");
		maximizeWindow();
		
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	
		type(page.getLoginPage().getUser().get(0), string);
		type(page.getLoginPage().getPass().get(0), string2);
	}
	@When("user clicks login button")
	public void user_clicks_login_button() {
	
		btnClick(page.getLoginPage().getLog().get(0));
	}
	@Then("user verify the success message")
	public void user_verify_the_success_message() {

		System.out.println("successfully logged in");
	}
	@When("user select {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_select_and_and_and_and_and(String location, String hotel, String roomType, String numOfRooms, String adultsPerRoom, String childPerRoom) {

	selectByVisibleText(page.getSearchPage().getLocation().get(0), location);
	selectByVisibleText(page.getSearchPage().getHotels().get(0), hotel);
	selectByVisibleText(page.getSearchPage().getRoomtype().get(0), roomType);
	selectByVisibleText(page.getSearchPage().getRooms().get(0), numOfRooms);
	selectByVisibleText(page.getSearchPage().getAdult_room().get(0), adultsPerRoom);
	selectByVisibleText(page.getSearchPage().getChild_room().get(0), childPerRoom);
	
		
	}
	@When("user click search button")
	public void user_click_search_button() {

		btnClick(page.getSearchPage().getSubmit().get(0));
	
	}
	@When("user select the hotel")
	public void user_select_the_hotel() {

		btnClick(page.getHotelConfirmPage().getRadio().get(0));
	}
	@When("user click the continue button")
	public void user_click_the_continue_button() {

		btnClick(page.getHotelConfirmPage().getContinue().get(0));	
	}
	@When("user enter {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enter_and_and_and_and_and_and_and(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {

		type(page.getBookingPage().getFname().get(0), firstName);
		type(page.getBookingPage().getLname().get(0), lastName);
		type(page.getBookingPage().getAddress().get(0), billingAddress);
		type(page.getBookingPage().getCcnum().get(0), creditCardNo);
		selectByVisibleText(page.getBookingPage().getCardtype().get(0), creditCardType);
		selectByVisibleText(page.getBookingPage().getMonth().get(0), expiryMonth);
		selectByVisibleText(page.getBookingPage().getYear().get(0), expiryYear);
		type(page.getBookingPage().getCvv().get(0), cvvNumber);
	
	}
	@When("user click booknow button")
	public void user_click_booknow_button() {

		btnClick(page.getBookingPage().getBook().get(0));
	
	}
	@When("user click search hotel")
	public void user_click_search_hotel() throws InterruptedException {

		Thread.sleep(5000);
		btnClick(page.getConfirmPage().getSearchhotel().get(0));
		quitBrowser();
	
	}



}
