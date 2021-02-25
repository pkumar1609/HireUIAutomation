package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;
import utilPackage.utilclass;

public class ShareWithTeamPage extends baseclass {
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-share-job-with-team/div[1]/h5/button")
	public WebElement AddTeamButton;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[1]/input")
	public WebElement TeamName;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[2]/input")
	public WebElement TeamEmail;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[3]/input")
	public WebElement TeamContactNumber;
	
	@FindBy(xpath = "//span[contains(text(),'Add to Team Member')]")
	public WebElement addToTeamMember;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement searchField;
	
	@FindBy(xpath = "//span[@class='checkround']")
	public WebElement primaryContactRadioButton;
	
	@FindBy(xpath = "(//span[@class='checkmark CheckBoxM'])[1]")  
	public WebElement shareCheckbox;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-share-job-with-team/div[2]/div[2]/div/div/table/tbody/tr/td[5]/label/input")
	public WebElement shareCheckboxForSearchedTeam;
	
	@FindBy(xpath = "//td[4]//label[1]//span[1]") //2nd team member primary contact after searching
	public WebElement secondRowPrimaryContact;
	
	@FindBy(id = "confirmModalBtn")
	public WebElement yesButtonRadioButton;
	
	@FindBy(xpath = "(//span[@class='checkmark CheckBoxM'])[2]")
	public WebElement blockUnblockCheckboxTeam;
		
	@FindBy(xpath = "(//input[@type='checkbox'])[6]")
	public WebElement isBlockUnblockSelected;
	
	@FindBy(xpath = "//select[@formcontrolname='teamId']")
	public WebElement selectTeam;
	
	public ShareWithTeamPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void canSeeAllCandidate(String Teamid) throws InterruptedException {
		String canSeeAllCandidates= "(//td[text()='"+Teamid+"']//following::div[@class='checkmark CheckBoxM'])[2]";
		
		if(driver.findElement(By.xpath("(//td[text()='"+Teamid+"']//following::input[@type='checkbox'])[3]")).isSelected())
		{
			
		} 
		else
		{
		Thread.sleep(4000);
		driver.findElement(By.xpath(canSeeAllCandidates)).click();
		try
		{
			common.clickOnConfirmYes();
		}
		catch(NoSuchElementException e)
		{
			
		}
		}
	}
	
	
	public void clickOnAddButton() throws InterruptedException {
		Thread.sleep(4000);
		AddTeamButton.click();
	}
	
	public void selectAddToTeamMember() {
		
		addToTeamMember.click();
	}
	
	public void searchEmployerTeam() {
		
		String expectedEmail = prop.getProperty("teamemail");
		searchField.click();
		searchField.sendKeys(expectedEmail);
	}
	
	public void searchAgencyTeam11() {
		
		String expectedEmail = prop.getProperty("agencyteamemail11");
		searchField.click();
		searchField.sendKeys(expectedEmail);
	}
	
	
	public void searchEmployerPrimaryContact(String team,String teamid) throws InterruptedException {
	
		String expectedEmployerEmail = teamid;
		Thread.sleep(2000);
		searchField.click();
		searchField.sendKeys(teamid);
		String actualEmployerEmail= driver.findElement(By.xpath("//*[@id=\"style-5\"]/table/tbody/tr/td[2]")).getText();
			
		if(expectedEmployerEmail.equals(actualEmployerEmail)) {
			
			System.out.println("\nEmployer primary contact found..");
			
			boolean value = shareCheckboxForSearchedTeam.isSelected();
			System.out.println("\nShared: " + value);
			
			if(value == true) {
				
				System.out.println("Job is already shared with logged in employer..");
			}
			
			boolean value1 = primaryContactRadioButton.isSelected();
			System.out.println("\nPrimary contact: " +value1);
			
			if(value1 == true) {
				
				System.out.println("Logged in employer is primary contact..");
			}
		}
	}
	
	public void searchAgencyPrimaryContact(String team,String teamid) {
		
		String expectedAgencyEmail = teamid;
		searchField.click();
		searchField.sendKeys(expectedAgencyEmail);
		String actualAgencyEmail= driver.findElement(By.xpath("//*[@id=\"style-5\"]/table/tbody/tr/td[2]")).getText();
			
		if(expectedAgencyEmail.equals(actualAgencyEmail)) {
			
			System.out.println("\nAgency primary contact found..");
			
			boolean value = shareCheckboxForSearchedTeam.isSelected();
			System.out.println("\nShared: " + value);
			
			if(value == true) {
				
				System.out.println("Job is already shared with logged in employer..");
			}
			
			boolean value1 = primaryContactRadioButton.isSelected();
			System.out.println("\nPrimary contact: " +value1);
			
			if(value1 == true) {
				
				System.out.println("\nLogged in agency is primary contact..");
			}
		}
	}
	
	public void findShareCheckboxForEmployerTeam() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		String s2 = "sayali1team1@gmail.com";
		System.out.println("\nNew team member: " + s2);
		
		String xpath_start_email = "//*[@id=\"style-5\"]/table/tbody/tr[";
		String xpath_end_email = "]/td[2]";
		
