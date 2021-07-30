Feature: HireXpert Reset password Feature. 


@ResetPassword 
Scenario Outline: Verify change password for all Employer user
Given User open browser
When click on Register link    
And New HireXpert application user employer registration "empresetp01" "empresetp01@gmail.com" "6001012012" "Employer" "India" "<TimeZone>" "<Password1>" "Pune" "empresetp01ORG" "empresetp01ORG.com" "Pune" 
When when the user clicks on the change password on the profile window 
When The change password pop up window appears, and the user fills all the data "<curPassword>","<nPassword>","<confirmPassword>" 
And clicks on the submit button 
And Successful pop-up message dispaly as "Your password has been successfully updated  " with OK button 
Then Logout from myAccount 
And Users should not be able to login with an old password "<Username1>","<Password1>" 
And Users should be able to login with a new password "<Password>" 	
Examples: 
|Username              |Password|curPassword|nPassword|confirmPassword|Username1             |Password1|TimeZone|
|empresetp01@gmail.com |12345678| 12345     |12345678 |12345678       |empresetp01@gmail.com |12345    |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|


@ResetPassword
Scenario Outline: Verify change password for all Agency user
Given User open browser
When click on Register link    
And New HireXpert application user employer registration "agencyresetp01" "agencyresetp01@gmail.com" "5001012012" "Agency" "India" "<TimeZone>" "<Password1>" "Pune" "agencyresetp01ORG" "agencyresetp01ORG.com" "Pune" 
When when the user clicks on the change password on the profile window 
When The change password pop up window appears, and the user fills all the data "<curPassword>","<nPassword>","<confirmPassword>" 
And clicks on the submit button 
And Successful pop-up message dispaly as "Your password has been successfully updated  " with OK button 
Then Logout from myAccount 
And Users should not be able to login with an old password "<Username1>","<Password1>" 
And Users should be able to login with a new password "<Password>" 	
Examples: 
|Username                 |Password|curPassword|nPassword|confirmPassword|Username1                |Password1|TimeZone|
|agencyresetp01@gmail.com |12345678| 12345     |12345678 |12345678       |agencyresetp01@gmail.com |12345    |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|

				
@ResetPassword
Scenario Outline: Verify change password for candidate. 
Given User open browser
When click on Register link  
And enter details of already registered employer "<CandidateName>" "<CandidateEmail>" "8510120124"
And Select value from dropdown of "<UserType>" "<TimeZone>" "<Country>"
And click on Submit button
And click on Yes button
And click on ok button
And click on Job Seeker(Candidate) Sign In link
And enter candidate email and password "<CandidateEmail>" "<curPassword>"
And click on Signin button
When when the user clicks on the change password on the profile window 
When The change password pop up window appears, and the user fills all the data "<curPassword>","<nPassword>","<confirmPassword>" 
And clicks on the submit button 
And Successful pop-up message dispaly as "Your password has been successfully updated  " with OK button 
Then Logout from myAccount 
And click on Job Seeker(Candidate) Sign In link
And enter candidate email and password "<CandidateEmail>" "<OldPassword>"
And click on Signin button
And Users should be able to login with a new password "<NewPassword>"
And click on ok button
Then Logout from myAccount 			
Examples: 
|CandidateName       |CandidateEmail               |NewPassword |curPassword| nPassword |confirmPassword|OldPassword|UserType  | Country |TimeZone|
|candidateresetpwd01 |candidateresetpwd01@gmail.com|12345678    | 12345     | 12345678  |12345678       | 12345     | Candidate| India   |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|

								
@ResetPassword
Scenario Outline: To verify Change Login Email id for Employer user
Given User open browser
When click on Register link    
And New HireXpert application user employer registration "<EmployerName>" "<OlDEmployerEmail>" "6001012012" "Employer" "India" "<TimeZone>" "<Password>" "Pune" "<EmployerOrg>" "<EmployerORGWebsite>" "Pune"  
When User clicks the ChangeLoginEmail option on the profile  window 
And On Change Login Email pop up window fill the data "<NewEmployerEmail>","<Password>" 
Then Successful pop-up message displayed as "Your login email has been changed. You will be redirected to the home page to login with a new login email."
And Users should not  be able to login with old Email id "<OlDEmployerEmail>","<Password>" 
And Users should be able to login with a new Email id "<NewEmployerEmail>"
Then Logout from myAccount 					
Examples: 
|EmployerName  |NewEmployerEmail          |OlDEmployerEmail        |Password|EmployerOrg      |EmployerORGWebsite    |TimeZone|
|empChgEmail01 |empNewChgEmail01@gmail.com|empChgEmail01@gmail.com |12345   |empChgEmail01ORG | empChgEmail01ORG.com |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|


@ResetPassword 
Scenario Outline: To verify Change Login Email id for Agency user
Given User open browser
When click on Register link    
And New HireXpert application user employer registration "<AgencyName>" "<OlDAgencyEmail>" "6001012012" "Agency" "India" "<TimeZone>" "<Password>" "Pune" "<AgencyOrg>" "<AgencyORGWebsite>" "Pune"  
When User clicks the ChangeLoginEmail option on the profile  window 
And On Change Login Email pop up window fill the data "<NewAgencyEmail>","<Password>" 
Then Successful pop-up message displayed as "Your login email has been changed. You will be redirected to the home page to login with a new login email."
And Users should not  be able to login with old Email id "<OlDAgencyEmail>","<Password>" 
And Users should be able to login with a new Email id "<NewAgencyEmail>"
Then Logout from myAccount 					
Examples: 
|AgencyName       |NewAgencyEmail               |OlDAgencyEmail             |Password|AgencyOrg           |AgencyORGWebsite         |TimeZone|
|agencyChgEmail01 |agencyNewChgEmail01@gmail.com|agencyChgEmail01@gmail.com |12345   |agencyChgEmail01ORG | agencyChgEmail01ORG.com |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|
						
