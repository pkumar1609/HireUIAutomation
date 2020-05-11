Feature: User Management

	Scenario: To verify functionality of skills and roles from Update Profile page of candidate
	
	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for registered candidate and click on Sign in button
    | can02@gmail.com | 12345 |
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
    And click on Delete Skill button in front of any skill
    Then after clicking on Delete Skill button present in front of skill then that skill row should get deleted
    And Click on Add Role button and observe
    Then one row should get added after clicking on Add Role button and user should able to add only three roles
    And click on Delete Role button in front of any role
    Then after clicking on Delete Role button present in front of role then that role should get deleted
    And close the browser
    
    
#TC ID: 36,37,38
