package Amazon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shahi\\\\eclipse-workspace\\\\Automation_home_project\\\\Drivers\\\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.navigate().to("www.facebook.com");
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
