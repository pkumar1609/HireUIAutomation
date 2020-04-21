package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class ShareWithTeamPage extends baseclass {
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-share-job-with-team/div[1]/h5/button")
	public WebElement AddTeamButton;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[1]/input")
	public WebElement agencyTeamName;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[2]/input")
	public WebElement agencyTeamEmail;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[3]/input")
	public WebElement agencyTeamContactNumber;
	
	@FindBy(xpath = "//span[contains(text(),'Add to Team Member')]")
	public WebElement addToTeamMember;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[2]/button[2]")
	public WebElement submitButton;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div/div/input")
	public WebElement searchField;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div/div/table/tbody/tr[1]/td[4]/label/span")
	public WebElement primaryContactRadioButton;
	
	
	
	public ShareWithTeamPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnAddButton() {
		
		AddTeamButton.click();
	}
	
	public void fillAgencyTeamDetails() {
		
		agencyTeamName.sendKeys("AMB Team 1");
		agencyTeamEmail.sendKeys("ambteam1@gmail.com");
		agencyTeamContactNumber.sendKeys("2542144154");
	}
	
	public void selectAddToTeamMember() {
		
		addToTeamMember.click();
	}
	
	public void searchAgencyTeam() {
		
		String expectedEmail = "ambteam1@gmail.com";
		searchField.click();
		searchField.sendKeys(expectedEmail);
	}
	
//	public void searchEmployerPrimaryContact() {
//		
//		String expectedEmployerEmail = prop.getProperty("employeremail");
//		
//		searchField.click();
//		searchField.sendKeys(expectedEmployerEmail);
//		
//		String actualEmployerEmail= driver.findElement(By.xpath("//td[contains(text(),'sayali@gmail.com')]")).getText();
//		System.out.println("record found..");
//		
//		if(expectedEmployerEmail.equals(actualEmployerEmail)) {
//			
//			Boolean value = primaryContactRadioButton.isSelected();
//			
//			if(value == true) {
//				
//				System.out.println("\nLogged in employer is primary contact..");
//			}
//		}
//		
//	}
	
	public void searchPrimaryContact() {
		
		String expectedEmployerEmail = prop.getProperty("employeremail");
		String expectedAgencyEmail = prop.getProperty("agencyemail");
		
		searchField.click();
		searchField.sendKeys(expectedEmployerEmail);
		
		String actualEmployerEmail= driver.findElement(By.xpath("//td[contains(text(),'sayali@gmail.com')]")).getText();
		
		
		if(expectedEmployerEmail.equals(actualEmployerEmail)) {
			
			System.out.println("record found..");
			
			Boolean value = primaryContactRadioButton.isSelected();
			
			if(value == true) {
				
				System.out.println("\nLogged in employer is primary contact..");
			}
		}
		
		else {
		
			searchField.clear();
			searchField.sendKeys(expectedAgencyEmail);
			
			String actualAgencyEmail = driver.findElement(By.xpath("//td[contains(text(),'sayagency@gmail.com')]")).getText();
			
			
			if(expectedAgencyEmail.equals(actualAgencyEmail)) {
				
				System.out.println("record found..");
				Boolean value1 = primaryContactRadioButton.isSelected();
				
				if(value1 == true) {
					
					System.out.println("\nLogged in agency is primary contact..");
				}
			}
		}
	}

}
