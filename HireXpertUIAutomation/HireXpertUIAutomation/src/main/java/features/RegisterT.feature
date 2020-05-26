Feature: HireXpert Registration feature

#TC :- 4, 5, 12, 433
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
And click on Job Seeker(Candidate) Sign In link
And enter candidate email and password "<CandidateEmail>" "<password>" 
And click on Signin button
And Update candidate profile "<title>" "<designation>" "<noticeperiod>" "<industry>" "<CandidateCity>" "<gender>" "<expertiselevel>"
And click on save button
And Verify that user has redirected to correct page or not after filling the information in update profile
And Verify the username by which user is login

Examples: 
| EmployerName   |   EmployerEmail       | EmployerContactNumber | EmployerUserType | timezone             | country | password | EmployerAddress | EmployerOrganizationName | EmployerWebsite | EmployerCity | AgencyName   | AgencyEmail       | AgencyContactNumber | AgencyUserType | AgencyAddress | AgencyOrganizationName | AgencyWebsite  | AgencyCity | CandidateName   | CandidateEmail    | CandidateContactNumber | CandidateUserType | title        | designation     | noticeperiod | industry    | CandidateCity | gender | expertiselevel  |
| Jade05         |  jade05@gmail.com     | 211394644             | Employer         | Indian Standard Time | India   | 12345    | Viman Nagar     |  EmpMain                 | www.mainemp.com |   Pune       | Jade06       | jade06@gmail.com  |  123654789          | Agency         | Viman Nagar   |   MainAgency           | www.mainag.com | Pune       | Jade07          | jade07@gmail.com  | 325497878              | Candidate         |Test Engineer | Software Tester |   30         | IT-Software |  Pune         | Male   | Intermediate    |



#TC :- 6
Scenario Outline: To verify the registration functionality of already registered user.

Given User open browser
When click on Register link       
And enter details of already registered candidate "<candidatename>" "<candidateemail>" "<candidatecontactnumber>"
And Select value from dropdown of "<candidateusertype>" "<timezone>" "<country>"
And click on Submit button
Then User should get a error message as "User with 'mac31@gmail.com' already register with system as Candidate. Please use forgot password link to recover password."
And click on Close button
And Click on Yes button of confirmation popup
And Close the browser
Given User open browser
When click on Register link       
And enter details of already registered agency "<agencyname>" "<agencyemail>" "<agencycontactnumber>"
And Select value from dropdown of "<agencyusertype>" "<timezone>" "<country>"
And click on Submit button
Then User should get a error message as "User with 'mac32@gmail.com' already register with system as Agency. Please use forgot password link to recover password."
And click on Close button
And Click on Yes button of confirmation popup
And Close the browser
Given User open browser
When click on Register link  
And enter details of already registered employer "<employername>" "<employeremail>" "<employercontactnumber>"
And Select value from dropdown of "<employerusertype>" "<timezone>" "<country>"
And click on Submit button
Then User should get a error message as "User with 'mac33@gmail.com' already register with system as Employer. Please use forgot password link to recover password."
And click on Close button
And Click on Yes button of confirmation popup
And Close the browser


Examples: 
   | candidatename  |   candidateemail     | candidatecontactnumber  | candidateusertype  | timezone             | country |  agencyname  |   agencyemail     | agencycontactnumber  | agencyusertype  |   employername    |   employeremail   | employercontactnumber  | employerusertype  |
   | Mac31          |  mac31@gmail.com     | 211394644               | Candidate          | Indian Standard Time | India   | Mac32        |  mac32@gmail.com  | 211314644            | Agency          | Mac33             |  mac33@gmail.com  | 123456456              | Employer          | 
   
    

     
#TC:- 289
Scenario Outline: To verify user is not able to add one user with multiple roles.
     
Given User open browser
When click on Register link    
And enter all details and email id of a previously registered employer "<EmployerName>" "<EmployerEmail>" "<EmployerContactNumber>"  
And enter user type as the candidate "<usertype>" "<timezone>" "<country>"
And click on Submit button
Then Verify User should get error message as "User with 'tom30@gmail.com' already register with system as Candidate. Please use forgot password link to recover password." 
And click on Close button
And Click on Yes button of confirmation popup
And Close the browser
     
 Examples:     
  | EmployerName  |   EmployerEmail    | EmployerContactNumber  |  timezone              | country     | usertype  |
  | Tom30         | tom30@gmail.com    | 4654644478             | Indian Standard Time   | India       | Candidate |
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  