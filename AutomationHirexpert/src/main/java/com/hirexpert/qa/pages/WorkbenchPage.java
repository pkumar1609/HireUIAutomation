package com.hirexpert.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hirexpert.qa.base.Testbase;

public class WorkbenchPage extends Testbase {
	
	@FindBy(xpath="//a[contains(text(),'Workbench')]")
	WebElement Workbenchbtn;
	
	@FindBy(id="jobDropdown")
	WebElement JobDropDown;
	
	@FindBy(xpath="//button[contains(text(),'Add Candidate')]")
	WebElement AddCandidateBtn;
	
	@FindBy(xpath="//button[contains(text(),'Find')]")
	WebElement FindBtn;
	
	@FindBy(id="Name")
	WebElement CandidateName;
	
	@FindBy(id="ContactNumber")
	WebElement ContactNo;
	
	@FindBy(xpath="//input[@formcontrolname='Designation']")
	WebElement JobDesignation;
	
	@FindBy(xpath="//*[@id=\"style-5\"]/div/div[1]/form/div[2]/div[1]/div/div/div[1]/div[6]/select")
	WebElement CandidateGender ;
	
	@FindBy(id="NoticePeriod")
	WebElement Noticeperiod ;
	
	@FindBy(xpath="//input[@formcontrolname='Location']")
	WebElement JobLocation ;
	
	@FindBy(xpath="//ngb-modal-window//div[5]//select[1]")
	WebElement CommunicationMode ;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement Savebtn ;
	
	@FindBy(name="Email")
	 WebElement CandidateEmailAddress ;
	
	@FindBy(id="alertModalCloseBtn")
	 WebElement CandidateOKBtn ;
	
	@FindBy(id="EditCandidate")
	 WebElement EditCandidateicon ;
	
	
	
	//Initializing the Page objects
	
		public WorkbenchPage() {     //constructor
			PageFactory.initElements(driver, this);
			
			this.driver = driver;
		}
		
		//Actions
		
		
	       public void ClickWorkbenchbtn () {
	    	   Workbenchbtn.click();
	       }
	  			
	       public void ClickAddCandidatebtn() {
		      	 
		      	 AddCandidateBtn.click();
		      	 
		   }

		public void selectjob() {
			Select select = new Select (JobDropDown);
	  		 select.selectByVisibleText("Job-1 Test Engineer - Active");
		}

		 public void Entercandidateemail(String CandidateEmail) {
	      	 
	      CandidateEmailAddress.sendKeys(CandidateEmail);
	      	 
	       }

		 public void ClickFindbtn() {
	      	 
		      FindBtn.click();
		      	 
		       }
		 
		 public void ClickCandidateOKbtn() {
	      	 
		      CandidateOKBtn.click();
		      	 
		       }
		 
		 public void EnterAllMandatoryfields(String Name, String ContactNumber, String Designation, String Gender, String NoticePeriod, String Location, String Communicationmode) {
	      	 
		      CandidateName.sendKeys(Name);
		      
		      ContactNo.sendKeys(ContactNumber);
		      
		      JobDesignation.sendKeys(Designation);
		      JobDesignation.sendKeys(Keys.ENTER);
		      
		      
		      CandidateGender.sendKeys(Keys.ENTER);
		      Select select1 = new Select (CandidateGender);
		  	  select1.selectByVisibleText(Gender);
		      
		      Noticeperiod.sendKeys(NoticePeriod);
		      
		      JobLocation.sendKeys(Location);
		      JobLocation.sendKeys(Keys.ENTER);
		      
		      CommunicationMode.sendKeys(Keys.ENTER);
		      Select select11 = new Select (CommunicationMode);
		  	  select11.selectByVisibleText(Communicationmode);
		  	  
		       }
		 
		 public void ClickSavebtn() {
	      	 
		      Savebtn.click();
		      	 
		       }
		 
		 public void clickEditCandidateIcon() {
			 
			 EditCandidateicon.click();
		 }
		 
		 public void EnterContactNumber(String ContactNumber) {
			 
			 ContactNo.clear();
			 
			 ContactNo.sendKeys(ContactNumber);
		 }
		 
		 
		 
		 
		 
		
		 
		 
		 
		 
		 
		 
	
}
