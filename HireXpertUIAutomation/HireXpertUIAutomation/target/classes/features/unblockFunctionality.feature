Feature: Job Management

@bvt_agencyunblock
  Scenario Outline: Verify the Unblock functionality for Agency with Employer login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<username>" and "<password>" for registered employer and click on Sign in button
#    And Click on Agencies tab
#    And Agency should be added previously
#    |Name  |Email             | contact  |
#	|pagy  |pagy@gmail.com    | 1234564  |
    And Go to workbench
	And Add job
	|title    |designation |industry   |jobrole        |location |budget |minexp|maxexp|agytitle   |
	|abc job  |developer   |IT software|java developer |pune     |400000 |1     |2     |blockjobAGY|
	And Select a added job
    And click on Share With Agency button and select the Share checkbox present in front of the "<agyEmailId>" to share the job 
    And click on the Block/Unblock to unblock checkbox present in front of whom you shared the job "<agyEmailId>"
    Then Employer should be able to unblock the agency
    And Click on close button
    And logout with employer and login with Agency "<agyEmailId>" and "<passward>" valid credentials which you blocked on Share Job page 
	And Go to workbench   
	And Select a added job
	And click on Add Candidate button
#    And enter "<CandEmailId>"of candidate and click on Find button and observe
	And Enter All details of "<CandEmailId>","<Name>","<ContactNumber>","<Designation>" ,"<Gender>", "<NoticePeriod>","<Location>" and "<Communicationmode>"
    Then Unblocked agency should be able to add candidate
#    And close the browser
 Examples:
 |username           |password  |CandEmailId    |team|teamId       |ContactNumber  |agyEmailId     |empEmailId       |Name |Designation|Gender|NoticePeriod|Location|Communicationmode|
 |pemp@gmail.com     |12345     |can11@gmail.com|pa1 |pa1@gmail.com|689498595      |pagy@gmail.com |pemp@gmail.com   |can11|developer  |Male  |20          |pune    |Email            |      

@bvt_teamunblock
  Scenario Outline: Verify the Unblock functionality for team member with Employer and Agency login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<username>" and "<password>" for registered employer and click on Sign in button
#    Given team member should be added
#	|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
#	|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
#	|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  | 
   	And Go to workbench
	And Add job
	|title    |designation |industry   |jobrole        |location |budget |minexp|maxexp|agytitle   |
	|abc job  |developer   |IT software|java developer |pune     |400000 |1     |2     |blockjobAGY|
	And Select a added job
    And click on Share With Team button and select the Share checkbox present in front of the team member "<team>"
    And click on the Block/Unblock to unblock checkbox present in front of whom you shared the job "<team>"
# 	And click on Yes button from confirmation popup and click on Close button from Share Job
    Then User should be able to unblock the team member
    And Click on close button
    And Logout from App
	And Click on Employer-Agency Signin link
	And Employer enters valid credentials "<team>","<password>"
    And Go to workbench
    And Select a added job
   	And Click on add candidate
	And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>" ,"<Gender>", "<NoticePeriod>","<Location>" and "<Communicationmode>"
    Then Unblocked team member should be able add candidate "<Name>"
    And close the browser
    
Examples:
|username        |   password   |team         |Name   |CandidateEmail   |ContactNumber|Designation   |Gender|NoticePeriod | Location|Communicationmode|
|pemp@gmail.com  |    12345     |pe1@gmail.com|Pratik |pratik@gmail.com |4564668596   |developer     |Male  |30           |pune     |Email            |
#|pagy@gmail.com  |    12345     |pa1@gmail.com|Abhijit|Abhijit@gmail.com|9856558555   |Java developer|Male  |30           |pune     |Email            |

#TC ID - 236,237,238    
