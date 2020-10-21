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
	
	@FindBy(xpath= "//body/div[1]/app-root[1]/div[1]/div[1]/div[1]/cvstore[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/label[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")
	public WebElement mandatorySkills ;
	
	@FindBy(xpath= "//body/div[1]/app-root[1]/div[1]/div[1]/div[1]/cvstore[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/label[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")
	public WebElement  preferredSkills;
	
	@FindBy(xpath= "//body/div[1]/app-root[1]/div[1]/div[1]/div[1]/cvstore[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/label[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")
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
		driver.findElement(By.xpath("//option[contains(text(),'Software developer 3')]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//span[@class='ng-value-label']")).getText(), designation);
		
		Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='ng-value-label'])[2]")).getText(), mandatorySkills);
		Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='ng-value-label'])[3]")).getText(), preferredSkills);
		Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='ng-value-label'])[4]")).getText(), optionalSkills);
		Assert.assertEquals(this.minExp.getAttribute("value"), minexp); 
		Assert.assertEquals(this.maxExp.getAttribute("value"), maxexp); 
		Assert.assertEquals(this.salary.getAttribute("value"), salary); 
		select=new Select(this.city);
		Assert.assertEquals(select.getFirstSelectedOption().getText().strip(), city);
//		Assert.assertEquals(this.noticePeriod.getAttribute("value"), noticeperiod);
	
	}
}
