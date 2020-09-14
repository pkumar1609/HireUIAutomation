Feature: Adding Candidate from workbench

@employerAgency1
Scenario Outline: Add the Candidate from workbench and verify details on edit candidate and candidate details page
	
Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
#Given team member should be added
#|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
#|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
#|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		        |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|
|Software developer |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |
And Select a added job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Give Can see All candidates permission "<Teamid>"
And Click on close button
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"
And Click on Edit Candidate icon on candidate card "<Name>"
And Assert the details of candidate 
|<Username>|<CandidateEmail>|<Name>|<ContactNumber>|<Designation>|<Date>|<Gender>|<OnNoticePeriod>|<NoticePeriod>|<LastWorkingDay>|<experience>|<CTC>|<expectedCTC>|<Country>|<City>|<CityArea>|<ZipCode>|<Communicationmode>|<Salaryoffered>|<distance>|<permanentAddress>|<relocate>|<Skill1>|<Skill2>|<Skill3>|<level1>|<level2>|<level3>|<certificate1>|<certificate2>|<certificate3>|<certificateforskill1>|<certificateforskill2>|
And Click on edit close button
And get the logged in user details
And click on Schedule Interview icon from candidate card
And fill all interview details and click on Submit button
| Title      |ScheduleOn| Hour | Minute |  Duration  | TimeZone             |Location   |
| Interview1 | 25       | 10   | 00     | 30 Minutes | Indian Standard Time |Viman Nagar|
And Click on close button
And Click Candidate details eye icon on candidate card "<Name>"
And Assert the details on candidate details icon"<Username>","<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<certificate1>","<certificate2>","<certificate3>","<certificateforskill1>" and "<certificateforskill2>"
And Click on close button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Teamid>","<Password>"
And And Go to workbench
And Select a added job
And Click on Edit Candidate icon on candidate card "<Name>"
And Assert the details of candidate 
|<Username>|<CandidateEmail>|<Name>|<ContactNumber>|<Designation>|<Date>|<Gender>|<OnNoticePeriod>|<NoticePeriod>|<LastWorkingDay>|<experience>|<CTC>|<expectedCTC>|<Country>|<City>|<CityArea>|<ZipCode>|<Communicationmode>|<Salaryoffered>|<distance>|<permanentAddress>|<relocate>|<Skill1>|<Skill2>|<Skill3>|<level1>|<level2>|<level3>|<certificate1>|<certificate2>|<certificate3>|<certificateforskill1>|<certificateforskill2>|
And Click on edit close button
And Click Candidate details eye icon on candidate card "<Name>"
And Assert the details on candidate details icon"<Username>","<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<certificate1>","<certificate2>","<certificate3>","<certificateforskill1>" and "<certificateforskill2>"
And Click on close button

Examples:
|Username      |Teamid         |Password |CandidateEmail      |Title                |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com|pe1@gmail.com  |12345    |hirecan08@gmail.com |jr software developer|hirecan08|9890685538    |Sr.developer  |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
#|pagy@gmail.com|pa1@gmail.com |12345   |hirecan08@gmail.com |software developer    |hirecan06|8453255656    |Sr.developer  |03/04/2020      |Male    |Yes           |30          |01/09/2021      |2.5       |700000|800000     | India |Pune  |pune       |455966 |Email            |500000       |8       |Yes             |No      |JAVA    |advanced java|JavaScript|Basic Knowledge | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version      |


@onupdateprofile
Scenario Outline: Add the Candidate from workbench and verify details on update profile page on candidate login
	
Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		          |agytitle          |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|
|Software developer I |Software Tester I |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"
And Logout from App
And Click on Job Seeker(Candidate) Sign In link
And candidate enters valid credentials "<CandidateEmail>","<Password>"
And click on update profile option
And Assert the details on candidate profile page 
|"<Username>|<CandidateEmail>|<Name>|<ContactNumber>|<Designation>|<Date>|<Gender>|<OnNoticePeriod>|<NoticePeriod>|<LastWorkingDay>|<experience>|<CTC>|<expectedCTC>|<Country>|<City>|<CityArea>|<ZipCode>|<Communicationmode>|<Salaryoffered>|<distance>|<permanentAddress>|<relocate>|
And Assert the Skills on candidate profile page
|<Skill1>|<Skill2>|<Skill3>|<level1>|<level2>|<level3>|<certificate1>|<certificate2>|<certificate3>|<certificateforskill1>|<certificateforskill2>|
Examples:
|Username      |Teamid        |Password|CandidateEmail      |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
#|pemp@gmail.com|pe1@gmail.com |12345   |hirecan09@gmail.com |hirecan06|4785685538    |Sr.developer  |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
|pagy@gmail.com|pa1@gmail.com |12345   |hirecan09@gmail.com |hirecan06|7457255656    |Sr.developer  |03/04/2020      |Male    |Yes           |30          |01/09/2021      |2.5       |700000|800000     | India |Pune  |pune       |455966 |Email            |500000       |8       |Yes             |No      |JAVA    |advanced java|JavaScript|Basic Knowledge | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |




