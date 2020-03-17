package Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Car {
	public WebDriver driver;
	@FindBy(id="all-in-car-header-link")
	WebElement car;
	public Car(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickcar() {
		car.click();
	}

}
