package ExpediaNG;

import org.testng.annotations.Test;

import Expedia.Car;
import Expedia.Deals;
import Expedia.Flight;
import Expedia.Hotel;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class expNG {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  Car pcar = new Car(driver);
	  Flight pflight = new Flight(driver);
	  Hotel photel = new Hotel(driver);
	  Deals pdeals = new Deals(driver);
	  
	  pcar.clickcar();
	  Thread.sleep(5000);
	  driver.navigate().back();
	  Thread.sleep(5000);
	  pflight.clickflight();
	  Thread.sleep(5000);
	  pflight.clickfl();
	  Thread.sleep(5000);
	  pflight.clciktg();
	  Thread.sleep(5000);
	  driver.navigate().back();
	  
	  Thread.sleep(5000);
	  photel.clickhotel();
	  driver.navigate().back();
	  Thread.sleep(5000);
	  pdeals.clickdeals();
	  Thread.sleep(5000);
	  driver.navigate().back();
	 
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\shahi\\\\\\\\eclipse-workspace\\\\\\\\Automation_home_project\\\\\\\\Drivers\\\\\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	  driver.navigate().to("https://www.expedia.com");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
