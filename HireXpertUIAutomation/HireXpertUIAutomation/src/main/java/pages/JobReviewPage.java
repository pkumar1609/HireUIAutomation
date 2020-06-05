package pages;

import java.awt.Desktop.Action;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.JobReviewPage;
import cucumber.api.DataTable;

import utilPackage.baseclass;

public class JobReviewPage extends baseclass{
	
	
	public JobReviewPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(), 'Job Review')]")
	public WebElement jobReview;
	
	int flag=0;
	String jobname="marketjob9";
	
	public void verifyJobDisplay(DataTable credentials) throws InterruptedException
	{
		Map<String, String> data = credentials.asMap(String.class, String.class);
		
		String approvebtn="//a[contains(text(),'marketjob9')]//following::button[text()='Approve']";		
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();",jobReview);
		WebElement ele = driver.findElement(By.xpath(approvebtn));
		executor.executeScript("arguments[0].scrollIntoView();", ele);
		ele.isDisplayed();
		
		executor.executeScript("arguments[0].click();",ele);
		common.clickOnOKBtn();
		common.clickOnCloseBtn();
		flag=1;
	}
	
	public void clickOnApproveButton() throws InterruptedException
	{
//		String approvebtn="//a[contains(text(),'"+jobname+"')]//following::button[text()='Approve']";
//		Thread.sleep(2000);
//		action.moveToElement(jobReview).click().perform();
//		WebElement ele = driver.findElement(By.xpath(approvebtn));
//		Thread.sleep(4000);
//		executor.executeScript("arguments[0].scrollIntoView();", ele);
//		executor.executeScript("arguments[0].click();",ele);
//		common.clickOnOKBtn();
//		common.clickOnCloseBtn();
//		flag=1;
	}
}
