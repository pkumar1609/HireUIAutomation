Feature: Job Management

  Scenario: Verify agency is able to add employer from 'Add job' page and Agency not able to delete that employer with whom job is added
	
	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for registered agency and click on Sign in button
    And click on Workbench tab
    And click on Add Job button and fill mandatory details
    And Click on plus button in front of employer field
    And Fill the employer details & click on submit button
    | Sayali | sayali@gmail.com | 215245554 |
    And Now click on employer field drop down and select added employer name
    And Click on submit button
    And click on Employers tab at the top
    Then agency should able to add employer and added employer should reflect in Employer drop down on Add Job page and Employer tab
    And Click on Delete icon in front of employer for which job is added
    Then agency should not able to delete employer which is link to job and error message should display
    And close the browser
    
#TC ID - 76,94