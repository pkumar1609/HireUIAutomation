package pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.DataTable;
import utilPackage.baseclass;

public class InvoicePage extends baseclass{

	public InvoicePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@formcontrolname='InvoiceNumber']")
	public WebElement invoiceNumber;
	
	@FindBy(xpath = "//button[@aria-label=\"Open Calendar\"]")
	public WebElement joiningDateCalendarPicker;
	
	@FindBy(xpath = "(//button[@aria-label=\"Open Calendar\"])[2]")
	public WebElement InvoiceDateCalendarPicker;
	
	@FindBy(xpath = "(//button[@aria-label=\"Open Calendar\"])[3]")
	public WebElement DueDateCalendarPicker;
	
	@FindBy(xpath = "//input[@formcontrolname='Amount']")
	public WebElement amount;
	
	@FindBy(xpath = "//input[@formcontrolname='Tax']")
	public WebElement Tax;
	
	@FindBy(xpath = "//input[@formcontrolname='InvoiceAttachment']")
	public WebElement invoiceAttachment;
	
	@FindBy(xpath = "//textarea[@formcontrolname='Description']")
	public WebElement description;
	
	public void generateInvoice(DataTable credentials) throws InterruptedException
	{
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
		this.invoiceNumber.sendKeys(data.get("invoiceNumber"));
		this.amount.sendKeys(data.get("amount"));
		this.Tax.sendKeys(data.get("tax"));
		this.description.sendKeys(data.get("description"));
		this.invoiceAttachment.sendKeys(data.get("attachment"));
		Thread.sleep(2000);
		common.submitbtn.click();
		}		
	}
	

}
