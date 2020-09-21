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
	
	public void AssertCandidatedetails(DataTable credentials) throws Throwable 
	{
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
		Thread.sleep(5000);
		Assert.assertEquals(addcandidatepage.emailField.getAttribute("value"), data.get("CandidateEmail"));
		Assert.assertEquals(addcandidatepage.title.getAttribute("value"), addjobpage.jobname);
		Assert.assertEquals(addcandidatepage.name.getAttribute("value"), data.get("Name"));
		Assert.assertEquals(addcandidatepage.contactNumber.getAttribute("value"), data.get("ContactNumber"));
		Assert.assertEquals(addcandidatepage.designation.getAttribute("value"), data.get("Designation"));
		Assert.assertEquals(addcandidatepage.gender.getAttribute("value"),data.get("Gender"));
		Assert.assertEquals(addcandidatepage.communicationMode.getAttribute("value"), data.get("Communicationmode"));
		Assert.assertEquals(addcandidatepage.date.getAttribute("value"), data.get("Date"));
		select=new Select(addcandidatepage.onNoticePeriod);
		WebElement option = select.getFirstSelectedOption();
		Assert.assertEquals(option.getText(),data.get("OnNoticePeriod"));
		if(data.get("OnNoticePeriod").contentEquals("Yes"))
		{
		Assert.assertEquals(addcandidatepage.lastWorkingDay.getAttribute("value"), data.get("LastWorkingDay"));
		}
		else
		{
		Assert.assertEquals(addcandidatepage.noticePeriod.getAttribute("value"), data.get("NoticePeriod"));
		}
		Assert.assertEquals(addcandidatepage.experienceInYears.getAttribute("value"), data.get("experience"));
		Assert.assertEquals(addcandidatepage.ctc.getAttribute("value"), data.get("CTC")); 
		Assert.assertEquals(addcandidatepage.expectedCTC.getAttribute("value"), data.get("expectedCTC"));
		select=new Select(addcandidatepage.countryId);
		Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+data.get("Country")+" ");		
		Assert.assertEquals(addcandidatepage.city.getAttribute("value"), data.get("City"));
		Assert.assertEquals(addcandidatepage.cityArea.getAttribute("value"), data.get("CityArea"));
		Assert.assertEquals(addcandidatepage.zipCode.getAttribute("value"), data.get("ZipCode"));
		Assert.assertEquals(addcandidatepage.salaryOffered.getAttribute("value"), data.get("Salaryoffered"));
		Assert.assertEquals(addcandidatepage.distance.getAttribute("value"), data.get("distance"));
		select=new Select(addcandidatepage.isPermanentAddress);
		Assert.assertEquals(select.getFirstSelectedOption().getText(), data.get("permanentAddress"));	
		select=new Select(addcandidatepage.isReadyToRelocateToJobLocation);
		Assert.assertEquals(select.getFirstSelectedOption().getText(), data.get("relocate"));	
		 }
	}
	
	public void assertSkill(DataTable credentials) throws InterruptedException
	{
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
		Thread.sleep(4000);
		Assert.assertEquals(this.jobskill.get(0).getAttribute("value"), data.get("Skill1")+" ("+data.get("level1")+")");
		Assert.assertEquals(this.jobskill.get(1).getAttribute("value"), data.get("Skill2")+" ("+data.get("level2")+")");	
		Assert.assertEquals(this.jobskill.get(2).getAttribute("value"), data.get("Skill3")+" ("+data.get("level3")+")");	
		select=new Select(addcandidatepage.expertiselevel.get(0));
		Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+data.get("level1")+" ");
		select=new Select(addcandidatepage.expertiselevel.get(1));
		Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+data.get("level2")+" ");
		select=new Select(addcandidatepage.expertiselevel.get(2));
		Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+data.get("level3")+" ");
		if(data.get("certificate1").contentEquals("Yes"))
		{
		Assert.assertEquals(addcandidatepage.certificate.get(0).getAttribute("value"), data.get("certificateforskill1"));	
		}
		if(data.get("certificate2").contentEquals("Yes"))
		{
		Assert.assertEquals(addcandidatepage.certificate.get(1).getAttribute("value"), data.get("certificateforskill2"));	
		}
		if(data.get("certificate3").contentEquals("Yes"))
		{
		Assert.assertEquals(addcandidatepage.certificate.get(2).getAttribute("value"), data.get("certificateforskill1"));	
		}
		}
	}
}
