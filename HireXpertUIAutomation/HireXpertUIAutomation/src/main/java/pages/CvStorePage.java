package pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilPackage.baseclass;

public class CvStorePage extends baseclass{
	
	public CvStorePage() {	
	PageFactory.initElements(driver, this);
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
	
	@FindBy(xpath= "(//div[text()='Select Cities']//following::input)[1]")
	public WebElement  city;
	
	@FindBy(xpath= "//select[@formcontrolname='UpdatedBefore']")
	public WebElement updatedBefore;
	
	@FindBy(xpath= "//button[text()=' Reset']")
	public WebElement reset ;
	
	@FindBy(xpath= "//select[@formcontrolname='IndustryId']")
	public WebElement industry ;
	
	@FindBy(xpath= "//select[@formcontrolname='IsBudgetConsidered']")
	public WebElement includeOverBudget;
	
	@FindBy(xpath= "//select[@formcontrolname='IsServingNoticePeriod']")
	public WebElement onNoticePeriod ;
	
	@FindBy(xpath= "//select[@formcontrolname='CityAreaId']")
	public WebElement  cityArea;
	
	@FindBy(xpath= "//select[@formcontrolname='Gender']")
	public WebElement gender;
	
	@FindBy(xpath= "//a[text()='View Details']")
	public WebElement viewDetails ;
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
	

	public void FillBasicFilterValues(String jobs, String designation, String mandatorySkills, String preferredSkills, String optionalSkills, String minexp, String maxexp, String salary, String noticeperiod, String City) throws InterruptedException
	{
		Thread.sleep(1000);
		this.jobs.click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//option[contains(text(),'"+addjobpage.jobname+"')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Cv Strore job 2b')]")).click();

		Assert.assertEquals(driver.findElement(By.xpath("//span[@class='ng-value-label']")).getText(), designation);
		
		Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='ng-value-label'])[2]")).getText(), mandatorySkills);
		Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='ng-value-label'])[3]")).getText(), preferredSkills);
		Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='ng-value-label'])[4]")).getText(), optionalSkills);
		Assert.assertEquals(this.minExp.getAttribute("value"), minexp); 
		Assert.assertEquals(this.maxExp.getAttribute("value"), maxexp); 
		Assert.assertEquals(this.salary.getAttribute("value"), salary); 
		driver.findElement(By.xpath("//div[text()='Select Cities']//following::span[text()='×']")).click();
		Thread.sleep(3000);
//		this.city.click();
		this.city.sendKeys(City);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
//		Assert.assertEquals(this.noticePeriod.getAttribute("value"), noticeperiod);
	
	}

	
	public void advancedFilter(String jobs, String designation, String mandatorySkills, String preferredSkills, String optionalSkills, String minexp, String maxexp, String salary, String noticeperiod, String City, String updatedOn, String industry, String overBudget, String OnNoticePeriod, String CityArea, String Gender, String minage, String maxage, String jobtype, String shift) throws InterruptedException
	{
		
		//job details assert
		Thread.sleep(1000);
		this.jobs.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[contains(text(),'Cv Strore job 2')]")).click();

//		driver.findElement(By.xpath("//option[contains(text(),'"+addjobpage.jobname+"')]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//span[@class='ng-value-label']")).getText(), designation);		
		Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='ng-value-label'])[2]")).getText(), mandatorySkills);
		Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='ng-value-label'])[3]")).getText(), preferredSkills);
		Assert.assertEquals(driver.findElement(By.xpath("(//span[@class='ng-value-label'])[4]")).getText(), optionalSkills);
		Assert.assertEquals(this.minExp.getAttribute("value"), minexp); 
		Assert.assertEquals(this.maxExp.getAttribute("value"), maxexp); 
		Assert.assertEquals(this.salary.getAttribute("value"), salary); 
		select=new Select (this.industry);
		Assert.assertEquals(select.getFirstSelectedOption().getText().strip(), industry); 
		select=new Select (this.includeOverBudget);
		Assert.assertEquals(select.getFirstSelectedOption().getText().strip(), overBudget); 
		Assert.assertEquals(addjobpage.minAge.getAttribute("value"), minage); 
		Assert.assertEquals(addjobpage.maxAge.getAttribute("value"), maxage); 
		select=new Select (addjobpage.jobType);
		Assert.assertEquals(select.getFirstSelectedOption().getText().strip(), jobtype);	
		select=new Select (addjobpage.Shift);
		Assert.assertEquals(select.getFirstSelectedOption().getText().strip(), shift);	
		
