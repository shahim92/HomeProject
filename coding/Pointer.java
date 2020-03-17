package coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pointer {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahi\\eclipse-workspace\\Automation_home_project\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		Actions hover = new Actions(driver);
		
		driver.navigate().to("https://www.walmart.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@class='f_a al_c f_c']")).click();
		WebElement sign = driver.findElement(By.xpath("//*[@class='f_a o_a ac_c'][3]"));
		hover.moveToElement(sign).build().perform();
		Thread.sleep(5000);
		hover.moveToElement(driver.findElement(By.linkText("iPad"))).click().build().perform();;
		
		

	}

}
