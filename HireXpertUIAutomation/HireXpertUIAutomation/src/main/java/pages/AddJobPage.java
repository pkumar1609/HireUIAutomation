package pages;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import org.testng.Assert;
import utilPackage.baseclass;
import utilPackage.utilclass;


public class AddJobPage extends baseclass {
	
public AddJobPage() 
    {
	 	super();
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath ="//input[@id='title']")
	public WebElement title;
	
	@FindBy(id = "typeahead-config")
	public WebElement designation;
	
	
	
	@FindBy(xpath = "//div[@class='col-md-4 pr-0']//div[3]//input[1]")
	public WebElement industry;
	
	@FindBy(xpath = "//div[@class='col-md-4 pr-0']//div[4]//input[1]")
	public WebElement jobrole;
	
	@FindBy(xpath = "//div[@class='col-md-4']//div[4]//input[1]")
	public WebElement location;
	
	@FindBy(id = "budget")
	public WebElement budget;
	
	@FindBy(id = "minExperience")
	public WebElement minexp;
	
	@FindBy(id = "maxExperience")
	public WebElement maxexp;
	
	@FindBy(id = "totalInterviews")
	public WebElement totalinterviews;
	
	@FindBy(xpath = "//button[contains(text(),' Add Skill ')]")
	public WebElement addskillbutton;
	
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
	
	@FindBy(xpath = "//button[@title='Add Employee']")
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
	
	
	@FindBy(xpath = "//select[@formcontrolname='EmployerId']")
	public WebElement employerId;
	
	public String skill1 = "Agile";
	public String skill2 = "Java";
	public String skill2Exp2 = "S2(Expert)";
	Select se;
	public String jobname;
	public boolean emp;
	public String selectJob;
	
	
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
	
	
	public void fillDetails() throws InterruptedException {
		
		title.sendKeys("Automation1");
		designation.sendKeys("Automation engineer");
		industry.sendKeys("IT Company Pvt. Ltd.");
		jobrole.sendKeys("Automation engineer");
		location.sendKeys("Bombay");
		budget.sendKeys("400000");
		minexp.sendKeys("0");
		maxexp.sendKeys("2");
		noOfInterviews();
		click.click();
		Thread.sleep(2000);
	}
	
public void filljobDetails(String Title, String Designation, String Industry, String JobRole, String Location, String Budget, String MinExp, String MaxExp, String NoOfInterviews) throws InterruptedException {
		
		title.sendKeys(Title);
		designation.sendKeys(Designation);
		industry.sendKeys(Industry);
		jobrole.sendKeys(JobRole);
		location.sendKeys(Location);
		budget.sendKeys(Budget);
		minexp.sendKeys(MinExp);
		maxexp.sendKeys(MaxExp);
		se = new Select(totalinterviews);
		se.selectByIndex(3);
		click.click();
		Thread.sleep(2000);
	}

	
	
public void addtenSkills() throws InterruptedException {
		
		
		Thread.sleep(3000);
		
		for(int i=2;i<=10;i++) {
			
			addskillbutton.click();
			
			
		}
	}

	
	public void addNewSkill1() {
		
//		addskillbutton.click();
		
		jobskill1.sendKeys(skill1);
		se = new Select(expertiselevel1);
		se.selectByVisibleText("Expert");
		
		se = new Select(weightage1);
		se.selectByVisibleText("Mandatory");
	}
	
