package org.pages;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPOJOClass extends BaseClass {

	public SearchHotelPOJOClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	private List<WebElement> location;
	@FindBy(id = "hotels")
	private List<WebElement> hotels;
	@FindBy(id = "room_type")
	private List<WebElement> roomtype;
	@FindBy(id = "room_nos")
	private List<WebElement> rooms;
	@FindBy(id = "adult_room")
	private List<WebElement> adult_room;
	@FindBy(id = "child_room")
	private List<WebElement> child_room;
	@FindBy(id = "Submit")
	private List<WebElement> submit;
	
	
	public List<WebElement> getLocation() {
		return location;
	}
	public List<WebElement> getHotels() {
		return hotels;
	}
	public List<WebElement> getRoomtype() {
		return roomtype;
	}
	public List<WebElement> getRooms() {
		return rooms;
	}
	public List<WebElement> getAdult_room() {
		return adult_room;
	}
	public List<WebElement> getChild_room() {
		return child_room;
	}
	public List<WebElement> getSubmit() {
		return submit;
	}
}
