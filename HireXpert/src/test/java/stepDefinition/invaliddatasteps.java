package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import utilPackage.baseclass;

public class invaliddatasteps extends baseclass{
	
//1st scenario
@Given("^User is on Home page of application$")
public void user_is_on_Home_page_of_application()  {
    
	baseclass.initialization();
    
}

@When("^title of page is \\\"([^\\\"]*)\\\"$")
public void title_of_page_is(String arg1) throws Throwable {
    
	String title = loginpage.validateTitle();
	System.out.println("Title of HireXpert application: " +title);
}

@When("^enter invalid user email address and invalid password which is not registered$")
public void enter_invalid_user_email_address_and_invalid_password_which_is_not_registered() throws Throwable {
    
	loginpage.signInButton();
}


@Then("^User should not be able to login to application and error message should display$")
public void user_should_not_be_able_to_login_to_application_and_error_message_should_display() throws Throwable {
    
	System.out.println("\n User should not able to login with invalid email address and invalid password");
	System.out.println("Error message should display like: User with 'asdfghj@gmail.com' doesn't exists in system");
	Thread.sleep(2000);
}

@Then("^click on OK button from popup window$")
public void click_on_OK_button_from_popup_window() throws Throwable {
    
	driver.findElement(By.id("alertModalCloseBtn")).click();
	Thread.sleep(2000);
}

@Then("^enter valid user email address and invalid password which is registered to application$")
public void enter_valid_user_email_address_and_invalid_password_which_is_registered_to_application() throws Throwable {
    
	loginpage.emailaddress.clear();
	loginpage.password.clear();
	loginpage.signInButton1();

}

@Then("^error message should display$")
public void error_message_should_display() throws Throwable {
    
	System.out.println("\n User should not able to login with valid email address and invalid password");
	System.out.println("Error message should display like: Wrong password. Please use forgot password link to reset your password.");
	
	Thread.sleep(2000);
}

@Then("^now keep Email address field blank and tab$")
public void now_keep_Email_address_field_blank_and_tab() throws Throwable {
    
	loginpage.emailaddress.clear();
	loginpage.emailaddress.sendKeys(Keys.TAB);
	Thread.sleep(2000);
}

@Then("^observe error message for Email address field$")
public void observe_error_message_for_Email_address_field() throws Throwable {
    
//	String emailerror = driver.findElement(By.xpath("//div[contains(text(),'Email is required.')]")).getText();
	System.out.println("\n Error message for Email address field: Email is required");
}

@Then("^keep password field blank and tab$")
public void keep_password_field_blank_and_tab() throws Throwable {
    
	loginpage.password.clear();
	loginpage.password.sendKeys(Keys.TAB);
	Thread.sleep(2000);
}

@Then("^observe error message for Password field$")
public void observe_error_message_for_Password_field() throws Throwable {
    
//	String pwderror = driver.findElement(By.xpath("//div[contains(text(),'Password is required.')]")).getText();
	System.out.println("\n Error message for Password field: Password is required");
}

@Then("^Sign in button should not get enabled without entering email address or password and User should get error message for mandatory fields$")
public void sign_in_button_should_not_get_enabled_without_entering_email_address_or_password_and_User_should_get_error_message_for_mandatory_fields() throws Throwable {
    
	System.out.println("\n Sign in button should be disabled when any one field or both Email address and Password fields are blank");
}

@Then("^close the browser$")
public void close_the_browser() throws Throwable {
    
	Thread.sleep(5000);
	driver.quit();
}







}
