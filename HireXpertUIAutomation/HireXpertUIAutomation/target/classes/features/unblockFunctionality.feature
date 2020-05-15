Feature: Job Management

@agencyunblock
  Scenario: Verify the Unblock functionality for Agency with Employer login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for registered employer and click on Sign in button
    |  sayali8@gmail.com  | 12345 |
    And click on Agencies tab and add one new agency by clicking on Add button if agencies are not present
    And click on Close button from Agencies window
    And click on Workbench tab and select job from Jobs drop down
    And click on Share With Agency button and select the Share checkbox present in front of agency to share the job
    And click on Yes button from confirmation popup and select the Block/Unblock checkbox present in front of the agency with whom you shared the job
    And click on Yes button from confirmation popup
    And now again click on Block/Unblock checkbox present in front of the agency which is blocked previously to unblock that agency
    And click on Yes button from confirmation popup
    Then Employer should be able to unblock the agency
    And logout with employer and login with Agency valid credentials which you unblocked
    And click on Workbench tab and select job from Jobs drop down for which agency is unblocked
    And click on Add Candidate button
    And enter email id of candidate and click on Find button
    | can03@gmail.com |
    And click on OK button from success popup window if you entered email id of registered candidate
    And Fill all details and click on Save button
    And click on Yes button if probability related fields are not filled and observe
    Then Unblocked agency should be able to add candidate
    And close the browser
    

@teamunblock
  Scenario Outline: Verify the Unblock functionality for team member with Employer and Agency login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
    And click on Team tab and add one new team member by clicking on Add button
    | sayali 8 team 3 | sayali8team3@gmail.com | 2451565965 | say Agency 1 team 3 | sayagency1team3@gmail.com | 2451565965 |
    And click on Close button from Team Members window
    And click on Workbench tab and select job from Jobs drop down
    And click on Share With Team button and select Share checkbox present in front of the team member to share the job
    And click on Yes button from confirmation popup and select the Block/Unblock checkbox present in front of the team member with whom you shared the job
    And click on Yes button from confirmation popup
    And now again click on Block/Unblock checkbox present in front of the team member which is blocked previously to unblock that team member
    And click on Yes button from confirmation popup and click on Close button from Share Job
    Then User should be able to unblock the team member
    And logout with logged in user and login with team member valid credentials which you unblocked
    And click on Workbench tab and select job from Jobs drop down for which team member is unblocked
    And click on Add Candidate button and enter email id of candidate and click on the Find button
    | can02@gmail.com |can01@gmail.com |
    And click on OK button from success popup window if you entered email id of registered candidate
    And Fill all details and click on Save button
    And click on Yes button if probability related fields are not filled and observe
    Then Unblocked team member should be able add candidate
    And close the browser
    
Examples:
|    email address   |   password   |
| sayali8@gmail.com  |    12345     |
|sayagency1@gmail.com|    12345     |
    


#TC ID - 236,237,238    