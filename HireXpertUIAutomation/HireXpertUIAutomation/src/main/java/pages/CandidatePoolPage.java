package pages;

import java.awt.AWTException;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilPackage.baseclass;

public class CandidatePoolPage extends baseclass {
	
	public CandidatePoolPage() {

		PageFactory.initElements(driver, this);
	}
	public String name;
	Select se;
	
	@FindBy(xpath = "//a[text()='Candidate Pool ']")
	public WebElement candidatePool;
	@FindBy(xpath = "//button[text()=' Add Candidate']")
	public WebElement addCandidate;
	@FindBy(xpath = "//h5[text()='Add Candidate']")
	public WebElement winAddCandidate;
	@FindBy(xpath = "//div[@class='col-md-4 pr-1']/input")
	public WebElement email;
	@FindBy(xpath = "//button[@class='btn Cbtn-primary' and (text()='Find')]")
	public WebElement btnFind;
	@FindBy(xpath = "//div[@class='col-md-6 pr-2']//input[1]")
	public WebElement txtname;
	@FindBy(xpath = "//input[@formcontrolname='Experience']")
	public WebElement txtexperience;
	@FindBy(xpath = "//input[@formcontrolname='designation']")
	public WebElement txtdesignation;
	@FindBy(xpath = "//button[@id='ngb-typeahead-3-0']//span")
	public WebElement btnABAP;
	@FindBy(xpath = "//select[@formcontrolname='CountryId']")
	public WebElement selCountry;
	@FindBy(xpath = "//input[@formcontrolname='CTC']")
	public WebElement txtCTC;
	@FindBy(xpath = "//input[@placeholder='Enter Contact Number']")
	public WebElement txtContactNumber;
	@FindBy(xpath = "//my-date-picker[@placeholder='Last Working Date']//button")
	public WebElement calenderIcon;
	@FindBy(xpath = "//input[@placeholder='Enter Notice Period']")
	public WebElement txtNoticePeriod;
	@FindBy(xpath = "//select[@formcontrolname='IsLookingForJob']")
	public WebElement selLookingForjob;
	@FindBy(xpath = "//input[@placeholder='Enter City']")
	public WebElement txtCity;
	@FindBy(xpath = "//input[@placeholder='Enter ECTC']")
	public WebElement txtECTC;
	@FindBy(xpath = "//div[@class='col-md-6 pr-2']//input[@placeholder='Enter Tag']")
	public WebElement txtTag;
	@FindBy(xpath = "//textarea[@placeholder='Enter Description']")
	public WebElement txtDescription;
	@FindBy(xpath = "//button[@id='ngb-typeahead-4-2']")
	public WebElement btnMumbai;
	@FindBy(xpath = "//div[@class='alert-icon confirm-icon-bg']")
	public WebElement popupInformation;
	@FindBy(xpath = "//div[@class='CandidateRelationshipTableHeight']/table")
	public WebElement candidatetable;
	By gridCandidateTable=By.xpath("//div[@class='CandidateRelationshipTableHeight']/table");
	
	

	public void clickOnCandidatePool() throws InterruptedException {
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", candidatePool);
		Thread.sleep(3000);
		
		//Assert.assertEquals(popupInformation.isDisplayed(),true);
		//common.clickOnOKBtn();
	}
	public void clickOnAddCandidate() throws InterruptedException {
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", addCandidate);

	}
	public void addCandidate() throws AWTException, InterruptedException{
		executor.executeScript("arguments[0].click();", email);
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);
		name="CandidateNew"+ randomInt +"@gmail.com";
		 email.sendKeys(name);  
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", btnFind);
		Thread.sleep(3000);
		txtname.sendKeys(name);
		Thread.sleep(3000);
		txtexperience.sendKeys("3");
		Thread.sleep(3000);
		txtCTC.sendKeys("400000");
		Thread.sleep(3000);
		txtTag.sendKeys("New Candidate");
		Thread.sleep(3000);
		txtDescription.sendKeys("New candidate Added");
		Thread.sleep(3000);
		addcandidatepage.uploadResumeDocument();
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", txtdesignation);
		txtdesignation.sendKeys("ABAP Developer");
		Thread.sleep(3000);
		txtContactNumber.sendKeys("1231231234");
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", txtNoticePeriod);
		Thread.sleep(3000);
		txtNoticePeriod.sendKeys("30"+Keys.SPACE);
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", calenderIcon);
		common.enterdate("01/11/2021");	
		Thread.sleep(3000);
		
		se=new Select(selLookingForjob);
		se.selectByVisibleText("No");
		txtECTC.sendKeys("600000");
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", txtdesignation);
		txtCity.sendKeys("Mumbai");
		Thread.sleep(3000);
		common.ClickSumbit();
		Thread.sleep(3000);

	}
	public void assertValues() throws InterruptedException {
		Thread.sleep(10000);
		WebElement element=common.selectTableForSpecficColumn(gridCandidateTable, gridCandidateTable, "Name", name, 8);
		String value=element.getText().trim();
		Assert.assertTrue(value.equals("ABAP Developer"));
		Thread.sleep(3000);
		WebElement element1=common.selectTableForSpecficColumn(gridCandidateTable, gridCandidateTable, "Name", name, 3);
		String value1=element1.getText().trim();
		Assert.assertTrue(value1.equals("New Candidate"));
		Thread.sleep(3000);
		WebElement element2=common.selectTableForSpecficColumn(gridCandidateTable, gridCandidateTable, "Name", name, 10);
		String value2=element2.getText().trim();
		Assert.assertTrue(value2.equals("400000"));
		Thread.sleep(3000);
		WebElement element3=common.selectTableForSpecficColumn(gridCandidateTable, gridCandidateTable, "Name", name, 11);
		String value3=element3.getText().trim();
		Assert.assertTrue(value3.equals("600000"));

	}
	
}
