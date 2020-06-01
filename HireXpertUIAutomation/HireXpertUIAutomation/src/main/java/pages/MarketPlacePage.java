package pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.DataTable;
import cucumber.runtime.Utils;
import utilPackage.baseclass;

public class MarketPlacePage extends baseclass {

	public MarketPlacePage() throws IOException 
	{
	  super();
      PageFactory.initElements(driver, this);
	}
	
	boolean b;
	WebDriverWait explicitwait = new WebDriverWait(driver,80);
	
	@FindBy(xpath ="//button[@title='Share With Marketplace']")
	public WebElement sharewithmarketplacebtn;  
	
	@FindBy(xpath ="//input[@formcontrolname='FeePercentage']")
	public WebElement commissionPercentage;

	@FindBy(xpath ="//Select[@formcontrolname='InvoicePeriod']")
	public WebElement invoicePeriod;

	@FindBy(xpath ="//Select[@formcontrolname='PaymentPeriod']")
	public WebElement paymentCycle;

	@FindBy(xpath ="//Select[@formcontrolname='ReplacementPeriod']")
	public WebElement replacementPeriod;

	@FindBy(xpath ="//a[@href='#/employerMarketPlace']")
	public WebElement marketPlaceTab;
	
	@FindBy(xpath ="//a[@href='#/agencyMarketPlace']")
	public WebElement agymarketPlaceTab;
	
	@FindBy(xpath ="//select[@id='jobDropdown']")
	public WebElement jobdropdown;
	
	@FindBy(xpath ="//p[text()='mns ckjsd']//following::p[text()='Rejected']")
	public WebElement statusAtEmp;
	
	@FindBy(xpath ="//button[text()='Search']")
	public WebElement searchbtn;
	
	@FindBy(xpath ="//button[text()='Accept and Sign']")
	public WebElement acceptAndSign;
	
	@FindBy(xpath ="//input[@formcontrolname='JobTitle']")
	public WebElement jobfield;
	
	@FindBy(xpath ="//input[@formcontrolname='Employer']")
	public WebElement employerfield;
	
	@FindBy(xpath ="//input[@formcontrolname='Agency']")
	public WebElement agencyfield;
	
	@FindBy(xpath ="//input[@formcontrolname='Status']")
	public WebElement statusfield;
	
	@FindBy(xpath ="//i[@class='fa fa-refresh']")
	public WebElement refreshjobProposal;
	
	@FindBy(xpath ="//button[text()= 'View']")
	public WebElement viewagreement;
	
	//change the job according to selected
	public String job=prop.getProperty("isshared");

	//Applybtn
	String x="//a[contains(text(),'" + job + "')]//following::button[text()='Apply']";
	
	//rejectbtn
	String x1="//p[contains(text(),'" + job + "')]//following::button[text()='Reject']";

	//review btn employer
	String reviewbtn= "//p[contains(text(),'" + job + "')]//following::button[text()='Review']";
	
	//review btn employer
	String reviewbtnAgy= "//a[contains(text(),'" + job + "')]//following::button[text()='Review']";

	//StatusAtAgy
	String x2="//a[contains(text(),'" + job + "')]//following::p[text()='Rejected']";
	
	String employerSignedStatusAgy="//a[contains(text(),'" + job + "')]//following::p[text()='Employer Signed']";
 
	String proposedStatusAgy= "//a[contains(text(),'" + job + "')]//following::p[text()='Proposed']";
	
	
	//StatusAtEmp
	String x3="//p[contains(text(),'" + job + "')]//following::p[text()='Rejected']";
	
	String employerSignedStatus="//p[contains(text(),'" + job + "')]//following::p[text()='Employer Signed']";
	
	
	//deactivate the request
	String x4= "//a[text()='" +job+ "']//following::button[text()='Deactivate']";
	
	String agyStatus="//input[@formcontrolname='Status']";
	String editjobproposalbtn = "//a[contains(text(),'" +job+ "')]//following::button[text()='Edit']" ;
	public void clickOnAcceptAndSignbtn() throws InterruptedException
	{
		explicitwait.until(ExpectedConditions.elementToBeClickable(acceptAndSign));
		Thread.sleep(1000);
		acceptAndSign.click();
		common.clickOnConfirmYes();
		common.clickOnOKBtn();
		common.clickOnCloseBtn();
	}

	public void deactivateRequest()
	{
	  driver.findElement(By.xpath(x4));
	}
	
	public void clickOnEditJobProposalBtn() throws InterruptedException
	{
//	  explicitwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(editjobproposalbtn))));
	  Thread.sleep(2000);
		driver.findElement(By.xpath(editjobproposalbtn)).click();
	}
	
	
	public void statusOfRequestEmp()
	{
		try
		{
			driver.findElement(By.xpath(x3)).isDisplayed(); 
			System.out.println("Status of request is rejected at employer side");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("issue");
	
		}		
	}
	public void employerSignedstatus()
	{
		try
		{
			driver.findElement(By.xpath(employerSignedStatus)).isDisplayed(); 
			System.out.println("Status of request is Employer Signed at employer side");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("issue");
	
		}		
	}
	
