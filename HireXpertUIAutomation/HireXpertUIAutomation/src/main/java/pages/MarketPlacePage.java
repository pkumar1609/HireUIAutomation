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
import org.testng.Assert;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class MarketPlacePage extends baseclass {

	public MarketPlacePage() throws IOException 
	{
	  super();
      PageFactory.initElements(driver, this);
//      job =addjobpage.jobname;
//      System.out.println("construtor of marketplace job "+job);
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

	@FindBy(xpath ="//a[text()='Marketplace']")
	public WebElement marketPlaceTab;
	
	@FindBy(xpath ="//a[text()='Marketplace']")
	public WebElement agymarketPlaceTab;
	
	@FindBy(xpath ="//select[@id='jobDropdown']")
	public WebElement jobDropdown;
	
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
	
	@FindBy(xpath ="//input[@formcontrolname='Status']")
	public WebElement agyStatus;

	@FindBy(xpath ="//h6[contains(text(),'You can not send more proposal in current week as you have reach our weekly limit of 5 proposal.')]")
	public List<WebElement> proposalLimitPopup;
	
	public String job;

	//StatusAtAgy
	String StatusAtAgy="//a[contains(text(),'" + job + "')]//following::p[text()='Rejected']";
	
	String proposedStatusAgy= "//a[contains(text(),'" + job + "')]//following::p[text()='Proposed']";
	
	//deactivate the request
	String x4= "//a[text()='" +job+ "']//following::button[text()='Deactivate']";
	
	
	
	public void clickOnAcceptAndSignbtn() throws InterruptedException
	{	
		Thread.sleep(4000);
		executor.executeScript("arguments[0].click();",acceptAndSign);
//		acceptAndSign.click();
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
		String editjobproposalbtn = "//a[contains(text(),'" +addjobpage.jobname+ "')]//following::button[text()='Edit']" ;
//	    explicitwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(editjobproposalbtn))));
	    Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",driver.findElement(By.xpath(editjobproposalbtn)) );
	}
	
	
	public void statusOfRequestEmp()
	{
		String StatusAtEmp="//td[contains(text(),'"+ addjobpage.jobname +"')]//following::td[text()='Rejected']";
		driver.findElement(By.xpath(StatusAtEmp)).isDisplayed();
		System.out.println("Status of request is rejected at employer side");
	}
	public void employerSignedstatus() throws InterruptedException
	{
		Thread.sleep(4000);
		refreshjobProposal.click();
		String employerSignedStatus="//td[contains(text(),'" + addjobpage.jobname + "')]//following::td[text()='Employer Signed']";
		driver.findElement(By.xpath(employerSignedStatus)).isDisplayed(); 
	}
	
	public void employerSignedstatusAgy()
	{
		String employerSignedStatusAgy="//a[contains(text(),'"+ addjobpage.jobname +"')]//following::td[text()='Employer Signed']";
		driver.findElement(By.xpath(employerSignedStatusAgy)).isDisplayed(); 
		System.out.println("Status of request is Employer Signed at agency side");
	
	}

		public void statusOfRequestAtAgy()
		{
			String StatusAtAgy="//a[contains(text(),'"+ addjobpage.jobname +"')]//following::td[text()='Rejected']";
			try
			{
				driver.findElement(By.xpath(StatusAtAgy)).isDisplayed(); 
				System.out.println("Status of request is rejected at agency side");
			}
			catch(NoSuchElementException e)
			{
				System.out.println("issue");
		
			}		
		}	
		
	public void clickApplybtnOfParticularJob() throws InterruptedException
	{
			String x="//a[contains(text(),'" +addjobpage.jobname+ "')]//following::button[text()='Apply']";
			WebElement ele =driver.findElement(By.xpath(x));
			executor.executeScript("arguments[0].scrollIntoView();", ele);
			Thread.sleep(2000);
			executor.executeScript("arguments[0].click();",ele);
			common.clickOnConfirmYes();	
	}
	

	public void ClickOnRejectBtn() throws InterruptedException
	{
		String rejectbtn="//td[contains(text(),'" + addjobpage.jobname + "')]//following::button[text()='Reject']";
		Thread.sleep(2000);
		if(driver.findElement(By.xpath(rejectbtn)).isEnabled())
		{
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",driver.findElement(By.xpath(rejectbtn)));
		Thread.sleep(2000);
		common.clickOnConfirmYes();
		}
	}
	
	public void ClickOnReviewBtn() throws InterruptedException
	{
		String reviewbtn= "//p[contains(text(),'" + addjobpage.jobname + "')]//following::button[text()='Review']";
		Thread.sleep(2000);
		driver.findElement(By.xpath(reviewbtn)).click();	
	}

	public void ClickOnReviewBtnAgy() throws InterruptedException
	{
		
		String reviewbtnAgy= "//a[contains(text(),'" + addjobpage.jobname + "')]//following::button[text()='Review']";
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",driver.findElement(By.xpath(reviewbtnAgy)));
//		driver.findElement(By.xpath(reviewbtnAgy)).click();	
	}

	
	public void ClickOnMarketPlaceTab() throws InterruptedException
	{
//		explicitwait.until(ExpectedConditions.elementToBeClickable(marketPlaceTab));
		Thread.sleep(4000);
		executor.executeScript("arguments[0].click();", marketPlaceTab);
	}
	
	public void ClickOnAgyMarketPlaceTab() throws InterruptedException
	{
//		explicitwait.until(ExpectedConditions.elementToBeClickable(marketPlaceTab));
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", agymarketPlaceTab);
	}

	public void ClickOnShareWithMarketPlace() throws InterruptedException	
	{
		workbenchpage.clickonthreedot();
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", sharewithmarketplacebtn);
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
			 common.ClickSumbit();;
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
		if(jobreviewpage.flag==1)
		{
			String x="//a[contains(text(),'" +addjobpage.jobname+ "')]//following::button[text()='Apply']";
			WebElement ele = driver.findElement(By.xpath(x));
			executor.executeScript("arguments[0].scrollIntoView();", ele);
			ele.isDisplayed();
			System.out.println("job is displaying on agency side");
		}
		jobreviewpage.flag=0;
	 }
	public void ValidatetheRequestDetails(DataTable credentials) throws InterruptedException
	{
		 for (Map<String, String> data : credentials.asMaps(String.class, String.class))
	{
		commissionPercentage.getText().contentEquals(data.get("Commission Percentage"));
		invoicePeriod.getText().contentEquals(data.get("Invoice Period"));
		paymentCycle.getText().contentEquals(data.get("Payment Cycle"));
		replacementPeriod.getText().contentEquals(data.get("Replacement Period"));
		jobfield.getText().contentEquals(addjobpage.jobname);
		employerfield.getText().contentEquals(data.get("Employer"));
		agencyfield.getText().contentEquals(data.get("Agency"));
		String status= agyStatus.getAttribute("value");
		if(status.equals("Rejected"))
		{
			System.out.println("Status field is displaying rejected status");
		}
		else if (status.equals("Proposed"))
		{
			System.out.println("Status field is displaying Proposed status");
		}
		else if (status.equals("Employer Signed"))
		{
			System.out.println("Status field is displaying Employer Signed status");
		}
		else if (status.equals("Signed"))
		{
			System.out.println("Status field is displaying  Signed status");
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
 
 public void assertjobdetails(String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2, String remark3, DataTable credentials) throws InterruptedException
 {
	 Thread.sleep(3000);
	 for (Map<String, String> data : credentials.asMaps(String.class, String.class))
	 {
	 Assert.assertEquals(driver.findElement(By.xpath("//h5[text()='"+addjobpage.jobname+"']")).isDisplayed(), true);
	 Assert.assertEquals(driver.findElement(By.xpath("//h6[text()=' "+data.get("designation")+"']")).isDisplayed(), true);
	 if(loginpage.b==true)
	 {
		 Assert.assertEquals(driver.findElement(By.xpath("//p[text()=' "+data.get("organization")+"']")).isDisplayed(), true);
	 }
	 Assert.assertEquals(driver.findElement(By.xpath("//span[text()=' "+data.get("location")+", "+data.get("city")+", "+data.get("country")+"']")).isDisplayed(), true);
	 WebElement zipcode = driver.findElement(By.xpath("//span[text()=' pune, Pune, India']//span"));
	 Assert.assertEquals(zipcode.getText().substring(zipcode.getText().indexOf("- ")+2, zipcode.getText().length()), data.get("zipcode"));
		
	 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Industry ']//following::td[text()='"+data.get("industry")+"']")).isDisplayed(), true);
	 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Experience ']//following::td[text()='"+data.get("minexp")+" - "+data.get("maxexp")+" Years']")).isDisplayed(), true);
	 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Notice Period ']//following::td[text()='"+data.get("noticePeriod")+" Days']")).isDisplayed(), true);
	 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Vacancies ']//following::td[text()='"+data.get("noofvacancies")+"']")).isDisplayed(), true);
	 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='No of Interviews ']//following::td[text()='"+data.get("totalinterviews")+"']")).isDisplayed(), true);
	 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Qualification ']//following::td[text()='"+data.get("qualification")+"']")).isDisplayed(), true);
	 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Job Type ']//following::td[text()='"+data.get("jobType")+"']")).isDisplayed(), true);

	 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Consider Relocation ']//following::td")).getText(), data.get("considerRelocation"));
	 
	 Assert.assertEquals(driver.findElement(By.xpath("(//th[text()='Skill']//following::tr//p)[1]")).getText(),Skill1);
	 Assert.assertEquals(driver.findElement(By.xpath("(//th[text()='Skill']//following::tr//p)[2]")).getText(),level1);
	 Assert.assertEquals(driver.findElement(By.xpath("(//th[text()='Skill']//following::tr//p)[3]")).getText(),Weightage1);
	 Assert.assertEquals(driver.findElement(By.xpath("(//th[text()='Skill']//following::tr//p)[4]")).getText(),certificate1);
	 Assert.assertEquals(driver.findElement(By.xpath("(//th[text()='Skill']//following::tr//p)[5]")).getText(),remark1);
	 Assert.assertEquals(driver.findElement(By.xpath("(//th[text()='Skill']//following::tr//p)[6]")).getText(),Skill2);
	 Assert.assertEquals(driver.findElement(By.xpath("(//th[text()='Skill']//following::tr//p)[7]")).getText(),level2);
	 Assert.assertEquals(driver.findElement(By.xpath("(//th[text()='Skill']//following::tr//p)[8]")).getText(),Weightage2);
	 Assert.assertEquals(driver.findElement(By.xpath("(//th[text()='Skill']//following::tr//p)[9]")).getText(),certificate2);
	 Assert.assertEquals(driver.findElement(By.xpath("(//th[text()='Skill']//following::tr//p)[10]")).getText(),remark2);
	 Assert.assertEquals(driver.findElement(By.xpath("(//th[text()='Skill']//following::tr//p)[11]")).getText(),Skill3);
	 Assert.assertEquals(driver.findElement(By.xpath("(//th[text()='Skill']//following::tr//p)[12]")).getText(),level3);
	 Assert.assertEquals(driver.findElement(By.xpath("(//th[text()='Skill']//following::tr//p)[13]")).getText(),Weightage3);
	 Assert.assertEquals(driver.findElement(By.xpath("(//th[text()='Skill']//following::tr//p)[14]")).getText(),certificate3);
	 Assert.assertEquals(driver.findElement(By.xpath("(//th[text()='Skill']//following::tr//p)[15]")).getText(),remark3);

 
//	 Assert.assertEquals(driver.findElement(By.xpath("//th[text()='Skill']//following::td[text()='"+data.get("Skill1")+"']")).isDisplayed(), true);
//	 Assert.assertEquals(driver.findElement(By.xpath("//th[text()='Skill']//following::td[text()='"+data.get("Skill2")+"']")).isDisplayed(), true);
//	 Assert.assertEquals(driver.findElement(By.xpath("//th[text()='Skill']//following::td[text()='"+data.get("Skill3")+"']")).isDisplayed(), true);
//	
//	 Assert.assertEquals(driver.findElement(By.xpath("//td[text()='"+data.get("Skill1")+"']//following::td[text()='"+data.get("level1")+" ']")).isDisplayed(), true);
//	 Assert.assertEquals(driver.findElement(By.xpath("//td[text()='"+data.get("Skill1")+"']//following::td[text()='"+data.get("Weightage1")+" ']")).isDisplayed(), true);
//	 Assert.assertEquals(driver.findElement(By.xpath("//td[text()='"+data.get("Skill1")+"']//following::td[text()='"+data.get("certificate1")+" ']")).isDisplayed(), true);
//	 Assert.assertEquals(driver.findElement(By.xpath("//td[text()='"+data.get("Skill1")+"']//following::td[text()='"+data.get("remark1")+" ']")).isDisplayed(), true);
//
//	 Assert.assertEquals(driver.findElement(By.xpath("//td[text()='"+data.get("Skill2")+"']//following::td[text()='"+data.get("level2")+" ']")).isDisplayed(), true);
//	 Assert.assertEquals(driver.findElement(By.xpath("//td[text()='"+data.get("Skill2")+"']//following::td[text()='"+data.get("Weightage2")+" ']")).isDisplayed(), true);
//	 Assert.assertEquals(driver.findElement(By.xpath("//td[text()='"+data.get("Skill2")+"']//following::td[text()='"+data.get("certificate2")+" ']")).isDisplayed(), true);
//	 Assert.assertEquals(driver.findElement(By.xpath("//td[text()='"+data.get("Skill2")+"']//following::td[text()='"+data.get("remark2")+" ']")).isDisplayed(), true);
//
//	 Assert.assertEquals(driver.findElement(By.xpath("//td[text()='"+data.get("Skill3")+"']//following::td[text()='"+data.get("level3")+" ']")).isDisplayed(), true);
//	 Assert.assertEquals(driver.findElement(By.xpath("//td[text()='"+data.get("Skill3")+"']//following::td[text()='"+data.get("Weightage3")+" ']")).isDisplayed(), true);
//	 Assert.assertEquals(driver.findElement(By.xpath("//td[text()='"+data.get("Skill3")+"']//following::td[text()='"+data.get("certificate3")+" ']")).isDisplayed(), true);
//	 Assert.assertEquals(driver.findElement(By.xpath("//td[text()='"+data.get("Skill3")+"']//following::td[text()='"+data.get("remark3")+" ']")).isDisplayed(), true);

    }
 }

 
}

