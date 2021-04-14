package pages;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import utilPackage.baseclass;
import utilPackage.utilclass;

public class ManageVendor extends baseclass {
	
	
	
	@FindBy(xpath = "//button[@title='Add Vendors']")
	public WebElement addVendors;
	
	
	public ManageVendor() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void addVendor(DataTable credentials) throws InterruptedException
	{
		Thread.sleep(3000);
		dashboardpage.openManageVendorsPage();
		Thread.sleep(2000);
		addVendors.click();
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
			Thread.sleep(1000);
			common.namefield.clear();
			common.namefield.sendKeys(data.get("Name"));
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
				explicitwait.until(ExpectedConditions.elementToBeClickable(addVendors));
				addVendors.click();
			}
		}
		common.clickOnAddClosebtn();
	}
	
}