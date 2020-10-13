package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilPackage.baseclass;

public class CvStorePage extends baseclass{
	
	public CvStorePage() {	
	PageFactory.initElements(driver, this);
	this.driver = driver;
	}
	
	@FindBy(xpath= "//select[@id='jobDropdown' and @class='form-control']")
	public WebElement filterType ;
	
	@FindBy(xpath= "//select[@formcontrolname='JobId']")
	public WebElement jobs;
	
	//need to change when developer add attribute
	@FindBy(xpath= "//input[@aria-activedescendant='a878acf831c5-8']")
	public WebElement designation ;
	
	@FindBy(xpath= "//input[@aria-activedescendant='aeb03b55bd56-0']")
	public WebElement mandatorySkills ;
	
	@FindBy(xpath= "//input[@aria-activedescendant='afd2df071abe-0']")
	public WebElement  preferredSkills;
	
	@FindBy(xpath= "//input[@aria-activedescendant='aaf0684c796a-1']")
	public WebElement  optionalSkills;
	
	@FindBy(xpath= "//input[@placeholder='Min Exp']")
	public WebElement minExp ;
	
	@FindBy(xpath= "//input[@placeholder='Max Exp']")
	public WebElement maxExp;
	
	@FindBy(xpath= "//input[@placeholder='Salary']")
	public WebElement salary;
	
	@FindBy(xpath= "//input[@placeholder='Notice Period']")
	public WebElement noticePeriod;
	
	@FindBy(xpath= "//select[@formcontrolname='CityId']")
	public WebElement  city;
	
	@FindBy(xpath= "//select[@formcontrolname='UpdatedBefore']")
	public WebElement updatedBefore;
	
	@FindBy(xpath= "//button[text()=' Reset']")
	public WebElement reset ;
	
//	@FindBy(xpath= "")
//	public WebElement  ;
//	
//	@FindBy(xpath= "")
//	public WebElement  ;
//	
//	@FindBy(xpath= "")
//	public WebElement  ;
//	
//	@FindBy(xpath= "")
//	public WebElement  ;
//	
//	@FindBy(xpath= "")
//	public WebElement  ;
//	
//	@FindBy(xpath= "")
//	public WebElement  ;
//	
//	@FindBy(xpath= "")
//	public WebElement  ;
	

	
	public void FillBasicFilterValues(String jobs, String designation, String mandatorySkills, String preferredSkills, String optionalSkills, String minexp, String maxexp, String salary, String noticeperiod, String city) throws InterruptedException
	{
		Thread.sleep(1000);
		this.jobs.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),' "+jobs+"')]")).click();
		Assert.assertEquals(this.designation.getAttribute("value"), designation);
		Assert.assertEquals(this.mandatorySkills.getAttribute("value"), mandatorySkills);
		Assert.assertEquals(this.preferredSkills.getAttribute("value"), preferredSkills);
		Assert.assertEquals(this.optionalSkills.getAttribute("value"), optionalSkills);
		Assert.assertEquals(this.minExp.getAttribute("value"), minexp);
		Assert.assertEquals(this.maxExp.getAttribute("value"), maxexp);
//		Assert.assertEquals(this.salary.getAttribute("value"), salary);
		Assert.assertEquals(this.city.getAttribute("value"), city);
//		Assert.assertEquals(this.noticePeriod.getAttribute("value"), noticeperiod);

		Thread.sleep(2000);
		common.crossIcon.click();
		this.designation.sendKeys(designation);
		common.ClickonCrossIcon();
		this.mandatorySkills.sendKeys(mandatorySkills);
		common.ClickonCrossIcon();
		this.preferredSkills.sendKeys(preferredSkills);
		this.optionalSkills.sendKeys(optionalSkills);
		this.minExp.sendKeys(minexp);
		this.maxExp.sendKeys(maxexp);
		this.salary.sendKeys(salary);
		this.noticePeriod.sendKeys(noticeperiod);
		this.city.sendKeys(city);
//		this.updatedBefore.sendKeys(up);
		
	}
}
