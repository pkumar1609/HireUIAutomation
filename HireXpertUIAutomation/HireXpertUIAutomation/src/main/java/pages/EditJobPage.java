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
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/add-edit-job/div[3]/button[2]")
	public WebElement submitButton;
	
	@FindBy(id = "totalInterviews")
	public WebElement totalinterviews;
	
	
	Select se;
	
	public EditJobPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void updateJobDetails() throws InterruptedException {
		
		addjobpage.budget.clear();
		addjobpage.budget.sendKeys("350000");  //updating budget
		Thread.sleep(1000);
		addjobpage.noticePeriod.clear();
		addjobpage.noticePeriod.sendKeys("30");  //updating notice period
		Thread.sleep(1000);
	}
	
	public void updateNoOfInterviews() {
		
		se = new Select(totalinterviews);
		se.selectByIndex(2);
	}

}
