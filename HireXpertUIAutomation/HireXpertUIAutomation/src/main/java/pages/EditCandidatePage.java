package pages;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;
import utilPackage.utilclass;

public class EditCandidatePage extends baseclass {
	
	@FindBy(id = "ContactNumber")
	public WebElement contactNumber;
	
	@FindBy(xpath = "//div[@class='modal-footer']//button[@class='btn btn-primary Cbtn-primary']")
	public WebElement saveButton;
	
	@FindBy(id = "NoticePeriod")
	public WebElement noticePeriod;
	
	@FindBy(xpath = "//button[contains(@class,'btn Cbtn-primary w-5')][contains(text(),'Save')]")
	public WebElement SavebtntoSaveUpdatedDetailsOnUpdateCandidatePopup;
	
	
	
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
	
	

}
