Feature: User Management

	Scenario: To verify the functionality of Update Profile page of candidate
	
	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for employer and click on Sign in button
    |  sayali@gmail.com  |  12345  |
    And click on Workbench tab and select job from Jobs drop down
    And click on Add Candidate button
    And enter email id of candidate which is not registered previously and click on Find button
    | c11@gmail.com |
    And Fill all mandatory details and click on Save button
    | c11 | 331630261 | test engineer | 30 | Pune |
    And click on Yes button if probability related fields are not filled and observe
    Then new candidate should get added in New column
    And logout with employer and login with new candidate added by employer
    | c11@gmail.com | 12345 |
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
	And close the browser
    
    
#TC ID: 39,92,228,229
    