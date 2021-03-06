Feature: UserAccount Feature

@TC47_51 @Bvtc @login
Scenario: To verify whether the employer is able to add agency.

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And Click on Agencies tab
And Click on add Button Fill all the mandatory details for agency
|Name  |         Email     | contact  |
|pagy  | pagy@gmail.com    | 1234564  |
|pagy1 | pagy1@gmail.com   | 1234564  |
And Click on Agencies tab
Then Employer should be able to add Agency
Then Newly added agency should be displayed in Agencies page
And delete the added agency
Then Close browser


@TC48_52 @Bvtc @login
Scenario: To verify whether the employer is able to add team

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And Click on team tab
And Click on add Button and Fill all the mandatory details for team
|Name|      Email      | contact  |
|pe1 | pe1@gmail.com   | 1234564  |
|pe2 | pe2@gmail.com   | 1234564  |
And Click on team tab
Then Newly added team member should be displayed in team page
Then the employer with which you have logged in should display in team tab by default
And delete the added team
Then Close browser

@TC49_53 @Bvtc @login
Scenario: To verify whether the Agency is able to add and delete employer

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Click on Employer tab
And Click on add Button and Fill all the mandatory details for employer 
|Name|         Email   | contact  |
|pe1 | pe1@gmail.com   | 1234564  |
|pe2 | pe2@gmail.com   | 1234564  |
And Click on Employer tab
Then Agency should be able to add Employer
And  delete the added employer
Then deleted employer should not be display on page
Then Close browser


@TC50_54 @Bvtc @login
Scenario: To verify whether the Agency is able to add and delete team

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Click on team tab
And Click on add Button and Fill all the mandatory details for team
|Name   |         Email     | contact     |
|pa1    | pa1@gmail.com     | 1234564     |
|pa2    | pa2@gmail.com     | 1234564     |
#And click on close button
And Click on team tab
Then Agency should be able to add team
Then Newly added team member should be displayed in team page
And delete the added team
Then deleted user should not be display on page
Then Close browser

#Regression Test Cases

@TC77_79_95 @reglogin 
Scenario: To verify search funtionality of Employer and team tab

Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And Click on Agencies tab
And Click on add Button Fill all the mandatory details for agency 
|Name  |      Email    | contact    |
|pagy  |pagy@gmail.com | 1234564    |
|pagy1 |pagy1@gmail.com| 1234564    |
And Click on Search section and enter already existing agency
|Name|
|pagy|
And User should able to search agency
And Click on close button
And Click on team tab
And Click on add Button and Fill all the mandatory details for team
|Name|         Email   | contact  |
|pe1 | pe1@gmail.com   | 1234564  |
|pe2 | pe2@gmail.com   | 1234564  |
And Click on Search section and enter already existing employer team
|Name|
|pe1 |
And User should able to search employer team


@TC_78_80_95 @reglogin
Scenario: To verify search funtionality of Agency and team tab

Given User must be registered

When title of login page is Home 
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Click on Employer tab
And Click on add Button and Fill all the mandatory details for employer 
|Name|         Email   | contact  |
|pe1 | pe1@gmail.com   | 1234564  |
|pe2 | pe2@gmail.com   | 1234564  |
And Click on Search section and enter already existing employer
|Name|
|pe1 |
And User should able to search employer
And Click on close button
And Click on team tab
And Click on add Button and Fill all the mandatory details for team
|Name  |       Email    | contact    |
|pa1   | pa1@gmail.com  | 1234564    |
|pa2   | pa2@gmail.com  | 1234564    |
And Click on Search section and enter already existing agency team
|Name|
|pa1 |
And User should able to search agency team






 @reglogin
Scenario Outline: To verify Error message for character limit for both agency and employer
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to update profile
And Check the character limit for fields with "<Name>"
And Click on team tab
And Click on Add button and fill "<Name>"
Then Error message should show only after exceeding character limit

Examples:
|Username      |Password |Name                                                            |
|pemp@gmail.com|12345    |1234567890123456789012345678901234567890123456789012345678901234|
|pagy@gmail.com|12345    |1234567890123456789012345678901234567890123456789012345678901234|






