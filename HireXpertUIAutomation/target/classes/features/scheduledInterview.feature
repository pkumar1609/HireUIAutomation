Feature: Interview Management

	Scenario Outline: To verify the functionality of scheduled interview with Employer and Agency login
	
	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
    And click on Workbench tab
    And select job from jobs drop down
    And click on Add Candidate button and one new candidate for the job
    | c01@gmail.com | c02@gmail.com |
    And observe candidate is getting added in New column
    And click on Schedule Interview icon from candidate card
    And fill all interview details and click on Submit button
    And click on close button from Interview details page 
    And observe the interview date and time displayed on candidate card below Assign To field
    And click on Edit Interview icon in front of interview details like date and time
    And make some changes in interview details and click on Submit button
    Then User should be able to update scheduled interview details and updated details should display properly
    And click on Edit Interview icon present on the left corner just beside of Cancel Interview icon 
    And make some changes and click on Submit button
    Then updated details should display properly
    And click on close button from Interview details page
    And click on Interviews tab
    And Select the filters for which you want candidate interview details and click on Search button
    Then Interview details should be reflect according to the filter applied
    And close the browser
    
Examples:
|   email address     |  password  |
|  sayali@gmail.com   |   12345    |
| sayagency@gmail.com |   12345    |

    
#TC ID: 30,105,108,110,224

