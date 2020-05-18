package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class EditCandidatePage extends baseclass {
	
	@FindBy(id = "ContactNumber")
	public WebElement contactNumber;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/job-applicant-component/div[3]/button[2]")
	public WebElement saveButton;
	
	@FindBy(id = "confirmModalBtn")
	public WebElement yesButtonProbabilityPopup;
	
	@FindBy(id = "NoticePeriod")
	public WebElement noticePeriod;
	
	Robot rb;
	
	public EditCandidatePage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void EnterContactNumberT(String ContactNumber) {
		 
		contactNumber.clear();
		contactNumber.sendKeys(ContactNumber); 
	 }
	
	public void EnterNoticePeriodT(String NoticePeriod) {
		 
		noticePeriod.clear();
		noticePeriod.sendKeys(NoticePeriod); 
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

}
