package Execution;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Home;

public class execute {
	public static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahi\\eclipse-workspace\\Automation_home_project\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Test
	public void test() throws Exception {
		Home homepage = new Home(driver);
		homepage.Enteremail("samjf@454");
		Thread.sleep(5000);
		homepage.Enterpasswd("sdsjdn");
		Thread.sleep(5000);
		homepage.clickLoginButton();
	}

}
