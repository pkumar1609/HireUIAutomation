package pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.JobReviewPage;

import utilPackage.baseclass;

public class JobReviewPage extends baseclass{
	
	
	public JobReviewPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	int flag=0;
	String jobname =addjobpage.jobname;
	
	@FindBy(xpath = "//a[contains(text(), 'Job Review')]")
	public WebElement jobReview;
	
	String approvebtn="//a[contains(text(),'"+jobname+"')]//following::button[text()='Approve']";
	
	public void verifyJobDisplay() throws InterruptedException
	{
		System.out.println(jobname);
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();",jobReview);
		driver.findElement(By.xpath(approvebtn)).isDisplayed();
	}
	
	public void clickOnApproveButton() throws InterruptedException
	{
		Thread.sleep(2000);
		action.moveToElement(jobReview).click().perform();
		WebElement ele = driver.findElement(By.xpath(approvebtn));
		executor.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		common.clickOnOKBtn();
		flag=1;
	}
}
