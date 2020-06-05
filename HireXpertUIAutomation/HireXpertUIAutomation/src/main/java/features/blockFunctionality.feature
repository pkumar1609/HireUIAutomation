Feature: Job Management

@bvt_agencyblock
  Scenario: Verify the Block functionality for Agency with Employer login
  
 	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for registered employer and click on Sign in button
    |  sayali1@gmail.com  | 12345 |
    And Agency should be added previously "sayagency3@gmail.com"
    And click on Workbench tab and select job from Jobs drop down
    And click on Share With Agency button and select the Share checkbox present in front of the agency to share the job 
    | sayagency3@gmail.com |
    And click on Yes button from confirmation popup and click on Close button from Share Job window
    And again click on Share With Agency button and select the Block/Unblock checkbox present in front of the agency with whom you shared the job
    | sayagency3@gmail.com |
    And click on Yes button from confirmation popup and click on Close button from Share Job window
    And logout with employer and login with Agency valid credentials which you blocked on Share Job page 
    | sayagency3@gmail.com | 12345 |
    And click on Workbench tab and select the job for which agency is blocked
    And click on Add Candidate button
    And enter email id of candidate and click on Find button and observe
    | c01@gmail.com |
    Then Blocked agency should not be able to add candidate for the job and error message message should display and he should be able to see all candidate status which are added for that job
    And click on OK button from error message popup 
    And click on Close button from Add Candidate page and click on Yes button from confirmation popup
    And click on Share With Team button and add new team by clicking on Add button on Share Job page
    | Say Agency 3 Team 1 | sayagency3team1@gmail.com | 2542144154 |
    And search for team member and select the Share checkbox present in front of the agency team member to share the job with team member
    | sayagency3team1@gmail.com |
    And click on Yes button from confirmation popup and observe
    Then user should able to search team member and blocked agency should not able to share job with any team members and error message should display
    And close the browser
    
#TC ID - 61,65,66,384
 
@bvt_teamblock
 Scenario Outline: Verify the Block functionality for team member with Employer and Agency login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
    And Team member should be added previously "sayali1team1@gmail.com" and "sayagency1team1@gmail.com"
#    And click on Team tab and add one new team member by clicking on Add button
#    | sayali 1 team 1 | sayali1team1@gmail.com | 2451565965 | say Agency 1 team 1 | sayagency1team1@gmail.com | 2451565965 |
#    And click on Close button from Team Members window
    And click on Workbench tab and select job from Jobs drop down
    And click on Share With Team button and select the Share checkbox present in front of the team member to share the job
	And click on Yes button from confirmation popup and now select the Block/Unblock checkbox present in front of the team member 
    And click on Yes button from confirmation popup and click on Close button from Share Job
	And logout with logged in user and login with team member valid credentials which you blocked on Share Job page
    And click on Workbench tab and select the job for which team member is blocked
    And click on Add Candidate button
    And enter email id of candidate and click on Find button and observe
    | can03@gmail.com |
    Then Blocked team member should not be able to add candidate for the job and error message should display and he should be able to see all candidate status which are added by himself into that job
    And close the browser
    
Examples:
|   email address    |   password   |
| sayali8@gmail.com  |    12345     |
|sayagency1@gmail.com|    12345     |


#TC ID - 67,72,73