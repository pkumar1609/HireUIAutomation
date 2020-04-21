package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;


public class EmployersPage extends baseclass {
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div/div/input")
	public WebElement searchfield;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div/div/table/tbody/tr/td[4]/button")
	public WebElement deleteEmployer;
	
	
	public EmployersPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void searchEmployer() {
		
//		String expectedEmail = prop.getProperty("employeremail");
		String expectedEmail = "sayali@gmail.com";
		
		searchfield.click();
		searchfield.sendKeys(expectedEmail);
		
		String actualEmail = driver.findElement(By.xpath("//*[@id=\"style-5\"]/div/div/div/table/tbody/tr/td[2]")).getText();
		
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

}
