Feature: Job Management

  Scenario Outline: Verify user having only one primary contact with Employer and Agency login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
    And click on Workbench tab and select job from Jobs drop down
    And click on Share With Team button and observe the primary contact then add new team member and try to make that team member as primary contact
    Then user should not able to make multiple team members as primary contact
    And user should able to change the primary contact only when the job is shared with the team member to whom user wants to make primary contact
    And close the browser
    
Examples:
|   email address   |  password  |
| sayali@gmail.com  |   12345    |
|sayagency@gmail.com|   12345    |

    
#TC ID - 68,69,93