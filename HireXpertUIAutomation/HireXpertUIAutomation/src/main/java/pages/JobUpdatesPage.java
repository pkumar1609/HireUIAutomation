package pages;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class JobUpdatesPage extends baseclass {

	public JobUpdatesPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@formcontrolname='selectedJobId']")
	public WebElement job;
	
	@FindBy(xpath = "//select[@formcontrolname='selectedUpdateType']")
	public WebElement updateType;
	
	public void selectUpdateType(String update)
	{
		select = new Select (this.updateType);
		select.selectByVisibleText(update);
	}
	
	public void selectJob(String jobname)
	{
		select = new Select (this.job);
		select.selectByVisibleText(jobname);
	}
}