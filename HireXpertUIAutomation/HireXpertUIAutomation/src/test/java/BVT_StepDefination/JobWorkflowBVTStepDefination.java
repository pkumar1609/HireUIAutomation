package BVT_StepDefination;

import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class JobWorkflowBVTStepDefination extends baseclass {

	@When("^Go to workbench$")
	public void go_to_workbench() throws Throwable {
		dashboardpage.openWorkbenchPage();
	}

}
