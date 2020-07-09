package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilPackage.baseclass;

public class UpdateProfilePopupPage extends baseclass {
	
	@FindBy(xpath="//input[@id='Name']")
	public WebElement Name;
	
	@FindBy(xpath="//input[@formcontrolname='name']")
	public WebElement AgencyEmployerName;
	
//	@FindBy(xpath="//label[contains(text(),'Agency Name')]")
//	public WebElement AgencyEmployerNameLable;
	
	@FindBy(xpath="//input[@id='Email']")
	public WebElement Email;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	public WebElement AgencyEmployerEmail;
	
	@FindBy(xpath="//input[@id='ContactNumber']")
	public WebElement ContactNumber;
	
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
	public WebElement Designation;
	
	@FindBy(xpath="//input[@id='NoticePeriod']")
	public WebElement Noticeperiod;
	
	@FindBy(xpath="//input[@formcontrolname='IndustryId']")
	public WebElement Industry;
	
	@FindBy(xpath="//input[@formcontrolname='CurrentCity']")
	public WebElement CityofCandidate;
	
	@FindBy(xpath="//input[@formcontrolname='CityId']")
	public WebElement City;
	
	@FindBy(xpath="//select[@formcontrolname='Gender']")
	public WebElement Gender;
	
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
	
	//Initializing the Page objects
	
	public UpdateProfilePopupPage() {     //constructor
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
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
	
     
	
	public void UpdateProfileEmployer (String EmployerAddress, String EmployerOrganizationName, String EmployerWebsite, String EmployerCity) {
				
		Address.sendKeys(EmployerAddress);
	    OrganizationName.sendKeys(EmployerOrganizationName);
	    Website.sendKeys(EmployerWebsite);
	    City.sendKeys(EmployerCity);
	}
		
	public void UpdateProfileAgency (String AgencyAddress, String AgencyOrganizationName, String AgencyWebsite, String AgencyCity) {
				
		Address.sendKeys(AgencyAddress);
	    OrganizationName.sendKeys(AgencyOrganizationName);
	    Website.sendKeys(AgencyWebsite);
	    City.sendKeys(AgencyCity);
	}
		
	public void UpdateProfileCandidate (String title, String designation, String noticeperiod, String CandidateCity, String industry, String gender) {
				
		Title.sendKeys(title);
		Designation.sendKeys(designation);
		Designation.click();
		Noticeperiod.sendKeys(noticeperiod);
		Industry.sendKeys(industry);
		Industry.click();
		CityofCandidate.sendKeys(CandidateCity);
		CityofCandidate.click();
				
		Select select = new Select (Gender);
		select.selectByVisibleText(gender);
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
    
    
    public void VerifyAutoPopulatedFieldsOnUpdateCandidateProfile () {
 	   
 	   if (Title.getAttribute("value").isEmpty()) {
 		   
 		   System.out.println("Title field is blank and it is not autopopulated");
 	   }else {
 		   
 		   System.out.println("Title field is autopopulated on Update Profile Popup Window");
 	   }
 	   
 	   if (Name.getAttribute("value").isEmpty()) {
 		   
            System.out.println("Name field is blank and it is not autopopulated");
 	   }else {
 		   
    		   System.out.println("Name field is autopopulated on Update Profile Popup Window");
 	   }
 	   
 	   if (Email.getAttribute("value").isEmpty()) {
		   
		         System.out.println("Email field is blank and it is not autopopulated");
	       }else {
		   
	    	System.out.println("Email field is autopopulated on Update Profile Popup Window");
	       }
 	   
 	   if (ContactNumber.getAttribute("value").isEmpty()) {
   		   
		          System.out.println("ContactNumber field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("ContactNumber field is autopopulated on Update Profile Popup Window");
	       }

 	   if (Designation.getAttribute("value").isEmpty()) {
 		   
          System.out.println("Designation field is blank and it is not autopopulated");
	       }else {
		   
		         System.out.println("Designation field is autopopulated on Update Profile Popup Window");
	       }
      
 	   if (Noticeperiod.getAttribute("value").isEmpty()) {
           
		         System.out.println("NoticePeriod field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("NoticePeriod field is autopopulated on Update Profile Popup Window");
	       }

 	   if (Industry.getAttribute("value").isEmpty()) {
           
		        System.out.println("Industry field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("Industry field is autopopulated on Update Profile Popup Window");   
	       }

 	   if (Country.getAttribute("value").isEmpty()) {
           
		        System.out.println("Country field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("Country field is autopopulated on Update Profile Popup Window");
	       }
       
 	   if (CityofCandidate.getAttribute("value").isEmpty()) {
           
		         System.out.println("City field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("City field is autopopulated on Update Profile Popup Window");
	       }

 	   if (Gender.getAttribute("value").isEmpty()) {
           
		         System.out.println("Gender field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("Gender field is autopopulated on Update Profile Popup Window");
	       }

 	   if (ExperienceinYears.getAttribute("value").isEmpty()) {
           
		        System.out.println("Experience (in Years)field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("Experience (in Years) field is autopopulated as 0 on Update Profile Popup Window");
	       }
	   
 	   if (CTCperAnnum.getAttribute("value").isEmpty()) {
           
		        System.out.println("CTC (Per Annum) field is blank and it is not autopopulated");
	       }else {
		   
	    	   System.out.println("CTC (Per Annum) field is autopopulated as 0 on Update Profile Popup Window");
	       }
    
 }
}


