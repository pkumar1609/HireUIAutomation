package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.DataTable;
import utilPackage.baseclass;

public class AgenciesPage extends baseclass {
	
	public String ele ;
	
	@FindBy(xpath = "//button[@title='Agencies']")
	public WebElement addAgencyButton;
	
	@FindBy(xpath = "//input[@placeholder='Enter Name']")
	public WebElement agencyName;
	
	@FindBy(xpath = "//input[@placeholder='Enter Email']")
	public WebElement agencyEmail;
	
	@FindBy(xpath = "//input[@placeholder='Enter Contact Number']")
	public WebElement agencyContactNumber;
	
	@FindBy(xpath="//button[@title='Delete']")
	static WebElement deletebtn;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	static WebElement search;
	
//	public String searchele= "//td[contains(text(),'"+ ele1 +"')]";

	public String namevalidate;
	String empname;
	String empAdded= "//td[contains(text(),'" +empname+ "')]";
	
	public AgenciesPage() 
	{
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnAddButton() throws InterruptedException {
		Thread.sleep(2000);
		addAgencyButton.click();
	}
	
	public void fillAgencyDetailsAddButton() {
		
		agencyName.sendKeys("AMB6 Agency");
		agencyEmail.sendKeys("amb6@gmail.com");
		agencyContactNumber.sendKeys("245551465");
	}
	
	public void getTitle()
	{
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "HireXpert");
		
	}
	public void Clickagencybtn() throws InterruptedException
	{
		wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(dashboardpage.agencies));
		dashboardpage.openAgenciesPage();
	}
	
	public void ClickAddbtn() throws InterruptedException
	{
		Thread.sleep(2000);
		addAgencyButton.click();
	}
	
	public void enterAllDetails(DataTable credentials) throws InterruptedException
	{
	for (Map<String, String> data : credentials.asMaps(String.class, String.class))
	{
		ClickAddbtn();
		agencyName.sendKeys(data.get("Name"));
		empname=data.get("Name");
		agencyEmail.sendKeys(data.get("Email"));
		agencyContactNumber.sendKeys(data.get("contact"));
		namevalidate= data.get("Name");
		WebElement testDropDown = driver.findElement(By.xpath("//select[@formcontrolname='CountryId']"));
		select = new Select(testDropDown);
		select.selectByVisibleText("India");
		common.ClickSumbit();
		try
		{ 
			common.okbtn.isDisplayed();
			common.clickOnOKBtn();
			common.clickOnAddClosebtn();
			System.out.println("this agency is already added");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("team added succesfully");
		}
		
	}
	}
	


	
	public void deleteagy() throws InterruptedException
	{
		Thread.sleep(2000);
		deletebtn.click();
		common.clickOnConfirmYes();	
	}
	
	public void AddedAgyencyDisplaying()
	{
		if(driver.getPageSource().contains(empname))
		{
			System.out.println("Text is present");
			}else{
			System.out.println("Text is absent");
			}
	}
	
	public void enterAgyNameInSearchSection(DataTable credentials)
	{
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
		wait.until(ExpectedConditions.elementToBeClickable(search));
		search.sendKeys(data.get("Name"));
		ele=data.get("Name");
		}
	}

}
