Feature: Job Management

@bvt_agencyunblock @BVT @unblock
  Scenario Outline: Verify the Unblock functionality for Agency with Employer login
  
  	Given User is on Home page of application   
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<Username>" and "<Password>" for registered employer and click on Sign in button
    And Click on Agencies tab
    And Agency should be added previously
    |Name  |Email             | contact  |
	|pagy  |pagy@gmail.com    | 1234564  |
    And Go to workbench
	And Add job
	|title	|agytitle    |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|
	|job4   |job1agy     |developer|IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			  |Hirexpert   |rahitech       |
	And Select a added job
    And click on Share With Agency button and select the Share checkbox present in front of the "<agyEmailId>" to share the job 
    And click on the Block/Unblock to unblock checkbox present in front of agency whom you shared the job "<agyEmailId>"
    Then Employer should be able to unblock the agency
    And Click on close button
    And Logout from App
    And Click on Employer-Agency Signin link	
	And Employer enters valid credentials "<agyEmailId>","<Password>"
	And Go to workbench
	And Select a added job
	And click on Add Candidate button
	And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<profiletitle>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
    Then Unblocked agency should be able to add candidate
   And close the browser

 Examples:
|Username      |agyEmailId    |Teamid         |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com|pagy@gmail.com|pe1@gmail.com  |12345    |hirecan08@gmail.com |jr software developer|hirecan08|9890685538    |Sr.developer  |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |

@bvt_teamunblock @BVT @unblock
  Scenario Outline: Verify the Unblock functionality for team member with Employer and Agency login
  
  	Given User is on Home page of application
    
    When title of page is HireXpert
    And Click on Employer-Agency Signin link
    And enter valid "<Username>" and "<Password>" for registered employer and click on Sign in button
  	Given team member should be added
	|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
	|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
	|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  | 
   	And Go to workbench
	And Add job
	|title      |agytitle      |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|
	|jobupdate  |jobupdateagy  |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |	
	And Select a added job
    And click on Share With Team button and select the Share checkbox present in front of the team member "<Teamid>"
    And click on the Block/Unblock to unblock checkbox present in front of team with whom you shared the job "<Teamid>"
    Then User should be able to unblock the team member
    And Click on close button
    And Logout from App
	And Click on Employer-Agency Signin link
	And Employer enters valid credentials "<Teamid>","<Password>"
    And Go to workbench
    And Select a added job
   	And Click on add candidate
	And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<profiletitle>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
    Then Unblocked team member should be able add candidate "<Name>"
    And close the browser
    
Examples:
|Username      |Teamid         |Password |CandidateEmail      |profiletitle          |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com|pe1@gmail.com  |12345    |hirecan11@gmail.com |jr software developer |hirecan11|9890685538    |Sr.developer  |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
|pagy@gmail.com|pa1@gmail.com  |12345    |hirecan12@gmail.com |jr software developer 1|hirecan12|78950685538  |Sr.developer  |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |



#TC ID - 236,237,238    
