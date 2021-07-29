package BVT_StepDefination;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class ForgetPasswordStepDefination extends baseclass {

	public ForgetPasswordStepDefination() throws IOException {

		super();

	}

	@Given("^Navigate to Hirexpert Application$")
	public void navigate_to_Hirexpert_Application() throws Throwable {
		baseclass.initialization();
		driver.navigate().refresh();
		Thread.sleep(4000);
		forgetpasswordpage.ClickonForgetPasswordLink();
	}

	@When("^User click forgot Password link on the login page\\.$")
	public void user_click_forgot_Password_link_on_the_login_page() throws Throwable {
		explicitwait.until(ExpectedConditions.visibilityOf(forgetpasswordpage.ForgotPasswordLink));
		forgetpasswordpage.ForgotPasswordLink.click();
	}

	@When("^Enter an  email id and Click on the Submit button\\.\"([^\"]*)\"$")
	public void enter_an_email_id_and_Click_on_the_Submit_button(String Username) throws Throwable {

		forgetpasswordpage.EmailAddress(Username);
		forgetpasswordpage.clickOnSendPasswordOnEmail();
	}

	@Then("^User get an message \"([^\"]*)\"$")
	public void user_get_an_message(String arg1) throws Throwable {
		explicitwait.until(ExpectedConditions.visibilityOf(forgetpasswordpage.lnkPass));
		Assert.assertEquals(forgetpasswordpage.lnkPass.isDisplayed(), true);
		forgetpasswordpage.clickOnClose();
	}

	@Then("^Users should get an email with a new password\\. \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void users_should_get_an_email_with_a_new_password(String Username1, String Password1, String Username,String Username2) throws Throwable {

		registerpage.clickLogin();
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginInNew(Username1, Password1);
		forgetpasswordpage.clickOnAnalysis();
		forgetpasswordpage.clickOnEmailHistory();
		forgetpasswordpage.clickOnSearch();
			
		if(forgetpasswordpage.searchToEmail.isDisplayed())
		{
			forgetpasswordpage.searchToEmail.sendKeys(Username);
			forgetpasswordpage.clickOnSearch();
			
			String userNameToCheck = Username.toLowerCase();
			WebElement gridRowElement = driver.findElement(By.xpath("//th[contains(text(),'Sent To Email')]//following::td[contains(text(),'"+userNameToCheck+"')]"));
			String gridUsername = gridRowElement.getText();
            Assert.assertEquals(userNameToCheck, gridUsername);
		}		
		loginpage.logoutFromAppK();
	}



	@And("^Users should not be able to login with an old password\\.\"([^\"]*)\",\"([^\"]*)\"$")
	public void users_should_not_be_able_to_login_with_an_old_password(String Username, String Password2)
			throws Throwable {
		registerpage.clickLogin();
		Thread.sleep(2000);
		loginpage.ClickOnEmployerAgencySigninLink();
		// registerpage.clickEmployerAgencySignInlink();
		explicitwait.until(ExpectedConditions.elementToBeClickable(resetPage.winWelcome));

		Assert.assertEquals(resetPage.winWelcome.isDisplayed(), true);
		Thread.sleep(2000);
		loginpage.loginInNew(Username, Password2);
		Thread.sleep(3000);
		explicitwait.until(ExpectedConditions.elementToBeClickable(resetPage.password));
		Assert.assertEquals(resetPage.password.isDisplayed(), true);
		Thread.sleep(3000);

	}

	@Then("^Users should be able to login with a new password\\.\"([^\"]*)\"$")
	public void users_should_be_able_to_login_with_a_new_password(String Password) throws Throwable {

		resetPage.password.clear();
		Thread.sleep(2000);
		resetPage.password.sendKeys(Password);
		Thread.sleep(2000);
		loginpage.signin.click();
		Thread.sleep(5000);
	}

	@Given("^User Navigate  to HireXpert$")
	public void user_Navigate_to_HireXpert() throws Throwable {
		baseclass.initialization();
		driver.navigate().refresh();
		Thread.sleep(4000);
		registerpage.clickLogin();
		Thread.sleep(2000);
		loginpage.ClickOnEmployerAgencySigninLink();

		// registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(2000);
	}

	@When("^User  login into wrong email id and password\\.\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_login_into_wrong_email_id_and_password(String Username, String Password) throws Throwable {
		Thread.sleep(2000);
		loginpage.loginInNew(Username, Password);
		Thread.sleep(3000);

	}

	@Then("^Job provider gets  an Error message “ user with e(\\d+)gmail\\.com” doesn't exist in the system\\.$")
	public void job_provider_gets_an_Error_message_user_with_e_gmail_com_doesn_t_exist_in_the_system(int arg1)
			throws Throwable {

		explicitwait.until(ExpectedConditions.elementToBeClickable(forgetpasswordpage.lnkWrongEmail));
		Assert.assertEquals(forgetpasswordpage.lnkWrongEmail.isDisplayed(), true);
		Thread.sleep(3000);
	}

	@Given("^Navigate to HireXpert$")
	public void navigate_to_HireXpert() throws Throwable {
		baseclass.initialization();
		driver.navigate().refresh();
		Thread.sleep(4000);
		registerpage.clickLogin();
		Thread.sleep(2000);
		loginpage.ClickOnEmployerAgencySigninLink();

		// registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(2000);
	}

	@When("^User login with valid email id and password\\.\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_login_with_valid_email_id_and_password(String Username, String Password) throws Throwable {
		Thread.sleep(2000);
		loginpage.loginInNew(Username, Password);
		Thread.sleep(3000);
	}

	@Given("^candidate Navigate to HireXpert$")
	public void candidate_Navigate_to_HireXpert() throws Throwable {
		baseclass.initialization();
		driver.navigate().refresh();
		Thread.sleep(4000);
		registerpage.clickLogin();
		Thread.sleep(2000);

	}

	@Then("^Users should be able to see a dashboard page\\.$")
	public void users_should_be_able_to_see_a_dashboard_page() throws Throwable {

		assertTrue(driver.getTitle().contains("HireXpert"));
	}

	@When("^User login with valid candidate email id and password\\.\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_login_with_valid_candidate_email_id_and_password(String Username, String Password)
			throws Throwable {

		homepage.clickJobseekerCandidateSignInlinklink();
		Thread.sleep(2000);
		loginpage.loginInNew(Username, Password);
		Thread.sleep(5000);

	}

	@Given("^admin creates new support user \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void admin_creates_new_support_user(String Name, String Email, String ContactNumber, String UserType,
			String Country, String TimeZone) throws Throwable {

		if (adminUserPage.getadminNewUserMenu().isDisplayed()) {
			executor.executeScript("arguments[0].click();", adminUserPage.getadminNewUserMenu());
			if (adminUserPage.checkAdminAddMemberPopUp()) {
				adminUserPage.getName().sendKeys(Name);
				adminUserPage.getEmail().sendKeys(Email);
				adminUserPage.getContactNumber().sendKeys(ContactNumber);
				Select usertype = new Select(adminUserPage.getUserType());
				usertype.selectByVisibleText(UserType);

				WebDriverWait w = new WebDriverWait(driver, 10);
				try {
					w.until(ExpectedConditions.presenceOfNestedElementsLocatedBy(
							By.xpath("//select[@formcontrolname='countryId']"), By.tagName("option")));
					WebElement l = driver.findElement(By.xpath("//select[@formcontrolname='countryId']"));
					Select s = new Select(l);
					s.selectByVisibleText(Country);
				} catch (Exception e) {
					System.out.println("Options not available");
				}
				common.ClickSumbit();
				common.clickOnOKBtn();
			}
		}
	}

	@Given("^Logout from admin user login$")
	public void logout_from_admin_user_login() throws Throwable {
		loginpage.logoutFromAppK();
		Thread.sleep(2000);
		if (common.okbtnPopup.size() > 0) {
			common.clickOnOKBtn();
		}
	}
	

}
