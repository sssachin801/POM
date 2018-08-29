package com.abc.magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home 
{
	WebDriver driver=null;
	
	By myAcct=By.linkText("My Account");
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		
	}
	 public void clickOnMyAcct()
	 {
		driver.findElement(myAcct).click();
	 }
}
