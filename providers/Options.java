package providers;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Options {
	public static WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String first, String second) throws InterruptedException {
	  driver.findElement(By.id("email")).sendKeys(first);
	  driver.findElement(By.id("pass")).sendKeys(second);
	  driver.findElement(By.xpath("//*[@aria-label='Log In']")).click();
	  Thread.sleep(5000);
	  driver.navigate().back();
	  Thread.sleep(5000);
	  driver.findElement(By.id("email")).clear();
	  Thread.sleep(5000);
	  driver.findElement(By.id("pass")).clear();
	  Thread.sleep(5000);
	  
	  
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "shahimjcs@yahs", "ido55" },
      new Object[] { "tim@eabd", "gsfd54" },
      new Object[] {"sam544@yahpo","sa54"},
      new Object[] {"tej@eard","dsaj"}
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\shahi\\\\eclipse-workspace\\\\Automation_home_project\\\\Drivers\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	  driver.navigate().to("https://www.facebook.com");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	
  }

}
