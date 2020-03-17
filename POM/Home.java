package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="pass")
	WebElement passwd;
	@FindBy(xpath="//*[@aria-label='Log In']")
	WebElement loginButton;
	@FindBy(linkText="Forgot account?")
	WebElement forgotButton;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void Enteremail(String emails) {
		email.sendKeys(emails);
	}
	public void Enterpasswd(String password) {
		passwd.sendKeys(password);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	public void clickForgotButton() {
		forgotButton.click();
	}

}
