package coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeEnvironment {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahi\\eclipse-workspace\\Automation_home_project\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("samqwe");
		driver.findElement(By.id("pass")).sendKeys("sam144");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.linkText("Terms")).click();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.linkText("Privacy Notice")).click();
		driver.findElement(By.name("firstname")).sendKeys("shahim");
		driver.findElement(By.name("lastname")).sendKeys("asdd");
		driver.findElement(By.name("reg_email__")).sendKeys("0145115");
		driver.findElement(By.name("reg_passwd__")).sendKeys("sf15");
		
		
		//This got us current url.
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		//driver.findElement(By.id("u_0_7")).click();
		
		
	}

}