	public void employerSignedstatusAgy()
	{
		try
		{
			driver.findElement(By.xpath(employerSignedStatusAgy)).isDisplayed(); 
			System.out.println("Status of request is Employer Signed at agency side");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("issue");
	
		}		
	}


	
		public void statusOfRequestAtAgy()
		{
			try
			{
				driver.findElement(By.xpath(x2)).isDisplayed(); 
				System.out.println("Status of request is rejected at agency side");
			}
			catch(NoSuchElementException e)
			{
				System.out.println("issue");
		
			}		
		}	
	public void clickApplybtnOfParticularJob() throws InterruptedException
	{
	try
		{
			driver.findElement(By.xpath(x)).isDisplayed();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement ele =driver.findElement(By.xpath(x));
//			wait.until(ExpectedConditions.visibilityOf(ele));
			js.executeScript("arguments[0].scrollIntoView();", ele);
			Thread.sleep(2000);
			ele.click();
			common.clickOnConfirmYes();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("you already applied for this job");
		}
		
	}
	
	public void selectjob() throws InterruptedException
	{
		Thread.sleep(2000);
		select=new Select(jobdropdown);
		select.selectByVisibleText("job2 - Active");
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", searchbtn);
	}
	
	public void ClickOnRejectBtn() throws InterruptedException
	{
		if(driver.findElement(By.xpath(x1)).isEnabled())
		{
		Thread.sleep(2000);
		driver.findElement(By.xpath(x1)).click();
		common.clickOnConfirmYes();
		}
		else
		{
			System.out.println("status is rejected");
		}
	}
	public void ClickOnReviewBtn() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(reviewbtn)).click();	
	}

	public void ClickOnReviewBtnAgy() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(reviewbtnAgy)).click();	
	}

	
	public void ClickOnMarketPlaceTab() throws InterruptedException
	{
//		explicitwait.until(ExpectedConditions.elementToBeClickable(marketPlaceTab));
		Thread.sleep(4000);
		executor.executeScript("arguments[0].click();", marketPlaceTab);

//		marketPlaceTab.click();
	}
	
	public void ClickOnAgyMarketPlaceTab() throws InterruptedException
	{
//		explicitwait.until(ExpectedConditions.elementToBeClickable(marketPlaceTab));
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", agymarketPlaceTab);

//		marketPlaceTab.click();
	}
	
	
	public void ClickOnShareWithMarketPlace() throws InterruptedException
	{
	
		executor.executeScript("arguments[0].click();", sharewithmarketplacebtn);

//		sharewithmarketplacebtn.click();
//		explicitwait.until(ExpectedConditions.elementToBeClickable(sharewithmarketplacebtn));
	
	}
	 public void EnterdeatilsOfMarketplace(DataTable credentials) throws InterruptedException
	 {
		 for (Map<String, String> data : credentials.asMaps(String.class, String.class))
			{
			 commissionPercentage.clear();
			 commissionPercentage.sendKeys(data.get("Commission Percentage"));
			 Select select= new Select(invoicePeriod);
			 select.selectByVisibleText(data.get("Invoice Period"));
			 Select select1= new Select(paymentCycle);
			 select1.selectByVisibleText(data.get("Payment Cycle"));
			 Select select2= new Select(replacementPeriod);
			 select2.selectByVisibleText(data.get("Replacement Period"));
			 employerspage.ClickSubmitBtn();
			 try
			 {
			 common.confimYes.isDisplayed();
			 common.clickOnConfirmYes();
			 }
			 catch(NoSuchElementException e)
			 {
				
			 }
			 try
			 {
			 common.okbtn.isDisplayed();
			 common.clickOnOKBtn();
			 }
			 catch(NoSuchElementException e)
			 {
				
			 }
			 
			}
	 }
	 
	public void marketPlaceJobAtAgy()
	 {
		
		try
			 {
				driver.findElement(By.xpath(x)).isDisplayed();
				 System.out.println("job is displaying");
			 }
			 catch(NoSuchElementException e)
			 {
				 System.out.println("job is not displaying");
			 }
		 }
	
	 
	public void ValidatetheRequestDetails(DataTable credentials) throws InterruptedException
	{
		 for (Map<String, String> data : credentials.asMaps(String.class, String.class))
	{
		commissionPercentage.getText().contentEquals(data.get("Commission Percentage"));
		invoicePeriod.getText().contentEquals(data.get("Invoice Period"));
		paymentCycle.getText().contentEquals(data.get("Payment Cycle"));
		replacementPeriod.getText().contentEquals(data.get("Replacement Period"));
		jobfield.getText().contentEquals(prop.getProperty("jobname"));
		employerfield.getText().contentEquals(prop.getProperty("employer"));
		loginpage.identifyUserK();
		agencyfield.getText().contentEquals(loginpage.logedinuser);
		String Status= driver.findElement(By.xpath(agyStatus)).getText();
		if(Status.equals("Rejected"))
		{
			System.out.println("Status field is displaying rejected status");
		}
		else
		{
			System.out.println("Status field not displaying any status");
		}
		
	common.clickOnCloseBtn();	
	}
		 
	}
	
	public void ClickOnRefreshjobProposal() throws InterruptedException
	{
		Thread.sleep(1000);
		refreshjobProposal.click();
	}
 public void ClickOnViewAgreement() throws InterruptedException
 {
	 Thread.sleep(2000);
	 viewagreement.click();
 }
 
}

