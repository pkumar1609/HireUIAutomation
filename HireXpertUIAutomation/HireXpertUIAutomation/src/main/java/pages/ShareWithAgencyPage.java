package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class ShareWithAgencyPage extends baseclass {
	
	
	boolean emp;
	String Sharedteam;
	String teamMemberName;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement searchField;
	
	@FindBy(xpath = "//span[@class='checkmark CheckBoxM']")
	public WebElement shareCheckbox;
	
	@FindBy(xpath = "(//span[@class=\"checkmark CheckBoxM\"])[2]")
	public WebElement blockUnblockCheckbox;
	
	@FindBy(xpath = "//button[@title='Share With Agency']")
	public WebElement shareWithAgency;
	
	
	public ShareWithAgencyPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
//	public void searchAgency() {
//		
//		String expectedEmail = prop.getProperty("agencyemail");
//		searchField.click();
//		searchField.sendKeys(expectedEmail);
//	}
	
//	public void searchAgencyOwner() {
//		
//		String expectedEmail = prop.getProperty("agencyemail2");
//		searchField.click();
//		searchField.sendKeys(expectedEmail);
//	}
	
	public void shareWithAgency(String agency) throws InterruptedException
	{
		workbenchpage.clickonthreedot();
		shareWithAgency.click();
		this.emp=loginpage.b;
		if(emp==true)
		{
//			sizeOfShareWithTeam++;
			Sharedteam=agency;
			String xpathforshare= "(//td[text()='"+Sharedteam+"']//following::span[@class='checkmark CheckBoxM'])[1]";
			Thread.sleep(2000);
			driver.findElement(By.xpath(xpathforshare)).click();
			try
			{
				common.confimYes.isDisplayed();
				common.clickOnConfirmYes();
			}
			catch(NoSuchElementException e)
			{}
			}
		
		else 
		{
//			sizeOfShareWithTeam++;
			Sharedteam=agency;
			String xpathforshare= "(//td[text()='"+Sharedteam+"']//following::span[@class='checkmark CheckBoxM'])[1]";
			Thread.sleep(2000);
			driver.findElement(By.xpath(xpathforshare)).click();
			try
			{
				common.confimYes.isDisplayed();
				common.clickOnConfirmYes();
			}
			catch(NoSuchElementException e)
			{}
	}
		common.clickOnCloseBtn();
}
//	public void isAgencyPresent(DataTable credentials) throws InterruptedException
//	{
//		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
//		{
//		workbenchpage.clickonthreedot();
//		shareWithAgency.click();
//		teamMemberName= data.get("Email");
//		String teammemberpresent= "//td[text()='" +teamMemberName+ "']";
//		try 
//		{
//			driver.findElement(By.xpath(teammemberpresent)).isDisplayed();
//			teampage.closeTeamPage();
//		}
//		catch(NoSuchElementException e)
//		{
//			agenciespage.enterAllDetails(credentials);			
//			teampage.closeTeamPage();
//		}
//		}
//	}
 }




//workbenchpage.clickonthreedot();
//Thread.sleep(2000);
//workbenchpage.shareWithAgencyButton.click();
//Thread.sleep(3000);
//sharewithteampage.searchField.click();
//sharewithteampage.searchField.sendKeys(username);
//Thread.sleep(2000);
//
//sharewithagencypage.shareCheckbox.click();
//Thread.sleep(1000);
//try
// {
//	common.confimYes.isDisplayed();
//	common.clickOnConfirmYes();
//}
//	catch(NoSuchElementException e )
//{
//	
//}