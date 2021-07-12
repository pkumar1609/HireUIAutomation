package pages;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilPackage.baseclass;

public class Commonfunction extends baseclass {

	public Commonfunction() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String DisplayDate;
	public String monthName;
	public int shareFlag;
	
	@FindBy(xpath="//button[@id='confirmModalBtn']")
	public WebElement confimYes;
	
	@FindBy(xpath="//button[@id='alertModalCloseBtn']")
	public WebElement okbtn;
	
	@FindBy(xpath="//button[@id='alertModalCloseBtn']")
	public List<WebElement> okbtnPopup;

	@FindBy(xpath="//button[text()='Close']")
	public WebElement closebtn;
	
	@FindBy(xpath = "//button[@type='button'][text()='Close']")
	public WebElement addClosebtn;
	
	@FindBy(xpath = "//button[text()='Save']")
	public WebElement savebtn;
	
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement submitbtn ;
	
	@FindBy(xpath = "(//button[text()='Submit'])[2]")
	public WebElement addSubmitbtn ;
	
	@FindBy(id = "confirmModalCloseBtn")
	public WebElement noButtonPopup;
	
	@FindBy(xpath = "//button[contains(text(), 'Search')]")
	public WebElement Search;
	
	@FindBy(xpath = "//button[contains(text(), 'Share') and @type='submit']")
	public WebElement share;
	
	@FindBy(xpath = "//button[text()='Find']")
	public WebElement find;
	
	@FindBy(xpath = "//button[text()='Logout']")
	public WebElement log_out;
	
	@FindBy(xpath = "//span[text()='×']")
	public WebElement crossIcon;
	
	@FindBy(xpath="//button[@class='btn btn-outline-danger']")
	public List<WebElement> deletebtn;
	
	@FindBy(xpath="//button[@class='btn Custom-btn mr-2']")
	public List<WebElement> editbtn;
	
	@FindBy(xpath="//button[text()='Logout']")
	public WebElement logout;
		
//	@FindBy(xpath="//input[@name= 'search-id']") // Old
	@FindBy(xpath="//all-jobs/div[2]/div[1]/input[@name= 'search-id']") //Dashboard Job section job search field.	
	public WebElement searchField;
	
	@FindBy(xpath="//button[text()='Apply']")
	public WebElement apply;
	
//	common fields
	
	@FindBy(xpath="//input[@formcontrolname='Name']")
	public WebElement  namefield;
	
	@FindBy(xpath="//input[@formcontrolname='Email']")
	public WebElement emailfield;
	
	@FindBy(xpath="//input[@formcontrolname='ContactNumber']")
	public WebElement contactnumberfield;
	
	@FindBy(xpath="//select[@formcontrolname='CountryId']")
	public WebElement countryid;
		
	@FindBy(xpath="//textarea[@placeholder='Enter Comment']")
	public WebElement CommentTextArea;
	
	@FindBy(xpath="//span[@class='close']")
	public WebElement closeIcon;
	
	
	WebDriverWait explicitwait = new WebDriverWait(driver,80);
	
	public void ClickonCrossIcon()
	{
		try
		{
			common.crossIcon.click();
		}
		catch(NoSuchElementException e)
		{}
	}
	
	public void clickOnSaveBtn() throws InterruptedException
	{
		Thread.sleep(5000);
		executor.executeScript("arguments[0].click();", savebtn);
	}
	
	public void clickOnEditCandidateDialogSaveBtn() throws InterruptedException
	{
		WebElement saveBtn = driver.findElement(By.xpath("(//button[text()='Save'])[2]"));			
		if(saveBtn.isDisplayed() && saveBtn.isEnabled())
		{
			executor.executeScript("arguments[0].click();", saveBtn);
		}
	}
	
	public void clickOnSearchBtn() throws InterruptedException
	{
		Thread.sleep(4000);
		executor.executeScript("arguments[0].click();", Search);
	}
	
	public void clickOnCloseBtn() throws InterruptedException
	{ 
		Thread.sleep(3000);
		executor.executeScript("arguments[0].scrollIntoView();", closebtn);
		Thread.sleep(4000);
//		closebtn.click();
		executor.executeScript("arguments[0].click();", closebtn);

	}
	
	public void clickOnAddClosebtn() throws InterruptedException
	{
		Thread.sleep(2000);
		addClosebtn.click();
	}
	public void clickOnConfirmYes() throws InterruptedException
	{
		Thread.sleep(4000);
		executor.executeScript("arguments[0].click();",confimYes);

//		confimYes.click();
	}
	
	public void clickOnOKBtn() throws InterruptedException
	{

		Thread.sleep(4000);
		executor.executeScript("arguments[0].click();",okbtn);
//		okbtn.click();

	}
	
	public void ClickSumbit() throws InterruptedException
	{
		Thread.sleep(4000);
		explicitwait.until(ExpectedConditions.visibilityOf(submitbtn));
		executor.executeScript("arguments[0].click();",submitbtn);
//		submitbtn.click(); 
	}
	
