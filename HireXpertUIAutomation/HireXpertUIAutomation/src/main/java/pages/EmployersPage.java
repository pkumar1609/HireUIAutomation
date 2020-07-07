package pages;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import utilPackage.baseclass;


public class EmployersPage extends baseclass {
	
	public String ele ;
	
	@FindBy(xpath = "//input[@name='search']")
	public WebElement searchfield;
	
	@FindBy(xpath = "//button[@title='Delete']")
	public WebElement deleteEmployer;
	
	public String namevalidate;
	
	@FindBy(xpath="(//a[@class='nav-link'])[4]")
	WebElement empbtn;
	
	@FindBy(xpath="//button[@title='Employers']")
	WebElement addbtn;
	
	@FindBy(xpath="//input[@formcontrolname='Name']")
	WebElement namefield;
	//[@class='form-control ng-pristine ng-invalid ng-touched']
	
	@FindBy(xpath="//input[@formcontrolname='Email']")
	WebElement emailfield;
	
	@FindBy(xpath="//input[@formcontrolname='ContactNumber']")
	WebElement contactnumberfield;
	
	@FindBy(xpath="//select[@formcontrolname='CountryId']")
	WebElement countryid;
	
	@FindBy(xpath="//button[@type='submit'][@class='btn btn-primary Cbtn-primary']")
	WebElement submitbtn;
	
	@FindBy(xpath="//button[@class='btn btn-outline-dark'][@type='button']")
	WebElement closebtn;
	
	@FindBy(xpath = "//button[@class='btn btn-outline-dark']")
	WebElement employersCloseButton;
	
	@FindBy(xpath="//button[@title='Delete']")
	public static WebElement deletebtn;
	
	@FindBy(xpath="//button[@id='confirmModalBtn']")
	public static WebElement confimYes;
	
	@FindBy(xpath="//td")
	static WebElement tableele;

	
	
	
	public EmployersPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void searchEmployer() {
		
		String expectedEmail = "sayali1@gmail.com";
		
		searchfield.click();
		searchfield.sendKeys(expectedEmail);
		
		String actualEmail = driver.findElement(By.xpath("//*[@id=\"style-5\"]/table/tbody/tr/td[2]")).getText();
		
		if(actualEmail.equals(expectedEmail)) {
			System.out.println("Employer found..");
		}
		else {
			System.out.println("Employer not found..");
		}
	}
	
	public void deleteSearchedEmployer() {
		
		deleteEmployer.click();
	}
	
	public void ClickOkBtn() {
		confimYes.click();
	}
	
	
//	public void ClickEmpBtn() {
//		empbtn.click();
//	}
	
	public void ClickAddBtn() throws InterruptedException {
		Thread.sleep(2000);
		addbtn.click();
	}
	
	
	
	public void enterValidCredentials(DataTable credentials) throws InterruptedException {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
			employerspage.ClickAddBtn();
			Thread.sleep(1000);
			namefield.sendKeys(data.get("Name"));
			namevalidate=data.get("Name");
			ar.add(namevalidate);
			emailfield.sendKeys(data.get("Email"));
			contactnumberfield.sendKeys(data.get("contact"));
			select = new Select(countryid);
			select.selectByVisibleText("India");
			common.ClickSumbit();
			try
			{ 
				common.okbtn.isDisplayed();
				common.clickOnOKBtn();
				common.clickOnAddClosebtn();
				System.out.println("these employer member are already added");
			}
			catch(NoSuchElementException e)
			{
				System.out.println("Employer added succesfully");
			}
			
		}
		
	}

	public void ClickSubmitBtn() throws InterruptedException
	{
//		submitbtn.click();
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",submitbtn);
	}
	
	public void ClickCloseBtn() throws InterruptedException
	{
		Thread.sleep(4000);
		closebtn.click();

//		explicitwait.until(ExpectedConditions.elementToBeClickable(closebtn));
//		executor.executeScript("arguments[0].click();",closebtn);
	}

	public void deleteemp()
	{
		deletebtn.click();
		confimYes.click();	
	}
	
	public void clickEmployersCloseButton() {
		
		employersCloseButton.click();
	}
	
	public void searchExistingEmp(DataTable credentials)
	{
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
		wait.until(ExpectedConditions.elementToBeClickable(searchfield));
		searchfield.sendKeys(data.get("Name"));
		ele=data.get("Name");
		}
     }
}