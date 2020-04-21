package com.hirexpert.qa.pages;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.hirexpert.qa.base.Testbase;

public class HomePage extends Testbase{    //HomePage.java class is child of Testbase.java Class
	
	
	//Page Factory / Object Repository 

	@FindBy(linkText="Register")
	WebElement Registerlink;
	
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
	
	@FindBy(xpath="//button[@class='btn Cbtn-primary']")
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
	
	@FindBy(xpath="//button[@class='btn w-100 Cbtn-primary mt-1 text-left CustomPointer']")
	WebElement Signinbtn;
	
	
	
	//Initializing the Page objects
	
	public HomePage() {     //constructor
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
	}
	
	
	//Actions
	
	public void clickRegister() {
		
		//WebDriverWait Wait = new WebDriverWait(driver,240);
		//Wait.until(ExpectedConditions.elementToBeClickable(Registerlink));
		
		Registerlink.click();
	}


	public void enterName(String name) {
		
		Name.sendKeys(name);
		
	}
		
    public void enterEmail(String email) {
		
		Email.sendKeys(email);
		
    }
		
		public void enterContactNumber(String contactno) {
			
			ContactNumber.sendKeys(contactno);
		
	}
		
     public void selectUserType(String usertype) {
    	 
    	 Select select = new Select (UserType);
		 select.selectByVisibleText(usertype);
			
			//UserType.sendKeys(usertype);
    }
		
		public void selectTimeZone(String timezone) {
				
			Select select = new Select (TimeZone);
			 select.selectByVisibleText(timezone);
			 
			}
			
		public void selectCountry(String country) {
			
			Select select = new Select (Country);
			 select.selectByVisibleText(country);
			
			//TimeZone.sendKeys(country);
		}
		
	public void ClickSubmitbtn () {
		
		//WebDriverWait Wait = new WebDriverWait(driver,30);
		//Wait.until(ExpectedConditions.elementToBeClickable(Submitbtn));
	
		Submitbtn.click();
	}
				
	public void Clickokbtn () {
		
		//WebDriverWait Wait = new WebDriverWait(driver,30);
		//Wait.until(ExpectedConditions.elementToBeClickable(OKbtn));
	
		OKbtn.click();
}
		
public void Clickclosebtn () {
	
	//WebDriverWait Wait = new WebDriverWait(driver,240);
	//Wait.until(ExpectedConditions.elementToBeClickable(Closebtn));
	
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

       public void ClickYesbtn () {
    	   
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
       
       
     
       public void employerlogin() {
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
