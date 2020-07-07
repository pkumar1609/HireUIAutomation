package pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class TeamPage extends baseclass {
	
	
	
	@FindBy(xpath = "//h5[@class='modal-title w-100']")
	public WebElement pagetitle;
	
	@FindBy(xpath = "//button[@title='Team Members']")
	public WebElement AddTeamButton;
	
	@FindBy(xpath ="//input[@placeholder='Enter Name']")
	public WebElement TeamMemberName;
	
	@FindBy(xpath = "//input[@placeholder='Enter Email']")
	public WebElement TeamMemberEmail;
	
	@FindBy(xpath = "//input[@formcontrolname='ContactNumber']")
	public WebElement TeamMemberContactNumber;
	
	@FindBy(xpath="//select[@formcontrolname='CountryId']")
	public WebElement countryid;
	
	@FindBy(xpath="//button[@title='Delete']")
	public WebElement deletebtn;
	
	@FindBy(xpath="//button[@id='confirmModalBtn']")
	static WebElement confimYesDelete;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-list-jobprovider/div[3]/button")
	public WebElement closeButton;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement searchField;
	
	@FindBy(xpath = "//button[@title='Agencies']")
	public WebElement addAgencies;
	
	
//	public String ele;
//	public String searchele= "//td[contains(text(),'"+ ele +"')]";
	
	public String namevalidate;
	public String teamMemberName;
	public String teamMemberNameAgy;
	public String ele;
	boolean emp;
	
	WebDriverWait explicitwait = new WebDriverWait(driver,20);
	
	
	public TeamPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void validatePageTitle() {
		
		String title = pagetitle.getText();
		System.out.println("Page title: " + title);
	}
	
	public void fillTeamMemberDetails() {
		
		TeamMemberName.sendKeys("sayali team 2");
		TeamMemberEmail.sendKeys(prop.getProperty("teamemail"));
		TeamMemberContactNumber.sendKeys("2451565965");
	}
	
	public void fillAgencyTeamMemberDetails() {
		
		TeamMemberName.sendKeys("say Agency team 2");
		TeamMemberEmail.sendKeys(prop.getProperty("agencyteamemail"));
		TeamMemberContactNumber.sendKeys("2451565965");
	}
	
	public void searchTeamMember() {
		
		String expectedEmail = prop.getProperty("teamemail");
		searchField.click();
		searchField.sendKeys(expectedEmail);
	}
	
	public void clickOnAddBtnK() throws InterruptedException
	{
		Thread.sleep(3000);
		AddTeamButton.click();
	}
	
	public void clickOnAddAgencies() throws InterruptedException
	{
		Thread.sleep(3000);
		addAgencies.click();
	}

	public void AddAllDetailsK(DataTable credentials) throws InterruptedException
	{
		this.emp=loginpage.b;
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
			teampage.clickOnAddBtnK();
			TeamMemberName.sendKeys(data.get("Name"));
			namevalidate = data.get("Name");
			TeamMemberEmail.sendKeys(data.get("Email"));
			TeamMemberContactNumber.sendKeys(data.get("contact"));
			Select dropdown = new Select(countryid);
			dropdown.selectByVisibleText("India");
			Thread.sleep(1000);
			common.ClickSumbit();
			try
			{ 
				common.okbtn.isDisplayed();
				common.clickOnOKBtn();
				common.clickOnAddClosebtn();
				System.out.println("these team member are already added");
			}
			catch(NoSuchElementException e)
			{
				System.out.println("team added succesfully");
			}
			
		}
	 }
	
//	public void AddAllDetailsagyK(DataTable credentials) throws InterruptedException
//	{
//		
//		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
//		{
//			teampage.clickOnAddBtnK();
//			TeamMemberName.sendKeys(data.get("Nameagy"));
//			namevalidate= data.get("Nameagy");
//			TeamMemberEmail.sendKeys(data.get("Emailagy"));
//			TeamMemberContactNumber.sendKeys(data.get("contactagy"));
//			select = new Select(countryid);
//			select.selectByVisibleText("India");
//			common.ClickSumbit();
//			try
//			{ 
//				common.okbtn.isDisplayed();
//				common.clickOnOKBtn();
//				common.clickOnAddClosebtn();
//				System.out.println("these Agency team member are already added");
//			}
//			catch(NoSuchElementException e)
//			{
//				System.out.println("Agency team added succesfully");
//			}
//			
//		}
//			
//			
//	}
	
	public void deleteteamK()
	{
		List<WebElement> ele= driver.findElements(By.xpath("//button[@title='Delete']"));
		if(ele.get(0).isEnabled())
		{
			ele.get(0).click();
			confimYesDelete.click();
		}
		else
		{	
			ele.get(1).click();
			confimYesDelete.click();
		}
	}
	
	public void closeTeamPage()
	{
		executor.executeScript("arguments[0].click();",closeButton);
	}
	
	//is team member present?
	public void isTeamPresentForEmp(DataTable credentials) throws InterruptedException
	{
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
			dashboardpage.openTeamPage();
			teamMemberName = data.get("Name");
			String teammemberpresent= "//td[text()='" +teamMemberName+ "']";
			try 
			{
				driver.findElement(By.xpath(teammemberpresent)).isDisplayed();
				teampage.closeTeamPage();
			}
			catch(NoSuchElementException e)
			{
				AddAllDetailsK(credentials);
				teampage.closeTeamPage();
			}
		}
	}


	public void isTeamPresentForAgy(DataTable credentials) throws InterruptedException
	{
		
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
			dashboardpage.openTeamPage();
			teamMemberNameAgy=data.get("agyteam");
			String teammemberpresent= "//td[text()='" +teamMemberNameAgy+ "']";
			try
			{
				driver.findElement(By.xpath(teammemberpresent)).isDisplayed();
				teampage.closeTeamPage();
			}
			catch(NoSuchElementException e)
			{
				AddAllDetailsagyK(credentials);
				teampage.closeTeamPage();
			}	
		}
		}
	
	public void searchExistingTeam(DataTable credentials)
	{
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
		wait.until(ExpectedConditions.elementToBeClickable(searchField));
		searchField.sendKeys(data.get("Name"));
		ele=data.get("Name");
		System.out.println(ele);
		}
	}
	public void verifyTeamAdded(DataTable credentials) throws InterruptedException
	{
		this.emp=loginpage.b;
		if(emp==true)
		{
		teampage.isTeamPresentForEmp(credentials);
		}
		else
		{
		teampage.isTeamPresentForAgy(credentials);
		}
	}
	
	
//	public void fillDetais()
//	{
//		this.emp=loginpage.b;
//		if(emp==true)
//		{
//			TeamMemberName.sendKeys(data.get("Name"));
//			namevalidate = data.get("Name");
//			TeamMemberEmail.sendKeys(data.get("Email"));
//		}
//		else
//		{
//			TeamMemberName.sendKeys(data.get("Nameagy"));
//			namevalidate= data.get("Nameagy");
//			TeamMemberEmail.sendKeys(data.get("Emailagy"));
//		}
//		TeamMemberContactNumber.sendKeys(data.get("contact"));
//		select = new Select(countryid);
//		select.selectByVisibleText("India");
//		common.ClickSumbit();
//		try
//		{ 
//			common.okbtn.isDisplayed();
//			common.clickOnOKBtn();
//			common.clickOnAddClosebtn();
//			System.out.println("these Agency team member are already added");
//		}
//		catch(NoSuchElementException e)
//		{
//			System.out.println("Agency team added succesfully");
//		}
//		
//	}
//		
//	}
	
	
}
