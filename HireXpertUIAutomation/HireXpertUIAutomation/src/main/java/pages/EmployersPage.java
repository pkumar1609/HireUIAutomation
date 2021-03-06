//package pages;
//import java.util.Map;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//
//import cucumber.api.DataTable;
//import utilPackage.baseclass;
//
//
//public class EmployersPage extends baseclass {
//	
//	public String ele ;
//	
//	@FindBy(xpath = "//h5[text()='Employers ']//following::input[@name='search']")
//	public WebElement employerSearchfield;
//	
//	@FindBy(xpath = "//button[@class='btn btn-outline-danger mr-2']")
//	public WebElement deleteEmployer;
//	
//	public String namevalidate;
//	
//	@FindBy(xpath="(//a[@class='nav-link'])[4]")
//	WebElement empbtn;
//	
//	@FindBy(xpath="//button[@title='Employers']")
//	WebElement addEmployer;
//	
//	@FindBy(xpath="//input[@formcontrolname='Name']")
//	WebElement namefield;
//	
//	@FindBy(xpath="//input[@formcontrolname='Email']")
//	WebElement emailfield;
//	
//	@FindBy(xpath="//input[@formcontrolname='ContactNumber']")
//	WebElement contactnumberfield;
//	
//	@FindBy(xpath="//select[@formcontrolname='CountryId']")
//	WebElement countryid;
//	
//	@FindBy(xpath="//button[@type='submit'][@class='btn btn-primary Cbtn-primary']")
//	WebElement submitbtn;
//	
//	@FindBy(xpath="//button[@class='btn btn-outline-dark'][@type='button']")
//	WebElement closebtn;
//	
//	@FindBy(xpath = "//button[@class='btn btn-outline-dark']")
//	WebElement employersCloseButton;
//	
//	@FindBy(xpath="//button[@title='Delete']")
//	public static WebElement deletebtn;
//	
//	@FindBy(xpath="//button[@id='confirmModalBtn']")
//	public static WebElement confimYes;
//	
//	@FindBy(xpath="//td")
//	static WebElement tableele;
//
//	
//	public EmployersPage() {
//		
//		PageFactory.initElements(driver, this);
//	}
//	
//	public void searchEmployer() {
//		
//		String expectedEmail = "trupti1@gmail.com";
//		
//		searchfield.click();
//		searchfield.sendKeys(expectedEmail);
//		
//		String actualEmail = driver.findElement(By.xpath("//*[@id=\"style-5\"]/table/tbody/tr/td[2]")).getText();
//		
//		if(actualEmail.equals(expectedEmail)) {
//			System.out.println("Employer found..");
//		}
//		else {
//			System.out.println("Employer not found..");
//		}
//	}
//	
//	public void deleteSearchedEmployer() {
//		
//		deleteEmployer.click();
//	}
//	
//	public void ClickOkBtn() {
//		confimYes.click();
//	}
//	
//	
////	public void ClickEmpBtn() {
////		empbtn.click();
////	}
//	
//	public void ClickAddBtn() throws InterruptedException {
//		executor.executeScript("arguments[0].scrollIntoView();", addEmployer);
//		Thread.sleep(2000);
//		addEmployer.click();
//	}
//	
//	public void enterValidCredentials(DataTable credentials) throws InterruptedException {
//		employerspage.ClickAddBtn();
//		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
//		{
//			Thread.sleep(1000);
//			namefield.clear();
//			namefield.sendKeys(data.get("Name"));
//			namevalidate=data.get("Name");
//			ar.add(namevalidate);
//			emailfield.clear();
//			emailfield.sendKeys(data.get("Email"));
//			contactnumberfield.clear();
//			contactnumberfield.sendKeys(data.get("contact"));
//			select = new Select(countryid);
//			select.selectByVisibleText("India");
//			common.ClickSumbit();
//			try
//			{
//				common.clickOnOKBtn();
//				System.out.println("this agency is already added");
//			}
//			catch(NoSuchElementException e)
//			{
//				employerspage.ClickAddBtn();
//			}
//		}
//		common.clickOnAddClosebtn();
//	}
//
////	public void deleteUser(String team) throws InterruptedException
////	{
////		employerSearchfield.sendKeys(team);
////		Thread.sleep(4000);
////		deleteEmployer.click();
////		confimYes.click();	
////	}
//	
//	public void clickEmployersCloseButton() {
//		
//		employersCloseButton.click();
//	}
//	
//	public void searchExistingEmp(DataTable credentials)
//	{
//		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
//		{
//		explicitwait.until(ExpectedConditions.elementToBeClickable(searchfield));
//		employerSearchfield.sendKeys(data.get("Name"));
//		ele=data.get("Name");
//		}
//     }
//}