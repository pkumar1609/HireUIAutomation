package KomalStepdefination;

import java.io.IOException;

import cucumber.api.java.en.And;
import utilPackage.baseclass;

public class TC273 extends baseclass{
	
	public TC273() throws IOException 
	{
		super();
	}
	
	@And("^Click on Mark Complete$")
	public void click_on_Mark_Complete() throws Throwable {
	   taskpage.MarkCompleted();
	}

	@And("^the task should not display on employer side$")
	public void And the task should display for loggedinuser
() throws Throwable {
		taskpage.validateTaskAfterMarkCompletedEmp();
	}

	@And("^login as employer team$")
	public void login_as_employer_team() throws Throwable {
	   loginpage.loginInAppWithTeamK();
	}


}
