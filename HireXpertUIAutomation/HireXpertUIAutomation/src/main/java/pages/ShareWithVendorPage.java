package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import utilPackage.baseclass;

public class ShareWithVendorPage extends baseclass{
	
	public ShareWithVendorPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[@class='checkmark CheckBoxM'])[2]")
	public WebElement blockUnblockCheckboxTeam;
		
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	public WebElement isBlockUnblockSelected;
	
	@FindBy(xpath = "//ng-select[@formcontrolname='Name']//input")
	public WebElement selectVendor;
	
	public void shareWithVendor(String Vendor) throws InterruptedException
	{
		Thread.sleep(4000);
//		explicitwait.until(ExpectedConditions.elementToBeClickable(sharewithagencypage.name));
		selectVendor.sendKeys(Vendor);
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//span[contains(text(),'"+Vendor+"')]")).click();
		Thread.sleep(2000); 
		common.share.click();
		common.clickOnConfirmYes();
	}
	
	public void blockVendor(String vendor) throws InterruptedException
	{
		boolean isBlockUnblockSelected=sharewithagencypage.isBlockUnblockSelected.isSelected();
		if(isBlockUnblockSelected==false)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//td[text()='"+vendor+"']//following::span[@class='checkmark CheckBoxM'][2]")).click();
			common.addBlockComment();
			common.ClickSumbit();
			Assert.assertEquals(driver.findElement(By.xpath("//td[text()='"+vendor+"']//following::input[2]")).isSelected(), true);
			
		}
	}
	
	public void unblockVendor(String vendor) throws InterruptedException
	{
		boolean isBlockUnblockSelected=sharewithagencypage.isBlockUnblockSelected.isSelected();
		if(isBlockUnblockSelected==true)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//td[text()='"+vendor+"']//following::span[@class='checkmark CheckBoxM'][2]")).click();
			common.clickOnConfirmYes();
			Assert.assertEquals(driver.findElement(By.xpath("//td[text()='"+vendor+"']//following::input[2]")).isSelected(), false);
		}
	}

}
