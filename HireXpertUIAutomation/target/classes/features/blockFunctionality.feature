Feature: Job Management

@agencyblock
  Scenario: Verify the Block functionality for Agency with Employer login
  
 	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for registered employer and click on Sign in button
    And click on Agencies tab and add one new agency by clicking on Add button if agencies are not present
    And click on Close button from Agencies window
    And click on Workbench tab and select job from Jobs drop down
    And click on Share With Agency button and select the Share checkbox present in front of the agency to share the job 
    And click on Yes button from confirmation popup and click on Close button from Share Job window
    And again click on Share With Agency button and select the Block/Unblock checkbox present in front of the agency with whom you shared the job
    And click on Yes button from confirmation popup and click on Close button from Share Job window
    And logout with employer and login with Agency valid credentials which you blocked on Share Job page 
    And update profile window get opened if new agency added for job
    And click on Workbench tab and select the job for which agency is blocked
    And click on Add Candidate button
    And enter email id of candidate and click on Find button
    And click on OK button from success popup window if you entered email id of registered candidate
    And Fill all details and click on Save button
    And click on Yes button if probability related fields are not filled and observe
    Then Blocked agency should not be able to add candidate for the job and error message message should display and he should be able to see all candidate status which are added for that job
    And click on OK button from error message popup 
    And click on Close button from Add Candidate page and click on Yes button from confirmation popup
    And click on Share With Team button and observe team is added and if not then add new team by clicking on Add button on Share Job page
    And search for team member and select the Share checkbox present in front of the agency team member to share the job with team member
    And click on Yes button from confirmation popup and observe
    Then user should able to search team member and blocked agency should not able to share job with any team members and error message should display
    And close the browser
    
#TC ID - 66,384 
 
@teamblock
 Scenario Outline: Verify the Block functionality for team member with Employer and Agency login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
    And click on Team tab and add one new team member by clicking on Add button
    And click on Close button from Team Members window
    And click on Workbench tab and select job from Jobs drop down
    And click on Share With Team button and select the Share checkbox present in front of the team member to share the job
	And click on Yes button from confirmation popup and now select the Block/Unblock checkbox present in front of the team member 
    And click on Yes button from confirmation popup and click on Close button from Share Job
	And logout with logged in user and login with team member valid credentials which you blocked on Share Job page
    And click on Workbench tab and select the job for which team member is blocked
    And click on Add Candidate button
    And enter email id of candidate and click on Find button
    Then Blocked team member should not be able to add candidate for the job and error message should display and he should be able to see all candidate status which are added by himself into that job
    And close the browser
    
Examples:
|   email address   |   password   |
| sayali@gmail.com  |    12345     |
|sayagency@gmail.com|    12345     |


#TC ID - 72,73