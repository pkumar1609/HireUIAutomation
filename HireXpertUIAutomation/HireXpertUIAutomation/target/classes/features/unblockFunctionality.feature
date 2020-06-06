Feature: Job Management

@bvt_agencyunblock
  Scenario: Verify the Unblock functionality for Agency with Employer login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user email address and password for registered employer and click on Sign in button
    |  sayali1@gmail.com  | 12345 |
    And Agency should be added previously "sayagency4@gmail.com"
    And click on Workbench tab and select job from Jobs drop down
    And click on Share With Agency button and select the Share checkbox present in front of the agency to share the job
    | sayagency4@gmail.com |
    And click on Yes button from confirmation popup and select the Block/Unblock checkbox present in front of the agency with whom you shared the job
    And click on Yes button from confirmation popup
    And now again click on Block/Unblock checkbox present in front of the agency which is blocked previously to unblock that agency
    And click on Yes button from confirmation popup
    Then Employer should be able to unblock the agency
    And logout with employer and login with Agency valid credentials which you unblocked
    | sayagency4@gmail.com | 12345 |
    And click on Workbench tab and select job from Jobs drop down for which agency is unblocked
    And click on Add Candidate button
    And enter email id of candidate and click on Find button
    | c01@gmail.com |
    And click on OK button from success popup window if you entered email id of registered candidate
    And Fill all details and click on Save button
    And click on Yes button if probability related fields are not filled and observe
    Then Unblocked agency should be able to add candidate
    And close the browser
    

@bvt_teamunblock
  Scenario Outline: Verify the Unblock functionality for team member with Employer and Agency login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
    And Team member should be added previously "sayali1team2@gmail.com" and "sayagency1team2@gmail.com"
    And click on Workbench tab and select job from Jobs drop down
    And click on Share With Team button and select the Share checkbox present in front of the team member
    | sayali1team2@gmail.com | sayagency1team2@gmail.com |
    And click on Yes button from confirmation popup and select the Block/Unblock checkbox present in front of the team member with whom you shared the job
    And click on Yes button from confirmation popup
    And now again click on Block/Unblock checkbox present in front of the team member which is blocked previously to unblock that team member
    And click on Yes button from confirmation popup and click on Close button from Share Job
    Then User should be able to unblock the team member
    And logout with logged in user and login with team member valid credentials which you unblocked
    | sayali1team2@gmail.com | 12345 |sayagency1team2@gmail.com | 12345 |
    And click on Workbench tab and select job from Jobs drop down for which team member is unblocked
    And click on Add Candidate button and enter email id of candidate and click on the Find button
    | c02@gmail.com |c03@gmail.com |
    And click on OK button from success popup window if you entered email id of registered candidate
    And Fill all details and click on Save button
    And click on Yes button if probability related fields are not filled and observe
    Then Unblocked team member should be able add candidate
    And close the browser
    
Examples:
|    email address   |   password   |
| sayali1@gmail.com  |    12345     |
|sayagency1@gmail.com|    12345     |

#TC ID - 236,237,238    
