package coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static WebDriver driver;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahi\\eclipse-workspace\\Automation_home_project\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		// this is iFrame web page.iFrame is one web page is inside of another web page. 
		driver.navigate().to("http://demo.automationtesting.in/Frames.html");
		//Syntax for iframe
		driver.switchTo().frame(driver.findElement(By.name("SingleFrame")));
		driver.findElement(By.xpath("//*[@class='col-xs-6 col-xs-offset-5']/input")).sendKeys("samsdsds");
		
	}

}
