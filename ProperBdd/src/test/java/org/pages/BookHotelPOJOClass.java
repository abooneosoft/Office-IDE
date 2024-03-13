package org.pages;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPOJOClass extends BaseClass {

	public BookHotelPOJOClass() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private List<WebElement> fname;
	@FindBy(id = "last_name")
	private List<WebElement> lname;
	@FindBy(id = "address")
	private List<WebElement> Address;
	@FindBy(id = "cc_num")
	private List<WebElement> ccnum;
	@FindBy(id = "cc_type")
	private List<WebElement> cardtype;
	@FindBy(id = "cc_exp_month")
	private List<WebElement> month;
	@FindBy(id = "cc_exp_year")
	private List<WebElement> year;
	@FindBy(id = "cc_cvv")
	private List<WebElement> cvv;
	@FindBy(id = "book_now")
	private List<WebElement> book;

	public List<WebElement> getFname() {
		return fname;
	}

	public List<WebElement> getLname() {
		return lname;
	}

	public List<WebElement> getAddress() {
		return Address;
	}

	public List<WebElement> getCcnum() {
		return ccnum;
	}

	public List<WebElement> getCardtype() {
		return cardtype;
	}

	public List<WebElement> getMonth() {
		return month;
	}

	public List<WebElement> getYear() {
		return year;
	}

	public List<WebElement> getCvv() {
		return cvv;
	}

	public List<WebElement> getBook() {
		return book;
	}

}
