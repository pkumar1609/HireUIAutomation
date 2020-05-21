Feature: HireXpert Change Password feature

#TC:- 81, 10
Scenario Outline: Verify user should not be able to Login with old password after creating the new password

Given User open browser
When click on Register link       
And enter employer details "<EmployerName>" "<EmployerEmail>" "<EmployerContactNumber>" 
And Select value from dropdown for employer "<EmployerUserType>" "<timezone>" "<country>"
And click on Submit button
And User should get confirmation message and click on OK button
And enter employer email and password "<EmployerEmail>" "<password>" 
And click on Signin button
And Update Employer Profile  "<EmployerAddress>" "<EmployerOrganizationName>" "<EmployerWebsite>" "<EmployerCity>"
And click on Submit button
And Click on Change Password tab
And Enter the Current Password and New Password "<password>" "<newpassword>" "<confirmpassword>"
And click on Submit button
And Successful pop-up message display as "Your password has been successfully updated." with Ok button
And Click on Ok button
And click on logout tab
And login as employer with new password "<EmployerEmail>" "<newpassword>" 
And click on logout tab
And login as employer with the old password "<EmployerEmail>" "<password>"
Then User should get error message as "Wrong password. Please use forgot password link to reset your password." when he try to login with old password
And Close browser
Given User open browser
When click on Register link       
And enter Agency details "<AgencyName>" "<AgencyEmail>" "<AgencyContactNumber>" 
And Select value from dropdown for Agency "<AgencyUserType>" "<timezone>" "<country>"
And click on Submit button
And User should get confirmation message and click on OK button
And enter agency email and password "<AgencyEmail>" "<password>" 
And click on Signin button
And Update Agency Profile  "<AgencyAddress>" "<AgencyOrganizationName>" "<AgencyWebsite>" "<AgencyCity>"
And click on Submit button
And Click on Change Password tab
And Enter the Current Password and New Password "<password>" "<newpassword>" "<confirmpassword>"
And click on Submit button
And Successful pop-up message display as "Your password has been successfully updated." with Ok button
And Click on Ok button
And click on logout tab
And login as agency with new password "<AgencyEmail>" "<newpassword>" 
And click on logout tab
And login as agency with old password "<AgencyEmail>" "<password>"
Then User should get error message as "Wrong password. Please use forgot password link to reset your password." when he try to login with old password
And Close browser

Examples:

| EmployerName   | EmployerEmail           | EmployerContactNumber | EmployerUserType | timezone              | country | EmployerAddress | EmployerOrganizationName | EmployerWebsite     | EmployerCity | password | newpassword | confirmpassword |  AgencyName | AgencyEmail          | AgencyContactNumber | AgencyUserType | AgencyAddress | AgencyOrganizationName | AgencyWebsite     | AgencyCity |
|EmployerCP13    | employercp13@gmail.com  | 565566625             |   Employer       |  Indian Standard Time |  India  | Viman Nagar     | EmployerOrg              | www.employerorg.com | Pune         | 12345    | 12345678    | 12345678        | AgencyCP13  | Agencycp13@gmail.com | 98563248            | Agency         | Viman Nagar   | CPAgency               | www.cpagency.com  | Pune       |


















