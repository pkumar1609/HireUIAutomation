package pagesK;
//package com.Hirexpert.pages;
//
//import java.io.IOException;
//
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.Hirexpert.utils.TestBase;
//
//
//
//public class LoginPage extends TestBase{
//	
//
//	public LoginPage() throws IOException 
//	{
//	  super();
//      PageFactory.initElements(driver, this);
//      Action = new Actions(driver);
//      explicitwait=new WebDriverWait(driver,80);
//
//      //Initialize element with driver of current class
//	}
//	
//	
////	public String username;    //added on login age
////	public String user;
////	public boolean b;
////	String logedinuser;
//	
////	@FindBy(xpath ="//input[@formcontrolname='username']")
////	public WebElement un; 
////	
////	@FindBy(xpath ="//input[@formcontrolname='password']")
////	public WebElement pwd;
////	
////	@FindBy(xpath= "//button[@class='btn w-100 Cbtn-primary mt-1 text-left CustomPointer']")
////	public WebElement login;
//	
////	@FindBy(xpath= "//img[@class='profile']")
////	public WebElement profilebtn;
////	
////	@FindBy(xpath= "(//a[@class='dropdown-item CustomPointer'])[3]")
////	private WebElement logoutbtn;
//	
////	@FindBy(xpath= "//a[@title='Agency']")     //added on login age
////	public WebElement userbtn;
////	
////	@FindBy(xpath= "//a[@title='Employer']")
////	public WebElement userbtnemp;
////	
////	@FindBy(xpath= "//a[@href='#']")
////	private WebElement logedinusername;
//	
//	//dashboard
////	@FindBy(xpath= "//a[@href='#/jobdashboard']")     //added on dashboard page
////	public WebElement dashboardbtn;
////	
////	public void dashboard()
////	{
////		executor.executeScript("arguments[0].click();",dashboardbtn);
////	}
//
//	//Actions
////	public void loginInAppWithEmp() throws InterruptedException                  //added on login page
////	{
////		un.sendKeys(prop.getProperty("loginid"));
////		pwd.sendKeys(prop.getProperty("pwd"));
//////		explicitwait.until(ExpectedConditions.elementToBeClickable(login));
////		Thread.sleep(2000);
////		login.click();
////	}
//	
//	
////	public void loginInAppWithAgy() throws InterruptedException
////	{
////		un.sendKeys(prop.getProperty("agyid"));
////		pwd.sendKeys(prop.getProperty("pwd"));
////		Thread.sleep(2000);
////		executor.executeScript("arguments[0].click();",login);
////		
////	}
////	public void loginInAppWithAgy2() throws InterruptedException
////	{
////		un.sendKeys(prop.getProperty("agyid2"));
////		pwd.sendKeys(prop.getProperty("pwd"));
////		Thread.sleep(2000);
////		executor.executeScript("arguments[0].click();",login);
////		
////	}
////	
////	public void loginInAppWithTeam() throws InterruptedException
////	{
////		un.sendKeys(prop.getProperty("teamid"));
////		pwd.sendKeys(prop.getProperty("pwd"));
////		Thread.sleep(2000);
////		login.click();
////	}
////	
////	public void loginInAppWithAgyTeam() throws InterruptedException
////	{
////		un.sendKeys(prop.getProperty("agyteamid"));
////		pwd.sendKeys(prop.getProperty("pwd"));
////		Thread.sleep(1000);
////		login.click();
////	}
////	
////	public void logoutFromApp() throws InterruptedException
////	{
////		explicitwait.until(ExpectedConditions.elementToBeClickable(profilebtn));
////		Action.moveToElement(profilebtn).click().perform();
////		executor.executeScript("arguments[0].click();",logoutbtn);
////
////	}
//
////	public void identifyUser() throws InterruptedException
////	{
////		try {		
////			Action.moveToElement(loginpage.profilebtn).perform();
////			Thread.sleep(2000);
////			b= loginpage.userbtnemp.isDisplayed();
////			Thread.sleep(2000);
////			executor.executeScript("arguments[0].click();",userbtnemp);
////			logedinuser= logedinusername.getText();
////			System.out.println(logedinuser);
////			}
////			catch(NoSuchElementException e)
////			{
////				b=false;
////				logedinuser= logedinusername.getText();
////				System.out.println(logedinuser);
////			}
////			
////		}
//	}
//	
//	
//
