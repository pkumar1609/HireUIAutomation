package pages;

import org.openqa.selenium.By;   
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilPackage.baseclass;

public class RegisterPage extends baseclass{    //HomePage.java class is child of Testbase.java Class
	
	
	//Page Factory / Object Repository 

	@FindBy(linkText="Register-Its Free")
	WebElement Registerlink;
	
	@FindBy(linkText="Employer-Agency Sign In")
	WebElement EmployerAgencySignInlink;
	
	@FindBy(linkText="Job Seeker(Candidate) Sign In")
	WebElement JobseekerCandidateSignInlink;
	
	
	@FindBy(xpath="//input[@formcontrolname='Name']")
	WebElement Name;
	
	@FindBy(xpath="//input[@formcontrolname='Email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@formcontrolname='ContactNumber']")
	WebElement ContactNumber;
	
	@FindBy(xpath="//select[@formcontrolname='UserType']")
	WebElement UserType;
	
	@FindBy(xpath="//select[@formcontrolname='TimeZone']")
    WebElement TimeZone;
	
	@FindBy(xpath="//select[@formcontrolname='countryId']")
	WebElement Country;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement Submitbtn;
	
	@FindBy(xpath="//button[@id='alertModalCloseBtn']")
	WebElement OKbtn;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/newuser/div[3]/button[1]")
	WebElement Closebtn;
	   //button[@type='button' and @class='btn btn-outline-dark']
	///html/body/ngb-modal-window/div/div/newuser/div[3]/button[1]
	
	@FindBy(id="confirmModalBtn")
	WebElement Yesbtn;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement Emailaddress;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	WebElement Signinbtn;
	
	
	
	//Initializing the Page objects
	
	public RegisterPage() {     //constructor
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
	}
	
	
	//Actions
	
	public void clickRegister() {
		
		Registerlink.click();
	}
	
   public void clickEmployerAgencySignInlink() throws InterruptedException {
		Thread.sleep(2000);
	   EmployerAgencySignInlink.click();
	}
   
   public void clickJobseekerCandidateSignInlinklink() {
		
	   JobseekerCandidateSignInlink.click();
	}
   
	public void enterName(String EmployerName) {
		
		Name.sendKeys(EmployerName);
		
	}
		
    public void enterEmail(String EmployerEmail) 
    {
		Email.sendKeys(EmployerEmail);
    }
		
		public void enterContactNumber(String EmployerContactNumber) {
			
			ContactNumber.sendKeys(EmployerContactNumber);
		
	}
		
		public void registeremployerdetails (String EmployerName,String EmployerEmail, String EmployerContactNumber ) {
			
			Name.sendKeys(EmployerName);
			Email.sendKeys(EmployerEmail);
			ContactNumber.sendKeys(EmployerContactNumber);
		}
		
   public void registerAgencydetails (String AgencyName,String AgencyEmail, String AgencyContactNumber ) {
			
			Name.sendKeys(AgencyName);
			Email.sendKeys(AgencyEmail);
			ContactNumber.sendKeys(AgencyContactNumber);
		}
   
   public void registerCandidatedetails (String CandidateName,String CandidateEmail, String CandidateContactNumber ) {
		
		Name.sendKeys(CandidateName);
		Email.sendKeys(CandidateEmail);
		ContactNumber.sendKeys(CandidateContactNumber);
	}
   
   public void alreadyregisterUserdetails (String name,String email, String contactnumber ) {
		
		Name.sendKeys(name);
		Email.sendKeys(email);
		ContactNumber.sendKeys(contactnumber);
	}
   
     public void selectUserType(String usertype) {
    	 
    	 Select select = new Select (UserType);
		 select.selectByVisibleText(usertype);
			
    }
		
		public void selectTimeZone(String timezone) {
				
			Select select = new Select (TimeZone);
			 select.selectByVisibleText(timezone);
			 
	}
			
		public void selectCountry(String country)
		{
			
			Select select = new Select (Country);
			select.selectByVisibleText(country);
		}
		
public void registeremployerdetails1(String EmployerUserType, String timezone, String country ) {
			
	Select select1 = new Select (UserType);
	 select1.selectByVisibleText(EmployerUserType);
			
	 Select select2 = new Select (TimeZone);
	 select2.selectByVisibleText(timezone);
	 
	 Select select3 = new Select (Country);
	 select3.selectByVisibleText(country);
	}

	public void registerAgencydetails1(String AgencyUserType, String timezone, String country ) { 
	
	 Select select4 = new Select (UserType);
	 select4.selectByVisibleText(AgencyUserType);
			
	 Select select5 = new Select (TimeZone);
	 select5.selectByVisibleText(timezone);
	 
	 Select select6 = new Select (Country);
	 select6.selectByVisibleText(country);
	
	}
	
