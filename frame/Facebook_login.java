package frame;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {
	public static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahi\\eclipse-workspace\\Automation_home_project\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Before
	public void setUp() throws Exception {
		Thread.sleep(5000);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
	}

	@Test
	public void test() {
		driver.findElement(By.id("email")).sendKeys("sam2665@yahh.coom");
		driver.findElement(By.id("pass")).sendKeys("sam5454");
		driver.findElement(By.xpath("//*[@aria-label='Log In']")).click();
	}

}
