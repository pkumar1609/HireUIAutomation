package pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class ManageEmployer extends baseclass {
	
	String employeeName;
	
	public ManageEmployer() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@title='Manage Employers']")
	public WebElement addEmployer;
	
	public String name;
	
	public void addEmployer(DataTable credentials) throws InterruptedException {
		Thread.sleep(3000);
			Action.moveToElement(dashboardpage.configuration).build().perform();
			dashboardpage.manageEmployers.click();
			Thread.sleep(2000);
			addEmployer.click();
			for (Map<String, String> data : credentials.asMaps(String.class, String.class))
			{
				Thread.sleep(1000);
				common.namefield.clear();
				common.namefield.sendKeys(data.get("Name"));
				name=data.get("Name");
				ar.add(name);
				common.emailfield.clear();
				common.emailfield.sendKeys(data.get("Email"));
				common.contactnumberfield.clear();
				common.contactnumberfield.sendKeys(data.get("contact"));
				select = new Select(common.countryid);
				select.selectByVisibleText("India");
				common.ClickSumbit();
				if(common.okbtnPopup.size()>0)
				{
					common.clickOnOKBtn();
				}
				else
				{
					explicitwait.until(ExpectedConditions.elementToBeClickable(addEmployer));
					addEmployer.click();
				}	
			}
			common.clickOnAddClosebtn();
		}

	
	
	
	
}
