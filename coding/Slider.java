package coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahi\\eclipse-workspace\\Automation_home_project\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		Actions op = new Actions(driver);
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		WebElement slidrs = driver.findElement(By.xpath("//*[@class='ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']"));
		op.dragAndDropBy(slidrs, 200, 0).build().perform();
		

	}

}
