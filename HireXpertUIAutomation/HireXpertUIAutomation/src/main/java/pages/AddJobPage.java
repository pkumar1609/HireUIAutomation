package pages;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import utilPackage.baseclass;


public class AddJobPage extends baseclass {
	
public AddJobPage() 
    {
	 	super();
		PageFactory.initElements(driver, this);
	}

	public int flag;
	public int addJobFlag=0;
	public String selectedOrganization;
	public String SelectedEmployer;
	public boolean jobAddedByEmp;
	public String skill1 = "Agile";
	public String skill2 = "Java";
	public String skill2Exp2 = "S2(Expert)";
	Select se;
	public String jobname;
	public boolean emp;
	public String selectJob;
	public String industryname;
	public String allOptions;
	
	
	@FindBy(xpath ="//input[@id='title']")
	public WebElement title;
	
	@FindBy(xpath = "//input[@formcontrolname='Designation']")
	public WebElement designation;
	
	@FindBy(xpath ="//input[@placeholder='Enter Functional Area']")
	public WebElement functionalArea;
	
	@FindBy(xpath = "//input[@formcontrolname='Industry']")
	public WebElement industry;
	
	@FindBy(xpath = "//input[@placeholder='Enter City Area']")
	public WebElement cityArea;
	
	@FindBy(xpath = "//input[@placeholder='Enter Min Salary']")
	public WebElement minsal;
	
	@FindBy(xpath = "//input[@placeholder='Enter Max Salary']")
	public WebElement maxsal;
	
	@FindBy(id = "minExperience")
	public WebElement minexp;
	
	@FindBy(id = "maxExperience")
	public WebElement maxexp;
	
	@FindBy(id = "totalInterviews")
	public WebElement totalinterviews;
	
	@FindBy(xpath = "//input[@placeholder='Enter Qualification']")
	public WebElement qualification;
	
	@FindBy(xpath = "//button[contains(text(),'Add Skill')]")
	public WebElement addskillbutton;
	
	@FindBy(xpath = "//th[text()='Job Skills']//following::i[@class='fa fa-trash']")
	public List<WebElement> deleteSkill;
	
	@FindBy(xpath = "//tr[2]//td[6]//button[1]")
	WebElement deleteSkill2;
	
	@FindBy(xpath = "//tr[3]//td[6]//button[1]")
	public WebElement deleteSkill3;
	
	@FindBy(xpath = "//tr[1]//td[6]//button[1]")
	public WebElement deleteSkill1;
	
	@FindBy(xpath = "//button[@title='Add Employer']")
	public WebElement employerplusicon;
	
	@FindBy(xpath = "//input[@placeholder='Enter Name']")
	public WebElement employerName;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Email'])[2]")
	public WebElement employerEmail;
	
	@FindBy(xpath = "//input[@placeholder='Enter Contact Number']")
	public WebElement employerContactNumber;
	
	@FindBy(xpath = "//input[@placeholder='Enter Organization']")
	public WebElement employerOrganizationName;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[2]/button[2]")
	public WebElement employerPlusIconSubmit;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/form/div/div/div[1]/div[3]")
	public WebElement click;
	
	@FindBy(id = "employer")
	public WebElement employer;
	
	@FindBy(xpath = "//input[@placeholder='Enter Skill']")
	public List<WebElement> jobskill;
	
	@FindBy(xpath = "//select[@formcontrolname='ExpertiseLevel']")
	public List<WebElement> expertiselevel;
	
	@FindBy(xpath = "//select[@formcontrolname='Weightage']")
	public List<WebElement> weightage;

	@FindBy(xpath = "//span[@class='checkmark']")
	public List<WebElement> certificateNeeded;

	@FindBy(xpath = "//input[@formcontrolname='Remark']")
	public List<WebElement> remark;
	
	@FindBy(id = "noticeperiod")
	public WebElement noticePeriod;
	
	@FindBy(xpath = "//button[@title='Add Employer']")
	public WebElement addEmployee;
	
