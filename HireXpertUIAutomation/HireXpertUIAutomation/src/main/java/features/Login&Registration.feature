Feature: HireXpert Login & Registration feature

	@BVT @Regression
	Scenario Outline: To verify the fields/button on Registration popup window and check functionality of Registration
	
	Given User open browser
	When click on Register link       
	And verify the fields and buttons present on the register dialog box
	And click on Close button
	And click on Register link
	And enter employer details "<EmployerName>" "<EmployerEmail>" "<EmployerContactNumber>" 
	And Select value from dropdown for employer "<EmployerUserType>" "<timezone>" "<country>"
	And click on Close button
	And Click on Yes button of confirmation popup
	And click on Register link
	And enter employer details "<EmployerName>" "<EmployerEmail>" "<EmployerContactNumber>" 
	And Select value from dropdown for employer "<EmployerUserType>" "<timezone>" "<country>"
	And click on Submit button
	And User should get confirmation message and click on OK button
	And click on Login link
	And click on Employer-Agency SignIn link
	And enter employer email and password "<EmployerEmail>" "<password>" 
	And click on Signin button
	And Update employer profile "<EmployerAddress>" "<EmployerOrganizationName>" "<EmployerWebsite>" "<EmployerCity>" 
	And click on Submit button
	And click on ok button
	And Verify that user has redirected to correct page or not after filling the information in update profile 
	And Verify the username by which user is login
	
	And User open browser
	And click on Register link       
	And verify the fields and buttons present on the register dialog box
    And click on Close button
	And click on Register link  
	And enter agency details "<AgencyName>" "<AgencyEmail>" "<AgencyContactNumber>" 
	And Select value from dropdown for agency "<AgencyUserType>" "<timezone>" "<country>"
	And click on Close button
      And Click on Yes button of confirmation popup 
	And click on Register link 
	And enter agency details "<AgencyName>" "<AgencyEmail>" "<AgencyContactNumber>" 
	And Select value from dropdown for agency "<AgencyUserType>" "<timezone>" "<country>"
	And click on Submit button
	And User should get confirmation message and click on OK button
	And click on Login link
	And click on Employer-Agency SignIn link
	And enter agency email and password "<AgencyEmail>" "<password>" 
	And click on Signin button
	And Update agency profile"<AgencyAddress>" "<AgencyOrganizationName>" "<AgencyWebsite>" "<AgencyCity>" 
	And click on Submit button
	And click on ok button
	And Verify that user has redirected to correct page or not after filling the information in update profile
	And Verify the username by which user is login


	And User open browser
	And click on Register link       
	And verify the fields and buttons present on the register dialog box
	And click on Close button
	And click on Register link  
	And enter candidate details "<CandidateName>" "<CandidateEmail>" "<CandidateContactNumber>" 
	And Select value from dropdown for candidate "<CandidateUserType>" "<timezone>" "<country>"
	And click on Close button
	And Click on Yes button of confirmation popup
	And click on Register link  
	And enter candidate details "<CandidateName>" "<CandidateEmail>" "<CandidateContactNumber>" 
And Select value from dropdown for candidate "<CandidateUserType>" "<timezone>" "<country>"
	And click on Submit button
	And User should get confirmation message and click on OK button
	And click on Login link
	And click on Job Seeker(Candidate) Sign In link
	And enter candidate email and password "<CandidateEmail>" "<password>" 
	And click on Signin button
