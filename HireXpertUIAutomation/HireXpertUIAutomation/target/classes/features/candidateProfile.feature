Feature: User Management

@bvt @regression1_01
	Scenario: To verify the functionality of Update Profile page of candidate
	
	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for employer and click on Sign in button
    |  sayali8@gmail.com  |  12345  |
    And click on Workbench tab and select job from Jobs drop down
    And click on Add Candidate button
    And enter email id of candidate which is not registered previously and click on Find button
    | c34@gmail.com |
    And Fill all mandatory details and click on Save button
    | c34 | 431632529 | test engineer| Female | 30 | Pune | Email | Expert |
    And click on Yes button if probability related fields are not filled and observe
    Then user should able to add new candidate and candidate should get added in New column
    And logout with employer and login with new candidate added by employer
    | c34@gmail.com | 12345 |
    Then Candidate should be able to login with email id added by user and Update profile pop up will appears 
    And observe the auto-populated fields on the update candidate profile popup
    Then all filled information should auto populate if candidate added through employer
    And observe email id field from candidate profile
	And Select the On Notice Period field and set last working day on Update Profile page
	And Click on Save button and again go to Update Profile page
	And Observe the Last Working Day field
	Then Last Working date should get updated properly
	And do not make any changes on Update Profile page and click on Close button
    Then update profile page should get closed and candidate dashboard should display
    And go to Profile section and then Update Profile page
    And click on Add Skill button to add one skill
    And add skill, expertise level and certificate
    | skill01 | Expert | yes |
    And add same skill, expertise level and certificate
    | skill01 | Expert |
    And fill other mandatory details and click on Save button
    Then error message should display and click on OK button from popup
    And delete duplicate skill and click on Not Looking For Job checkbox and click on Save button
    Then entered certificate should appear in skill section on candidate dashboard
    And again go to update profile and delete certificate value of the skill and click on save button
    And again go to update profile and verify Not Looking For Job checkbox
    Then all changes should be saved 
    And Click on Add Skill button to add more than ten skills and observe
    Then one job skill row should get added after clicking on Add Skill button and user should able to add only ten skills and error message should display
    And click on Delete Skill button in front of any skill for candidate
    Then after clicking on Delete Skill button present in front of skill then that skill row should get deleted
    And Click on Add Role button and observe
    Then one row should get added after clicking on Add Role button and user should able to add only three roles
    And click on Delete Role button in front of any role
    Then after clicking on Delete Role button present in front of role then that role should get deleted
	And close the browser
	
#TC ID: 36,37,38,39,92,228,229
#reg TC ID: 25,64,104,129,296
    
@regression1_02
	Scenario Outline: To verify the functionality of Upload Resume on candidate profile
	
	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
    And click on Workbench tab and select job from Jobs drop down
   	And click on Add Candidate button and one new candidate for the job and click on Find button
    | c01@gmail.com | c02@gmail.com |
    And fill mandatory details
    And click on Browse button and Upload file with any format like document 
    And click on Save button
    Then User should be able to upload cv in document format
    And click on Edit Candidate icon from candidate card
    And click on Browse button and upload another file with different format like executable file format and click on Save button
    Then User should be able to upload cv in executable file format
    And click on Edit Candidate icon from candidate card
    And click on Browse button and upload another file with different format like zip file format and click on Save button
    Then User should be able to upload cv in zip format
    And click on Edit Candidate icon from candidate card
    And click on Browse button and upload another file with different format like PDF file format
    And click on Save button
    Then User should be able to upload cv in PDF file format
    And click on Edit Candidate icon from candidate card
    And click on Browse button and upload another file with different format like text file format
    And click on Save button
    Then User should be able to upload cv in text file format
    And click on Edit Candidate icon from candidate card
    And click on Browse button and upload another file with different format like PNG file format
    And click on Save button
    Then User should be able to upload cv in PNG file format
    And close the browser
    
Examples:
|    email address     |  password  |
|  sayali8@gmail.com   |   12345    |
| sayagency1@gmail.com |   12345    |    
    