	@FindBy(xpath = "//input[@placeholder='Enter Organization']")
	public WebElement Organization;
	
	@FindBy(xpath = "(//select[@formcontrolname='ExpertiseLevel'])[1]")
	public WebElement expertiselevel1;
	
	@FindBy(xpath = "(//select[@formcontrolname='ExpertiseLevel'])[2]")
	public WebElement expertiselevel2;
	
	@FindBy(xpath = "(//select[@formcontrolname='ExpertiseLevel'])[3]")
	public WebElement expertiselevel3;
	
	@FindBy(xpath = "(//select[@formcontrolname='Weightage'])[1]")
	public WebElement weightage1;
	
	@FindBy(xpath = "(//select[@formcontrolname='Weightage'])[2]")
	public WebElement weightage2;
	
	@FindBy(xpath = "(//select[@formcontrolname='Weightage'])[3]")
	public WebElement weightage3;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Skill'])[1]")
	public WebElement jobskill1;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Skill'])[2]")
	public WebElement jobskill2;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Skill'])[3]")
	public WebElement jobskill3;
	
	@FindBy(xpath = "//select[@formcontrolname='CountryId']")
	public WebElement country;
	
	@FindBy(xpath = "//input[@placeholder='Enter City']")
	public WebElement city;
	
	@FindBy(xpath = "//input[@placeholder='Enter Zip Code']")
	public WebElement zipcode;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Interview Address']")
	public WebElement address;
	
	@FindBy(xpath = "//input[@formcontrolname='NoOfVacancies']")
	public WebElement noofvacancies;
	
	@FindBy(xpath = "//input[@formcontrolname='CashBenefit']")
	public WebElement cashBenefit;
	
	@FindBy(xpath = "//input[@formcontrolname='MinAge']")
	public WebElement minAge;
	
	@FindBy(xpath = "//input[@formcontrolname='MaxAge']")
	public WebElement maxAge;
	
	@FindBy(xpath = "//select[@formcontrolname='JobType']")
	public WebElement jobType;
	
	@FindBy(xpath = "//select[@formcontrolname='ConsiderRelocation']")
	public WebElement considerRelocation;
	
	@FindBy(xpath = "//select[@formcontrolname='DoNotAddOverBudgetCandidate']")
	public WebElement blockOverBudgetCandidate;
	
	@FindBy(xpath = "//select[@formcontrolname='Shift']")
	public WebElement Shift;
	
	@FindBy(xpath = "//input[@formcontrolname='ShiftTimings']")
	public WebElement ShiftTimings;
	
	@FindBy(xpath = "//input[@formcontrolname='FromEmail']")
	public WebElement FromEmail;
	
	@FindBy(xpath = "//input[@formcontrolname='EmailSubject']")
	public WebElement EmailSubject;
		
	@FindBy(xpath = "//select[@formcontrolname='EmployerId']")
	public WebElement employerId;
	
	@FindBy(xpath = "//input[@formcontrolname='IsCertificateNeeded']")
	public List<WebElement> isCertificateNeeded;

	public void validateJobPageTitle() {
		
		String jobpagetitle = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-edit-job/div[1]/h5")).getText();
		System.out.println("Add Job page Title: " + jobpagetitle);
	}
	
	public void noOfInterviews() throws InterruptedException {
		Thread.sleep(2000);
		se = new Select(totalinterviews);
		se.selectByIndex(2);
	}
	
	public void clickaddemployericon() throws InterruptedException {
		
		employerplusicon.click();
	}
	