And click on ok button
	And Verify that user has redirected to correct page or not after filling the information in update profile
	And Verify the username by which user is login
	
	Examples: 
	| EmployerName   |   EmployerEmail       | EmployerContactNumber | EmployerUserType | timezone             | country | password | EmployerAddress | EmployerOrganizationName | EmployerWebsite | EmployerCity | AgencyName   | AgencyEmail      | AgencyContactNumber | AgencyUserType | AgencyAddress | AgencyOrganizationName | AgencyWebsite  | AgencyCity | CandidateName   | CandidateEmail    | CandidateContactNumber | CandidateUserType | title        | designation     | noticeperiod | industry    | CandidateCity | gender | expertiselevel  |
	| TXE14          |  txe14@gmail.com      | 285248688             | Employer         | Indian Standard Time | India   | 12345    | Viman Nagar     |  EmpMain                 | www.mainemp.com |   Pune       | Age14        | age14@gmail.com  |  1236556659         | Agency         | Viman Nagar   |   MainAgency           | www.mainag.com | Pune       | Mike14          | mike14@gmail.com  | 369497878              | Candidate         |Test Engineer | Software Tester |   30         | IT-Software |  Pune         | Male   | Intermediate    |
	
	#TC :- 4, 5, 12, 433

	# Change name, email of employer/agency/candidate


	@BVT
	Scenario Outline: To verify the registration functionality of already registered user and to verify user is not able to add one user with multiple roles.
	
	Given User open browser
	When click on Register link       
	And enter details of already registered user "<employername>" "<employeremail>" "<employercontactnumber>"
	And Select value from dropdown of "<candidateusertype>" "<timezone>" "<country>"
	And click on Submit button
	And click on Yes button
	Then User should get a error message as "User with 'employermain01@gmail.com' already register with system as Employer. You can not register same email Id as Candidate."
	And click on Close button
	And Click on Yes button of confirmation popup
	And Close the browser
	Given User open browser
		When click on Register link       
	And enter details of already registered agency "<agencyname>" "<agencyemail>" "<agencycontactnumber>"
	And Select value from dropdown of "<candidateusertype>" "<timezone>" "<country>"
		And click on Submit button
	And click on Yes button
	Then User should get a error message as "User with 'agencymain01@gmail.com' already register with system as Agency. You can not register same email Id as Candidate."
	And click on Close button
	And Click on Yes button of confirmation popup
	And Close the browser
	Given User open browser
	When click on Register link  
	And enter details of already registered employer "<candidatename>" "<candidateemail>" "<candidatecontactnumber>"
	And Select value from dropdown of "<employerusertype>" "<timezone>" "<country>"
	And click on Submit button
	And click on Yes button
	Then User should get a error message as "User with 'candidatemain01@gmail.com' already register with system as Candidate. You can not register same email Id as Employer."
	And click on Close button
	And Click on Yes button of confirmation popup
	And Close the browser
	
	
	Examples: 
	   | employername    |   employeremail              | employercontactnumber   | candidateusertype  | timezone             | country |  agencyname   |   agencyemail             | agencycontactnumber  |   candidatename   |   candidateemail             | candidatecontactnumber  | employerusertype  |
	   | employermain01  |  employermain01@gmail.com    | 211394644               | Candidate          | Indian Standard Time | India   | agencymain01  |  agencymain01@gmail.com   | 211314644            | candidatemain01   |  candidatemain01@gmail.com   | 123456456               | Employer          | 
	   
	#TC :- 6, 289
	
	# no change for this scenario 
	# if db clear then register candidatemain01@gmail.com as candidate

  
	 @BVT
	Scenario Outline: Verify user should not be able to Login with old password after creating the new password
	
	Given User open browser
	When click on Register link       
	And enter employer details "<EmployerName>" "<EmployerEmail>" "<EmployerContactNumber>" 
	And Select value from dropdown for employer "<EmployerUserType>" "<timezone>" "<country>"
	And click on Submit button
	And User should get confirmation message and click on OK button
	And click on Login link
	And click on Employer-Agency SignIn link
	And enter employer email and password "<EmployerEmail>" "<password>" 
	And click on Signin button
	And Update Employer Profile  "<EmployerAddress>" "<EmployerOrganizationName>" "<EmployerWebsite>" "<EmployerCity>"
	And click on Submit button
	And click on ok button
	And Click on Change Password tab
	And Enter the Current Password and New Password "<password>" "<newpassword>" "<confirmpassword>"
	And click on Submit button
	And Successful pop-up message display as "Your password has been successfully updated." with Ok button
	And Click on Ok button
	And click on logout tab
	And click on Login link
	And click on Employer-Agency SignIn link
	And login as employer with new password "<EmployerEmail>" "<newpassword>" 
	And click on ok button
	And click on logout tab
	And click on Login link
	And click on Employer-Agency SignIn link
	And login as employer with the old password "<EmployerEmail>" "<password>"
	Then User should get error message as "Wrong password. Please use forgot password link to reset your password." when he try to login with old password
	And Close browser
	
	Given User open browser
	When click on Register link       
	And enter Agency details "<AgencyName>" "<AgencyEmail>" "<AgencyContactNumber>" 
	And Select value from dropdown for Agency "<AgencyUserType>" "<timezone>" "<country>"
	And click on Submit button
	And User should get confirmation message and click on OK button
	And click on Login link
	And click on Employer-Agency SignIn link
	And enter agency email and password "<AgencyEmail>" "<password>" 
	And click on Signin button
	And Update Agency Profile  "<AgencyAddress>" "<AgencyOrganizationName>" "<AgencyWebsite>" "<AgencyCity>"
	And click on Submit button
	And click on ok button
	And Click on Change Password tab
	And Enter the Current Password and New Password "<password>" "<newpassword>" "<confirmpassword>"
	And click on Submit button
	And Successful pop-up message display as "Your password has been successfully updated." with Ok button
    And Click on Ok button
	And click on logout tab
	And click on Login link
	And click on Employer-Agency SignIn link
	And login as agency with new password "<AgencyEmail>" "<newpassword>" 
	And click on ok button
	And click on logout tab
	And click on Login link
	And click on Employer-Agency SignIn link
	And login as agency with old password "<AgencyEmail>" "<password>"
	Then User should get error message as "Wrong password. Please use forgot password link to reset your password." when he try to login with old password
	And Close browser
	
	Examples:
	
	| EmployerName  | EmployerEmail            | EmployerContactNumber | EmployerUserType | timezone              | country | EmployerAddress | EmployerOrganizationName | EmployerWebsite     | EmployerCity | password | newpassword | confirmpassword |  AgencyName  | AgencyEmail           | AgencyContactNumber | AgencyUserType | AgencyAddress | AgencyOrganizationName | AgencyWebsite     | AgencyCity |
	|CPemployer09   | cpemployer09@gmail.com   | 565566625             |   Employer       |  Indian Standard Time |  India  | Viman Nagar     | EmployerOrg              | www.employerorg.com | Pune         | 12345    | 12345678    | 12345678        | CPagency09   | CPagency09@gmail.com  |  98563248           | Agency         | Viman Nagar   | CPAgency               | www.cpagency.com  | Pune       |
	
	
	#TC:- 81, 10
	
	#Change name, email of agency & employer
	
	  
	@BVT @Regression
	Scenario Outline: Verify that Agency, Employer & Candidate is not able to continue without completing the profile. Also Agency, Employer $ Candidate is able to update profile.
	
	Given User open browser
	When click on Register link 
	And enter agency details "<AgencyName>" "<AgencyEmail>" "<AgencyContactNumber>" 
	And Select value from dropdown for agency "<AgencyUserType>" "<timezone>" "<country>"
	And click on Submit button
	And User should get confirmation message and click on OK button
	And click on Login link
	And click on Employer-Agency SignIn link
	And enter agency email and password "<AgencyEmail>" "<password>" 
	And click on Signin button
	And Click on Close button on Agency Update Profile popup
	And Click on Yes button on the confirmation message
	And Click on Close button on Agency Update Profile popup
	And Click on No button on the confirmation message
	And click on Login link