#############Job Validation##########

@jobvalidation 
Scenario Outline: Add job and assert all details on edit job page also on team view job page
	
Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
#Given team member should be added
#|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
#|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
#|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title             |agytitle         |designation |industry   |jobrole        |organization|qualification|country|city|location |zipcode|address    |noofvacancies|budget |minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
|candidateJob      |candidateJobagy  |Developer   |IT software|java developer |Talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |400000 |1     |2     |400000|800000|400000     |25     |30   |4			  |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |
#And Select a added job
#And Share job with team member
#|EmpTeam|Agyteam|
#|pe1    |pa1    |
#And Click on close button
#And Click on hamburger menu
#And click on edit button
#And Assert details of add jon on edit job page "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
#|title             |agytitle         |designation |industry   |jobrole        |organisation|qualification|country|city|location |zipcode|address    |noofvacancies|budget |minexp|maxexp|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
#|candidateJob      |candidateJobagy  |Developer   |IT software|java developer |Talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |400000 |1     |2     |400000     |25     |30   |4			  |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |
#And Click on close button
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials "<Teamid>","<Password>"
#And And Go to workbench
#And Select a added job
#And Click on hamburger menu
#And click on Edit/view job button
#And Assert details of add jon on edit job page "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
#|title             |agytitle         |designation |industry   |jobrole        |organisation|qualification|country|city|location |zipcode|address    |noofvacancies|budget |minexp|maxexp|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
#|candidateJob      |candidateJobagy  |Developer   |IT software|java developer |Talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |400000 |1     |2     |400000     |25     |30   |4			  |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |

Examples:
|Username      |Teamid        |Password|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com|pe1@gmail.com|12345   |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
#|pagy@gmail.com|pa1@gmail.com |12345   |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |

@jobvalidationonAgency
Scenario Outline: Add job and assert all details on edit job page on agency side ehen job is shared
	
Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
#Given team member should be added
#|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
#|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
#|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title             |agytitle         |designation |industry   |jobrole        |organisation|qualification|country|city|location |zipcode|address    |noofvacancies|budget |minexp|maxexp|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
|candidateJob      |candidateJobagy  |Developer   |IT software|java developer |Talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |400000 |1     |2     |400000     |25     |30   |4			  |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |
And Select a added job
And share job with agency "<agencyname>"
And Click on close button
And Click on hamburger menu
And click on edit button
And Assert details of add jon on edit job page "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
|title             |agytitle         |designation |industry   |jobrole        |organisation|qualification|country|city|location |zipcode|address    |noofvacancies|budget |minexp|maxexp|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
|candidateJob      |candidateJobagy  |Developer   |IT software|java developer |Talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |400000 |1     |2     |400000     |25     |30   |4			  |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |
And Click on close button
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Click on close button
And Click on hamburger menu
And click on Edit/view job button
And Assert details of add jon on edit job page "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
|title             |agytitle         |designation |industry   |jobrole        |organisation|qualification|country|city|location |zipcode|address    |noofvacancies|budget |minexp|maxexp|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
|candidateJob      |candidateJobagy  |Developer   |IT software|java developer |Talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |400000 |1     |2     |400000     |25     |30   |4			  |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |
And Click on close button

Examples:

|Username      |agencyname    |Teamid        |Password|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com|pagy@gmail.com|pe1@gmail.com|12345   |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |


@jobvalidationonMarketplace
Scenario Outline: assert job details on marketplace when job is shared on marketplace
	
Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title                     |agytitle         |designation |industry   |jobrole        |organisation|qualification|country|city|location |zipcode|address    |noofvacancies|budget |minexp|maxexp|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
|Marketplace job validation|candidateJobagy  |Developer   |IT software|java developer |Talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |400000 |1     |2     |400000     |25     |30   |4			  |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |
And Select a added job
And Click on share job with market place
And Click on Employer marketplace tab 
And Click on shared job
And Assert the job details on job title 
|<designation>|<industry>|<organisation>|<qualification>|<country>|<city>|<location>|<minexp>|<maxexp>|<jobType>|<noticePeriod>|<noofvacancies>|<considerRelocation>|<Skill1>|<Skill2>|<Skill3>|<level1>|<level2>|<level3>|<Weightage1>|<Weightage2>|<Weightage3>|<certificate1>|<certificate2>|<certificate3>|<remark1>|<remark2>|<remark3>|
And Click on close button
And Logout from App
And Click on Employer-Agency Signin link
And login as a support user
And verify shared job is displaying on support login
And Click on approve
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<agencyname>","<Password>"
And Go to agency marketplace tab
And Click on job displaying in marketplace job section
And Assert the job details on job title 
|<designation>|<industry>|<organisation>|<qualification>|<country>|<city>|<location>|<minexp>|<maxexp>|<jobType>|<noticePeriod>|<noofvacancies>|<considerRelocation>|<Skill1>|<Skill2>|<Skill3>|<level1>|<level2>|<level3>|<Weightage1>|<Weightage2>|<Weightage3>|<certificate1>|<certificate2>|<certificate3>|<remark1>|<remark2>|<remark3>|
And Click on close button
Examples:
|Username      |agencyname    |Teamid        |Password|designation |industry   |organisation|qualification|country|city|location |minexp|maxexp|jobType                |noticePeriod|noofvacancies|totalinterviews|considerRelocation|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com|pagy@gmail.com|pe1@gmail.com |12345   |Developer   |IT software|Talentxpert |BE           |India  |Pune|pune     |1     |2     | Contractual Full Time |20          |2            |4			  |Yes         		 |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |


