package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[2]/button[2]")
	public WebElement submitButton;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement searchField;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-share-job-with-team/div[2]/div[2]/div/div/table/tbody/tr/td[4]/label/input")
	public WebElement primaryContactRadioButton;
	
	@FindBy(xpath = "//button[@class='btn btn-outline-dark']")
	public WebElement closeButton;
	
	@FindBy(xpath = "//td[5]//label[1]//span[1]")   //2nd team member share checkbox after searching
	public WebElement shareCheckbox;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-share-job-with-team/div[2]/div[2]/div/div/table/tbody/tr/td[5]/label/input")
	public WebElement shareCheckboxForSearchedTeam;
	
	@FindBy(xpath = "//td[4]//label[1]//span[1]") //2nd team member primary contact after searching
	public WebElement secondRowPrimaryContact;
	
//	@FindBy(id = "confirmModalBtn")               //sharewithagencypage.yesButtonConfirmation.click();  share checkbox
//	public WebElement yesButtonShareCheckbox;
	
	@FindBy(id = "confirmModalBtn")
	public WebElement yesButtonRadioButton;
	
	@FindBy(xpath = "//td[8]//label[1]//span[1]")
	public WebElement blockUnblockCheckbox;
	
	public ShareWithTeamPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnAddButton() {
		
		AddTeamButton.click();
	}
	
	public void selectAddToTeamMember() {
		
		addToTeamMember.click();
	}
	
	public void searchAgencyTeam() {
		
		String expectedEmail = prop.getProperty("agencyteamemail1");
		searchField.click();
		searchField.sendKeys(expectedEmail);
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
	
	public void searchAgencyTeam3() {
		
		String expectedEmail = prop.getProperty("agencyteamemail3");
		searchField.click();
		searchField.sendKeys(expectedEmail);
	}
	
	public void searchEmployerTeam3() {
		
		String expectedEmail = prop.getProperty("teamemail3");
		searchField.click();
		searchField.sendKeys(expectedEmail);
	}
	
	public void searchEmployerPrimaryContact() {
		
		String expectedEmployerEmail = prop.getProperty("employeremail");
		searchField.click();
		searchField.sendKeys(expectedEmployerEmail);
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
	
	public void searchAgencyPrimaryContact() {
		
		String expectedAgencyEmail = prop.getProperty("agencyemail");
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
		String s2 = prop.getProperty("teamemail2");
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
				sharewithagencypage.yesButtonConfirmation.click();
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
		
		
		//Set implicit wait to 0
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		String s2 = prop.getProperty("agencyteamemail2");
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
				sharewithagencypage.yesButtonConfirmation.click();
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
		
		//Revert back to default value of implicit wait
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
	

}