And click on Employer-Agency SignIn link
	And Login with that agency "<AgencyEmail>" "<password>"
	And click on Signin button
	And verify user login as Agency has redirect on correct agency update profile or not
	Then verify the Auto Populated fields on agency update profile popup window
	And Verify that the critical fields on Update Agency Profile popup are not editable
And Update Agency Profile  "<AgencyAddress>" "<AgencyOrganizationName>" "<AgencyWebsite>" "<AgencyCity>"
	And click on Submit button
	And click on ok button
And Click on Update Profile tab
And Make changes in Agency profile "<organizationname>"
	And click on Submit button
	
	And User open browser
When click on Register link 
	And enter employer details "<EmployerName>" "<EmployerEmail>" "<EmployerContactNumber>" 
	And Select value from dropdown for employer "<EmployerUserType>" "<timezone>" "<country>"
	And click on Submit button
	And User should get confirmation message and click on OK button
	And click on Login link
	And click on Employer-Agency SignIn link
	And enter employer email and password "<EmployerEmail>" "<password>" 
	And click on Signin button
	And Click on Close button on Employer Update Profile popup
	And Click on Yes button on the confirmation message
	And Click on Close button on Employer Update Profile popup
	And Click on No button on the confirmation message
	And click on Login link
	And click on Employer-Agency SignIn link
	And Login with that employer "<EmployerEmail>" "<password>"
	And click on Signin button
	And verify user login as Employer has redirect on correct employer update profile or not
	Then verify the Auto Populated fields on employer update profile popup window
	And Verify that the critical fields on Update Employer Profile popup are not editable
