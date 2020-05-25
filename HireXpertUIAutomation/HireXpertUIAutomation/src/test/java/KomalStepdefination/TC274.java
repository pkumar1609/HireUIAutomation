package KomalStepdefination;

import java.io.IOException;

import cucumber.api.java.en.And;
import utilPackage.baseclass;

public class TC274 extends baseclass{
	public TC274() throws IOException 
	{
		super();
	}
	
	@And("^the task should not display on agency side$")
	public void the_task_should_not_display_on_agency_side() throws Throwable {
	    taskpage.validateTaskAfterMarkCompletedAgy();
	}
	
}
