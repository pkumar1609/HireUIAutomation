Feature: Job Management

@bvt @primary
  Scenario Outline: Verify user having only one primary contact with Employer and Agency login
  
  	Given User is on Home page of application 
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<email address>" and "<password>" for registered employer and click on Sign in button
    And Go to workbench
	And Add job
	|title		   |agytitle       |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|
	|primary123 job   |primaryagy job |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |
	And Select a added job
    And team member should be added
	|Name|         Email   | contact  |Nameagy  |         Emailagy  |team  |agyteam |
	|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|pe1   |pa1     |
	|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|pe1   |pa1	    |
    And click on Share With Team button and select the Share checkbox present in front of the team member "<Teamid>"
    And Click on primary contact
    And try to make that team member as primary contact "<anotherteam>"
    Then user should not able to make multiple team members as primary contact "<email address>"
    And Click on close button
	And team member should be added
	|Name|         Email   | contact  |Nameagy  |         Emailagy  |
	|pe3 | pe3@gmail.com   | 1234564  |pa3      |pa3@gmail.com		|
	And user should able to change the primary contact only when the job is shared with the team member to whom user wants to make primary contact "<thridteam>"
	
#	And close the browser
    
Examples:
|   email address    |  password  |Team|Teamid       |contact |anotherteam|thridteam|
|pemp@gmail.com      |   12345    |pe1 |pe1@gmail.com|16546856|pe2        |pe3@gmail.com|
#|pagy@gmail.com      |   12345    |pa1 |pa1@gmail.com|98598695|pa2        |pa3@gmail.com|

    
#TC ID - 68,69,93