//		candidate detail set
		select=new Select (this.onNoticePeriod);
		select.selectByVisibleText(OnNoticePeriod);
		if(OnNoticePeriod.contentEquals("Yes"))
		{
			this.noticePeriod.clear();
		}
		select=new Select (this.gender);	
		select.selectByVisibleText(Gender);		
	}
	public void assertCandidateDetails(String CandidateEmail,String profiletitle,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String jobtype,String shift,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2) throws InterruptedException
	{
		Assert.assertEquals(driver.findElement(By.xpath("(//h6[@class='mb-0'])[2]")).getText().strip(), Name);
		  Assert.assertEquals(driver.findElement(By.xpath("//h6[@title='Title']")).getText().strip(), profiletitle);
		  Assert.assertEquals(driver.findElement(By.xpath("(//p[@title='Designation'])[2]")).getText().strip(), Designation+" (IT software)");
		  Assert.assertEquals(driver.findElement(By.xpath("(//p[@title='Location'])[2]")).getText().strip(), CityArea+", "+City+", "+Country+" - "+ZipCode);
		  Assert.assertEquals(driver.findElement(By.xpath("//p[@title='Contact Number']")).getText().strip(), ContactNumber);
		  if(OnNoticePeriod.equals("No"))
		  {
			  Assert.assertEquals(driver.findElement(By.xpath("(//p[@title='Notice Period'])[2]")).getText().strip(), NoticePeriod);
		  }
		  Assert.assertEquals(driver.findElement(By.xpath("(//p[@title='Experience'])[2]")).getText().strip(), experience+" Years");
		  Assert.assertEquals(driver.findElement(By.xpath("(//p[@title='CTC'])[2]")).getText().strip(), CTC+" PA (CTC)");
		  Assert.assertEquals(driver.findElement(By.xpath("(//p[@title='ECTC'])[2]")).getText().strip(), expectedCTC+" PA (ECTC)");
		  Assert.assertEquals(driver.findElement(By.xpath("//p[@title='DOB']")).getText().strip(), Date);
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Email ']//following::td)[1]")).getText().strip(), CandidateEmail);
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Last Working Day ']//following::td)[1]")).getText().strip(),LastWorkingDay );
		 
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Ready to Relocate ']//following::td)[1]")).getText().strip(), relocate);
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Mode of Communication ']//following::td)[1]")).getText().strip(), Communicationmode);
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Job Type']//following::td)[1]")).getText().strip(),jobtype);
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Gender ']//following::td)[1]")).getText().strip(),Gender );
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Shift ']//following::td)[1]")).getText().strip(), shift);
		 
		  
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Skills']//following::td)[1]")).getText().strip(),Skill1 );
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Skills']//following::td)[2]")).getText().strip(),Skill1 );
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Skills']//following::td)[3]")).getText().strip(), level1);
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Skills']//following::td)[5]")).getText().strip(), Skill2);
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Skills']//following::td)[6]")).getText().strip(), Skill2);
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Skills']//following::td)[7]")).getText().strip(), level2);
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Skills']//following::td)[10]")).getText().strip(), Skill3);
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Skills']//following::td)[11]")).getText().strip(), Skill3);
		  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Skills']//following::td)[12]")).getText().strip(), level3);
		  
		  for(int i=1; i<=3;i++)
		  {	
			  if(driver.findElement(By.xpath("(//strong[text()='Skills']//following::td)["+i+"]")).getText().strip().contains(driver.findElement(By.xpath("(//strong[text()='Skills']//following::td)["+i+1+"]")).getText().strip()))
			  {
				  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Skills']//following::td)["+i+3+"]")).getText().strip(), " Strong Match ");
			  }	  
		  }
		  
		  if(certificate1.equals("Yes"))
		  {
			  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Skills']//following::td)[5]")).getText().strip(), certificateforskill1);

		  }
		  if(certificate2.equals("Yes"))
		  {
			  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Skills']//following::td)[10]")).getText().strip(), certificateforskill2);

		  }
		  if(certificate3.equals("Yes"))
		  {
			  Assert.assertEquals(driver.findElement(By.xpath("(//strong[text()='Skills']//following::td)[15]")).getText().strip(),certificateforskill1);
		  }
		  
		}
	}
	
	
