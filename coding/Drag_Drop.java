package coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahi\\eclipse-workspace\\Automation_home_project\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Actions point = new Actions(driver);
		Thread.sleep(4000);
		
		
		driver.switchTo().frame(0);
		point.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
		
		
	}

}
