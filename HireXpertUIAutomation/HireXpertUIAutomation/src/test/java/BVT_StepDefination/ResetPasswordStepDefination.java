package BVT_StepDefination;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class ResetPasswordStepDefination extends baseclass {


	public ResetPasswordStepDefination() throws IOException {

		super();

	}

	@Given("^user login to HireXpert \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_login_to_HireXpert(String Username, String Password) throws Throwable {
		baseclass.initialization();
		driver.navigate().refresh();
		Thread.sleep(4000);
		registerpage.clickLogin();
		Thread.sleep(2000);
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(2000);
		loginpage.loginInNew(Username, Password);
		Thread.sleep(5000);


		explicitwait.until(ExpectedConditions.visibilityOf(resetPage.myAccount));
		resetPage.clickOnMyAccount();

		Thread.sleep(3000);
	}

	@When("^when the user clicks on the change password on the profile window$")
	public void when_the_user_clicks_on_the_change_password_on_the_profile_window() throws Throwable {
		resetPage.clickOnChangePassword();
		explicitwait.until(ExpectedConditions.visibilityOf(resetPage.ChangePasswordWin));
		Assert.assertEquals(resetPage.ChangePasswordWin.isDisplayed(), true);
	}

	@When("^The change password pop up window appears, and the user fills all the data \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void the_change_password_pop_up_window_appears_and_the_user_fills_all_the_data(String curPassword,
			String nPassword, String conPassword) throws Throwable {
		Thread.sleep(3000);
		resetPage.txtCurrentPassword(curPassword);
		Thread.sleep(3000);
		resetPage.txtNewPassword(nPassword);
		Thread.sleep(3000);
		resetPage.txtConfirmPassword(conPassword);
	}

	@When("^clicks on the submit button$")
	public void clicks_on_the_submit_button() throws Throwable {
		resetPage.clickOnSubmit();
	}

	@When("^Successful pop-up message dispaly as \"([^\"]*)\" with OK button$")
	public void successful_pop_up_message_dispaly_as_with_OK_button(String arg1) throws Throwable {
		explicitwait.until(ExpectedConditions.visibilityOf(resetPage.popSucess));

		Assert.assertEquals(resetPage.popSucess.isDisplayed(), true);
		Thread.sleep(2000);
		resetPage.clickOnOK();
	}

	@Then("^Logout from myAccount$")
	public void logout_as_a_support_user() throws Throwable {
		Thread.sleep(3000);
		explicitwait.until(ExpectedConditions.elementToBeClickable(loginpage.myAccount));
		Action.moveToElement(loginpage.myAccount).click().perform();
		Thread.sleep(2000);
		loginpage.Logout.click();
		explicitwait.until(ExpectedConditions.elementToBeClickable(resetPage.winRateUS));

		Assert.assertEquals(resetPage.winRateUS.isDisplayed(), true);
		resetPage.Logout.click();

		Thread.sleep(5000);

	}
	@Then("^Users should not be able to login with an old password \"([^\"]*)\",\"([^\"]*)\"$")
	public void users_should_not_be_able_to_login_with_an_old_password(String Username1, String Password1) throws Throwable {

		registerpage.clickLogin();
		Thread.sleep(2000);
		registerpage.clickEmployerAgencySignInlink();
		explicitwait.until(ExpectedConditions.elementToBeClickable(resetPage.winWelcome));

		Assert.assertEquals(resetPage.winWelcome.isDisplayed(), true);
		Thread.sleep(2000);
		loginpage.loginInNew(Username1, Password1);
		Thread.sleep(3000);
		explicitwait.until(ExpectedConditions.elementToBeClickable(resetPage.password));
		Assert.assertEquals(resetPage.password.isDisplayed(), true);
		Thread.sleep(3000);
	}


	@Then("^Users should be able to login with a new password \"([^\"]*)\"$")
	public void users_should_be_able_to_login_with_a_new_password(String Password) throws Throwable {
		resetPage.password.clear();
		Thread.sleep(2000);
		resetPage.password.sendKeys(Password);
		Thread.sleep(2000);
		loginpage.signin.click();
		Thread.sleep(5000);
	}

	@Given("^Candididate login to HireXpert \"([^\"]*)\",\"([^\"]*)\"$")
	public void candididate_login_to_HireXpert(String Username, String Password) throws Throwable {
		baseclass.initialization();
		driver.navigate().refresh();
		Thread.sleep(4000);
		registerpage.clickLogin();
		Thread.sleep(2000);
		homepage.clickJobseekerCandidateSignInlinklink();
		Thread.sleep(2000);
		loginpage.loginInNew(Username, Password);
		Thread.sleep(5000);
		String hometitle = driver.getTitle();

		explicitwait.until(ExpectedConditions.visibilityOf(resetPage.myAccount));
		resetPage.clickOnMyAccount();

		Thread.sleep(3000);

	}


	@Given("^User login into HireXpert \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_login_into_HireXpert(String Username, String Password) throws Throwable {
		baseclass.initialization();
		driver.navigate().refresh();
		Thread.sleep(4000);
		registerpage.clickLogin();
		Thread.sleep(2000);
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(2000);
		loginpage.loginInNew(Username, Password);
		Thread.sleep(5000);
		String hometitle = driver.getTitle();

		explicitwait.until(ExpectedConditions.visibilityOf(resetPage.myAccount));
		resetPage.clickOnMyAccount();

		Thread.sleep(3000);

	}
	@When("^User clicks the ChangeLoginEmail   option on the profile  window$")
	public void user_clicks_the_ChangeLoginEmail_option_on_the_profile_window() throws Throwable {

		resetPage.btnChangeEmail.click();
		explicitwait.until(ExpectedConditions.elementToBeClickable(resetPage.winChangeEmail));
		Assert.assertEquals(resetPage.winChangeEmail.isDisplayed(), true);

	}

	@When("^The Change  Login Email  pop up window appears , fill the  data click on submit button \"([^\"]*)\",\"([^\"]*)\"$")
	public void the_Change_Login_Email_pop_up_window_appears_fill_the_data_click_on_submit_button(String Username, String Password) throws Throwable {
		Thread.sleep(2000);
		resetPage.inpChangeEmail.sendKeys(Username);
		Thread.sleep(2000);
		resetPage.password.sendKeys(Password);
		Thread.sleep(2000);
		resetPage.btnSubmit.click();

	}


	@Then("^Successful pop-up message displayed as \"([^\"]*)\"$")
	public void successful_pop_up_message_displayed_as(String arg1) throws Throwable {
		explicitwait.until(ExpectedConditions.elementToBeClickable(resetPage.winSuccess));
		Assert.assertEquals(resetPage.winSuccess.isDisplayed(), true);

		resetPage.clickOnOK();
		Thread.sleep(3000);

	}

	@Then("^Users should not  be able to login with old Email id \"([^\"]*)\",\"([^\"]*)\"$")
	public void users_should_not_be_able_to_login_with_old_Email_id(String Username1, String Password) throws Throwable {
		registerpage.clickLogin();
		Thread.sleep(2000);
		registerpage.clickEmployerAgencySignInlink();
		explicitwait.until(ExpectedConditions.elementToBeClickable(resetPage.winWelcome));

		Assert.assertEquals(resetPage.winWelcome.isDisplayed(), true);
		Thread.sleep(2000);
		loginpage.loginInNew(Username1, Password);
		Thread.sleep(3000);
		explicitwait.until(ExpectedConditions.elementToBeClickable(resetPage.inpEmail));
		Assert.assertEquals(resetPage.inpEmail.isDisplayed(), true);
		Thread.sleep(3000);

	}


	@Then("^Users should be able to login with a new Email id \"([^\"]*)\"$")
	public void users_should_be_able_to_login_with_a_new_Email_id(String Username) throws Throwable {
		resetPage.inpEmail.clear();
		Thread.sleep(2000);
		resetPage.inpEmail.sendKeys(Username);
		Thread.sleep(2000);
		loginpage.signin.click();
		Thread.sleep(5000);


	}
	@Given("^User login to HireXpert Application\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_login_to_HireXpert_Application(String Username, String Password) throws Throwable {

		baseclass.initialization();
		driver.navigate().refresh();
		Thread.sleep(4000);
		registerpage.clickLogin();
		Thread.sleep(2000);
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(2000);
		loginpage.loginInNew(Username, Password);
		Thread.sleep(5000);
		String hometitle = driver.getTitle();

		explicitwait.until(ExpectedConditions.visibilityOf(resetPage.myAccount));
		resetPage.clickOnMyAccount();

		Thread.sleep(3000);
	}


	@When("^User clicks the Change Password   option on the profile  window\\.$")
	public void user_clicks_the_Change_Password_option_on_the_profile_window() throws Throwable {
		resetPage.clickOnChangePassword();

	}

	@When("^The Change password   pop up window appears\\.$")
	public void the_Change_password_pop_up_window_appears() throws Throwable {
		explicitwait.until(ExpectedConditions.elementToBeClickable(resetPage.ChangePasswordWin));
		Assert.assertEquals(resetPage.ChangePasswordWin.isDisplayed(), true);
		resetPage.clickOnCancle();
	}

	@Then("^Users should remain on a Dashboard page\\.$")
	public void users_should_remain_on_a_Dashboard_page() throws Throwable {
		Thread.sleep(2000);
		String hometitle = driver.getTitle();

	}
	@Given("^User login to HireXpert Application\\(change Login Email \\)\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_login_to_HireXpert_Application_change_Login_Email(String Username, String Password) throws Throwable {
		baseclass.initialization();
		driver.navigate().refresh();
		Thread.sleep(4000);
		registerpage.clickLogin();
		Thread.sleep(2000);
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(2000);
		loginpage.loginInNew(Username, Password);
		Thread.sleep(5000);
		String hometitle = driver.getTitle();

		explicitwait.until(ExpectedConditions.visibilityOf(resetPage.myAccount));
		resetPage.clickOnMyAccount();

		Thread.sleep(3000);
	}

	@When("^User clicks the Change Login Email  option on the profile  window\\.$")
	public void user_clicks_the_Change_Login_Email_option_on_the_profile_window() throws Throwable {
		resetPage.btnChangeEmail.click();
		explicitwait.until(ExpectedConditions.elementToBeClickable(resetPage.winChangeEmail));
		Assert.assertEquals(resetPage.winChangeEmail.isDisplayed(), true);
	}

	@When("^The Change  Login Email    pop up window appears\\.$")
	public void the_Change_Login_Email_pop_up_window_appears() throws Throwable {
		explicitwait.until(ExpectedConditions.elementToBeClickable(resetPage.winChangeEmail));
		Assert.assertEquals(resetPage.winChangeEmail.isDisplayed(), true);
	}

	@When("^When Users click the cancel button\\.$")
	public void when_Users_click_the_cancel_button() throws Throwable {
		Thread.sleep(3000);		
		resetPage.clickOnCancle();
	}



}
