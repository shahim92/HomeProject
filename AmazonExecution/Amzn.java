package AmazonExecution;

import org.testng.annotations.Test;

import Amazon.Amazon_Home;
import Amazon.Amazon_Prime;
import Amazon.Amazon_login;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Amzn {
	WebDriver driver;
	String url ="https://www.amazon.com";
  @Test
  public void f() throws InterruptedException {
	  Amazon_Home home = new Amazon_Home(driver);
	  Amazon_login login = new Amazon_login(driver);
	  Amazon_Prime prime = new Amazon_Prime(driver);
	  
	  home.ClickNavi();
	  Thread.sleep(2000);
	  driver.navigate().to(url);
	  Thread.sleep(2000);
	  
	  login.ClickAccount();
	  Thread.sleep(5000);
	  driver.navigate().back();
	  prime.ClickPrime();
	  Thread.sleep(5000);
	  
	 
	  driver.navigate().back();
	  
	 
	
  }
 

  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shahi\\\\eclipse-workspace\\\\Automation_home_project\\\\Drivers\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	  driver.navigate().to("https://www.amazon.com");
  }

  @AfterClass
  public void afterClass() {
	 
	  
  }

}