		String xpath_start_sharecheckbox = "//tr[";
		String xpath_end_sharecheckbox = "]//td[5]//label[1]//span[1]";
		
		String xpath_start_radiobutton = "//tr[";
		String xpath_end_radiobutton = "]//td[4]//label[1]//span[1]";
		
		String xpath_start_radiobuttoninput = "//tr[";
		String xpath_end_radiobuttoninput = "]//td[4]//label[1]//input[1]";
		
		int i = 1;
		
		while(isElementPresent(xpath_start_email+i+xpath_end_email)) {
			
			String s02 = driver.findElement(By.xpath(xpath_start_email+i+xpath_end_email)).getText();
			
			if(s02.equalsIgnoreCase(s2)) {
				System.out.println("\nTeam member found: " + s02);
				Thread.sleep(3000);
				
				WebElement web1 = driver.findElement(By.xpath(xpath_start_radiobuttoninput+i+xpath_end_radiobuttoninput));
				boolean value1 = web1.isEnabled();
				Thread.sleep(1000);
				System.out.println("\nOther team member's primary contact: " +value1);
				
				if(value1 == false) {
					
					System.out.println("Primary contact radio button is disabled for other team members without sharing the job..");
				}
				Thread.sleep(3000);
				
				WebElement we = driver.findElement(By.xpath(xpath_start_sharecheckbox+i+xpath_end_sharecheckbox));		
				we.click();
				Thread.sleep(1000);
				common.clickOnConfirmYes();
				System.out.println("\nNow job is shared with other team member..");
				Thread.sleep(3000);
				
				WebElement web = driver.findElement(By.xpath(xpath_start_radiobutton+i+xpath_end_radiobutton));
				web.click();
				Thread.sleep(1000);
				yesButtonRadioButton.click();
				System.out.println("Now other team member is primary contact");
				Thread.sleep(3000);
			}
			
			i++;
		}
		
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	public boolean isElementPresent(String elementXpath) {
		
		int count = driver.findElements(By.xpath(elementXpath)).size();
		
		if(count==0) {
			return false;
		}
		else {
			return true;
		}
			
	}
	
	public void findShareCheckboxForAgencyTeam() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		String s2 = "sayagency1team1@gmail.com";
		System.out.println("\nNew team member: " + s2);
		
		String xpath_start_email = "//*[@id=\"style-5\"]/table/tbody/tr[";
		String xpath_end_email = "]/td[2]";
		
		String xpath_start_sharecheckbox = "//tr[";
		String xpath_end_sharecheckbox = "]//td[5]//label[1]//span[1]";
		
		String xpath_start_radiobutton = "//tr[";
		String xpath_end_radiobutton = "]//td[4]//label[1]//span[1]";
		
		String xpath_start_radiobuttoninput = "//tr[";
		String xpath_end_radiobuttoninput = "]//td[4]//label[1]//input[1]";
		
		int i = 1;
		
		while(isElementDisplayed(xpath_start_email+i+xpath_end_email)) {
			
			String s02 = driver.findElement(By.xpath(xpath_start_email+i+xpath_end_email)).getText();
			
			if(s02.equalsIgnoreCase(s2)) {
				System.out.println("\nTeam member found: " + s02);
				Thread.sleep(3000);
				
				WebElement web1 = driver.findElement(By.xpath(xpath_start_radiobuttoninput+i+xpath_end_radiobuttoninput));
				boolean value1 = web1.isEnabled();
				Thread.sleep(1000);
				System.out.println("\nOther team member's primary contact: " +value1);
				
				if(value1 == false) {
					
					System.out.println("Primary contact radio button is disabled for other team members without sharing the job..");
				}
				Thread.sleep(3000);
				
				WebElement we = driver.findElement(By.xpath(xpath_start_sharecheckbox+i+xpath_end_sharecheckbox));		
				we.click();
				Thread.sleep(1000);
				common.clickOnConfirmYes();
				System.out.println("\nNow job is shared with other team member..");
				Thread.sleep(3000);
				
				WebElement web = driver.findElement(By.xpath(xpath_start_radiobutton+i+xpath_end_radiobutton));
				web.click();
				Thread.sleep(1000);
				yesButtonRadioButton.click();
				System.out.println("Now other team member is primary contact");
				Thread.sleep(3000);
			}
			
			i++;
		}
		
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	public boolean isElementDisplayed(String elementXpath) {
		
		int count = driver.findElements(By.xpath(elementXpath)).size();
		
		if(count==0) {
			return false;
		}
		else {
			return true;
		}			
	}
	
	public void shareWithTeam(String team) throws InterruptedException
	{
		Thread.sleep(1000); 
		executor.executeScript("arguments[0].click();",workbenchpage.shareJob );
//		workbenchpage.shareJob.click();
		Thread.sleep(1000); 
		workbenchpage.shareWithTeamButton.click();
		sharewithteampage.searchField.sendKeys(team);
		Thread.sleep(2000);
		sharewithteampage.shareCheckbox.click();
		common.shareFlag=1;
		try
		{
		common.clickOnConfirmYes();
		}
		catch(NoSuchElementException e)
		{}		
	}
}
