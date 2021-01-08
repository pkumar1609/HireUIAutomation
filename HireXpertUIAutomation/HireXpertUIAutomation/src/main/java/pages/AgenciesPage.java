package pages;


import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.DataTable;
import utilPackage.baseclass;

public class AgenciesPage extends baseclass {
	
	public String ele ;
//	public static ArrayList<String> agencies= new ArrayList<String>();
	
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
	
	@FindBy(xpath="//input[@placeholder='Search here' and @name='search']")
	static WebElement search;

	public String namevalidate;
	public String empname;
	String empAdded= "//td[contains(text(),'" +empname+ "')]";
	
	public AgenciesPage() 
	{
		PageFactory.initElements(driver, this);
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
//		Action.moveToElement(dashboardpage.recruitment).click().perform();
//		explicitwait.until(ExpectedConditions.elementToBeClickable(dashboardpage.agencies));
		dashboardpage.openAgenciesPage();
	}
	
	public void ClickAddbtn() throws InterruptedException
	{
		Thread.sleep(3000);
		addAgencyButton.click();
	}
	
	public void enterAllDetails(DataTable credentials) throws InterruptedException
	{
		ClickAddbtn();
	for (Map<String, String> data : credentials.asMaps(String.class, String.class))
	{
		agencyName.clear();
		agencyName.sendKeys(data.get("Name"));
		empname=data.get("Name"); 
		agencyEmail.clear();
		agencyEmail.sendKeys(data.get("Email"));
		agencyContactNumber.clear();
		agencyContactNumber.sendKeys(data.get("contact"));
		namevalidate= data.get("Name");
		WebElement testDropDown = driver.findElement(By.xpath("//select[@formcontrolname='CountryId']"));
		select = new Select(testDropDown);
		select.selectByVisibleText("India");
		common.ClickSumbit();
		try
		{		
//			Assert.assertEquals(driver.findElement(By.xpath("//h6")).getText(), "Job Provider with email id "+data.get("Email")+" already exists");
			common.clickOnOKBtn();
		}
		finally
		{}
	}
	common.clickOnAddClosebtn();
	common.clickOnCloseBtn();
	}

//	public void deleteagy() throws InterruptedException
//	{
//		Thread.sleep(2000);
//		deletebtn.click();
//		common.clickOnConfirmYes();	
//	}
	
	
	public void enterAgyNameInSearchSection(DataTable credentials) throws InterruptedException
	{
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
		Thread.sleep(2000);
//		explicitwait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys(data.get("Name"));
		ele=data.get("Name");
		}
	}

}