 public void enteremployerorganizationname() throws InterruptedException {
		
		employerOrganizationName.sendKeys("EmployerOrg");
	}
	

	
public void filljobDetails(String JobTitle,String Industry, String JobDesignation, String MinSalary , String MaxSalary, String MinExp, String MaxExp, String NoOfInterviews, String CityArea, String ZipCode, String JobNoticePeriod) throws InterruptedException {
		
		title.sendKeys(JobTitle);
		industry.sendKeys(Industry);
		designation.sendKeys(JobDesignation);
		minsal.sendKeys(MinSalary);
		maxsal.sendKeys(MaxSalary);
		minexp.sendKeys(MinExp);
		maxexp.sendKeys(MaxExp);
		se = new Select(totalinterviews);
		se.selectByVisibleText(NoOfInterviews);
		Thread.sleep(2000);
		cityArea.sendKeys(CityArea);
		zipcode.sendKeys(ZipCode);
		noticePeriod.sendKeys(JobNoticePeriod);
	}

	
	
public void addtenSkills() throws InterruptedException {
		
		
			Thread.sleep(3000);
			for(int i=0;i<10;i++) {
			addskillbutton.click();
		}
	}

	
	public void addNewSkill1(String JobSkill1) {
				
		jobskill.get(3).sendKeys(JobSkill1);
		se = new Select(expertiselevel.get(3));
		se.selectByVisibleText("Expert");
		
		se = new Select(weightage.get(3));
		se.selectByVisibleText("Mandatory");
	}
	
	public void addNewSkill2(String JobSkill2) {
		
//		addskillbutton.click();
		
		jobskill2.sendKeys(JobSkill2);
		se = new Select(expertiselevel2);
		se.selectByVisibleText("Expert");
		
		se = new Select(weightage2);
		se.selectByVisibleText("Preferred");
	}
	
public void addNewSkill3() {
		 
//		addskillbutton.click();
		
		jobskill3.sendKeys("Python");
		se = new Select(expertiselevel3);
		se.selectByVisibleText("Expert");
		
		se = new Select(weightage3);
		se.selectByVisibleText("Preferred");
	}
	
	public void deleteSkills() {
		
		deleteSkill2.click();
	}
	
	public void fillEmployerDetailsPlusIcon() {
		
		employerName.sendKeys("Trupti1");
		employerEmail.sendKeys("trupti1@gmail.com");
		employerContactNumber.sendKeys("215245554");
	}
	
//	public void employerDropDown() {
//		
//		se = new Select(employer);
//		se.selectByVisibleText("Trupti1");
//	}