#TC ID: 26    


@regression1_03
	Scenario Outline: To verify the Notice Period field on candidate page
	
	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
    And click on Workbench tab and observe Add Candidate button
    And select job from Jobs drop down and observe Add Candidate button
    And click on Add Candidate button and one new candidate for the job and click on Find button
    | c01@gmail.com | c02@gmail.com |
    And observe On Notice Period field
    And unchecked the On Notice Period field and enter zero in Notice Period field and click on Close button
    Then confirmation popup message should display with Yes and No buttons and Click on No button 
    And click on Save button
    Then User should able to add candidate after entering zero value in Notice Period field
    And click on Edit Candidate icon from candidate card
    And set another value in Notice Period in Edit Candidate page and click on Close button
    Then confirmation popup message should display with Yes and No buttons and Click on Yes button
    Then Workbench page should display
    And close the browser
    
Examples:
|    email address     |  password  |
|  sayali8@gmail.com   |   12345    |
| sayagency1@gmail.com |   12345    |      

#TC ID: 59,70,134,263


@regression1_04
	Scenario Outline: Verify user is able to add comment for candidate
	
	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
	And click on Workbench tab and select job from Jobs drop down
	And click on Add Candidate button and one new candidate for the job and click on Find button
    | c01@gmail.com | c02@gmail.com |
    And fill mandatory details
    And click on Save button
    Then new candidate should get added in New column
    And Click on Comment icon from candidate card to add comment
    And Add a comment greater than 512 characters and observe
    Then error message should display and Save button should be disabled
    And add comment with or below 512 characters and click on Save button
    | This is comment for candidate.. |
    Then comment should get added below Save button with Delete Comment icon
    And click on Delete Comment icon to delete the comment and comment should get deleted
    And close the browser

Examples:
|    email address     |  password  |
|  sayali8@gmail.com   |   12345    |
| sayagency1@gmail.com |   12345    |      

#reg TC ID: 317  


@regression1_05
	Scenario: Verify user able to move rejected candidate from Rejected column to any other column
	
	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for employer and click on Sign in button
    |  sayali1@gmail.com  |  12345  |
    And click on Workbench tab and select job from Jobs drop down
    And observe candidate is added or not if not added then add new candidate
    | c01@gmail.com | 300000 |
    And Click on Reject Candidate icon from candidate card and reject that candidate
    Then Observe candidate get moved in Rejected column automatically
    And Now move that candidate from Rejected column to any other column and observe
    And Click on Add Questionnaire button
	And Enter a Question and enter Marks accordingly to that question
	| Question 1 | 20 |
	And Enter the answers and Marks accordingly to the answer 
	| answer1 | 20 | answer2 | 0 |
	And click on Save Changes button
	And Enter the cutoff & rejection percentage
	| 60 | 40 |
	And click on submit button
	Then Collect Answer icon should reflect on candidates card for giving answers
	And Click on Reject Candidate icon from candidate card and reject that candidate
	Then Observe candidate get moved in Rejected column automatically
	And Now move that candidate from Rejected column to any other column and observe
	And close the browser

#reg TC ID: 292


@regression1_06
	Scenario Outline: Verify one after one rejected candidate listed in Rejected Column
	
	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
	And click on Workbench tab and select job from Jobs drop down
	And click on Add Candidate button and add two new candidates for the job and click on Find button
    | c01@gmail.com | c02@gmail.com | c03@gmail.com | c04@gmail.com |
    And fill mandatory details
    And click on Save button
    Then new candidate should get added in New column
    And move both candidates in Interview Pending 1 column
    And Click on Reject Candidate icon from candidate card and reject that candidate
    Then Observe candidate get moved in Rejected column automatically
    And Click on Reject Candidate icon from candidate card for second candidate 
    And click on No from confirmation popup and observe
    Then both candidates should not display in same column
    And close the browser

Examples:
|    email address     |  password  |
|  sayali1@gmail.com   |   12345    |
| sayagency1@gmail.com |   12345    |    

#reg TC ID: 467
