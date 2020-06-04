package BVT_StepDefination;

import java.io.IOException;

import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class TC302 extends baseclass {
	boolean b;
	public TC302() throws IOException 
	{
		super();
	}
	
	@Before()
	public void setup() throws IOException
	{
//		baseclass.initialization();
	}

	@And("^edit the task$")
	public void edit_the_task(DataTable credentials) throws Throwable {
		this.b=loginpage.b;
		if(b==true)
		{
			if(taskpage.assignto.contains("employer"))
			{
				taskpage.ClickOnMyTask();
				taskpage.ClickOnEditTask();
				taskpage.edittaskdetailsforemp(credentials);
			}
			else
			{
				
				taskpage.ClickOnTeamTask();
				taskpage.ClickOnEditTask();
				taskpage.edittaskdetailsforemp(credentials);
			}
		}
		else
		{
			if(taskpage.assignto.contains("agency"))
			{
				taskpage.ClickOnMyTask();
				taskpage.ClickOnEditTask();
				taskpage.editTaskDetailsForAgy(credentials);
			}
			else
			{
				taskpage.ClickOnTeamTask();
				taskpage.ClickOnEditTask();
				taskpage.editTaskDetailsForAgy(credentials);
			}
			
		}
	}

	@Then("^verify all the edited details$")
	public void verify_all_the_edited_details(DataTable credentials) throws Throwable {
	
		if(taskpage.assignto.contentEquals(loginpage.logedinuser))
		{
			taskpage.ClickOnMyTask();
			taskpage.ClickOnEditTask();
			taskpage.assertDeatailsOfTask(credentials);
			
				
		}
		else
		{
			taskpage.ClickOnTeamTask();
			taskpage.ClickOnEditTask();
			taskpage.assertDeatailsOfTask(credentials);	
				
		}
		
		
	}

}
