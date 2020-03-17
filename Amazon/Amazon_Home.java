package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home {
	
	 public WebDriver driver;

	
		@FindBy(xpath="//*[@aria-label='Open Menu']")
		WebElement NavigationBar;
		
		
		public Amazon_Home(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		

	}
		public void ClickNavi() {
			NavigationBar.click();
		
		}
	

}
