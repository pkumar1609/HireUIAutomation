package com.Hirexpert.pages;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Hirexpert.utils.TestBase;


public class WorkbenchPage extends TestBase {
	
	@FindBy(xpath = "/html/body/app-root/div/div/div/workbench/div/div[1]/div/div[1]/div[3]/div[1]/button[1]")
	public WebElement addjob;
	
	@FindBy(id = "jobDropdown")
	public WebElement jobDropDown;
	
	@FindBy(xpath = "//button[contains(text(),'Share With Agency')]")
	public WebElement shareWithAgencyButton;
	
	@FindBy(xpath = "//button[contains(text(),'Add Candidate')]")
	public WebElement addCandidateButton;
	
	@FindBy(xpath = "//button[contains(text(),'Share With Team')]")
	public WebElement shareWithTeamButton;
	
	@FindBy(xpath = "//button[contains(text(),'Edit Job')]")
	public WebElement editJobButton;
	
	@FindBy(xpath = "//a[@href='#/workbench']")
	public WebElement workbenchbtn;
	
	@FindBy(xpath = "//button[@title='Add Task']")
	public WebElement addtask;
	
	
	public WorkbenchPage() throws IOException{
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void AddJob() {
		
		addjob.click();
	}
	
	public Select se;
	
	public void selectJob() {
		
		se = new Select(jobDropDown);
		se.selectByIndex(1);
//		String jobname = jobDropDown.getText();
//		System.out.println("Selected job name: " + jobname);
	}
	
//	public String jobname1= jobDropDown.getText();
	
	
	
	
	
	

}
