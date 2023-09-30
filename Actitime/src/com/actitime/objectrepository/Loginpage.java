package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
       //declaration
	@FindBy(id = "username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
	
	//initilization
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//utilization

	public WebElement getUntbx() {
		return untbx;
	}


	public WebElement getPwtbx() {
		return pwtbx;
	}


	public WebElement getLgbtn() {
		return lgbtn;
	}
	
	
	
}
