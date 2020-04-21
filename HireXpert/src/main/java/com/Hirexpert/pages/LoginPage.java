package com.Hirexpert.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hirexpert.utils.TestBase;



public class LoginPage extends TestBase{
	

	public LoginPage() throws IOException 
	{
	  super();
      PageFactory.initElements(driver, this);
      //initialise element with driver of current class
	}
	@FindBy(xpath ="//input[@formcontrolname='username']")
	private WebElement un; 
	
	@FindBy(xpath ="//input[@formcontrolname='password']")
	private WebElement pwd;
	
	@FindBy(xpath= "//button[@class='btn w-100 Cbtn-primary mt-1 text-left CustomPointer']")
	private WebElement login;
	//Actions
	public void loginInAppWithEmp()
	{
		un.sendKeys(prop.getProperty("loginid"));
		pwd.sendKeys(prop.getProperty("pwd"));
		login.click();
	}
	public void loginInAppWithAgy()
	{
		un.sendKeys(prop.getProperty("agyid"));
		pwd.sendKeys(prop.getProperty("pwd"));
		login.click();
	}
}
