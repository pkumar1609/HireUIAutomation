Feature: HireXpert Update Profile feature

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
And enter candidate email and password  "<CandidateEmail>" "<password>" 
And click on Signin button
And click on ok button of confirmation popup.
And Click on Update Profile tab
And verify user login as Candidate has redirect on correct candidate update profile or not
Then verify the Auto Populated fields on candidate update profile popup window
And Update Candidate Profile "<title>" "<designation>" "<noticeperiod>" "<industry>" "<CandidateCity>" "<gender>" "<expertiselevel>"
And click on save button
And click on ok button of confirmation popup
And Make changes in candidate profile "<noticeperiod>"
And click on save button
And click on ok button of confirmation popup


Examples:

| AgencyName   | AgencyEmail            | AgencyContactNumber | AgencyUserType | timezone              | country | AgencyAddress | AgencyOrganizationName | AgencyWebsite     | AgencyCity | organizationname | password |EmployerName  | EmployerEmail            | EmployerContactNumber | EmployerUserType | EmployerAddress | EmployerOrganizationName | EmployerWebsite     | EmployerCity | organizationname | CandidateName  | CandidateEmail           | CandidateContactNumber | CandidateUserType     | country |title         | designation     | noticeperiod | industry    | CandidateCity | gender | expertiselevel | 
| UPAgency01   | upagency01@gmail.com   | 5685263125          |   Agency       | Indian Standard Time  |  India  | Viman Nagar   | AgencyOrg              | www.agencyorg.com | Pune       | OrgAgency        | 12345    |UPEmployer01  | upemployer01@gmail.com   | 565566625             |   Employer       | Viman Nagar     | EmployerOrg              | www.employerorg.com | Pune         | OrgEmployer      |UPCandidate01   | upcandidate01@gmail.com  | 9564783126             | Candidate             | India   |Test Engineer | Software Tester |   30         | IT-Software |  Pune         | Male   | Intermediate   |


#TC ID :- 84,85,31,35,17,87,57,19,86,34,91,60


# Change name, email of employer/agency/candidate



