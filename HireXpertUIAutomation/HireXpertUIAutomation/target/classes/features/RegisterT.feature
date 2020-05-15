Feature: HireXpert Registration feature

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
And enter employer email and password "<EmployerEmail>" "<password>" 
And click on Signin button
And Update employer profile "<EmployerAddress>" "<EmployerOrganizationName>" "<EmployerWebsite>" "<EmployerCity>" 
And click on Submit button
#And Verify the employer username by which employer is login
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
And enter agency email and password "<AgencyEmail>" "<password>" 
And click on Signin button
And Update agency profile"<AgencyAddress>" "<AgencyOrganizationName>" "<AgencyWebsite>" "<AgencyCity>" 
And click on Submit button
#And Verify the agency username by which agency is login
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
And enter candidate email and password "<CandidateEmail>" "<password>" 
And click on Signin button
And Update candidate profile "<title>" "<designation>" "<noticeperiod>" "<industry>" "<CandidateCity>" "<gender>" "<expertiselevel>"
And click on save button
#And Verify the candidate username by which candidate is login

Examples: 
| EmployerName  |   EmployerEmail     | EmployerContactNumber | EmployerUserType | timezone             | country | password | EmployerAddress | EmployerOrganizationName | EmployerWebsite | EmployerCity | AgencyName | AgencyEmail     | AgencyContactNumber | AgencyUserType | AgencyAddress | AgencyOrganizationName | AgencyWebsite  | AgencyCity | CandidateName | CandidateEmail  | CandidateContactNumber | CandidateUserType | title        | designation     | noticeperiod | industry    | CandidateCity | gender | expertiselevel |
| Tom38         |  tom38@gmail.com    | 211394644             | Employer         | Indian Standard Time | India   | 12345    | Viman Nagar     |  EmpMain                 | www.mainemp.com |   Pune       | Tom39      | tom39@gmail.com |  123654789          | Agency         | Viman Nagar   |   MainAgency           | www.mainag.com | Pune       | Tom40         | tom40@gmail.com | 325497878              | Candidate         |Test Engineer | Software Tester |   30         | IT-Software |  Pune         | Male   | Intermediate    |





Scenario Outline: To verify the registration functionality of already registered user.

Given User open browser
When click on Register link       
And enter details of already registered user "<name>" "<email>" "<contactnumber>"
And Select value from dropdown of "<usertype>" "<timezone>" "<country>"
And click on Submit button
Then User should get a error message with OK button and click on OK button
And click on Close button
And Close the browser

Examples: 
   | name  |   email           | contactnumber  | usertype  | timezone             | country | password | emailaddress    |
   | Mac31 |  mac31@gmail.com  | 211394644      | Candidate | Indian Standard Time | India   | 12345    | mac28@gmail.com |
   | Mac32 |  mac32@gmail.com  | 211314644      | Agency    | Indian Standard Time | India   | 12345    | mac29@gmail.com |
   | Mac33 |  mac33@gmail.com  | 123456456      | Employer  | Indian Standard Time | India   | 12345    | mac30@gmail.com |

     
     
     
     
     
     
     
     
     
     
     