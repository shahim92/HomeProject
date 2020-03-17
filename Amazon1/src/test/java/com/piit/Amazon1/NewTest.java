package com.piit.Amazon1;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	 WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	 Home homepage = new Home(driver);
	 homepage.ClickOnSearch();
	 Thread.sleep(5000);
	 homepage.clicknav();
	 Thread.sleep(5000);
	 
	
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\shahi\\eclipse-workspace\\Amazon1\\Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("https://www.amazon.com");
	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
