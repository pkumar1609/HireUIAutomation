package pages;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class JobUpdatesPage extends baseclass {

	public JobUpdatesPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	
}