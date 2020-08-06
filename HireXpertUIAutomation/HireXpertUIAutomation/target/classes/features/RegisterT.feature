Feature: HireXpert Registration feature

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
And click on ok button of confirmation popup.
And Verify that user has redirected to correct page or not after filling the information in update profile
And Verify the username by which user is login

Examples: 
| EmployerName   |   EmployerEmail       | EmployerContactNumber | EmployerUserType | timezone             | country | password | EmployerAddress | EmployerOrganizationName | EmployerWebsite | EmployerCity | AgencyName   | AgencyEmail      | AgencyContactNumber | AgencyUserType | AgencyAddress | AgencyOrganizationName | AgencyWebsite  | AgencyCity | CandidateName   | CandidateEmail    | CandidateContactNumber | CandidateUserType | title        | designation     | noticeperiod | industry    | CandidateCity | gender | expertiselevel  |
| TXE01          |  txe01@gmail.com      | 285248688             | Employer         | Indian Standard Time | India   | 12345    | Viman Nagar     |  EmpMain                 | www.mainemp.com |   Pune       | Age01        | age01@gmail.com  |  1236556659         | Agency         | Viman Nagar   |   MainAgency           | www.mainag.com | Pune       | Mike01          | mike01@gmail.com  | 369497878              | Candidate         |Test Engineer | Software Tester |   30         | IT-Software |  Pune         | Male   | Intermediate    |

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

  
  
 
  
  
  
  
  
  
  
  
  
  