package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class EditJobPage extends baseclass {
	
	@FindBy(id = "noticeperiod")
	public WebElement noticePeriod;
	
	@FindBy(id = "budget")
	public WebElement budget;
	
	@FindBy(id = "totalInterviews")
	public WebElement totalinterviews;
	
	
	Select se;
	
	public EditJobPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void updateJobDetails(String Budget1, String Noticeperiod ) throws InterruptedException {
		
		addjobpage.budget.clear();
		addjobpage.budget.sendKeys(Budget1);  //updating budget
		Thread.sleep(1000);
		addjobpage.noticePeriod.clear();
		addjobpage.noticePeriod.sendKeys(Noticeperiod);  //updating notice period
		Thread.sleep(1000);
	}
	
	public void updateNoOfInterviews() {
		
		se = new Select(totalinterviews);
		se.selectByIndex(2);
	}
	public void assertJobdetails(DataTable credentials) throws InterruptedException {
		
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
		Thread.sleep(5000);
		Assert.assertEquals(addjobpage.title.getAttribute("value"), addjobpage.jobname);
		Assert.assertEquals(addjobpage.industry.getAttribute("value"), data.get("industry"));
		Assert.assertEquals(addjobpage.designation.getAttribute("value"), data.get("designation"));
		if(loginpage.b==true)
		{
			Assert.assertEquals(addjobpage.Organization.getAttribute("value"), data.get("organization"));
		}
		else
		{
			if(addjobpage.jobAddedByEmp==true)
			{
				Assert.assertEquals(driver.findElement(By.xpath("//input[@formcontrolname='Employer']")).getAttribute("value"), "pemp");
//				Assert.assertEquals(addjobpage.employerOrganizationName.getAttribute("value"), "");
			}
			else
			{
				Assert.assertEquals(driver.findElement(By.xpath("//input[@formcontrolname='Employer']")).getAttribute("value"), addjobpage.SelectedEmployer.strip());
				Assert.assertEquals(addjobpage.employerOrganizationName.getAttribute("value"), addjobpage.selectedOrganization);
			}
			
		}
		Assert.assertEquals(addjobpage.qualification.getAttribute("value"), data.get("qualification"));
		se = new Select (addjobpage.country);
		WebElement option = se.getFirstSelectedOption();
		Assert.assertEquals(option.getText()," "+data.get("country")+" ");
		Assert.assertEquals(addjobpage.city.getAttribute("value"), data.get("city"));
		Assert.assertEquals(addjobpage.cityArea.getAttribute("value"), data.get("location"));
		Assert.assertEquals(addjobpage.zipcode.getAttribute("value"), data.get("zipcode"));
		Assert.assertEquals(addjobpage.address.getAttribute("value"), data.get("address"));
		Assert.assertEquals(addjobpage.noofvacancies.getAttribute("value"), data.get("noofvacancies"));
		Assert.assertEquals(addjobpage.minsal.getAttribute("value"), data.get("minsal"));
		Assert.assertEquals(addjobpage.maxsal.getAttribute("value"), data.get("maxsal"));
		Assert.assertEquals(addjobpage.minexp.getAttribute("value"), data.get("minexp"));
		Assert.assertEquals(addjobpage.maxexp.getAttribute("value"), data.get("maxexp"));
		Assert.assertEquals(addjobpage.cashBenefit.getAttribute("value"), data.get("cashBenefit"));
		Assert.assertEquals(addjobpage.minAge.getAttribute("value"), data.get("minAge"));
		Assert.assertEquals(addjobpage.maxAge.getAttribute("value"), data.get("maxAge"));
		Assert.assertEquals(addjobpage.totalinterviews.getAttribute("value"), data.get("totalinterviews"));
		Assert.assertEquals(addjobpage.noticePeriod.getAttribute("value"), data.get("noticePeriod"));
		se = new Select (addjobpage.jobType);
		WebElement jobType = se.getFirstSelectedOption();
		Assert.assertEquals(jobType.getText(), " "+data.get("jobType")+" ");
		se = new Select (addjobpage.considerRelocation);
		WebElement considerRelocation = se.getFirstSelectedOption();
		Assert.assertEquals(considerRelocation.getText(), data.get("considerRelocation"));
		se = new Select (addjobpage.blockOverBudgetCandidate);
		WebElement DoNotAddOverBudgetCandidate = se.getFirstSelectedOption();
		Assert.assertEquals(DoNotAddOverBudgetCandidate.getText(), data.get("OverBudget"));
		se = new Select (addjobpage.Shift);
		WebElement Shift = se.getFirstSelectedOption();
		Assert.assertEquals(Shift.getText(), " "+data.get("Shift")+" ");
		Assert.assertEquals(addjobpage.ShiftTimings.getAttribute("value"), data.get("ShiftTimings"));
			if(loginpage.b==true)
			{
				Assert.assertEquals(addjobpage.FromEmail.getAttribute("value"), data.get("FromEmail"));
			}
			else
			{
				Assert.assertEquals(addjobpage.FromEmail.getAttribute("value"), data.get("FromEmailagy"));
			}
		Assert.assertEquals(addjobpage.EmailSubject.getAttribute("value"), data.get("EmailSubject"));
		}
	}
	
		public void assertjobdskills(String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2,DataTable credentials) throws InterruptedException
		{
			Thread.sleep(4000);
			Assert.assertEquals(addjobpage.jobskill.get(0).getAttribute("value"), Skill1);
			Assert.assertEquals(addjobpage.jobskill.get(1).getAttribute("value"), Skill2);
			Assert.assertEquals(addjobpage.jobskill.get(2).getAttribute("value"), Skill3);
			select=new Select(addjobpage.expertiselevel.get(0));
			Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+level1+" ");
			select=new Select(addjobpage.expertiselevel.get(1));
			Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+level2+" ");
			select=new Select(addjobpage.expertiselevel.get(2));
			Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+level3+" ");
			
			select=new Select(addjobpage.weightage.get(0));
			Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+Weightage1+" ");
			select=new Select(addjobpage.weightage.get(1));
			Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+Weightage2+" ");
			select=new Select(addjobpage.weightage.get(2));
			Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+Weightage3+" ");
				
			if(certificate1.contentEquals("Yes"))
			{
			Assert.assertEquals(addjobpage.isCertificateNeeded.get(0).isSelected(), true);	
			}
			if(certificate2.contentEquals("Yes"))
			{
				Assert.assertEquals(addjobpage.isCertificateNeeded.get(1).isSelected(), true);	
			}
			if(certificate3.contentEquals("Yes"))
			{
				Assert.assertEquals(addjobpage.isCertificateNeeded.get(2).isSelected(), true);	
			}
			Assert.assertEquals(addjobpage.remark.get(0).getAttribute("value"), remark1);
			Assert.assertEquals(addjobpage.remark.get(1).getAttribute("value"), remark2);
			Assert.assertEquals(addjobpage.remark.get(2).getAttribute("value"), remark3);
		}
	}


