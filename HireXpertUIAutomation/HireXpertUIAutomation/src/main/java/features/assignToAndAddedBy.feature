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
    And now move the candidate from New column to another column and and check the name for Added by field on candidate card
    And again move the candidate to the next column and check the name for Added by field
    Then name for Added by should remain same on candidate card
    And click on Team tab and add one new team member by clicking on Add button
    | sayali 8 team 1 | sayali8team1@gmail.com | 2451565965 |
    And click on Close button from Team Members window
    And click on Workbench tab and select job from Jobs drop down
    And click on Share With Team button and select the Share checkbox present in front of the team member to share the job
    And click on Yes button from confirmation popup and click on Close button from Share Job
    And logout with logged in user and login with team member valid credentials for which you Shared the Job
    | sayali8team1@gmail.com | 12345 |
    And click on Workbench tab and select the shared job
    And click on Add Candidate button and one new candidate for the job and click on Find button
    | c03@gmail.com |
    And Fill mandatory details 
    And click on Save button
    Then new candidate should get added in New column
    And observe Added By field on candidate card
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


@regression1_03
	Scenario: Verify the Assign To field from candidate card
	
	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for employer and click on Sign in button
    | sayali8@gmail.com | 12345 |
    And click on Workbench tab and select job from Jobs drop down
    And click on Share With Agency button and share job with agency owner
    | sayagency1@gmail.com |
    And logout with employer and login with agency with whom job is shared
    | sayagency1@gmail.com | 12345 |
    And click on Workbench tab and select job from Jobs drop down
    And click on Add Candidate button
    And add one new candidate for the job and click on Find button
    | c01@gmail.com |
    And Fill mandatory details 
    And click on Save button
    Then new candidate should get added in New column
    And observe Change Assign To icon in front of Assign To name
    And now move the candidate from New column to another column and and check the name for Assign To field on candidate card
    And click on Share With Team button and share that job with agency team member
    | sayagency1team1@gmail.com |
    And Login with agency team member
    | sayagency1team1@gmail.com | 12345 |
    And click on Workbench tab and select job from Jobs drop down
    And click on Add Candidate button
    And add one new candidate for the job and click on Find button
    | c02@gmail.com |
    And Fill mandatory details 
    And click on Save button
    Then new candidate should get added in New column
    And Click on Reject Candidate icon from candidate card and reject that candidate
    And logout with employer and login with agency with whom job is shared
    | sayagency1@gmail.com | 12345 |
    And click on Workbench tab and select job from Jobs drop down
    And move the candidate from second column to first column and delete that candidate
    And Now login with Employer
    | sayali8@gmail.com | 12345 |
    And click on Workbench tab and select job from Jobs drop down
    And Observe rejected candidate in Rejected column and observe name for Assign To on candidate card
    And Observe Assign To filter list from Filters section
    And close the browser
    

#Reg TC ID - 114,342
    