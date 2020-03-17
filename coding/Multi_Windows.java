package coding;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multi_Windows {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahi\\eclipse-workspace\\Automation_home_project\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Actions point = new Actions(driver);
		
		WebElement forgot = driver.findElement(By.linkText("Forgot account?"));
		point.keyDown(Keys.SHIFT).click(forgot).build().perform();
		

	}

}
