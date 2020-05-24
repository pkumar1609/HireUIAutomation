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
	
	@FindBy(xpath = "//button[@type='button'][text()='Close']")
	public WebElement addClosebtn ;
	
	@FindBy(xpath = "//button[text()='Save']")
	public WebElement savebtn;
	
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitbtn ;
	
	@FindBy(id = "confirmModalCloseBtn")
	public WebElement noButtonPopup;
	

	
	WebDriverWait explicitwait = new WebDriverWait(driver,80);
	
	public void clickOnSaveBtn()
	{
		savebtn.click();
	}
	
	public void clickOnCloseBtn() throws InterruptedException
	{
		Thread.sleep(4000);
		closebtn.click();
	}
	
	public void clickOnAddClosebtn() throws InterruptedException
	{
		Thread.sleep(2000);
		addClosebtn.click();
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
	
	public void ClickSumbit() throws InterruptedException
	{
		Thread.sleep(3000);
		submitbtn.click();
	}
	
	public void clickNoButton() {
		
		noButtonPopup.click();
	}
}