	public void addNewSkill2() {
		
//		addskillbutton.click();
		
		jobskill2.sendKeys(skill2);
		se = new Select(expertiselevel2);
		se.selectByVisibleText("Expert");
		
		se = new Select(weightage2);
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
	
	public void employerDropDown() {
		
		se = new Select(employer);
		se.selectByVisibleText("Trupti1");
	}
	
	public void clickOnSubmitButton() {
		
		common.submitbtn.click();
	}
	
	
public void addJobforEmployerandAgency(String Title, String Designation, String Industry, String JobRole, String Location, String Budget, String MinExp, String MaxExp, String NoOfInterviews) throws InterruptedException{
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
		if(dynamicElement.size() != 0){
			
		 //If list size is non-zero, element is present
			System.out.println("\nUser logged in as Employer..");
			
			Thread.sleep(3000);

			workbenchpage.AddJob();
			
			Thread.sleep(3000);
			
			addjobpage.filljobDetails(Title, Designation, Industry, JobRole, Location, Budget, MinExp, MaxExp, NoOfInterviews);
			
			Thread.sleep(3000);
			
			addjobpage.addNewSkill1();
			
			Thread.sleep(3000);
			
			addjobpage.addNewSkill2();
			
			Thread.sleep(3000);
			
			addjobpage.deleteSkill3.click();
			
			Thread.sleep(3000);
			
			common.submitbtn.click();

		}
		
		else{
			
		 //Else if size is 0, then element is not present
			System.out.println("\nUser logged in as Agency..");
			
			Thread.sleep(3000);

			workbenchpage.AddJob();
			
			Thread.sleep(3000);
			
			addjobpage.filljobDetails(Title, Designation, Industry, JobRole, Location, Budget, MinExp, MaxExp, NoOfInterviews);
			
			Thread.sleep(3000);
			
			addjobpage.addNewSkill1();
			
			Thread.sleep(3000);
			
			addjobpage.addNewSkill2();
			
			Thread.sleep(3000);
			
			addjobpage.deleteSkill3.click();
			
			Thread.sleep(2000);
			
			addjobpage.clickaddemployericon();
			
			Thread.sleep(3000);
			
			addjobpage.fillEmployerDetailsPlusIcon();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@class='btn Cbtn-primary w-20'][contains(text(),'Submit')]")).click();
			
			Thread.sleep(1000);
			
			addjobpage.employerDropDown();
			
	        Thread.sleep(3000);
	        
	        addjobpage.enteremployerorganizationname();
			
			Thread.sleep(3000);
			
			common.submitbtn.click();

		
		}
	
	}



	
	public void addjob(DataTable credentials) throws InterruptedException
	{ 
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
//			workbenchpage.AddJob();
			this.emp=loginpage.b;
			if(emp==true) 
			{
				jobname=data.get("title");
				System.out.println("Selected job: "+jobname);
//				title.sendKeys(jobname);
			}
			else
			{
				jobname=data.get("agytitle");
				System.out.println("Selected job: "+jobname);
//				title.sendKeys(jobname);
			}
			
//			designation.sendKeys(data.get("designation"));
//			industry.sendKeys(data.get("industry"));
//			jobrole.sendKeys(data.get("jobrole"));
//			location.sendKeys(data.get("location"));
//			budget.sendKeys(data.get("budget"));
//			minexp.sendKeys(data.get("minexp"));
//			maxexp.sendKeys(data.get("maxexp"));
//			noOfInterviews();
//			List<WebElement> deletebtn = driver.findElements(By.xpath("//button[@class='btn btn-outline-danger']"));
//			for(int i=0;i<deletebtn.size();i++)
//				{
//					WebElement btn = deletebtn.get(i);
//					Thread.sleep(6000);
//					btn.click();
//				}
//			this.emp=loginpage.b;
//			if(emp==false)
//			{ 
//				select =new Select(employerId);
//				List<WebElement> options = select.getOptions();
//				if(options.size()>0)
//				{
//					select.selectByIndex(1);
//				}
//				else if (options.size()==0)
//				{
//					Thread.sleep(2000);
//					addEmployee.click();
//					teampage.AddAllDetailsK(credentials);
//					select.selectByIndex(1);
//					Organization.sendKeys(data.get("Oraganization"));	
				}
		    }

//	     }
//    }
	public void addSkills(String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2, String remark3) throws InterruptedException
	{
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



