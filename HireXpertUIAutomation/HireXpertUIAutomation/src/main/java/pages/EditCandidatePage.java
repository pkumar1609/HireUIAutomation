package pages;

import org.testng.Assert;

import cucumber.api.DataTable;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import junit.framework.Assert;
import utilPackage.baseclass;
import utilPackage.utilclass;

public class EditCandidatePage extends baseclass {
	
	@FindBy(id = "ContactNumber")
	public WebElement contactNumber;
	
	@FindBy(xpath = "//div[@class='modal-footer']//button[@class='btn btn-primary Cbtn-primary']")
	public WebElement saveButton;
	
	@FindBy(id = "NoticePeriod")
	public WebElement noticePeriod;
	
	@FindBy(xpath = "(//button[text()='Save'])[2]")
	public WebElement SavebtntoSaveUpdatedDetailsOnUpdateCandidatePopup;
	
	@FindBy(xpath = "//select[@formcontrolname='ServingNoticePeriod']")
	public WebElement onnoticePeriod;
	
	@FindBy(xpath = "//input[@placeholder='Skill']")
	public List<WebElement> jobskill;
	
	Robot rb;
	
	public EditCandidatePage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void EnterContactNumberT(String contactnumber) {
		 
		contactNumber.clear();
		contactNumber.sendKeys(contactnumber); 
	 }
	
	public void ClickOnSaveBtntoSavetheupdatedDetails() {
		 
		SavebtntoSaveUpdatedDetailsOnUpdateCandidatePopup.click();

	 }
	
	public void EnterNoticePeriodT(String noticeperiod) {
		 
		noticePeriod.clear();
		noticePeriod.sendKeys(noticeperiod); 
	 }
	
