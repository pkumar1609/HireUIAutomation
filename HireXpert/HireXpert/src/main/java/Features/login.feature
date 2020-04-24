Feature: UserAccount Feature

Scenario: Verify that employer is able to update profile.

Given User is registered as employer in an application

When title of login page is Home
And user enters valid credentials
And user clicks on Sign in button
And user is on update profile page
And enter all neccessory detalis
And Click on submit button
Then User is on Home page
Then user close the browser

@Tc31
Scenario: Employer continue without completing the profile.

Given User must be registered as employer profile

When title of login page is Home
And user enters valid credentials
And Click on Close button 
And A pop up will appear 
And Click on yes button
And click on close button
Then Click on no button 


@TC47,51
Scenario: To verify whether the employer is able to add agency.

Given User must be registered as employer profile abc

When title of login page is Home abc
And user enters valid credentials abc
And Click on Agencies tab
And Click on add Button to add the agency
And Fill all the mandatory details
|Name|         Email   | contact  |
|demp| demp@gmail.com  | 1234564  |
#|pemp| pemp@gmail.com  | 1234564  |
And Click on Submit button
Then Employer should be able to add Agency
Then Newly added agency should be displayed in Agencies page
And delete the added agency 

@TC48_52
Scenario: To verify whether the employer is able to add team

Given User must be registered as employer profile 

When title of login page is Home 
And user enters valid credentials 
And Click on team tab
And Click on add Button to add the team member
And Fill all the mandatory details
|Name|         Email   | contact  |
|pe1 | pe1@gmail.com   | 1234564  |
|pe2 | pe2@gmail.com   | 1234564  |
And Click on Submit button
Then Employer should be able to add team member
Then Newly added team member should be displayed in team page
Then the employer with which you have logged in should display in team tab by default
And delete the added agency

@TC49_53
Scenario: To verify whether the Agency is able to add and delete employer

Given User must be registered as agency profile 

When title of login page is Home 
And agency enters valid credentials 
And Click on Employer tab
And Click on add Button to add the employer
And Fill all the mandatory details
|Name|         Email   | contact  |
|pe1 | pe1@gmail.com   | 1234564  |
|pe2 | pe2@gmail.com   | 1234564  |
Then Agency should be able to add Employer
Then Newly added employer should be displayed in employer page
And delete the added employer
Then deleted employer should not be display in employer page


@TC50_54
Scenario: To verify whether the Agency is able to add and delete team

Given User must be registered as agency profile 

When title of login page is Home 
And agency enters valid credentials 
And Click on team tab
And Click on add Button to add the team
And Fill all the mandatory details
|Name|         Email   | contact  |
|pa1 | pa1@gmail.com   | 1234564  |
|pa2 | pa2@gmail.com   | 1234564  |
Then Agency should be able to add team
Then Newly added team should be displayed in team page
And delete the added team
Then deleted employer should not be display in team page









