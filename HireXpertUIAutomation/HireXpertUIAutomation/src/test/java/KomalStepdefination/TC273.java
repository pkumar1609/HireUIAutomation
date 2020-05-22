package KomalStepdefination;

import java.io.IOException;

import cucumber.api.java.en.And;
import utilPackage.baseclass;

public class TC273 extends baseclass{
	
	public TC273() throws IOException 
	{
		super();
	}
	
	@And("^Click on Mark Complete from team member login$")
	public void click_on_Mark_Complete_from_team_member_login() throws Throwable {
	   taskpage.MarkCompleted();
	}

	@And("^the task should not display on employer side$")
	public void the_task_should_not_display_on_employer_side() throws Throwable {
		taskpage.validateTaskAfterMarkCompletedEmp();
	}

	@And("^login as employer team$")
	public void login_as_employer_team() throws Throwable {
	   loginpage.loginInAppWithTeamK();
	}


}
