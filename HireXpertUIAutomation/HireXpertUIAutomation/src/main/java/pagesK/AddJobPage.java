package pagesK;

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
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/form/div/div/div[1]/div[1]/div[5]/div/div[2]/button")
	public WebElement employerplusicon;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[1]/input")
	public WebElement employerName;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[2]/input")
	public WebElement employerEmail;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[3]/input")
	public WebElement employerContactNumber;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[2]/button[2]")
	public WebElement employerPlusIconSubmit;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/form/div/div/div[1]/div[3]")
	public WebElement click;
	
	@FindBy(id = "employer")
	public WebElement employer;
	
	@FindBy(xpath = "//tr[1]//td[1]//input[1]")
	public WebElement jobskill1;
	
	@FindBy(xpath = "//tr[1]//td[2]//select[1]")
	public WebElement expertiselevel1;
	
	@FindBy(xpath = "//tr[1]//td[3]//select[1]")
	public WebElement weightage1;
	
	@FindBy(xpath = "//*[@id=\"ng-invalidDiv\"]/td[4]/label/span")
	public WebElement certificateNeeded1;
	
	@FindBy(xpath = "//tr[1]//td[5]//input[1]")
	public WebElement remark1;
	
	@FindBy(xpath = "//tr[2]//td[1]//input[1]")
	public WebElement jobskill2;
	
	@FindBy(xpath = "//tr[2]//td[2]//select[1]")
	public WebElement expertiselevel2;
	
	@FindBy(xpath = "//tr[2]//td[3]//select[1]")
	public WebElement weightage2;
	
	@FindBy(xpath = "//tr[3]//td[1]//input[1]")
	public WebElement jobskill3;
	
	@FindBy(xpath = "//tr[3]//td[2]//select[1]")
	public WebElement expertiselevel3;
	
	@FindBy(xpath = "//tr[3]//td[3]//select[1]")
	public WebElement weightage3;
	
	@FindBy(id = "noticeperiod")
	public WebElement noticePeriod;
	
	@FindBy(xpath = "//button[@title='Add Employee']")
	public WebElement addEmployee;
	
	@FindBy(xpath = "//select[@formcontrolname='EmployerId']")
	public WebElement employerId;
	
	public String skill1 = "s1";
	public String skill2 = "s2";
	public String skill2Exp2 = "S2(Expert)";
	Select se;
	public String jobname1;
	public String jobname2;
	public boolean emp;
	public String selectJob;
	
	
	public void validateJobPageTitle() {
		
		String jobpagetitle = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-edit-job/div[1]/h5")).getText();
		System.out.println("Add Job page Title: " + jobpagetitle);
	}
	
	public void noOfInterviews() {
		
		se = new Select(totalinterviews);
		se.selectByIndex(4);
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
	
	public void addSkillButton() throws InterruptedException {
		
		for(int i=4;i<=12;i++) {
			
			addskillbutton.click();
			Thread.sleep(1000);
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
		se.selectByVisibleText("Preffered");
	}
	
	public void deleteSkills() {
		
		deleteSkill2.click();
	}
	
	public void fillEmployerDetailsPlusIcon() {
		
		employerName.sendKeys("Sayali1");
		employerEmail.sendKeys("sayali1@gmail.com");
		employerContactNumber.sendKeys("215245554");
	}
	
	public void employerDropDown() {
		
		se = new Select(employer);
		se.selectByVisibleText("Sayali 1");
	}
	
	public void clickOnSubmitButton() {
		
		common.submitbtn.click();
	}
	
	public void addjob(DataTable credentials) throws InterruptedException
	{
		
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
		Thread.sleep(3000);
		workbenchpage.AddJob();
		this.emp=loginpage.b;
		if(emp==true)
		{
			jobname1=data.get("title");
			System.out.println("Selected job: "+jobname1);
			title.sendKeys(jobname1);
		}
		else
		{
			jobname2=data.get("agytitle");
			System.out.println("Selected job: "+jobname2);
			title.sendKeys(jobname2);
		}
		
		designation.sendKeys(data.get("designation"));
		industry.sendKeys(data.get("industry"));
		jobrole.sendKeys(data.get("jobrole"));
		location.sendKeys(data.get("location"));
		budget.sendKeys(data.get("budget"));
		minexp.sendKeys(data.get("minexp"));
		maxexp.sendKeys(data.get("maxexp"));
		noOfInterviews();
		List<WebElement> deletebtn = driver.findElements(By.xpath("//i[@class='fa fa-trash']"));	
		for(int i=0;i<deletebtn.size();i++)
			{
				WebElement btn = deletebtn.get(i);
				Thread.sleep(2000);
				btn.click();
			}
		this.emp=loginpage.b;
		if(emp==false)
			{ 
			select =new Select(employerId);
			List<WebElement> options = select.getOptions();
			if(options.size()>0)
			{
				select.selectByIndex(1);
			}
			else if (options.size()==0)
			{
				Thread.sleep(2000);
				addEmployee.click();
				teampage.AddAllDetailsK(credentials);
			}
			}
		common.ClickSumbit();
	}
		
}
	

}
	

