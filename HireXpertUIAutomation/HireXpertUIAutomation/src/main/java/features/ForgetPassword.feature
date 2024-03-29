Feature: Forget Password
	  
@forgetPassword
Scenario Outline: Verify when candidate enters correct email id hirexpert.
    Given candidate Navigate to HireXpert 
    When  User login with valid candidate email id and password."<Username>","<Password>"
    Then Users should be able to see a dashboard page.
   	Examples: 
      |Username              |Password |
	  |candidate100@gmail.com|12345678 |
	  
@forgetPassword
Scenario Outline: Wrong email id entered

    Given User Navigate  to HireXpert
    When  User  login into wrong email id and password."<Username>","<Password>"
    Then Job provider gets  an Error message “ user with e50gmail.com” doesn't exist in the system.
    Examples: 
      |Username     |Password|
	  |e50gmail.com |12345   |
	  
@forgetPassword
Scenario Outline: Verify When the job provider enters the correct email id.
    Given Navigate to HireXpert 
    When  User login with valid email id and password."<Username>","<Password>"
    Then Users should be able to see a dashboard page.
    Examples: 
      |Username             |Password|
	  |employer101@gmail.com|12345   |
	  |agency101@gmail.com  |12345   |	
	    
@forgetPassword
Scenario Outline: To Verify reset password functionality for employer user
    Given User logged in to HireXpert "admin@talentxpert.com" and "<Password>"
    And admin creates new support user "support100" "<Username1>" "8041012301" "Support" "India" "<TimeZone>"
    And Logout from admin user login  
    When click on Register link   
    And New HireXpert application user employer registration "empFP01" "empFP01@gmail.com" "6521012012" "Employer" "India" "<TimeZone>" "<Password>" "Pune" "empFP01ORG" "empFP01ORG.com" "Pune"
    And Logout from App
    When User click forgot Password link on the login page.
    And Enter an  email id and Click on the Submit button."<Username>"
    Then User get an message "Your password have been reset send to your registered email id please check"
    And Users should get an email with a new password. "<Username1>","<Password1>","<Username>","<Username2>"    
    And Users should not be able to login with an old password."<Username>","<Password2>"
    And Users should be able to login with a new password."<Password>"
	Examples: 
      |Username          |Password| Username1           |Password1|Password2|Username2 |TimeZone |
      |empFP01@gmail.com |12345   | support100@gmail.com|12345    |123456   |empFP01   |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|
 		  

	  
	  
	  