package pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class ManageEmployee extends baseclass {
	
	
	
	public ManageEmployee() {
		
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//button[@title='Add Employee']")
	public WebElement addEmployee;
	
	@FindBy(xpath = "//select[@formcontrolname='Role']")
	public WebElement role;
	
	@FindBy(xpath = "//button[@id='btnGroupDrop1']")
	public WebElement action;
	
	@FindBy(xpath = "//input[@name='search']")
	public WebElement search;
	
	@FindBy(xpath = "//button[@title='Edit']")
	public WebElement edit;

	public String employeeName;
	public String name;
	
	
	
	public void addEmployee(DataTable credentials) throws InterruptedException {
			Thread.sleep(3000);	
			dashboardpage.openManageEmployeePage();
			addEmployee.click();
			for (Map<String, String> data : credentials.asMaps(String.class, String.class))
			{			
			if(loginpage.b==true)
			{
				Thread.sleep(1000);
				common.namefield.clear();
				common.namefield.sendKeys(data.get("Name"));
				name=data.get("Name");
				ar.add(name);
				common.emailfield.clear();
				common.emailfield.sendKeys(data.get("Email"));
				select = new Select(role);
				select.selectByVisibleText(data.get("Role"));
			}
			else
			{	
				common.namefield.clear();
				common.namefield.sendKeys(data.get("Nameagy"));
				name=data.get("Nameagy");
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
				if(common.okbtnPopup.size()>0)
				{
					common.clickOnOKBtn();
				}
				else
				{
					explicitwait.until(ExpectedConditions.elementToBeClickable(addEmployee));
					addEmployee.click();
				}	
			}
			common.clickOnAddClosebtn();
		}

	
	
	
	
}
