package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilPackage.baseclass;

public class Commonfunction extends baseclass {

	public Commonfunction() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String DisplayDate;
	public String monthName;
	
	
	@FindBy(xpath="//button[@id='confirmModalBtn']")
	public WebElement confimYes;
	
	@FindBy(xpath="//button[@id='alertModalCloseBtn']")
	public WebElement okbtn;

	@FindBy(xpath="//button[text()='Close']")
	public WebElement closebtn;
	
	@FindBy(xpath = "//button[@type='button'][text()='Close']")
	public WebElement addClosebtn ;
	
	@FindBy(xpath = "//button[text()='Save']")
	public WebElement savebtn;
	
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitbtn ;
	
	@FindBy(xpath = "(//button[text()='Submit'])[2]")
	public WebElement addSubmitbtn ;
	
	@FindBy(id = "confirmModalCloseBtn")
	public WebElement noButtonPopup;
	
	@FindBy(xpath = "//button[contains(text(), 'Search')]")
	public WebElement Search;
	
	@FindBy(xpath = "//button[text()='Find']")
	public WebElement find;
	
	@FindBy(xpath = "//button[text()='Logout']")
	public WebElement log_out;
	
	@FindBy(xpath = "//span[text()='×']")
	public WebElement crossIcon;
	
	@FindBy(xpath="//button[@class='btn btn-outline-danger']")
	public List<WebElement> deletebtn;
	
	@FindBy(xpath="//button[text()='Logout']")
	public WebElement logout;
		
	@FindBy(xpath="//input[@name= 'search-id']")
	public WebElement searchField;
	
	
	WebDriverWait explicitwait = new WebDriverWait(driver,80);
	
	public void ClickonCrossIcon()
	{
		try
		{
			common.crossIcon.click();
		}
		catch(NoSuchElementException e)
		{}
	}
	
	public void clickOnSaveBtn() throws InterruptedException
	{
		Thread.sleep(5000);
		savebtn.click();
	}
	
	public void clickOnSearchBtn() throws InterruptedException
	{
		Thread.sleep(4000);
		Search.click();
	}
	
	public void clickOnCloseBtn() throws InterruptedException
	{ 
	//	explicitwait.until(ExpectedConditions.elementToBeClickable(closebtn));
		Thread.sleep(5000);	
		closebtn.click();
	}
	
	public void clickOnAddClosebtn() throws InterruptedException
	{
		Thread.sleep(2000);
		addClosebtn.click();
	}
	public void clickOnConfirmYes() throws InterruptedException
	{
		Thread.sleep(4000);
		confimYes.click();
	}
	
	public void clickOnOKBtn() throws InterruptedException
	{
		Thread.sleep(3000);
		okbtn.click();
	}
	
	public void ClickSumbit() throws InterruptedException
	{
		Thread.sleep(4000);
		submitbtn.click(); 
	}
	
	public void clickNoButton() {
		
		noButtonPopup.click();
	}
	
	public void enterdate(String date) throws InterruptedException
	{
	        String[] values = date.split("/");
	        int day = Integer.parseInt(values[0]);
	        int month = Integer.valueOf(values[1]);   
	        int year = Integer.parseInt(values[2]);
	        switch(month){    
		    case 1: monthName= "Jan";  
		    break;    
		    case 2: monthName="Feb";  
		    break;    
		    case 3: monthName="Mar";  
		    break;    
		    case 4: monthName="Apr";  
		    break;    
		    case 5: monthName="May";  
		    break;    
		    case 6: monthName="Jun";  
		    break;    
		    case 7: monthName="Jul";  
		    break;    
		    case 8: monthName="Aug";  
		    break;    
		    case 9: monthName="Sep";  
		    break;    
		    case 10: monthName="Oct";  
		    break;    
		    case 11: monthName="Nov";  
		    break;    
		    case 12: monthName="Dec";  
		    break;
			}
	        Thread.sleep(1000);	
			driver.findElement(By.xpath("//button[@class='headerlabelbtn yearlabel']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='"+year+"']")).click();
			driver.findElement(By.xpath("//button[@class='headerlabelbtn monthlabel']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='"+monthName+"']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[text()='"+day+"']")).click();
		}
	
	public String displayDate(String Date)
	{
		String[] values = Date.split("/");
        int day = Integer.parseInt(values[0]);
        int month = Integer.valueOf(values[1]);   
        int year = Integer.parseInt(values[2]);
        switch(month){    
	    case 1: monthName= "Jan";  
	    break;    
	    case 2: monthName="Feb";  
	    break;    
	    case 3: monthName="Mar";  
	    break;    
	    case 4: monthName="Apr";  
	    break;    
	    case 5: monthName="May";  
	    break;    
	    case 6: monthName="Jun";  
	    break;    
	    case 7: monthName="Jul";  
	    break;    
	    case 8: monthName="Aug";  
	    break;    
	    case 9: monthName="Sep";  
	    break;    
	    case 10: monthName="Oct";  
	    break;    
	    case 11: monthName="Nov";  
	    break;    
	    case 12: monthName="Dec";  
	    break;
        }
		return day+"-"+monthName+"-"+year;
		
	}

}

