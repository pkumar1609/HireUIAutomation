package BVT_StepDefination;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import utilPackage.baseclass;

import org.apache.commons.io.FileUtils;


public class hooks extends baseclass{

//	@jobworkflow,@jobupdate,@interview,@JCWF,@market,@TaskManagement
	
	@After()
	public void screenShot(Scenario scenario) throws InterruptedException, IOException
	{
		System.out.println("inside after hook:"+rootFolder+"");

		if (scenario.isFailed()) {

			try {
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String filename=scenario.getName().strip();
				System.out.println(rootFolder+"/"+filename+".png");
			    FileUtils.copyFile(screenshotFile, new File(rootFolder+"/"+filename+".png"));
			} catch (WebDriverException e) {
				System.out.println("expection Thrown :"+e.getMessage());
			}
		}
	}	

		@After("@jobworkflow,@jobupdate,@interview,@JCWF,@market")  
		public void endTest() throws InterruptedException
		{
//			System.out.println(common.shareFlag+" : common.shareFlag ");
//			System.out.println(addjobpage.addJobFlag+" : addjobpage.addJobFlag ");
	
			loginpage.logoutFromAppK();
			loginpage.ClickOnEmployerAgencySigninLink();
			loginpage.login("pemp@gmail.com");
			workbenchpage.deleteJob();
			loginpage.logoutFromAppK();
			loginpage.ClickOnEmployerAgencySigninLink();
			loginpage.loginIn("pemp@gmail.com", "12345");
			workbenchpage.deleteJob();		
			
//		if(addjobpage.addJobFlag==1)
//		{
//			workbenchpage.deleteJob();
//			if(loginpage.logedinuser=="pemp" || loginpage.logedinuser=="pa1" && common.shareFlag==1)
//			{
//				loginpage.logoutFromAppK();
//				loginpage.ClickOnEmployerAgencySigninLink();
//				loginpage.loginIn("pagy@gmail.com", "12345");
//				workbenchpage.deleteJob();
//			}
//			else if(loginpage.logedinuser=="pagy" || loginpage.logedinuser=="pe1"  && common.shareFlag==1)
//			{				
//				loginpage.logoutFromAppK();
//				loginpage.ClickOnEmployerAgencySigninLink();
//				loginpage.loginIn("pemp@gmail.com", "12345");
//				workbenchpage.deleteJob();
//			}		
//			if (addjobpage.jobAddedByEmp==false)
//			{
//				loginpage.logoutFromAppK();
//				loginpage.ClickOnEmployerAgencySigninLink();
//				loginpage.loginIn("pemp@gmail.com", "12345");
//				workbenchpage.deleteJob();
//			}	
//		}
	Thread.sleep(1000);
	driver.quit();
//	addjobpage.addJobFlag=0;
//	common.shareFlag=0;
	}	
				
}

