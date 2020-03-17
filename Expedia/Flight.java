package Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight {
	public WebDriver driver;
	
	@FindBy(id="primary-header-flight")
	WebElement flight;
	@FindBy(id="tab-flightHotel-tab-flp-fh")
	WebElement flightonly;
	@FindBy(xpath="//*[@class='uitk-icon uitk-icon-cars']")
	WebElement Tg;
	
	
	public Flight(WebDriver driver) {;
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public void clickflight() {
	flight.click();
	}
	public void clickfl() {
		flightonly.click();
	}
	public void clciktg() {
		Tg.click();
	}
	
}
