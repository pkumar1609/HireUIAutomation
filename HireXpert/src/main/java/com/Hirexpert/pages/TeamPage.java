package com.Hirexpert.pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Hirexpert.utils.TestBase;

import cucumber.api.DataTable;

public class TeamPage extends TestBase{

		public TeamPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
		
		public String namevalidate;

		@FindBy(xpath ="(//a[@class='nav-link'])[5]")
		private WebElement teambtn; 
		
		@FindBy(xpath ="//button[@title='Team Members']")
		private WebElement addbtn ; 
		
		@FindBy(xpath="//button[@type='button'][text()='Close']")
		public WebElement Closebtn;
		
		@FindBy(xpath="//button[@class='btn btn-outline-dark']")
		public WebElement teamclosebtn;
		
		@FindBy(xpath="//button[@title='Delete']")
		public WebElement deletebtn;
		
		@FindBy(xpath="//button[@id='confirmModalBtn']")
		static WebElement confimYes;
		
		
		public void clickOnTeamBtn()
		{
			teambtn.click();
		}

		public void clickOnAddBtn()
		{
			addbtn.click();
		}
		public void AddAllDetails(DataTable credentials) throws InterruptedException
		{
			
			for (Map<String, String> data : credentials.asMaps(String.class, String.class))
			{
				driver.findElement(By.xpath("//input[@formcontrolname='Name']")).sendKeys(data.get("Name"));
				namevalidate= data.get("Name");
				driver.findElement(By.xpath("//input[@formcontrolname='Email']")).sendKeys(data.get("Email"));
				driver.findElement(By.xpath("//input[@formcontrolname='ContactNumber']")).sendKeys(data.get("contact"));
				
				WebElement testDropDown = driver.findElement(By.xpath("//select[@formcontrolname='CountryId']"));
				Select dropdown = new Select(testDropDown);
				dropdown.selectByVisibleText("India");
				Thread.sleep(1000);
				teampage.ClickSumbit();
				Thread.sleep(1000);
				teampage.clickOnAddBtn();
			}
				Thread.sleep(1000);
				teampage.Closebtn.click();
				
		}
		
	
		public void ClickSumbit()
		{
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		}

		public void deleteteam()
		{
			
			
			List<WebElement> ele= driver.findElements(By.xpath("//button[@title='Delete']"));
	 if(ele.get(0).isEnabled())
	 {
		 ele.get(0).click();
		 confimYes.click();
	 }
	 else
				
		ele.get(1).click();
	 confimYes.click();
			}
			
		}