	public void registerCandidatedetails1(String CandidateUserType, String timezone, String country ) { 
	
	 Select select7 = new Select (UserType);
	 select7.selectByVisibleText(CandidateUserType);
			
	 Select select8 = new Select (TimeZone);
	 select8.selectByVisibleText(timezone);
	 
	 Select select9 = new Select (Country);
	 select9.selectByVisibleText(country);
	
}

public void alreadyregisterUserdetails1(String usertype, String timezone, String country ) {
	
	Select select1 = new Select (UserType);
	 select1.selectByVisibleText(usertype);
			
	 Select select2 = new Select (TimeZone);
	 select2.selectByVisibleText(timezone);
	 
	 Select select3 = new Select (Country);
	 select3.selectByVisibleText(country);
	}

		public void enterEmployerEmailandPassword (String EmployerEmail, String password) {
			
			Emailaddress.clear();
			
			Emailaddress.sendKeys(EmployerEmail);
			
			Password.clear();
			
			Password.sendKeys(password);
		}
		
       public void enterAgencyEmailandPassword (String AgencyEmail, String password) {
    	   
    	   Emailaddress.clear();
			
			Emailaddress.sendKeys(AgencyEmail);
			
			Password.clear();
			
			Password.sendKeys(password);
		}
       
       public void enterCandidateEmailandPassword (String CandidateEmail, String password) {
    	   
    	    Emailaddress.clear();
			
			Emailaddress.sendKeys(CandidateEmail);
			
			Password.clear();
			
			Password.sendKeys(password);
		}
		
		
	     public void ClickSubmitbtn () {
		
		      Submitbtn.click();
	}
				
	    public void Clickokbtn () {
		
		
		      OKbtn.click();
   }
		
         public void Clickclosebtn () {
	
	
	         Closebtn.click();
  }
		
		

public void verifythefieldsonregisterdialogbox () {
	
	if((Name).isDisplayed()){

		System.out.println("Name Element is Visible");

		}else{

		System.out.println("Name Element is InVisible");

		}
	
	if((Email).isDisplayed()){

		System.out.println("Email Element is Visible");

		}else{

		System.out.println("Email Element is InVisible");
	
        }
	if((ContactNumber).isDisplayed()){

		System.out.println("Contact Number Element is Visible");

		}else{

		System.out.println("Contact Number Element is InVisible");
		}
	
	if((UserType).isDisplayed()){

		System.out.println("User Type Element is Visible");

		}else{

		System.out.println("User Type Element is InVisible");
		}
	
	if((TimeZone).isDisplayed()){

		System.out.println("TimeZone Element is Visible");

		}else{

		System.out.println("TimeZone Element is InVisible");
		}
	
	if(( Country).isDisplayed()){

		System.out.println("Country Element is Visible");

		}else{

		System.out.println("Country Element is InVisible");

		}
}

       public void ClickYesbtn () 
       {
    	   
    	   //WebDriverWait Wait = new WebDriverWait(driver,30);
   		//Wait.until(ExpectedConditions.elementToBeClickable(Yesbtn));

		Yesbtn.click();
}
       
       public void enteremailaddress (String emailaddress2) {
    	   Emailaddress.sendKeys(emailaddress2);
       }
       
       
       public void enterpassword(String password) {
    	   Password.sendKeys(password);
       }
       
       public void Loginwithemployernewpassword(String EmployerEmail, String newpassword) {
    	   
    	   Emailaddress.sendKeys(EmployerEmail);
    	   Password.sendKeys(newpassword);
       }
       
     public void Loginwithemployeroldpassword(String EmployerEmail, String password) {
    	   
    	   Emailaddress.sendKeys(EmployerEmail);
    	   Password.sendKeys(password);
       }
       
       public void Loginwithagencynewpassword(String AgencyEmail, String newpassword) {
    	   Emailaddress.sendKeys(AgencyEmail);
    	   Password.sendKeys(newpassword);
       }
       
       public void Loginwithagencyoldpassword(String AgencyEmail, String password) {
    	   Emailaddress.sendKeys(AgencyEmail);
    	   Password.sendKeys(password);
       }
       
       public void loginwithsamecandidate() {
    	   Emailaddress.sendKeys("candidate01@gmail.com");
    	   Password.sendKeys("12345");
    	   Signinbtn.click();
       }
     
       public void employerlogin() {
    	   Emailaddress.sendKeys(prop.getProperty("employerusername"));
    	   Password.sendKeys(prop.getProperty("password"));
    	   Signinbtn.click();
       }
       
       public void employerloginforAddCandidate() {
    	   Emailaddress.sendKeys(prop.getProperty("employerusername"));
    	   Password.sendKeys(prop.getProperty("password"));
    	   Signinbtn.click();
       }
 
 
       public void agencylogin() {
    	   Emailaddress.sendKeys(prop.getProperty("agencyusername"));
    	   Password.sendKeys(prop.getProperty("password"));
    	   Signinbtn.click();
    	   
       }
       public void ClickSigninbtn () {
    	   Signinbtn.click();
       }
       
      
}
