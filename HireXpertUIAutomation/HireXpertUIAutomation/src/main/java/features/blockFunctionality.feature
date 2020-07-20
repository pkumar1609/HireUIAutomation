Feature: Job Management

@bvt_agencyblock @block
  Scenario Outline: Verify the Block functionality for Agency with Employer login
  
 	Given User is on Home page of application
    
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<username>" and "<passward>" for registered employer and click on Sign in button
#    And Click on Agencies tab
#    And Agency should be added previously 
#    |Name  |Email             | contact  |
#	|pagy  |pagy@gmail.com    | 1234564  |
#	|pagy1 |pagy1@gmail.com   | 1234564  |	
    And Go to workbench
   	And Add job
	|title    |designation |industry   |jobrole        |location |budget |minexp|maxexp|
	|blockjob |developer   |IT software|java developer |pune     |400000 |1     |2     |
    And Select a added job
    And click on Share With Agency button and select the Share checkbox present in front of the "<agyEmailId>" to share the job 
    And click on Yes button from confirmation popup and click on Close button from Share Job window
    And again click on Share With Agency button and select the Block/Unblock checkbox present in front of the agency "<agyEmailId>" with whom you shared the job
    And click on Yes button from confirmation popup and click on Close button from Share Job window
    And logout with employer and login with Agency "<agyEmailId>" and "<passward>" valid credentials which you blocked on Share Job page 
    And click on Workbench tab and select the job for which agency is blocked
    And Click on add candidate
	And enter "<CandidateEmail>"of candidate and click on Find button and observe
	Then Blocked agency should not be able to add candidate for the job and error message message should display and he should be able to see all candidate status which are added for that job
    And click on Close button from Add Candidate page and click on Yes button from confirmation popup
    And click on Share With Team button and add new team by clicking on Add button on Share Job page "<team>","<teamId>","<ContactNumber>"
    And search for "<teamId>" team member and select the Share checkbox present in front of the agency team member to share the job with team member
    And click on Yes button from confirmation popup and observe
    Then user should able to search team member and blocked agency should not able to share job with any team members and error message should display
#   And close the browser
 
 
 Examples:
 |username           |Password  |CandidateEmail    |team|teamId       |ContactNumber  |agyteam |agency|agyEmailId     |Name |Designation|Gender|NoticePeriod|Location|Communicationmode|
 |pemp@gmail.com     |12345     |pratik@gmail.com  |pa1 |pa1@gmail.com|689498595      |pa1     |pagy   |pagy@gmail.com |can11|developer  |Male  |20          |pune    |Email            |   

#TC ID - 61,65,66,384
 
@bvt_teamblock @block
 Scenario Outline: Verify the Block functionality for team member with Employer and Agency login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
	Given team member should be added
	|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
	|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
	|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |    
	And Go to workbench
	And Add job
	|title    |designation |industry   |jobrole        |location |budget |minexp|maxexp|agytitle   |
	|blockjob |developer   |IT software|java developer |pune     |400000 |1     |2     |blockjobAGY|
	And Select a added job
    And click on Share With Team button and select the Share checkbox present in front of the team member"<team>"
	And click on Yes button from confirmation popup and now select the Block/Unblock checkbox present in front of the team member 
    And click on Yes button from confirmation popup and click on Close button from Share Job
	And logout with logged in user and login with team member "<teamId>","<password>"valid credentials which you blocked on Share Job page
    And click on Workbench tab and select the job for which team member is blocked
#   And click on Workbench tab and select the job for which agency is blocked
    And click on Add Candidate button
    And enter "<CandEmailId>"of candidate and click on Find button and observe
    Then Blocked team member should not be able to add candidate for the job and error message should display and he should be able to see all candidate status which are added by himself into that job
    And close the browser
    
Examples:
|   email address |   password   |team|teamId         |CandEmailId    |
#|pemp@gmail.com  |    12345     |pe1 |pe1@gmail.com  |can12@gmail.com|
|pagy@gmail.com   |    12345     |pa1 |pa1@gmail.com  |can13@gmail.com|

#TC ID - 67,72,73