@onjobboard
Scenario Outline: assert job details on marketplace when job is shared on marketplace
	
Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title       |agytitle         |designation |industry   |jobrole        |organisation|qualification|country|city|location |zipcode|address    |noofvacancies|budget |minexp|maxexp|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
|jobboard    |candidateJobagy  |Developer   |IT software|java developer |Talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |400000 |1     |2     |400000     |25     |30   |4			  |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |
And Select a added job
And Logout from App
And Click on Employer-Agency Signin link
And login as a support user
And verify shared job is displaying on support login
And Click on approve
And Logout from App
And Click on more jobs
And Click on view job details button
Then Assert the details on job board page
|<designation>|<industry>|<jobrole>|<organisation>|<qualification>|<country>|<city>|<location>|<zipcode>|<budget>|<cashBenefit>|<minexp>|<maxexp>|<jobType>|<noticePeriod>|<noofvacancies>|<Shift>|<ShiftTimings>|<totalinterviews>|<considerRelocation>|<Skill1>|<Skill2>|<Skill3>|<level1>|<level2>|<level3>|

Examples:
|Username      |agencyname    |Teamid        |Password|jobrole       |designation |industry   |organisation|qualification|country|city|location |zipcode|minexp|maxexp|budget|cashBenefit|jobType                |noticePeriod|noofvacancies|totalinterviews|considerRelocation|Shift 		  |ShiftTimings|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com|pagy@gmail.com|pe1@gmail.com |12345   |java developer|Developer   |IT software|Talentxpert |BE           |India  |Pune|pune     |442001 |1     |2     |400000|400000     |Contractual Full Time  |20          |2            |4			    |Yes         	   |Mid-Day Shift |9-5         |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |


########Candidate data validation########
@candidatedetails
Scenario Outline: validate the candidate details when he updated his profile
	
Given User must be registered

When title of login page is Home
#And Click register link
#And Enter all details on register page "<Name>" "<CandidateEmail>" "<ContactNumber>" "<UserType>" "<timezone>" "<country>"
And Click on Job Seeker(Candidate) Sign In link
And candidate enters valid credentials "<CandidateEmail>","<Password>"
And click on update profile option
And Enter all personal and professional details of candidate 
|<title>|<CandidateEmail>|<ContactNumber>|<Date>|<Country>|<CityArea>|<Name>|<alternateemail>|<alternate contactnumber>|<Gender>|<City>|<ZipCode>|<currentorganization>|<currentdesignation>|<currentduration>|<jobtype>|<shift>|<preferredcity>|<searchkeyword>|<industry>|<experience>|<CTC>|<expectedCTC>|<Communicationmode>|<residentialstatus>|<willingtotravel>|<OnNoticePeriod>|<NoticePeriod>|<lookingforjob>|<relocate>|<cv>|

Examples:
|Username      |Teamid        |Password|CandidateEmail      |alternateemail     |Name     |ContactNumber |alternateContact|UserType |timezone			  |country|title                |currentorganization|currentdesignation |currentduration|jobtype              |shift        |preferredcity|Date         |Gender  |OnNoticePeriod|NoticePeriod|searchkeyword|industry   |experience|CTC   |expectedCTC|City  |CityArea   |ZipCode|Communicationmode|residentialstatus|willingtotravel  |lookingforjob|relocate|cv                                  |
|pemp@gmail.com|pe1@gmail.com |12345   |hirecan10@gmail.com |hirecan11@yahoo.com|hirecan06|9890685538    |8694755554      |Candidate|Indian Standard Time | India |Sr. software engineer|Accenture          |Sr.developer       |2   			|Contractual Full Time|Evening Shift|Pune         |14/02/1995   |Female  |Yes           |25          |can11        |IT software|1.5       |800000|800000     |wardha|Arvi naka  |455966 |Call             |Citizen          |No		    	|No           |No      |C:\\Users\\TLP33\\Documents\\CV.docx|