	public void clickNoButton() {
		
		noButtonPopup.click();
	}
	
	
	public void ClickReloadAllBtn() throws InterruptedException
	{
		WebElement reloadAllBtn = driver.findElement(By.xpath("//button[@title='Clear and Reload All' and text()='Reload All']"));			
		if(reloadAllBtn.isDisplayed() && reloadAllBtn.isEnabled())
		{
			executor.executeScript("arguments[0].click();", reloadAllBtn);
			common.clickOnConfirmYes();
		}
	}
	
	public void enterdate(String date) throws InterruptedException
	{
	        String[] values = date.split("/");
	        int day = Integer.parseInt(values[0]);
	        int month = Integer.valueOf(values[1]);   
	        int year = Integer.parseInt(values[2]);
	        switch(month){    
		    case 1: monthName= "Jan";  
		    break;    
		    case 2: monthName="Feb";  
		    break;    
		    case 3: monthName="Mar";  
		    break;    
		    case 4: monthName="Apr";  
		    break;    
		    case 5: monthName="May";  
		    break;    
		    case 6: monthName="Jun";  
		    break;    
		    case 7: monthName="Jul";  
		    break;    
		    case 8: monthName="Aug";  
		    break;    
		    case 9: monthName="Sep";  
		    break;    
		    case 10: monthName="Oct";  
		    break;    
		    case 11: monthName="Nov";  
		    break;    
		    case 12: monthName="Dec";  
		    break;
			}
	        Thread.sleep(1000);	
	        driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			driver.findElement(By.xpath("//button[@class='headerlabelbtn yearlabel']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='"+year+"']")).click();
			driver.findElement(By.xpath("//button[@class='headerlabelbtn monthlabel']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='"+monthName+"']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//td//span[text()='"+day+"']")).click();
		}
	
	public String displayDate(String Date)
	{
		String[] values = Date.split("/");
        int day = Integer.parseInt(values[0]);
        int month = Integer.valueOf(values[1]);   
        int year = Integer.parseInt(values[2]);
        switch(month){    
	    case 1: monthName= "Jan";  
	    break;    
	    case 2: monthName="Feb";  
	    break;    
	    case 3: monthName="Mar";  
	    break;    
	    case 4: monthName="Apr";  
	    break;    
	    case 5: monthName="May";  
	    break;    
	    case 6: monthName="Jun";  
	    break;    
	    case 7: monthName="Jul";  
	    break;    
	    case 8: monthName="Aug";  
	    break;    
	    case 9: monthName="Sep";  
	    break;    
	    case 10: monthName="Oct";  
	    break;    
	    case 11: monthName="Nov";  
	    break;    
	    case 12: monthName="Dec";  
	    break;
        }
		return day+"-"+monthName+"-"+year;
		
	}
	
	public void addComment() throws InterruptedException  {		
		explicitwait.until(ExpectedConditions.visibilityOf(CommentTextArea));
		CommentTextArea.sendKeys("Comment added to text area.");
	}
	
	public Hashtable<String, String> getTableColumnHeader(By weResultTableForThead) {
		Hashtable<String, String> dataColumnHeader = new Hashtable<String, String>();
		int intColumnNumber = 1;
		try {
			WebElement weResultTable = driver.findElement(weResultTableForThead);
			
			List<WebElement> weColumnsHeaders = weResultTable
					.findElements(By.xpath(".//thead//th"));
			for (WebElement weColumnHeader : weColumnsHeaders) {
				String strHeader = weColumnHeader.getText().trim();
				if (!strHeader.equals(""))
					dataColumnHeader.put(strHeader, String.valueOf(intColumnNumber));
				intColumnNumber++;
			}
			return dataColumnHeader;

		
		} catch (Exception exception) {
			exception.printStackTrace();
			return dataColumnHeader;
		}

	}
	
	public WebElement selectTableForSpecficColumn(By weResultTableForThead, By weResultTableForTbody,
			String columnHeaderNameForSearch, String textToSearch, int ColoumnIndex) {
		Hashtable<String, String> dataColumnHeader = new Hashtable<String, String>();
		try {
			dataColumnHeader = getTableColumnHeader(weResultTableForThead);
			WebElement weResultTable = driver.findElement(weResultTableForTbody);
			
			List<WebElement> weRows = weResultTable.findElements(By.xpath(".//tbody/tr"));
			for (WebElement weRow : weRows) {
				WebElement weExceptedClm = weRow.findElement(By.xpath(
						".//td[" + dataColumnHeader.get(columnHeaderNameForSearch.trim()) + "]"));
				if (weExceptedClm.getText().trim().contains(textToSearch.trim())) {
					WebElement weExceptedSpecificColoum = weRow
							.findElement(By.xpath(".//td[" + ColoumnIndex + "]"));
					return weExceptedSpecificColoum;
				}
			}
		
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
		return null;
	}


}

