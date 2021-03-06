package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilPackage.baseclass;

public class UpdateProfilePopupPage extends baseclass {
	
	public String Contact;
	public String Organization;
	public String datebelowField;
	
	@FindBy(xpath="//input[@id='Name']")
	public WebElement Name;
	
	@FindBy(xpath="//input[@placeholder='Enter Name']")
	public WebElement AgencyEmployerName;
		
	@FindBy(xpath="//input[@id='Email']")
	public WebElement Email;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	public WebElement AgencyEmployerEmail;
	
	@FindBy(xpath="//input[@formcontrolname='isAgencyOwner']")
	public WebElement isAgencyOwner;
	
	@FindBy(xpath="//input[@placeholder='Enter Contact Number']")
	public WebElement contactNumber;
	
	@FindBy(xpath="//input[@formcontrolname='contactNumber']")
	public WebElement AgencyEmployerContactNumber;
	
	@FindBy(xpath="//select[@formcontrolname='timezone']")
	public WebElement AgencyEmployerTimeZone;
	
	@FindBy(xpath="//select[@formcontrolname='CountryId']")
	public WebElement Country;
	
	@FindBy(xpath="//input[@formcontrolname='language']")
	public WebElement language;
	
	@FindBy(xpath="//input[@id='ExperienceInYears']")
	public WebElement ExperienceinYears;
	
	@FindBy(xpath="//input[@id='CTC']")
	public WebElement CTCperAnnum;
	
	@FindBy(xpath="//ng-select[@formcontrolname='Shift']//input")
	public WebElement Shift;
	
	@FindBy(xpath="//ng-select[@formcontrolname='JobType']//input")
	public WebElement JobType;
	
	@FindBy(xpath="//textarea[@id='agencyaddress']")
	public WebElement Address;
	
	@FindBy(xpath="//textarea[@formcontrolname='address']")
	public WebElement Address1;
	
	@FindBy(xpath="//input[@formcontrolname='OrganizationId']")
	public WebElement OrganizationName;
	
	@FindBy(xpath="//input[@id='agencywebsite']")
	public WebElement Website;
	
	@FindBy(xpath="//input[@id='Title']")
	public WebElement Title;
	
	@FindBy(xpath="//input[@formcontrolname='Designation']")
	public WebElement designation;
	
	@FindBy(xpath="//input[@formcontrolname='FunctionalArea']")
	public WebElement FunctionalArea;
	
	@FindBy(xpath="//input[@id='NoticePeriod']")
	public WebElement Noticeperiod;
	
	@FindBy(xpath="//input[@formcontrolname='IndustryId']")
	public WebElement Industry;
	
	@FindBy(xpath="//input[@placeholder='Enter City']")
	public WebElement CityofCandidate;
	
	@FindBy(xpath="//input[@formcontrolname='CityId']")
	public WebElement City;
	
	@FindBy(xpath="//select[@formcontrolname='Gender']")
	public WebElement Gender1;
	
	@FindBy(xpath="/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-candidate-profile[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/table[1]/tbody[1]/tr[1]/td[4]/button[1]")
	public WebElement DeleteCandidateSkill1;
	
	@FindBy(xpath="/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-candidate-profile[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/table[1]/tbody[1]/tr[2]/td[4]/button[1]")
	public WebElement DeleteCandidateSkill2;
	
	@FindBy(css="body.modal-open:nth-child(2) ngb-modal-window.modal.fade.show.d-block.JobDashboardModal:nth-child(7) div.modal-dialog div.modal-content div.modal-body.ModalBodyHeight div.row div.col-md-12 form.ng-untouched.ng-pristine.ng-invalid div.row:nth-child(2) div.col-md-8.mt-2:nth-child(3) table.table.table-bordered tbody.ng-untouched.ng-pristine.ng-invalid tr.ng-untouched.ng-pristine.ng-invalid:nth-child(3) td.text-center:nth-child(4) > button.btn.btn-outline-danger")
	public WebElement DeleteCandidateSkill3;
	
	@FindBy(xpath="/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-candidate-profile[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/button[1]")
	public WebElement DeleteRole1;
	
	@FindBy(xpath="/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-candidate-profile[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[4]/table[1]/tbody[1]/tr[2]/td[2]/button[1]")
	public WebElement DeleteRole2;
	
	@FindBy(css="body.modal-open:nth-child(2) ngb-modal-window.modal.fade.show.d-block.JobDashboardModal:nth-child(7) div.modal-dialog div.modal-content div.modal-body.ModalBodyHeight div.row div.col-md-12 form.ng-untouched.ng-pristine.ng-invalid div.row:nth-child(2) div.col-md-4.pl-1.mt-2:nth-child(4) table.table.table-bordered tbody.ng-untouched.ng-pristine.ng-invalid tr.ng-untouched.ng-pristine.ng-invalid:nth-child(3) td.text-center > button.btn.btn-outline-danger")
	public WebElement DeleteRole3;
	
