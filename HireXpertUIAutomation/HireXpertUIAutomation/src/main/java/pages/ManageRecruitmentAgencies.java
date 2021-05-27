package pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class ManageRecruitmentAgencies extends baseclass {
	
	String employeeName;
	
	public ManageRecruitmentAgencies() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@title='Manage Recruiters']")
	public WebElement addRecruitmentAgencies;
	


	public String name;
	
	public void addRecruiters(DataTable credentials) throws InterruptedException {
		Thread.sleep(3000);
			dashboardpage.openManageRecruitersPage();
			Thread.sleep(2000);
			addRecruitmentAgencies.click();
			for (Map<String, String> data : credentials.asMaps(String.class, String.class))
			{
				Thread.sleep(1000);
				common.namefield.clear();
				common.namefield.sendKeys(data.get("Name"));
				name=data.get("Name");
				System.out.println("name"+name);
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
					explicitwait.until(ExpectedConditions.elementToBeClickable(addRecruitmentAgencies));
					addRecruitmentAgencies.click();
				}
			}
			common.clickOnAddClosebtn();
		}
	
	public void checkRecruitementAgenciesIsAlreadyPresent()
	{
		
	}


}
