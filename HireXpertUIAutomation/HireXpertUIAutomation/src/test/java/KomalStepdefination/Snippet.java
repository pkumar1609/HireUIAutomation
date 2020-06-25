package KomalStepdefination;

public class Snippet {
	@And("^Go to workbench$")
		public void go_to_workbench() throws Throwable {
			dashboardpage.openWorkbenchPage();
		}
		
		@And("^Add job$")
		public void add_job(DataTable credentials) throws Throwable {
			addjobpage.addjob(credentials);
		}
	
		@And("^Select a job$")
		public void select_a_job() throws Throwable {
			workbenchpage.selectJob();
		}
		
		@And("^Share job with team member$")
		public void share_job_with_team_member(DataTable credentials) throws Throwable {
		taskpage.shareWithTeam(credentials);
		} 
		
		@And("^Click on Add task button and enter all details$")
		public void click_on_Add_task_button_and_enter_all_details(DataTable credentials) throws Throwable {
			this.emp=loginpage.b;
			if(emp==true) 
			{
			taskpage.enterAlldetails(credentials);
			}
			else
			{
			taskpage.enterAlldetailsForAgy(credentials);
			}
		}
}

