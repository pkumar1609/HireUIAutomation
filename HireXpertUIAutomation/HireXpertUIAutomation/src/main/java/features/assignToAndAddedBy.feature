Feature: Job Management

@regression1_01
	Scenario: Verify the Added by field from candidate card with Employer login
	
	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for employer and click on Sign in button
    | sayali8@gmail.com | 12345 |
    And click on Workbench tab and select job from Jobs drop down
    And click on Add Candidate button and one new candidate for the job and click on Find button
    | c02@gmail.com |
    And Fill mandatory details 
    And click on Save button
    Then new candidate should get added in New column
    And observe Added By field on candidate card
    Then name of user who is logged in into application should display in Added By field
    And now move the candidate from New column to another column and and check the name for Added by field on candidate card
    And again move the candidate  to the next column and check the name for Added by field
    Then name for Added by should remain same on candidate card
    And click on Team tab and add one new team member by clicking on Add button
    | sayali 8 team 1 | sayali8team1@gmail.com | 2451565965 |
    And click on Close button from Team Members window
    And click on Workbench tab and select job from Jobs drop down
    And click on Share With Team button and select the Share checkbox present in front of the team member to share the job
    And click on Yes button from confirmation popup and click on Close button from Share Job
    And logout with logged in user and login with team member valid credentials for which you Shared the Job
    And click on Workbench tab and select the shared job
    And click on Add Candidate button and one new candidate for the job and click on Find button
    | c03@gmail.com |
    And Fill mandatory details 
    And click on Save button
    Then new candidate should get added in New column
    And observe Added By field on candidate card
    Then name of user who is logged in into application should display in Added By field
    And close the browser
    
#Reg TC ID - 115,116


@regression1_02
    Scenario: Verify updated agency or employer name is reflected on Added By & Assign To on candidate card
    
    Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for agency and click on Sign in button
    | sayagency1@gmail.com | 12345 |
    And click on Workbench tab and select job from Jobs drop down
    And click on Add Candidate button
    And add one new candidate for the job and click on Find button
    | c01@gmail.com |
    And Fill mandatory details 
    And click on Save button
    Then new candidate should get added in New column
    And go to Profile and then Update Profile page
    And update name of agency and click on Submit button
    And click on Edit job button and observe the employer name and login with employer for which job is added
    And go to Profile and then Update Profile page
    And update name of employer and click on Submit button
    And click on Workbench tab and select job from Jobs drop down for which candidate is added
    And observe Added By and Assign To fields on candidate card
    And close the browser
    
#Reg TC ID - 151
    