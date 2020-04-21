package pages;

import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class EditJobPage extends baseclass {
	
	
	
	
	
	public EditJobPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

}
