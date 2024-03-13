package org.pages;

public class PageObjectManager {

	LoginPOJOClass loginPage;
	SearchHotelPOJOClass searchPage;
	HotelConfirmPOJOClass hotelConfirmPage;
	BookHotelPOJOClass bookingPage;
	ConfirmationPOJOClass confirmPage;
	/**
	 * @return the loginPage
	 */
	public LoginPOJOClass getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPOJOClass() : loginPage;
	}
	/**
	 * @return the searchPage
	 */
	public SearchHotelPOJOClass getSearchPage() {
		return (searchPage == null) ? searchPage = new SearchHotelPOJOClass() : searchPage;
	}
	/**
	 * @return the hotelConfirmPage
	 */
	public HotelConfirmPOJOClass getHotelConfirmPage() {
		return (hotelConfirmPage == null) ? hotelConfirmPage = new HotelConfirmPOJOClass() : hotelConfirmPage;
	}
	/**
	 * @return the bookingPage
	 */
	public BookHotelPOJOClass getBookingPage() {
		return (bookingPage == null) ? bookingPage = new BookHotelPOJOClass() : bookingPage;
	}
	/**
	 * @return the confirmPage
	 */
	public ConfirmationPOJOClass getConfirmPage() {
		return (confirmPage == null) ? confirmPage = new ConfirmationPOJOClass() : confirmPage;
	}
	
	
}
