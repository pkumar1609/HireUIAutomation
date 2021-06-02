package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilPackage.baseclass;

public class CvParserPage extends baseclass {

	public CvParserPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath= "//select[@id='jobDropdown']")
	public WebElement cvParserSelectJobDropDown ;
	
	@FindBy(xpath= "//input[@formcontrolname='File']")
	public WebElement cvParserSelectIndustryDropDown ;
	
	@FindBy(xpath= "//button[@title='Add Job']")
	public WebElement cvParserAddJobBtn ;
	
	
}
