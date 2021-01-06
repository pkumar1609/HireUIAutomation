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
	
//	Logger log = LoggerHelper.getLogger(hooks.class);


	
	
		@After("@reg1")  
		public void endTest() throws InterruptedException
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
		
		@After()
		public void screenShot(Scenario scenario) throws InterruptedException, IOException
		{
			if (scenario.isFailed()) {

				try {
//					log.info(scenario.getName() + " is Failed");
					
//					final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//					scenario.embed(screenshot, "image/png"); // ... and embed it in
					
					File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				    FileUtils.copyFile(screenshotFile, new File("c:\\hirexprt.png"));
				
				} catch (WebDriverException e) {
					e.printStackTrace();
				}

			}
//			else {
//				try {
////					log.info(scenario.getName() + " is pass");
//					scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
		}		
}