	@FindBy(xpath="//button[@id='confirmModalCloseBtn']")
	public WebElement NoButton;
	
	@FindBy(xpath="//button[contains(text(),'Close')]")
	public WebElement CloseButton; 
	
	@FindBy(xpath="//input[@formcontrolname='Skill']")
	public WebElement CandidateSkill;
	
	@FindBy(xpath="//select[@formcontrolname='ExpertiseLevel']")
	public WebElement ExpertiseLevel;
	
	@FindBy(xpath="//input[@formcontrolname='Role']")
	public WebElement Role;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement Savebutton;
	
	@FindBy(xpath = "//select[@formcontrolname='CountryId']")
	public WebElement countryId;
	
	@FindBy(xpath = "//input[@placeholder='Enter Current Designation']")
	public WebElement currentDesignation;
	
	@FindBy(xpath = "//select[@formcontrolname='ServingNoticePeriod']")
	public WebElement onNoticePeriod;
	
	@FindBy(xpath = "//button[@aria-label='Open Calendar']")
	public List<WebElement> calenderIcon;
	
	@FindBy(xpath = "//input[@id='ECTC']")
	public WebElement ectc;
	
	@FindBy(xpath = "//input[@placeholder='Enter Location']")
	public WebElement cityArea;
	
	@FindBy(xpath = "//input[@id='ZipCode']")
	public WebElement zipCode;
	
	
	//Initializing the Page objects
	
	public UpdateProfilePopupPage() {     //constructor
		
		PageFactory.initElements(driver, this);
	}
		
	//Actions
	
	public void ToVerifyAgencyisonAgencyUpdateProfilePopupOrNot() {
		
    if (driver.findElement(By.xpath("//span[contains(text(),'Agency Name')]")).isDisplayed()==true) {            //label[contains(text(),'Agency Name')]
			
			System.out.println("Agency has redirected to correct update profile popup window");
		}
		 
		else {
			
			System.out.println("Agency has not redirected to correct update profile popup window");
		}
	}
	
	public void ToVerifyEmployerisonEmployerUpdateProfilePopupOrNot() {
		
	    if (driver.findElement(By.xpath("//span[contains(text(),'Employer Name')]")).isDisplayed()==true) {
				
				System.out.println("Employer has redirected to correct update profile popup window");
			}
			
			else {
				
				System.out.println("Employer has not redirected to correct update profile popup window");
			}
		}
	
    public void ToVerifyCandidateisonCandidateUpdateProfilePopupOrNot() {
		
	    if (driver.findElement(By.xpath("//span[contains(text(),'Name')]")).isDisplayed()==true){
				
				System.out.println("Candidate has redirected to correct update profile popup window");
			}
			
			else {
				
				System.out.println("Candidate has not redirected to correct update profile popup window");
			}
		}
				
	
      public void verifyEmail() {
		
	    AgencyEmployerEmail.click();
		
		String emailAttribute = updateprofilepopuppage.AgencyEmployerEmail.getAttribute("readonly");
		System.out.println("\nEmail readonly field: " + emailAttribute);
		
		if(emailAttribute.equals("true")) {
			System.out.println("Email ID field is not editable.. Email ID field is critical field..");
		}
		else {
			System.out.println("Email ID field is editable..");
		}
		
	}
      
      public void verifylanguage() {
  		
  	    language.click();
  		
  		String languageAttribute = updateprofilepopuppage.language.getAttribute("readonly");
  		System.out.println("\nEmail readonly field: " + languageAttribute);
  		
  		if(languageAttribute.equals("true")) {
  			System.out.println("Language field is not editable.. Language field is critical field..");
  		}
  		else {
  			System.out.println("Language field is editable..");
  		}
  		
  	}
	
     
	
	public void UpdateProfile (String Address, String OrganizationName, String Website, String City) throws InterruptedException {
		
		Thread.sleep(2000);
		
		this.Address.clear();
		this.Address.sendKeys(Address);
		
		this.OrganizationName.clear();
		this.OrganizationName.sendKeys(OrganizationName);
		
		this.Website.sendKeys(Website);
		this.City.sendKeys(City);
	}
		
//	public void UpdateProfileAgency (String AgencyAddress, String AgencyOrganizationName, String AgencyWebsite, String AgencyCity) {
//				
//		Address.sendKeys(AgencyAddress);
//	    OrganizationName.sendKeys(AgencyOrganizationName);
//	    Website.sendKeys(AgencyWebsite);
//	    City.sendKeys(AgencyCity);
//	}
		