And Update Employer Profile  "<EmployerAddress>" "<EmployerOrganizationName>" "<EmployerWebsite>" "<EmployerCity>"
	And click on Submit button
	And click on ok button
	And Click on Update Profile tab
	And Make changes in Employer profile "<organizationname>"
	And click on Submit button
	
	And User open browser
	When click on Register link 
	And enter candidate details "<CandidateName>" "<CandidateEmail>" "<CandidateContactNumber>" 
	And Select value from dropdown for candidate "<CandidateUserType>" "<timezone>" "<country>"
	And click on Submit button
	And User should get confirmation message and click on OK button
	And click on Login link
	And click on Job Seeker(Candidate) Sign In link
	And enter candidate email and password "<CandidateEmail>" "<password>"
	And click on Signin button
	And click on ok button
	And Click on Update Profile tab
	And verify user login as Candidate has redirect on correct candidate update profile or not
	Then verify the Auto Populated fields on candidate update profile popup window
	And Update Candidate Profile "<title>" "<designation>" "<noticeperiod>" "<industry>" "<CandidateCity>" "<gender>" "<expertiselevel>"
	And click on save button
	And click on ok button
	And Make changes in candidate profile "<noticeperiod>"
	And click on save button
	And click on ok button



	Examples:

	| AgencyName   | AgencyEmail            | AgencyContactNumber | AgencyUserType | timezone              | country | AgencyAddress | AgencyOrganizationName | AgencyWebsite     | AgencyCity | organizationname | password |EmployerName  | EmployerEmail            | EmployerContactNumber | EmployerUserType | EmployerAddress | EmployerOrganizationName | EmployerWebsite     | EmployerCity | organizationname | CandidateName  | CandidateEmail           | CandidateContactNumber | CandidateUserType     | country |title         | designation     | noticeperiod | industry    | CandidateCity | gender | expertiselevel | 
	| UPAgency16   | upagency16@gmail.com   | 5685263125          |   Agency       | Indian Standard Time  |  India  | Viman Nagar   | AgencyOrg              | www.agencyorg.com | Pune       | OrgAgency        | 12345    |UPEmployer16  | upemployer16@gmail.com   | 565566625             |   Employer       | Viman Nagar     | EmployerOrg              | www.employerorg.com | Pune         | OrgEmployer      |UPCandidate16   | upcandidate16@gmail.com  | 9564783126             | Candidate             | India   |Test Engineer | Software Tester |   30         | IT-Software |  Pune         | Male   | Intermediate   |

	
     #TC ID :- 84,85,31,35,17,87,57,19,86,34,91,60
	# Change name, email of employer/agency/candidate

	
@Regression
	Scenario Outline: Forgot password functionality for not registered user
	
	Given User open browser
		#And click on Login link
#	When click on Employer-Agency SignIn link
	And Click on forgot password link
	And Enter an email id which is not registered and click on submit button "<emailid>" 
	Then Verify that user get an error message as "aa11bb@gmail.com is not registered with us. Please register first." or not
	
	Examples:
	
	| emailid         |
	|aa11bb@gmail.com |
	
	#TC:- 83
	
	# No change is required. In email id there should be email on non registered user.
	 
  