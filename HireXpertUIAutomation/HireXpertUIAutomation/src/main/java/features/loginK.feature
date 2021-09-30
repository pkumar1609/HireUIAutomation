Feature: UserAccount Feature

@loginJobProviders
Scenario Outline: To verify whether the employer/agency is able to login and logout
Given Start Application 
And Click on Employer Agency Signin Link
And User should able to enter the "<Username>" and "<Password>" 
And Click on sumbit button 
Then Verify user able to login
And Now logout from application 
And Now Close browser
Examples:
|Username       |Password| 
|pemp@gmail.com | 12345  |
|pagy@gmail.com | 12345  |


@loginCandidate
Scenario Outline: To verify whether the Job Seeker(candidate) is able to login and logout
Given Start Application 
And Click on Job Seeker(candidate) Signin Link
And Candidate should able to enter the "<Username>" and "<Password>" 
And Click on Sign in button 
Then Verify candidate able to login
And Now logout from application 
And Now Close browser
Examples:
|Username              |Password| 
|candidate01@gmail.com | 12345  |


@loginInvalidUsers
Scenario Outline: Verify that User is not able to Login with invalid credentials  
Given Start Application 
And Click on Employer Agency Signin Link
And User able to enter invalid email address and password which is not registered "<username>" and "<password>"
And Click on sumbit button 
Then User should not be able to login to application and error message should display "<username>"
And Enter valid user email address and invalid password which is registered to application "<username>" and "<password>"
And Click on sumbit button 
Then Verify error message should be display 
And Now keep Email address field blank and tab also verify the erroe message
And observe error message for Email address field
And keep password field blank and tab
And observe error message for Password field
Then Sign in button should not get enabled without entering email address or password and User should get error message for mandatory fields
And Close browser    
Examples:
|username          |password |  
|asdfghj@gmail.com | asdfghj |
|pemp@gmail.com    | asdfghj |

#

#@login
#Scenario Outline: To verify whether the employer is able to add team
#Given User logged in to HireXpert "<Username>" and "<Password>" 
#And Click on add Button Fill all the mandatory details for Manage Employee
#|Name|      Email      | contact  |Role          |
#|pe1 | pe1@gmail.com   | 12345164  |Recruitment HR|
#|pe2 | pe2@gmail.com   | 12345264  |Recruitment HR|
#|pe3 | pe3@gmail.com   | 12345364  |Recruitment HR|
#Then Newly added team member should be displayed in team page
#Then the employer with which you have logged in should display in team tab by default
## ** deleting team member func is disabled in application so below line is commented
##And delete the added team "pe2"    
#And Close browser
#Examples:
#|Username       |Password| 
#|pemp@gmail.com | 12345  |
#
#
#@login1
#Scenario Outline: To verify whether the Agency is able to add and delete employer
#Given User logged in to HireXpert "<Username>" and "<Password>" 
#And Click on add Button Fill all the mandatory details for Manage Employee
#|Nameagy| Emailagy      | contact   |Roleagy                |
#|pa4    | pa4@gmail.com | 123405164 |Recruitment Agency Head|
#|pa5    | pa5@gmail.com | 123405264 |Recruitment Agency Head|
#Then Newly added team member should be displayed in team page
## ** deleting team member func is disabled in application so below line is commented
##And delete the added team "pa5"
#And Close browser
#Examples:
#|Username       |Password| 
#|pagy@gmail.com | 12345  |
#
#
#@login
#Scenario Outline: To verify Error message for character limit for both agency and employer
#Given User must be registered
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials "<Username>","<Password>"
#And Go to update profile
#And Check the character limit for fields with "<Name>"
#And Click on Add button and fill "<Name>" for "Team Members"
#Then Error message should show only after exceeding character limit
#Examples:
#|Username        |Password |Name                                                      |
#|pemp@gmail.com  |12345    |1234567890123456789012345678901234567890123456789012345678901234|
#|pagy@gmail.com  |12345    |1234567890123456789012345678901234567890123456789012345678901234|
#
#@login
#Scenario Outline: Verify that User is not able to Login with invalid credentials  
#Given User must be registered    
#When title of page is HireXpert
#And Click on Employer-Agency Signin link
#And enter invalid user email address and invalid password which is not registered "<username>" and "<password>"
#Then User should not be able to login to application and error message should display "<username>"
#And enter valid user email address and invalid password which is registered to application "<username>" and "<password>"
#And now keep Email address field blank and tab 
#And observe error message for Email address field
#And keep password field blank and tab
#And observe error message for Password field
#Then Sign in button should not get enabled without entering email address or password and User should get error message for mandatory fields
#And Close browser    
#Examples:
#|username          |password |  
#|asdfghj@gmail.com | asdfghj |
#|pemp@gmail.com    | asdfghj |
#
#
