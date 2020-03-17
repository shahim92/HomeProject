package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_login {
	public WebDriver driver;
	@FindBy(id="nav-link-accountList")
	WebElement Account;
	
	public Amazon_login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickAccount() {
		Account.click();
	}
	
}
	
	

	

	


