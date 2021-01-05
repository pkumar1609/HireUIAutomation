package BVT_StepDefination;

import cucumber.api.java.After;
import utilPackage.baseclass;

public class hooks extends baseclass{

//	@jobworkflow,@jobupdate,@interview,@JCWF,@market,@TaskManagement
	@After("@jobworkflow,@jobupdate,@interview,@JCWF,@market")
	public void Endtest() throws InterruptedException
	{
		if(addjobpage.addJobFlag==1)
		{
			workbenchpage.deleteJob();
			if((loginpage.logedinuser=="pemp" || loginpage.logedinuser=="pa1") && common.shareFlag==1)
			{
				loginpage.logoutFromAppK();
				loginpage.ClickOnEmployerAgencySigninLink();
				loginpage.loginIn("pagy@gmail.com", "12345");
				workbenchpage.deleteJob();
			}
			else if((loginpage.logedinuser=="pagy" || loginpage.logedinuser=="pe1" ) && common.shareFlag==1)
			{
				loginpage.logoutFromAppK();
				loginpage.ClickOnEmployerAgencySigninLink();
				loginpage.loginIn("pemp@gmail.com", "12345");
				workbenchpage.deleteJob();
			}		
			if (addjobpage.jobAddedByEmp==false)
			{
				loginpage.logoutFromAppK();
				loginpage.ClickOnEmployerAgencySigninLink();
				loginpage.loginIn("pemp@gmail.com", "12345");
				workbenchpage.deleteJob();
			}	
		}
	Thread.sleep(1000);
	driver.quit();	
	}	
}
