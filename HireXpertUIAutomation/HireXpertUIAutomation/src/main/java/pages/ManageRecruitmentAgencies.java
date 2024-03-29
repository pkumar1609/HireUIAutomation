package pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class ManageRecruitmentAgencies extends baseclass {

	String employeeName;

	public ManageRecruitmentAgencies() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[normalize-space()='Add Recruiters']")
	public WebElement addRecruitmentAgencies;

	public String name;

	public void addRecruiters(DataTable credentials) throws InterruptedException {

		dashboardpage.openManageRecruitersPage();

		if (addRecruitmentAgencies.isDisplayed()) {
			addRecruitmentAgencies.click();
		}

		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			Thread.sleep(1000);
			common.namefield.clear();
			common.namefield.sendKeys(data.get("Name"));
			name = data.get("Name");
			System.out.println("name: " + name);
			ar.add(name);
			common.emailfield.clear();
			common.emailfield.sendKeys(data.get("Email"));
			common.contactnumberfield.clear();
			common.contactnumberfield.sendKeys(data.get("contact"));
			select = new Select(common.countryid);
			select.selectByVisibleText("India");
			common.cityfield.clear();
			common.cityfield.sendKeys("Hyderabad");
			common.ClickSumbit();
			if (common.okbtnPopup.size() > 0) {
				common.clickOnOKBtn();
			} else {
				if (addRecruitmentAgencies.isDisplayed()) {
					addRecruitmentAgencies.click();
				}
			}
		}
		common.clickOnAddClosebtn();
	}

	// Do not delete below method.
	public void addRecruitersNew(String Name, String Email, String Contact) throws InterruptedException {

		dashboardpage.openManageRecruitersPage();

		if (addRecruitmentAgencies.isDisplayed()) {
			addRecruitmentAgencies.click();
		}
		Thread.sleep(1000);
		common.namefield.clear();
		common.namefield.sendKeys(Name.strip());
		
		name = Name.strip();
		ar.add(name);
		
		common.emailfield.clear();
		common.emailfield.sendKeys(Email);
		
		common.contactnumberfield.clear();
		common.contactnumberfield.sendKeys(Contact);
		
		select = new Select(common.countryid);
		select.selectByVisibleText("India");
		
		common.cityfield.clear();
		common.cityfield.sendKeys("Hyderabad");
		
		common.ClickSumbit();
		if (common.okbtnPopup.size() > 0) {
			common.clickOnOKBtn();
		} else {
			if (addRecruitmentAgencies.isDisplayed()) {
				addRecruitmentAgencies.click();
			}
		}
		common.clickOnAddClosebtn();
	}

}
