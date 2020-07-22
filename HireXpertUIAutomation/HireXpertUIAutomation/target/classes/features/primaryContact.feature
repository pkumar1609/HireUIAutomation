Feature: Job Management

@bvt @primary
  Scenario Outline: Verify user having only one primary contact with Employer and Agency login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
    And click on Workbench tab and select job from Jobs drop down
    |title              |designation |industry   |jobrole        |location |budget |minexp|maxexp|agytitle            |
  	|primarycontactjob  |developer   |IT software|java developer |pune     |400000 |1     |2     |primarycontactjobagy|
    And team member should be added
	|Name|         Email   | contact  |Nameagy  |         Emailagy  |team  |agyteam |
	|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|pe1   |pa1     |
	|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|pe1   |pa1	    |
    And click on Share With Team button and observe the primary contact then add new team member and try to make that team member as primary contact"<team>","<teamid>","<contact>"
    Then user should not able to make multiple team members as primary contact "<anotherteam>"
    |Name|         Email   | contact  |Nameagy  |         Emailagy  |team  |agyteam |
	|pe3 | pe3@gmail.com   | 1234564  |pa3      |pa3@gmail.com		|pe3   |pa3     |
	And user should able to change the primary contact only when the job is shared with the team member to whom user wants to make primary contact "<anotherteam>"
	
#	And close the browser
    
Examples:
|   email address    |  password  |team|teamid       |contact |anotherteam|
|pemp@gmail.com      |   12345    |pe1 |pe1@gmail.com|16546856|pe2        |
#|pagy@gmail.com      |   12345    |pa1 |pa1@gmail.com|98598695|pa2        |

    
#TC ID - 68,69,93