	public void addjob(DataTable credentials) throws InterruptedException
	{ 		
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{	
			
			currentTime = LocalDateTime.now();			
			if(loginpage.b==true)
			{
				jobname=dtFormate.format(currentTime)+" Emp";
				title.sendKeys(jobname);				
				Organization.clear();
				this.Organization.sendKeys(data.get("organization"));
				jobAddedByEmp=true;
			}
			else
			{
				jobAddedByEmp=false;
				jobname=dtFormate.format(currentTime)+" Agy";
				title.sendKeys(jobname);
				select =new Select(employerId);
				List<WebElement> options = select.getOptions();	
					try {
						select.selectByVisibleText("pemp");
					}
					catch(NoSuchElementException e)
					{
						Thread.sleep(2000);
						addEmployee.click();
						Thread.sleep(5000);
						common.emailfield.sendKeys("pemp@gmail.com");
						Thread.sleep(2000);
						common.find.click();
						Thread.sleep(2000);
						common.addSubmitbtn.click();  
						select.selectByVisibleText("pemp");
					}
					if(this.Organization.isEnabled())
						{
							this.Organization.sendKeys(data.get("organization"));
						}
					SelectedEmployer=select.getFirstSelectedOption().getText();
					selectedOrganization=this.Organization.getAttribute("value");
	
			}
			Thread.sleep(1000);
			designation.sendKeys(data.get("designation"));
			functionalArea.sendKeys(data.get("functionalArea"));
			this.industry.sendKeys(data.get("industry"));
			industryname= data.get("industry");		
			minsal.sendKeys(data.get("minsal"));
			maxsal.sendKeys(data.get("maxsal"));
			minexp.sendKeys(data.get("minexp"));
			maxexp.sendKeys(data.get("maxexp"));			
			if(loginpage.b==false && city.getAttribute("value").isEmpty())
			{
				city.sendKeys("Pune");				
			}
			cityArea.sendKeys(data.get("location"));
			Thread.sleep(1000);
			se=new Select(totalinterviews);
			se.selectByVisibleText(data.get("totalinterviews"));
			List<WebElement> deletebtn = driver.findElements(By.xpath("//th[text()='Job Skills']//following::i[@class='fa fa-trash']"));
			for(int i=0;i<deletebtn.size();i++)
				{
					WebElement btn = deletebtn.get(i);
					Thread.sleep(3000);
					executor.executeScript("arguments[0].click();", btn);
				}
	    }
		addJobFlag=1;
    }
	
	
	public void extraInfoOfJob(DataTable credentials) throws InterruptedException
	{
		this.emp=loginpage.b;
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
			if(loginpage.b==true)
			{
				this.FromEmail.sendKeys(data.get("FromEmail"));
			}
			else
			{
				this.FromEmail.sendKeys(data.get("FromEmailagy"));	
			}
		this.EmailSubject.sendKeys(data.get("EmailSubject"));
		this.qualification.sendKeys(data.get("qualification"));
		this.country.sendKeys(data.get("country"));
		this.city.sendKeys(data.get("city"));
		cityArea.clear();
		cityArea.sendKeys(data.get("location"));
		this.zipcode.sendKeys(data.get("zipcode"));
//		address.clear();
		this.address.sendKeys(data.get("address"));
		noofvacancies.clear();
		noofvacancies.sendKeys(data.get("noofvacancies"));
		this.cashBenefit.sendKeys(data.get("cashBenefit"));
		this.minAge.sendKeys(data.get("minAge"));
		this.maxAge.sendKeys(data.get("maxAge"));
		this.noticePeriod.sendKeys(data.get("noticePeriod"));
		se=new Select(jobType);
		se.selectByVisibleText(data.get("jobType"));
		se=new Select(considerRelocation);
		se.selectByVisibleText(data.get("considerRelocation"));
		se=new Select(blockOverBudgetCandidate);
		se.selectByVisibleText(data.get("OverBudget"));
		se=new Select(Shift);
		se.selectByVisibleText(data.get("Shift"));
		this.ShiftTimings.sendKeys(data.get("ShiftTimings"));
		}
	}
			

	public void addSkills(String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2, String remark3) throws InterruptedException
	{
		executor.executeScript("arguments[0].scrollIntoView();", addskillbutton);
		for(int i=0;i<3;i++)	
		{
			Thread.sleep(4000);
			this.addskillbutton.click();
			if(i==0)
			{
				jobskill.get(i).sendKeys(Skill1);
				Thread.sleep(2000);
				expertiselevel.get(i).click();
				select =new Select(expertiselevel.get(i));
				select.selectByVisibleText(level1);
				select =new Select(weightage.get(i));
				select.selectByVisibleText(Weightage1);
				if(certificate1.contains("Yes"))
				{
					Thread.sleep(4000);
					certificateNeeded.get(i).click();
				}
				remark.get(i).sendKeys(remark1);
			}
			if(i==1)
			{
				jobskill.get(i).sendKeys(Skill2);
				Thread.sleep(2000);
				expertiselevel.get(i).click();
				select =new Select(expertiselevel.get(i));
				select.selectByVisibleText(level2);
				select =new Select(weightage.get(i));
				select.selectByVisibleText(Weightage2);
				if(certificate2.contains("Yes"))
				{
					Thread.sleep(4000);
					certificateNeeded.get(i).click();
				}
				remark.get(i).sendKeys(remark2);
			}
			if(i==2)
			{
				jobskill.get(i).sendKeys(Skill3);
				Thread.sleep(2000);
				expertiselevel.get(i).click();
				select =new Select(expertiselevel.get(i));
				select.selectByVisibleText(level3);
				select =new Select(weightage.get(i));
				select.selectByVisibleText(Weightage3);
				if(certificate3.contains("Yes"))
				{
					Thread.sleep(4000);
					certificateNeeded.get(i).click();
				}
				remark.get(i).sendKeys(remark3);
				
			}
		}
	}

	
}