	public void UpdateProfileCandidate (String title1, String Designation, String functionalArea, String shift, String jobType, String NoticePeriod, String industry, String CandidateCity, String gender1, String experience, String CTC, String expectedCTC, String CityArea) throws InterruptedException {
				
		Title.sendKeys(title1);
		designation.sendKeys(Designation);
		designation.click();
		FunctionalArea.sendKeys(functionalArea);
		Shift.sendKeys(shift);
		driver.findElement(By.xpath("//span[contains(text(),'Day Shift')]")).click();
		JobType.sendKeys(jobType);
		driver.findElement(By.xpath("//span[contains(text(),'Permanent Full Time')]")).click();
		Noticeperiod.sendKeys(NoticePeriod);
		Industry.sendKeys(industry);
		Industry.click();
		CityofCandidate.sendKeys(CandidateCity);
		Thread.sleep(3000);
		CityofCandidate.click();
		ExperienceinYears.clear();
		ExperienceinYears.sendKeys(experience);
		CTCperAnnum.clear();
		CTCperAnnum.sendKeys(CTC);
		ectc.sendKeys(expectedCTC);
		cityArea.sendKeys(CityArea);
	
		Select select = new Select (Gender1);
		select.selectByVisibleText(gender1);
	}
		
	public void DeleteCandidateSkillsandRoles() {
			
		DeleteCandidateSkill1.click();
		DeleteRole1.click();
		DeleteCandidateSkill2.click();
		DeleteRole2.click();
	}
		
    public void AddCandidateSkillandRole(String expertiselevel) {
			
		CandidateSkill.sendKeys("Java");
			
		Select select = new Select(ExpertiseLevel);
		select.selectByVisibleText(expertiselevel);
		Role.sendKeys("Engineer");
	}
		
    public void MakeChangesinAgencyUpdateProfile(String organizationname) {
    	   
    	 OrganizationName.clear();
		 OrganizationName.sendKeys(organizationname);	
    }
       
    public void MakeChangesinEmployerUpdateProfile(String organizationname) {
   	   
    	 OrganizationName.clear();
		 OrganizationName.sendKeys(organizationname);		
    }
    
    public void MakeChangesinCandidateUpdateProfile(String noticeperiod) {
    	   
    	Noticeperiod.clear();
		Noticeperiod.sendKeys(noticeperiod);		
   }
     
