Feature: Job Management

@bvt 
  Scenario Outline: To verify user is able to add and edit job for Employer and Agency login
  
    Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
    And click on Workbench tab
    And click on Add Job button and fill all mandatory details on Add Job popup window
    And click on submit button
    Then Job should get successfully added and Job should be visible in Job drop down
    And click on Employers tab at the top and verify user able to delete the employer or not when agency is logged in
    And click on Job drop down and select recently added job
    And click on Edit Job button to make changes in job
    And make any changes in the job
    And click on submit button
    Then User should be able to update the job
    And again click on Edit Job button and observe the changes
    Then all updated information should be saved in the job
    And click on Add Skill button and add some skills
    Then one job skill row should get added after clicking on Add Skill button and user should able to add only ten skills
    And click on Delete Skill button in front of any skill
    Then after clicking on Delete Skill button present in front of skill then that skill row should get deleted
    And close the browser
    
Examples:
|    email address     |  password  |
|  sayali1@gmail.com   |   12345    |
| sayagency1@gmail.com |   12345    |

#TC ID - 15,21,22,46,74,76,94


@regression1_01
  Scenario: To verify user is able to update skills and No. of Interviews for the job with Employer login
  
    Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for employer and click on Sign in button
    | sayali7@gmail.com | 12345 |
    And click on Workbench tab
    And click on Add Job button and fill all mandatory details on Add Job popup window
    And click on submit button
    Then Job should get successfully added and Job should be visible in Job drop down
    And click on Job drop down and select recently added job
    And click on Add Candidate button
    And add one new candidate for the job and click on Find button
    | c01@gmail.com |
    And Fill mandatory details 
    And click on Save button
    Then new candidate should get added in New column
    And click on Edit Job button to update skills and number of interview
    And select number of interview except previously selected number
    And click on submit button
    And again click on Edit Job button and observe the number of interviews
    And click on Add Skill button to add one new skill
    And enter skill details and click on submit button
    | s01 | Expert | Mandatory |
    Then Workbench page should display
    And click on Edit Candidate icon from candidate card
    And observe Skills section for newly added skill
    Then Newly Added skills should be reflect in candidate profile which are already added for that job
    And close the browser
    
#Reg TC ID: 112,324


@regression1_02
  Scenario: To verify deleted skill on Candidate Details page and when employer is adding new candidate for the job
  
    Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for employer and click on Sign in button
    | sayali1@gmail.com | 12345 |
    And click on Workbench tab and select job from Jobs drop down
    And click on Add Candidate button
    And add one new candidate for the job and click on Find button
    | c01@gmail.com |
    And Fill mandatory details 
    And click on Save button
    Then new candidate should get added in New column
    And Click on Candidate name from candidate card and observe the skills 
    And click on Close button from candidate Details page
    And click on Edit Job button to make changes in job
    And Delete one skill from Skills section 
    And click on submit button
    And click on Edit Candidate icon from candidate card
    And observe deleted skill not displayed
    And click on Close button from Edit Candidate page
    And Click on Candidate name from candidate card and observe the skills
    Then deleted skills should display on Candidate Details page 
    And click on Close button from candidate Details page 
    And click on Edit Job button to make changes in job
    And delete all added skills
    And click on submit button
    And click on Add Candidate button
    And add one new candidate for the job and click on Find button
    | c02@gmail.com |
    Then observe deleted job skill should not show when employer is going to add new candidate
    And close the browser
    
#Reg TC ID: 335,349
    
   
@regression1_03
    Scenario: Verify the functionality of adding a candidate to the job that is shared by agency team member
    
    Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for agency and click on Sign in button
    | sayagency1@gmail.com | 12345 | 
    And click on Team tab and add one new team member by clicking on Add button for agency
    | say Agency 1 team 1 | sayagency1team1@gmail.com | 2451565965 |
    And click on Close button from Team Members window
    And logout with agency owner
    And enter valid user email address and password for agency team member and click on Sign in button
    | sayagency1team1@gmail.com | 12345 | 
    And click on Workbench tab and click on Add Job button and fill all mandatory details on Add Job popup window for agency team member
    |Agency team job 1|Automation engineer|IT Company Pvt. Ltd.|Automation engineer|Pune|300000|0|2|1|
    And click on submit button
    Then Job should get successfully added and Job should be visible in Job drop down
    And logout with agency team member
    And enter valid user email address and password for agency and click on Sign in button
    | sayagency1@gmail.com | 12345 | 
    And click on Workbench tab and select the job which is added by agency team member
    | Agency team job 1 |
    And add one new candidate for the job and click on Find button
    | c01@gmail.com |
    And Fill mandatory details 
    And click on Save button
    Then new candidate should get added in New column
    And close the browser
    
    
#Reg TC ID: 239
    