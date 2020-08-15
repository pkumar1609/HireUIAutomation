package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

}
