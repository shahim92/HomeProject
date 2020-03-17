package Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deals {
	public WebDriver driver;
	@FindBy(id="primary-header-deals")
	WebElement deals;
	public Deals (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickdeals() {
		deals.click();
	}

}
