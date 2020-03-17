package TstNG;

import org.testng.annotations.Test;


import POM.Home;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Practice_1 {
	public static WebDriver driver;
  @Test
  public void f() {
	  
	  Home homepage = new Home(driver);
	  homepage.clickForgotButton();
	  
	  Reporter.log("This is testing forgot LInk");
	  
  }
  @BeforeClass
  @Parameters("Browser")
  public static void setUpBeforeClass() throws Exception {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahi\\eclipse-workspace\\Automation_home_project\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
  
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }

}
