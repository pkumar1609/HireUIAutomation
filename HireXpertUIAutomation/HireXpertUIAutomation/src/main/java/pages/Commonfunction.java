package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilPackage.baseclass;

public class Commonfunction extends baseclass {
	
	public Commonfunction() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath="//button[@id='confirmModalBtn']")
	static WebElement confimYes;
	
	@FindBy(xpath="//button[@id='alertModalCloseBtn']")
	public WebElement okbtn;

	@FindBy(xpath="//button[text()='Close']")
	public WebElement closebtn;
	
	@FindBy(xpath = "//button[text()='Save']")
	public WebElement savebtn;
	
	WebDriverWait explicitwait = new WebDriverWait(driver,80);
	
	public void clickOnSaveBtn()
	{
		savebtn.click();
	}
	
	public void clickOnCloseBtn() throws InterruptedException
	{
		Thread.sleep(2000);
		closebtn.click();
	}
	
	public void clickOnConfirmYes()
	{
		explicitwait.until(ExpectedConditions.elementToBeClickable(confimYes));
		confimYes.click();
	}
	
	public void clickOnOKBtn() throws InterruptedException
	{
		Thread.sleep(2000);
//		explicitwait.until(ExpectedConditions.elementToBeClickable(okbtn));
		okbtn.click();
	}
}
