package com.piit.Amazon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement Search;
	@FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div")
	WebElement ClickOnIcon;
	
	
	public Home(WebDriver driver) {
	this.driver =driver;
	PageFactory.initElements(driver, this);
	driver.manage().window().maximize();
	}
	
	public void ClickOnSearch() {
		Search.sendKeys("Tablet");
		
	}
	public void clicknav() {
		ClickOnIcon.click();
	}
	

}
