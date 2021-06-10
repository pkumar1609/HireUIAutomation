package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilPackage.baseclass;

public class ForgetPasswordPage  extends baseclass {
	

	@FindBy(xpath = "//li//a[contains(text(),'Forgot Password ')]")
	 public WebElement ForgotPasswordLink;
	@FindBy(xpath = "//h5[contains(text(),'Forgot Password')]")
	public WebElement winForgetPassword;
	
	@FindBy(xpath = "//p[contains(text(),'Your password have been reset and send to your registered email. Please check.')]")
	public WebElement lnkPass;
	@FindBy(xpath = "//button[contains(text(),'Sign in ')]//ancestor::form//p")
	public WebElement lnkWrongEmail;
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	public WebElement btnSubmit;
	@FindBy(xpath = "//span[@class='close']")
	public WebElement btnClose;
	@FindBy(xpath = "//input[@formcontrolname='Email']")
	public WebElement inpEmailAddress;
	@FindBy(xpath="//input[@placeholder='Email address']")
	public  WebElement LoginEmailField;
	@FindBy(xpath = "//li//a[contains(text(),'Analysis')][1]")
	public WebElement lnkAnalysis;
	@FindBy(xpath = "//li//a[contains(text(),'Email History')]")
	public WebElement lnkEmailHistory;
	@FindBy(xpath = "//button[contains(text(),' Search ')]")
	public WebElement btnSearch;
//	@FindBy(xpath="//button[text()='Submit']")
//	public WebElement SubmitBtn;
//	
//	@FindBy(xpath="//button[contains(text(),'OK')]")
//	 public WebElement OKBtn;
	
     public ForgetPasswordPage() {
		
		PageFactory.initElements(driver, this);

	}
	
	public void EnterNonregisteredEmailid(String emailid) {
		
		LoginEmailField.sendKeys(emailid);
	}
	
	public void ClickonForgetPasswordLink () throws InterruptedException {
		
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();",ForgotPasswordLink);

	}
	public void EmailAddress(String Username) throws Throwable {
		Thread.sleep(2000);
		inpEmailAddress.sendKeys(Username);
		
	}
	public void clickOnSubmit() throws Throwable {
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",btnSubmit);

	}
	public void clickOnClose() throws Throwable {
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",btnClose);

	}
	public void clickOnAnalysis() throws Throwable {
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",lnkAnalysis);

	}
	public void clickOnEmailHistory() throws Throwable {
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",lnkEmailHistory);

	}
	public void clickOnSearch() throws Throwable {
		Thread.sleep(4000);
		executor.executeScript("arguments[0].click();",btnSearch);

	}
	public void webTable(String colName,String colData) {
		
	
		// step 01-- Find the column index
		List<WebElement> colList =driver.findElements(By.xpath("//div[@class='PerformanceAnalysisTableHeight']//thead//tr//th"));
	System.out.println(colList.size());
	
	int columnIndex=0;
	for(int i=0;i<colList.size();i++) {
		System.out.println(colList.get(i).getText()); 
		if(colName.equalsIgnoreCase(colList.get(i).getText())) {
			columnIndex=i+1;
			break;
		}
	}
	System.out.println("Column Index : " +columnIndex );
	
	//Step 02-- verify column data in the table
	
	List<WebElement> noOfRows=driver.findElements(By.xpath("//div[@class='PerformanceAnalysisTableHeight']//tbody//tr"));
	System.out.println("Number Of rows : "+ noOfRows.size());
	
	boolean f=false;
	for(int i=1;i<=noOfRows.size();i++) {
		String value=driver.findElement(By.xpath("//div[@class='PerformanceAnalysisTableHeight']//tbody//tr["+i+"]//td["+columnIndex+"]")).getText();
	System.out.println(value);
	if(colData.equalsIgnoreCase(value)) {
		f=true;
		break;
		}
	}
	
	Assert.assertTrue(f,"value verification");
	}
	
	
}











