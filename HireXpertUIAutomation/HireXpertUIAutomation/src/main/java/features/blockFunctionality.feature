Feature: Job Management

#@bvt_agencyblock @block @Bvtc
  Scenario Outline: Verify the Block functionality for Agency with Employer login
  
 	Given User is on Home page of application
    
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<username>" and "<Password>" for registered employer and click on Sign in button
    And Click on Agencies tab
    And Agency should be added previously
    |Name  |Email             | contact  |
	|pagy  |pagy@gmail.com    | 1234564  |
    And Go to workbench
   	And Add job
	|title		 |agytitle          |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
	|Developer   |Agynew Developer  |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
    And Select a added job
    And click on Share With Agency button and select the Share checkbox present in front of the "<agyEmailId>" to share the job 
    And again click on Share With Agency button and select the Block/Unblock checkbox present in front of the agency "<agyEmailId>" with whom you shared the job    
   	And Logout from App
    And Click on Employer-Agency Signin link	
	And Employer enters valid credentials "<agyEmailId>","<Password>"
	And Go to workbench
	And Select a added job    
	And Click on add candidate
	And enter "<CandidateEmail>"of candidate and click on Find button and observe
	Then Blocked agency should not be able to add candidate for the job and error message message should display and he should be able to see all candidate status which are added for that job
    And click on Close button from Add Candidate page and click on Yes button from confirmation popup
    And click on Share With Team button and add new team by clicking on Add button on Share Job page "<Team>","<Teamid>","<ContactNumber>"
    And search for "<Teamid>" team member and select the Share checkbox present in front of the agency team member to share the job with team member
    And click on Yes button from confirmation popup and observe
    Then user should able to search team member and blocked agency should not able to share job with any team members and error message should display
#   And close the browser
 
 
 Examples:
 |username           |Password  |agyEmailId	   |CandidateEmail    |Team|Teamid       |ContactNumber  |
 |pemp@gmail.com     |12345     |pagy@gmail.com|pratik@gmail.com  |pa1 |pa1@gmail.com|689498595      |

#TC ID - 61,65,66,384
 
@bvt_teamblock @block @Bvtc
 Scenario Outline: Verify the Block functionality for team member with Employer and Agency login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<username>" and "<Password>" for registered employer and click on Sign in button
	Given team member should be added
	|Name|         Email   | contact  |Nameagy   |    Emailagy     | contactagy  |
	|pe1 | pe1@gmail.com   | 1234564  | pa1      | pa1@gmail.com   |1234556      |
	|pe2 | pe2@gmail.com   | 1234564  | pa2      | pa2@gmail.com   |1234566      |   
	And Go to workbench
	And Add job
	|title		     |agytitle          |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
	|New3 Developer  |Newagy3job        |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
	And Select a added job
    And click on Share With Team button and select the Share checkbox present in front of the team member "<team>"
	And click on Yes button from confirmation popup and now select the Block/Unblock checkbox present in front of the team member 
 	And Click on close button
  	And Logout from App
	And Click on Employer-Agency Signin link
    And enter valid "<teamId>" and "<Password>" for registered employer and click on Sign in button
    And Go to workbench
    And Select a added job
    And click on Add Candidate button
    And enter "<CandEmailId>"of candidate and click on Find button and observe
    Then Blocked team member should not be able to add candidate
    And close the browser
    
Examples:
|username         |   Password   |team|teamId         |CandEmailId    |
|pemp@gmail.com   |    12345     |pe1 |pe1@gmail.com  |can12@gmail.com|
|pagy@gmail.com   |    12345     |pa1 |pa1@gmail.com  |can13@gmail.com|

#TC ID - 67,72,73