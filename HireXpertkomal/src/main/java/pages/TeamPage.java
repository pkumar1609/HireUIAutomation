package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class TeamPage extends baseclass {
	
	@FindBy(xpath = "//h5[@class='modal-title w-100']")
	public WebElement pagetitle;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-list-jobprovider/div[1]/h5/button[2]")
	public WebElement AddTeamButton;
	
	@FindBy(xpath ="/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[1]/input")
	public WebElement TeamMemberName;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[2]/input")
	public WebElement TeamMemberEmail;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[3]/input")
	public WebElement TeamMemberContactNumber;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[2]/button[2]")
	public WebElement submitButton;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-list-jobprovider/div[3]/button")
	public WebElement closeButton;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement searchField;
	
	
	
	public TeamPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void validatePageTitle() {
		
		String title = pagetitle.getText();
		System.out.println("Page title: " + title);
	}
	
	public void fillTeamMemberDetails() {
		
		TeamMemberName.sendKeys("sayali team 1");
		TeamMemberEmail.sendKeys("sayaliteam1@gmail.com");
		TeamMemberContactNumber.sendKeys("2451565965");
	}
	
	public void searchTeamMember() {
		
		String expectedEmail = prop.getProperty("teamemail");
		searchField.click();
		searchField.sendKeys(expectedEmail);
	}
	
	
	
	

}
