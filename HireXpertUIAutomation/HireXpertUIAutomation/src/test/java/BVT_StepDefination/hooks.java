package BVT_StepDefination;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
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
			finally {
				driver.quit();
				}
		}
	}	
	
//	@After()
//	public void deleteJob() throws InterruptedException
//	{
//		if(addjobpage.addJobFlag==1)
//		{
//			dashboardpage.openWorkbenchPage();
//			workbenchpage.selectJobK();
//			workbenchpage.deleteJob();
//		}
//		addjobpage.addJobFlag=0;
//	}
	
	@After()
	public void closeBrowser()
	{
		driver.quit();
	}
}
