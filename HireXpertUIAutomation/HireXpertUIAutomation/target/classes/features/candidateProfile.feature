Feature: User Management

	Scenario: To verify the functionality of Update Profile page of candidate
	
	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for employer and click on Sign in button
    |  sayali8@gmail.com  |  12345  |
    And click on Workbench tab and select job from Jobs drop down
    And click on Add Candidate button
    And enter email id of candidate which is not registered previously and click on Find button
    | c20@gmail.com |
    And Fill all mandatory details and click on Save button
    | c20 | 431632620 | test engineer | 30 | Pune |
    And click on Yes button if probability related fields are not filled and observe
    Then new candidate should get added in New column
    And logout with employer and login with new candidate added by employer
    | c20@gmail.com | 12345 |
    Then Update profile pop up will appears 
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
    | skill01 | yes |
    And fill other mandatory details and click on Save button
    Then entered certificate should appear in skill section on candidate dashboard
    And again go to update profile and delete certificate value of the skill and click on save button
    And again go to update profile and verify all changes are saved
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
    
    
#TC ID: 39,92,228,229,36,37,38
    