    public void VerifyAutoPopulatedFieldsOnUpdateAgencyProfile () {
    	   
    	   if (AgencyEmployerName.getAttribute("value").isEmpty()) {
    		   
               System.out.println("Name field is blank and it is not autopopulated");
    	   }else {
    		   
       		   System.out.println("Name field is autopopulated on Update Profile Popup Window");
    	   }
    	   
    	   if (AgencyEmployerEmail.getAttribute("value").isEmpty()) {
   		   
   		         System.out.println("Email field is blank and it is not autopopulated");
   	       }else {
   		   
   	    	System.out.println("Email field is autopopulated on Update Profile Popup Window");
   	       }
    	   
    	   if (AgencyEmployerContactNumber.getAttribute("value").isEmpty()) {
      		   
		          System.out.println("ContactNumber field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("ContactNumber field is autopopulated on Update Profile Popup Window");
	       }
 
    	   if (Country.getAttribute("value").isEmpty()) {
              
		        System.out.println("Country field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("Country field is autopopulated on Update Profile Popup Window");
	       }
          
    	   if (City.getAttribute("value").isEmpty()) {
              
		         System.out.println("City field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("City field is autopopulated on Update Profile Popup Window");
	       }
    	   
    	   if (AgencyEmployerTimeZone.getAttribute("value").isEmpty()) {
               
		         System.out.println("TimeZone field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("Timezone field is autopopulated on Update Profile Popup Window");
	       }
    	   
    	   if (language.getAttribute("value").isEmpty()) {
               
		         System.out.println("language field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("language field is autopopulated on Update Profile Popup Window");
	       }

    	   if (Address1.getAttribute("value").isEmpty()) {
               
		         System.out.println("Address field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("Address field is autopopulated on Update Profile Popup Window");
	       }
    	   
    	   if (OrganizationName.getAttribute("value").isEmpty()) {
               
		         System.out.println("Organization Name field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("Organization Name field is autopopulated on Update Profile Popup Window");
	       }
    }
    
    
    public void VerifyAutoPopulatedFieldsOnUpdateEmployerProfile () {
 	   
 	   if (AgencyEmployerName.getAttribute("value").isEmpty()) {
 		   
            System.out.println("Name field is blank and it is not autopopulated");
 	   }else {
 		   
    		   System.out.println("Name field is autopopulated on Update Profile Popup Window");
 	   }
 	   
 	   if (AgencyEmployerEmail.getAttribute("value").isEmpty()) {
		   
		         System.out.println("Email field is blank and it is not autopopulated");
	       }else {
		   
	    	System.out.println("Email field is autopopulated on Update Profile Popup Window");
	       }
 	   
 	   if (AgencyEmployerContactNumber.getAttribute("value").isEmpty()) {
   		   
		          System.out.println("ContactNumber field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("ContactNumber field is autopopulated on Update Profile Popup Window");
	       }

 	   if (Country.getAttribute("value").isEmpty()) {
           
		        System.out.println("Country field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("Country field is autopopulated on Update Profile Popup Window");
	       }
       
 	   if (City.getAttribute("value").isEmpty()) {
           
		         System.out.println("City field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("City field is autopopulated on Update Profile Popup Window");
	       }
 	   
 	   if (AgencyEmployerTimeZone.getAttribute("value").isEmpty()) {
            
		         System.out.println("TimeZone field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("Timezone field is autopopulated on Update Profile Popup Window");
	       }
 	   
 	   if (language.getAttribute("value").isEmpty()) {
            
		         System.out.println("language field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("language field is autopopulated on Update Profile Popup Window");
	       }

 	   if (Address1.getAttribute("value").isEmpty()) {
            
		         System.out.println("Address field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("Address field is autopopulated on Update Profile Popup Window");
	       }
 	   
 	   if (OrganizationName.getAttribute("value").isEmpty()) {
            
		         System.out.println("Organization Name field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("Organization Name field is autopopulated on Update Profile Popup Window");
	       }
 }

    Select se;
    public void VerifyAutoPopulatedFieldsOnUpdateCandidateProfile (String CandidateEmail, String CandidateName, String ContactNumber) throws InterruptedException {
 	   
//    	Thread.sleep(3500);
//		Assert.assertEquals(addcandidatepage.emailField.getAttribute("value"),registerpage.registerdEmail);
//		Assert.assertEquals(addcandidatepage.name.getAttribute("value"),registerpage.registerdName);
//		Assert.assertEquals(updateprofilepopuppage.contactNumber.getAttribute("value"),registerpage.registerdContact);
//		currentDesignation.sendKeys(Designation);
//		currentDesignation.click();
//		driver.findElement(By.xpath("//span[contains(text(),'Software Tester')]")).click();
//		Select select = new Select (Gender1);
//		select.selectByVisibleText(gender1);
//		select=new Select(updateprofilepopuppage.onNoticePeriod);
//		Assert.assertEquals(select.getFirstSelectedOption().getText(),OnNoticePeriod);
//		Thread.sleep(3000);
//		//Noticeperiod.sendKeys(NoticePeriod);
//		Industry.sendKeys(industry);
//		Industry.click();
//		CityofCandidate.sendKeys(CandidateCity);
//		Thread.sleep(3000);
//		CityofCandidate.click();
//		Shift.sendKeys(shift);
//		driver.findElement(By.xpath("//span[contains(text(),'Day Shift')]")).click();
//		JobType.sendKeys(jobType);
//		driver.findElement(By.xpath("//span[contains(text(),'Permanent Full Time')]")).click();
//		ExperienceinYears.clear();
//		ExperienceinYears.sendKeys(experience);
//		CTCperAnnum.clear();
//		CTCperAnnum.sendKeys(CTC);
//		se = new Select (this.countryId);
//		WebElement option = se.getFirstSelectedOption();
//		Assert.assertEquals(option.getText()," "+Country+" ");
//		Assert.assertEquals(updateprofilepopuppage.CityofCandidate.getAttribute("value"),CandidateCity);
//		CityofCandidate.click();
//		Assert.assertEquals(updateprofilepopuppage.FunctionalArea.getAttribute("value"),functionalArea);
//		FunctionalArea.sendKeys(functionalArea);
//		Assert.assertEquals(this.dateOfBirth.getAttribute("value"),Date); 
//		Assert.assertEquals(this.cityArea.getAttribute("value"),CityArea);
//		Assert.assertEquals(addcandidatepage.zipCode.getAttribute("value"),ZipCode);
//		Assert.assertEquals(addcandidatepage.industry.getAttribute("value"),addjobpage.industryname);	
//		Assert.assertEquals(this.ectc.getAttribute("value"),expectedCTC);

		
 }
    
    public void getDetails() throws InterruptedException
    {
    	Thread.sleep(2000);
    	Actions action = new Actions(driver);
    	action.moveToElement(loginpage.myAccount).perform();
		Thread.sleep(2000);
		loginpage.updateProfile.click();
		Thread.sleep(4000);
    	Contact= contactNumber.getAttribute("value");
    	System.out.println("contact is "+Contact);
    	Organization=OrganizationName.getAttribute("value");
    	System.out.println("Organization is "+Organization);
    	common.clickOnCloseBtn();
    }
}
