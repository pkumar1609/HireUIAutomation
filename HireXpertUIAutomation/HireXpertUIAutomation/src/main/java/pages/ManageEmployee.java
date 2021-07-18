package pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class ManageEmployee extends baseclass {

	String employeeName;

	public ManageEmployee() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@title='Add Employee']")
	public WebElement addEmployee;

	@FindBy(xpath = "//select[@formcontrolname='Role']")
	public WebElement role;

	public String name;

	public void addEmployee(DataTable credentials) throws InterruptedException {
		Thread.sleep(3000);
		dashboardpage.openManageEmployeePage();
//			addEmployee.click();
		executor.executeScript("arguments[0].click();", addEmployee);
		System.out.println(loginpage.user);
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			if (loginpage.user == "employer") {
				Thread.sleep(1000);
				common.namefield.clear();
				common.namefield.sendKeys(data.get("Name"));
				name = data.get("Name");
				ar.add(name);
				common.emailfield.clear();
				common.emailfield.sendKeys(data.get("Email"));
				select = new Select(role);
				select.selectByVisibleText(data.get("Role"));
			} else {
				common.namefield.clear();
				common.namefield.sendKeys(data.get("Nameagy"));
				name = data.get("Nameagy");
				ar.add(name);
				common.emailfield.clear();
				common.emailfield.sendKeys(data.get("Emailagy"));
				select = new Select(role);
				select.selectByVisibleText(data.get("Roleagy"));
			}
			common.contactnumberfield.clear();
			common.contactnumberfield.sendKeys(data.get("contact"));
			select = new Select(common.countryid);
			select.selectByVisibleText("India");
			common.ClickSumbit();
			if (common.okbtnPopup.size() > 0) {
				common.clickOnOKBtn();
			} else {
				explicitwait.until(ExpectedConditions.elementToBeClickable(addEmployee));
				addEmployee.click();
			}
		}
		common.clickOnAddClosebtn();
	}

	// Do not delete below method.
	public void addEmployeeNew(String userType, String Name, String Email, String Role, String Contact)
			throws InterruptedException {

		Thread.sleep(3000);
		dashboardpage.openManageEmployeePage();
		executor.executeScript("arguments[0].click();", addEmployee);

		if (userType.equalsIgnoreCase("employer")) {
			Thread.sleep(1000);
			common.namefield.clear();
			common.namefield.sendKeys(Name.strip());
			name = Name.strip();
			ar.add(name);
			common.emailfield.clear();
			common.emailfield.sendKeys(Email);
			select = new Select(role);
			select.selectByVisibleText(Role);
		} else {
			common.namefield.clear();
			common.namefield.sendKeys(Name);
			name = Name.strip();
			ar.add(name);
			common.emailfield.clear();
			common.emailfield.sendKeys(Email);
			select = new Select(role);
			select.selectByVisibleText(Role);
		}
		common.contactnumberfield.clear();
		common.contactnumberfield.sendKeys(Contact);
		select = new Select(common.countryid);
		select.selectByVisibleText("India");
		common.ClickSumbit();
		if (common.okbtnPopup.size() > 0) {
			common.clickOnOKBtn();
		} else {
			explicitwait.until(ExpectedConditions.elementToBeClickable(addEmployee));
			addEmployee.click();
		}
		common.clickOnAddClosebtn();
	}

}
