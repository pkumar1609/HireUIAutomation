Feature: UserAccount Feature

@login
Scenario Outline: To verify whether the employer is able to add and delete recruitment agency.
Given User logged in to HireXpert "<Username>" and "<Password>" 
And Click on add Button Fill all the mandatory details for Recruitment Agencies
|Name     | Email            | contact   |
|pagy1    | pagy1@gmail.com  | 8154101234|
|pagy2    | pagy2@gmail.com  | 8254101234|
Then Employer should be able to add Agency
Then Newly added agency should be displayed in Agencies page
And delete the added agency "pagy1"
And delete the added agency "pagy2"
And Close browser
Examples:
|Username       |Password| 
|pemp@gmail.com | 12345 |


@login
Scenario Outline: To verify whether the employer is able to add team
Given User logged in to HireXpert "<Username>" and "<Password>" 
And Click on add Button Fill all the mandatory details for Manage Employee
|Name|      Email      | contact  |Role          |
|pe1 | pe1@gmail.com   | 12345164  |Recruitment HR|
|pe2 | pe2@gmail.com   | 12345264  |Recruitment HR|
|pe3 | pe3@gmail.com   | 12345364  |Recruitment HR|
Then Newly added team member should be displayed in team page
Then the employer with which you have logged in should display in team tab by default
#deleting team member func is disabled in application so below line is commented
#And delete the added team "pe2"    
And Close browser
Examples:
|Username       |Password| 
|pemp@gmail.com | 12345  |


@login
Scenario Outline: To verify whether the Agency is able to add and delete employer
Given User logged in to HireXpert "<Username>" and "<Password>" 
And Click on add Button Fill all the mandatory details for Manage Employee
|Nameagy| Emailagy      | contact   |Roleagy                |
|pa4    | pa4@gmail.com | 123405164 |Recruitment Agency Head|
|pa5    | pa5@gmail.com | 123405264 |Recruitment Agency Head|
Then Newly added team member should be displayed in team page
#deleting team member func is disabled in application so below line is commented
#And delete the added team "pa5"
And Close browser
Examples:
|Username       |Password| 
|pagy@gmail.com | 12345  |


#Regression Test Cases

#@TC77_79_95 @login
#Scenario: To verify search funtionality of Employer and team tab
#
#Given User must be registered
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And Click on add Button Fill all the mandatory details for Recruitment Agencies
#|Nameagy  |      Emailagy    | contact    |
#|pagy     |pagy@gmail.com | 1234564    |
#|pagy1    |pagy1@gmail.com| 1234564    |
#And Click on Search section and enter already existing agency
#|Name|
#|pagy|
#And User should able to search agency
#And Click on add Button Fill all the mandatory details for Manage Employee
#|Name|         Email   | contact  |
#|pe1 | pe1@gmail.com   | 1234564  |
#|pe2 | pe2@gmail.com   | 1234564  |
#And Click on Search section and enter already existing employer team
#|Name|
#|pe1 |
#And User should able to search employer team
#And Close browser



#@TC_78_80_95 @login
#Scenario: To verify search funtionality of Agency and team tab
#
#Given User must be registered
#
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And Click on add Button Fill all the mandatory details for "Employers"
#|Name|         Email   | contact  |
#|pe1 | pe1@gmail.com   | 1234564  |
#|pe2 | pe2@gmail.com   | 1234564  |
#And Click on Search section and enter already existing employer
#|Name|
#|pe1 |
#And User should able to search employer
#And Click on add Button Fill all the mandatory details for "Team Members"
#|Name  |       Email    | contact    |
#|pa1   | pa1@gmail.com  | 1234564    |
#|pa2   | pa2@gmail.com  | 1234564    |
#And Click on Search section and enter already existing agency team
#|Name|
#|pa1 |
#And User should able to search agency team


@login
Scenario Outline: To verify Error message for character limit for both agency and employer
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to update profile
And Check the character limit for fields with "<Name>"
And Click on Add button and fill "<Name>" for "Team Members"
Then Error message should show only after exceeding character limit
Examples:
|Username        |Password |Name                                                            |
|pemp@gmail.com|12345 |1234567890123456789012345678901234567890123456789012345678901234|
|pagy@gmail.com|12345    |1234567890123456789012345678901234567890123456789012345678901234|

@login
Scenario Outline: Verify that User is not able to Login with invalid credentials  
Given User must be registered    
When title of page is HireXpert
And Click on Employer-Agency Signin link
And enter invalid user email address and invalid password which is not registered "<username>" and "<password>"
Then User should not be able to login to application and error message should display "<username>"
And enter valid user email address and invalid password which is registered to application "<username>" and "<password>"
And now keep Email address field blank and tab 
And observe error message for Email address field
And keep password field blank and tab
And observe error message for Password field
Then Sign in button should not get enabled without entering email address or password and User should get error message for mandatory fields
And Close browser    
Examples:
|username          |password |  
|asdfghj@gmail.com | asdfghj |
|pemp@gmail.com    | asdfghj |