	public void uploadResumeExecutableFile() throws AWTException {
		
		rb = new Robot();
		rb.setAutoDelay(2000);
		
		StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\Firefox Installer.exe");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.setAutoDelay(3000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);   
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.setAutoDelay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);   
		rb.setAutoDelay(3000);
	}
	
	public void uploadResumeZipFile() throws AWTException {
		
		rb = new Robot();
		rb.setAutoDelay(2000);
		
		StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\AutomationHirexpert.zip");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.setAutoDelay(3000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);   
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.setAutoDelay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);   
		rb.setAutoDelay(3000);
	}
	
	public void uploadResumePDFFile() throws AWTException {
		
		rb = new Robot();
		rb.setAutoDelay(2000);
		
		StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\Sayali_Ambekar_Resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.setAutoDelay(3000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);   
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.setAutoDelay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);   
		rb.setAutoDelay(3000);
	}
	
	public void uploadResumeTextFile() throws AWTException {
		
		rb = new Robot();
		rb.setAutoDelay(2000);
		
		StringSelection ss = new StringSelection("D:\\automation testing\\HireXpert\\execution time.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.setAutoDelay(3000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);   
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.setAutoDelay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);   
		rb.setAutoDelay(3000);
	}
	
	public void uploadResumePNGFile() throws AWTException {
		
		rb = new Robot();
		rb.setAutoDelay(2000);
		
		StringSelection ss = new StringSelection("D:\\automation testing\\HireXpert\\add & edit job.PNG");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.setAutoDelay(3000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);   
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.setAutoDelay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);   
		rb.setAutoDelay(3000);
	}
	
	public void observeOneDeletedSkill() throws InterruptedException {
		
		String sk2Exp2 = addjobpage.skill2Exp2;
		System.out.println("\nDeleted skill2: " + sk2Exp2);
		Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		String xpath_start_sk2Exp2 = "//*[@id=\"ng-invalidDiv\"]/tr[";
		String xpath_end_sk2Exp2 = "]/td[1]/input[1]";
		
		int i = 1; 
		
		while(isElementPresent(xpath_start_sk2Exp2+i+xpath_end_sk2Exp2)) {
			
			String s02 = driver.findElement(By.xpath(xpath_start_sk2Exp2+i+xpath_end_sk2Exp2)).getText();
			
			if(s02.equalsIgnoreCase(sk2Exp2)) {
				
				System.out.println("\nDeleted skill found..");
			}
			else {
				
				System.out.println("\nDeleted skill not found..");
			}
			
			i++;
		}
		
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	public boolean isElementPresent(String elementXpath) {
		
		int count = driver.findElements(By.xpath(elementXpath)).size();
		
		if(count==0)
			return false;
		else
			return true;
	}
	
	public void AssertCandidatedetails(String Username, String CandidateEmail, String profiletitle, String Name, String ContactNumber, String Designation, String Date, String Gender, String OnNoticePeriod, String NoticePeriod, String LastWorkingDay, String experience, String CTC, String expectedCTC, String Country, String City, String CityArea, String ZipCode, String Communicationmode) throws Throwable 
	{
		Thread.sleep(5000);
		Assert.assertEquals(addcandidatepage.emailField.getAttribute("value"), CandidateEmail);
		Assert.assertEquals(addcandidatepage.title.getAttribute("value"), profiletitle);
		Assert.assertEquals(addcandidatepage.name.getAttribute("value"), Name);
		Assert.assertEquals(addcandidatepage.contactNumber.getAttribute("value"), ContactNumber);
		Assert.assertEquals(addcandidatepage.designation.get(0).getAttribute("value"), Designation);
		Assert.assertEquals(addcandidatepage.gender.getAttribute("value"),Gender);
		Assert.assertEquals(addcandidatepage.communicationMode.getAttribute("value"), Communicationmode);
		Assert.assertEquals(driver.findElement(By.xpath("(//input[@placeholder='Select Date']//following::p)[1]")).getText(), Date);
		select=new Select(addcandidatepage.onNoticePeriod);
		WebElement option = select.getFirstSelectedOption();
		Assert.assertEquals(option.getText(),OnNoticePeriod);
		if(OnNoticePeriod.contentEquals("Yes"))
		{
//		Assert.assertEquals(driver.findElement(By.xpath("(//input[@placeholder='Select Date']//following::p)[2]")).getText(), LastWorkingDay);
		}
		else
		{
		Assert.assertEquals(addcandidatepage.noticePeriod.getAttribute("value"), NoticePeriod);
		}
		Assert.assertEquals(addcandidatepage.experienceInYears.getAttribute("value"), experience);
		Assert.assertEquals(addcandidatepage.ctc.getAttribute("value"), CTC); 
		Assert.assertEquals(addcandidatepage.expectedCTC.getAttribute("value"), expectedCTC);
		select=new Select(addcandidatepage.countryId);
		Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+Country+" ");		
		Assert.assertEquals(addcandidatepage.city.getAttribute("value"), City);
		Assert.assertEquals(addcandidatepage.cityArea.getAttribute("value"), CityArea);
		Assert.assertEquals(addcandidatepage.zipCode.getAttribute("value"), ZipCode);
		 
	} 
	
	public void AssertprobabiltyFields(String Salaryoffered, String distance, String permanentAddress, String relocate)
	{
		Assert.assertEquals(addcandidatepage.salaryOffered.getAttribute("value"), Salaryoffered);
		Assert.assertEquals(addcandidatepage.distance.getAttribute("value"), distance);
		select=new Select(addcandidatepage.isPermanentAddress);
		Assert.assertEquals(select.getFirstSelectedOption().getText(), permanentAddress);	
		select=new Select(addcandidatepage.isReadyToRelocateToJobLocation);
		Assert.assertEquals(select.getFirstSelectedOption().getText(), relocate);		
	}
	
	
	public void assertSkill(String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String certificate1, String certificate2, String certificate3, String certificateforskill1, String certificateforskill2) throws InterruptedException{

		Thread.sleep(4000);
		Assert.assertEquals(this.jobskill.get(0).getAttribute("value"), Skill1+" ("+level1+")");
		Assert.assertEquals(this.jobskill.get(1).getAttribute("value"), Skill2+" ("+level2+")");	
		Assert.assertEquals(this.jobskill.get(2).getAttribute("value"), Skill3+" ("+level3+")");	
		select=new Select(addcandidatepage.expertiselevel.get(0));
		Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+level1+" ");
		select=new Select(addcandidatepage.expertiselevel.get(1));
		Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+level2+" ");
		select=new Select(addcandidatepage.expertiselevel.get(2));
		Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+level3+" ");
		if(certificate1.contentEquals("Yes"))
		{
		Assert.assertEquals(addcandidatepage.certificate.get(0).getAttribute("value"), certificateforskill1);	
		}
		if(certificate2.contentEquals("Yes"))
		{
		Assert.assertEquals(addcandidatepage.certificate.get(1).getAttribute("value"), certificateforskill2);	
		}
		if(certificate3.contentEquals("Yes"))
		{
		Assert.assertEquals(addcandidatepage.certificate.get(2).getAttribute("value"), certificateforskill1);	
		}
		
	}
}
