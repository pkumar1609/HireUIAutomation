Feature: Task Management

@TaskManagement1
Scenario Outline: To verify general and Job task displaying on task management page

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
Given team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to dashboard
And Click on Add task button and enter all details employer
|Title for emp |Title for agy     |teamField |AssignTo |note                             |employer |team    |teamid         |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task1         |particular task   |pemp      |pe1      |Task should complete before time |pemp     |pe1     |pe1@gmail.com  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Go to Task Management tab
Then task should display on task Management page
And Go to Workbench
And Add job
|title         |agytitle      |designation |industry   |jobrole        |location |budget |minexp|maxexp|minsal|maxsal|totalinterviews|organization|functionalArea|
|ui Designer   |uiagy Designer|developer   |IT software|java developer |pune     |400000 |1     |2     |400000|500000|4|talentxpert|java|
And Select a added job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Click on close button
And Click on hamburger menu
And Click on Add task button and enter all details employer
|Title for emp |Title for agy         |teamField |AssignTo |note                             |employer |team    |teamid         |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|ui Designer   |ui Designer agy task  |pemp      |pe1      |Task should complete before time |pemp     |pe1     |pe1@gmail.com  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Go to Task Management tab
Then task should display on task Management page

Examples:
|Username      |Teamid         |Password |
#|pemp@gmail.com|pe1@gmail.com  |12345    |
|pagy@gmail.com|pa1@gmail.com  |12345    |

@TaskManagement2
Scenario Outline: To verify Schedule interview and pending interview task displaying on task management page

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
Given team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to Workbench
And Add job with All details "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title              |agytitle 				 |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea|                                                                  
|taskmanagementjob1 |taskmanagementjob1 agy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Permanent Full Time |Yes			      |No        | Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |Java|
And Select a added job
And Click on add candidate 
And Enter All details of "<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And move the candidate card from potential candidate to Schedule Interview column
And Go to Task Management tab
Then Schedule interview task should display on task Management page "<Name>"
And Go to Workbench
And Select a added job
And move the candidate card from Schedule Interview column to pending interview column
And Go to Task Management tab
Then pending interview task should display on task Management page "<Name>"


Examples:
|Username      |Teamid         |Password |CandidateEmail      |profiletitle    |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|jobs    |designation   |mandatorySkills|preferredSkills|optionalSkills|minexp|maxexp|updatedOn|industry   |overBudget|minage|maxage|jobtype            |shift|
|pemp@gmail.com|pe1@gmail.com  |12345    |hirecan58@gmail.com |Developer       |hirecan58|7885685538    |Developer     |14/2/1995       |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |JCFW 10 |Developer     |JAVA 			|advanced java  |JavaScript    |1     |2     |         |IT software|No        |25    |30    |Permanent Full Time| Day Shift|


