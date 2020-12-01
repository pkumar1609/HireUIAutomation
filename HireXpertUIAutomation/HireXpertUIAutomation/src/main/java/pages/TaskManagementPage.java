package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass; 

public class TaskManagementPage extends baseclass {
	
	public TaskManagementPage() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@placeholder='Search here']")
	public WebElement searchHere;
	
	
}
