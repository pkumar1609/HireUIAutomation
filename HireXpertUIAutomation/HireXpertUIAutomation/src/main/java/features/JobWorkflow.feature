Feature: Job Workflow

	@bvt_agencyblock @block @BVTC @jobworkflow
  	Scenario Outline: Verify the Block functionality for Agency with Employer login
  
 	Given User is on Home page of application
    
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<username>" and "<Password>" for registered employer and click on Sign in button
    And "agency" should be added previously
    |Name  |Email           | contact  |
	|pagy  |pagy@gmail.com  | 1234564  |
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
 	And Click on close button
	 
	 Examples:
	 |username           |Password  |agyEmailId	   |CandidateEmail    |Team|Teamid       |ContactNumber  |
	 |pemp@gmail.com     |12345     |pagy@gmail.com|pratik@gmail.com  |pa1 |pa1@gmail.com|689498595      |

#TC ID - 61,65,66,384
 
	@bvt_teamblock @block @BVTC @jobworkflow
	Scenario Outline: Verify the Block functionality for team member with Employer and Agency login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<username>" and "<Password>" for registered employer and click on Sign in button
	Given "team" should be added
	|Name|         Email   | contact  |Nameagy   |    Emailagy     | contactagy  |
	|pe1 | pe1@gmail.com   | 1234564  | pa1      | pa1@gmail.com   |1234556      |
	|pe2 | pe2@gmail.com   | 1234564  | pa2      | pa2@gmail.com   |1234566      |   
	And Go to workbench
	And Add job
	|title		     |agytitle          |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
	|New Developer   |New8agyjob        |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
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
    And Click on close button and confirm Yes button
    
	Examples:
	|username         |   Password   |team|teamId         |CandEmailId    |
	|pemp@gmail.com   |    12345     |pe1 |pe1@gmail.com  |can12@gmail.com|
	|pagy@gmail.com   |    12345     |pa1 |pa1@gmail.com  |can13@gmail.com|
	
	#TC ID - 67,72,73

	@bvt_agencyunblock @BVTC @unblock @jobworkflow
    Scenario Outline: Verify the Unblock functionality for Agency with Employer login
  
  	Given User is on Home page of application   
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<Username>" and "<Password>" for registered employer and click on Sign in button
    And "agency" should be added previously
    |Name  |Email             | contact  |
	|pagy  |pagy@gmail.com    | 1234564  |
    And Go to workbench
	And Add job
	|title	        |designation  |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
	|Jobworkflow5   |developer    |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			     |Hirexpert   |rahitech       |java|
	And Select a added job
	And click on Share With Agency button and select the Share checkbox present in front of the "<agyEmailId>" to share the job 	
	And Block the agency "<agyEmailId>"
    And click on the Block/Unblock to unblock checkbox present in front of agency whom you shared the job "<agyEmailId>"
    Then Employer should be able to unblock the agency
    And Click on close button
    And Logout from App
    And Click on Employer-Agency Signin link	
	And Employer enters valid credentials "<agyEmailId>","<Password>"
	And Go to workbench
	And Select a added job
	And click on Add Candidate button
	And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
    Then Unblocked agency should be able add candidate "<Name>"

	 Examples:
	|Username      |agyEmailId    |Teamid         |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
	|pemp@gmail.com|pagy@gmail.com|pe1@gmail.com  |12345    |hirecan08@gmail.com |jr software developer|hirecan08|9890685538    |Sr.developer  |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |

	@bvt_teamunblock @BVTC @unblock @jobworkflow
  	Scenario Outline: Verify the Unblock functionality for team member with Employer and Agency login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<Username>" and "<Password>" for registered employer and click on Sign in button
  	Given "team" should be added
	|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
	|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
	|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  | 
   	And Go to workbench
	And Add job
	|title          |agytitle        |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
	|Jobworkflow6   |Jobworkflow6agy |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			  |Hirexpert   |rahitech       |	java|
	And Select a added job
    And click on Share With Team button and select the Share checkbox present in front of the team member "<Teamid>"
    And Block the team "<Teamid>"
    And click on the Block/Unblock to unblock checkbox present in front of team with whom you shared the job "<Teamid>"
    Then User should be able to unblock the team member
    And Click on close button
    And Logout from App
	And Click on Employer-Agency Signin link
	And Employer enters valid credentials "<Teamid>","<Password>"
    And Go to workbench
    And Select a added job
   	And Click on add candidate
	And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
    Then Unblocked team member should be able add candidate "<Name>"
    
	Examples:
	|Username      |Teamid         |Password |CandidateEmail      |profiletitle           |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
	|pemp@gmail.com|pe1@gmail.com  |12345    |hirecan30@gmail.com |jr software developer  |hirecan30|9890685538    |Sr.developer  |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
	|pagy@gmail.com|pa1@gmail.com  |12345    |hirecan31@gmail.com |jr software developer 1|hirecan31|78950685538  |Sr.developer  |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |

#TC ID - 236,237,238    


	@BVTC @primary @jobworkflow
    Scenario Outline: Verify user having only one primary contact with Employer and Agency login
  
  	Given User is on Home page of application 
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<email address>" and "<password>" for registered employer and click on Sign in button
    And Go to workbench
	And Add job
	|title		    |agytitle       |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|Employer|functionalArea|
	|Primary12      |Primaryagy123 Job |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			    |Hirexpert   |rahitech       |pemp    |java|
	And Select a added job
	And Go to dashboard
    Given "team" should be added
	|Name|         Email   | contact  |Nameagy  |         Emailagy  |team  |agyteam |
	|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|pe1   |pa1     |
	|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|pe1   |pa1	    |
    And click on Share With Team button and select the Share checkbox present in front of the team member "<Teamid>"
    And Click on primary contact
    And try to make another team member as primary contact "<anotherteam>" 
    Then user should not able to make multiple team members as primary contact "<Teamid>"
    And Click on close button
	Given "team" should be added
	|Name|         Email   | contact  |Nameagy  |         Emailagy  |
	|pe3 | pe3@gmail.com   | 1234564  |pa3      |pa3@gmail.com		|
	And user should able to change the primary contact only when the job is shared with the team member to whom user wants to make primary contact "<thridteam>"
    And Click on close button
	Examples:
	|   email address    |  password  |Team|Teamid       |contact |anotherteam|thridteam|
	|pemp@gmail.com      |   12345    |pe1 |pe1@gmail.com|16546856|pe2        |pe3@gmail.com|
	|pagy@gmail.com      |   12345    |pa1 |pa1@gmail.com|98598695|pa2        |pa3@gmail.com|

    
#TC ID - 68,69,93

