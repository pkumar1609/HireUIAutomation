package KomalStepdefination;

import java.io.IOException;

import cucumber.api.java.en.And;
import utilPackage.baseclass;

public class TC269_271_273 extends baseclass{

	public TC269_271_273() throws IOException 
	{
		super();
	}
	@And("^Click on mark in progress$")
	public void click_on_mark_in_progress() throws Throwable 
	{
	   taskpage.ClickOnMarkInProgress();
	   
	}
}
