package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilPackage.baseclass;

public class ShareWithAgencyPage extends baseclass {
	
	
	boolean emp;
	String Sharedteam;
	String teamMemberName;
	
	
	@FindBy(xpath = "//ng-select[@formcontrolname='Name']//input")
	public WebElement name;
	
	@FindBy(xpath = "//span[@class='checkmark CheckBoxM']")
	public WebElement shareCheckbox;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	public WebElement isBlockUnblockSelected;
	
	@FindBy(xpath = "(//span[@class='checkmark CheckBoxM'])[2]")
	public WebElement blockUnblockCheckbox;
	
	@FindBy(xpath = "//button[@title='Share With Agency']")
	public WebElement shareWithAgency;
	
	
	
	
	
	public ShareWithAgencyPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void shareWithAgency(String agyName) throws InterruptedException
	{
		explicitwait.until(ExpectedConditions.elementToBeClickable(sharewithagencypage.name));
		sharewithagencypage.name.sendKeys(agyName);
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//span[contains(text(),'"+agyName+"')]")).click();
		Thread.sleep(2000); 
		common.share.click();
		common.clickOnConfirmYes();
		common.shareFlag=1;
	}
	
	public void blockAgency() throws InterruptedException
	{
		boolean isBlockUnblockSelected=sharewithagencypage.isBlockUnblockSelected.isSelected();
		if(isBlockUnblockSelected==false)
		{
			Thread.sleep(1000);
			sharewithagencypage.blockUnblockCheckbox.click();
			common.clickOnConfirmYes();
		}
	}
	
	public void unblockAgency() throws InterruptedException
	{
		boolean isBlockUnblockSelected=sharewithagencypage.isBlockUnblockSelected.isSelected();
		if(isBlockUnblockSelected==true)
		{
			Thread.sleep(1000);
			sharewithagencypage.blockUnblockCheckbox.click();
			common.clickOnConfirmYes();
		}
	}

}
