Feature: Data validation

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
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<profiletitle>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"
And Click on Edit Candidate icon on candidate card "<Name>"
And Assert the candidate details "<Username>","<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<certificate1>","<certificate2>","<certificate3>","<certificateforskill1>" and "<certificateforskill2>"
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
And Assert the candidate details "<Username>","<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<certificate1>","<certificate2>","<certificate3>","<certificateforskill1>" and "<certificateforskill2>"
And Click on edit close button
And Click Candidate details eye icon on candidate card "<Name>"
And Assert the details on candidate details icon"<Username>","<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<certificate1>","<certificate2>","<certificate3>","<certificateforskill1>" and "<certificateforskill2>"
And Click on close button

Examples:
|Username      |Teamid         |Password |CandidateEmail      |Title                |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com|pe1@gmail.com  |12345    |hirecan08@gmail.com |jr software developer|hirecan08|9890685538    |Sr.developer  |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
#|pagy@gmail.com|pa1@gmail.com  |12345     |hirecan08@gmail.com  |software developer    |hirecan06|8453255656    |Sr.developer  |03/04/2020      |Male    |Yes           |30          |01/09/2021      |2.5       |700000|800000     | India |Pune  |pune       |455966 |Email            |500000       |8       |Yes             |No      |JAVA    |advanced java|JavaScript|Basic Knowledge | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version      |


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
|<Username>|<CandidateEmail>|<Name>|<ContactNumber>|<Designation>|<Date>|<Gender>|<OnNoticePeriod>|<NoticePeriod>|<LastWorkingDay>|<experience>|<CTC>|<expectedCTC>|<Country>|<City>|<CityArea>|<ZipCode>|<Communicationmode>|<Salaryoffered>|<distance>|<permanentAddress>|<relocate>|
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
And Add job with all details"<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title             |agytitle         |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
|candidateJob      |candidateJobagy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |
And Select a added job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Click on close button
#And Click on hamburger menu
#And click on edit button
#And Assert details of add jon on edit job page "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
#|title             |agytitle         |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift            |ShiftTimings  |FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
#|candidateJob      |candidateJobagy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |
#And Click on close button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Teamid>","<Password>"
And And Go to workbench
And Select a added job
And Click on hamburger menu
And click on Edit/view job button
And Assert details of add jon on edit job page "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
|title             |agytitle         |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
|candidateJob      |candidateJobagy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |

Examples:
|Username      |Teamid        |Password|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
#|pemp@gmail.com|pe1@gmail.com|12345   |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
|pagy@gmail.com|pa1@gmail.com |12345   |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |


@jobvalidationonAgency
Scenario Outline: Add job and assert all details on edit job page on agency side when job is shared
	
Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
#Given team member should be added
#|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
#|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
#|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Add job with all details"<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title  |agytitle |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
|job3   |job3agy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |
And Select a added job
And share job with agency "<agencyname>"
And Click on close button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<agencyname>","<Password>"
And And Go to workbench
And Select a added job
And Click on hamburger menu
And click on view job button
And Assert details of add jon on edit job page "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
|title                 |agytitle         |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
|jobvalidationonAgency |candidateJobagy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |
And Click on close button
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Click on close button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "pagy@gmail.com","<Password>"
And And Go to workbench
And Select a added job
And Click on hamburger menu
And click on Edit/view job button
And Assert details of add jon on edit job page "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
|title                |agytitle         |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
|jobvalidationonAgency|candidateJobagy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |
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
|title  			   |agytitle 				   |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
|marketplacevalidation |marketplacevalidation agy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |
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
And Logout as a support user
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
|title    |agytitle 	 |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|                                                                    
|job1board |jobboard agy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |
And Select a added job
And Logout from App
And Click on Employer-Agency Signin link
And login as a support user
And verify shared job is displaying on support login
And Click on approve
And Logout as a support user
And Click on more jobs
And Click on view job details button
Then Assert the details on job board page
|<designation>|<industry>|<jobrole>|<organisation>|<qualification>|<country>|<city>|<location>|<zipcode>|<budget>|<cashBenefit>|<minexp>|<maxexp>|<jobType>|<noticePeriod>|<noofvacancies>|<Shift>|<ShiftTimings>|<totalinterviews>|<considerRelocation>|<Skill1>|<Skill2>|<Skill3>|<level1>|<level2>|<level3>|

Examples:
|Username      |agencyname    |Teamid        |Password|jobrole       |designation |industry   |organisation|qualification|country|city|location |zipcode|minexp|maxexp|budget|cashBenefit|jobType                |noticePeriod|noofvacancies|totalinterviews|considerRelocation|Shift 		  |ShiftTimings|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com|pagy@gmail.com|pe1@gmail.com |12345   |java developer|Developer   |IT software|Talentxpert |BE           |India  |Pune|pune     |442001 |1     |2     |400000|400000     |Contractual Full Time  |20          |2            |4			    |Yes         	   |Mid-Day Shift |9-5         |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |


########Candidate data validation########
#below all scenarion of candidate data validation require same candidate email

@candidatedetails
Scenario Outline: validate the candidate details when candidate login himself and add profile details
	
Given User must be registered

When title of login page is Home
And Click register link
And Enter all details on register page "<Name>" "<CandidateEmail>" "<ContactNumber>" "<UserType>" "<timezone>" "<country>"
And Click on Job Seeker(Candidate) Sign In link
And candidate enters valid credentials "<CandidateEmail>","<Password>"
And click on update profile option
#Then Enter all the personal and professional details of candidate "<title>" "<ContactNumber>" "<Date>" "<Country>" "<CityArea>" "<Name>" "<alternateemail>" "<alternateContact>" "<Gender>" "<City>" "<ZipCode>" "<currentorganization>" "<currentdesignation>" "<currentduration>" "<jobtype>" "<shift>" "<preferredcity>" "<searchkeyword>" "<industry>" "<experience>" "<expectedCTC>" "<residentialstatus>" "<OnNoticePeriod>" "<LastWorkingDay>" "<NoticePeriod>" "<CTC>" "<Communicationmode>" "<willingtotravel>" "<lookingforjob>" "<relocate>" "<cv>"
#And Click on save button
#And click ok on success popup
#Then Assert the personal and professional details of candidate
#|Username      |Teamid        |Password|CandidateEmail      |title				   |Name      |alternateemail     |ContactNumber |alternateContact|UserType |timezone			    |country|currentorganization|currentdesignation |currentduration|jobtype              |shift        |preferredcity|Date         |Gender  |OnNoticePeriod|LastWorkingDay |NoticePeriod|searchkeyword|industry   |experience|CTC   |expectedCTC|City  |CityArea   |ZipCode|Communicationmode|residentialstatus|willingtotravel  |lookingforjob|relocate|cv     |
#|pemp@gmail.com|pe1@gmail.com |12345   |hirecan14@gmail.com |Sr.software engineer  |hirecan14 |hirecan14@yahoo.com|8596685538    |2586355555      |Candidate|Indian Standard Time    | India |Accenture          |Sr.developer       |2   			|Contractual Full Time|Evening Shift|Pune         |14-Sep-2020  |Female  |Yes           |25-Dec-2020    |25          |can13        |IT software|1.7       |700000|800000     |Nagpur|sita bardi |248966 |Call             |Citizen          |Yes		     	 |No           |No   |CV.docx|
#And click on qualification tab
#And Fill all the qualification details 
#|Major    |year|grade |college        |university|country|degree  |
#|Research |2021|90    |CUJB      	  |cambridge |USA    |Ph.D    |
#|MBA  	  |2019|95    |BD college     |Nagpur    |India  |Master  |
#|BE       |2017|85    |DMIETR college |Nagpur    |India  |Bachelor|
#|Science  |2013|79    |New English    |Nagpur    |India  |12	  |
#|CBSE     |2011|80    |MVM            |Nagpur    |India  |10	  |
#And Click on save button
#And click ok on success popup
#Then Assert the qualification details
#|Major    |year|grade |college        |university|country|degree  |
#|Research |2021|90    |CUJB      	  |cambridge |USA    |Ph.D    |
#|MBA  	  |2019|95    |BD college     |Nagpur    |India  |Master  |
#|BE       |2017|85    |DMIETR college |Nagpur    |India  |Bachelor|
#|Science  |2013|79    |New English    |Nagpur    |India  |12	  |
#|CBSE     |2011|80    |MVM            |Nagpur    |India  |10	  |
#And Click on work experience tab
#And fill all work experience details
#|organization|fromMonth|fromYear|toMonth|toYear|designation	  |city  |country|
#|wipro       |JAN      |2020    |NOV    |2020  |Software Engineer|Nagpur|India  |
#|persistant  |FEB      |2019    |APR    |2019  |Software Engineer|Nagpur|India  |
#|Dell        |MAR      |2018    |DEC    |2018  |Software Engineer|Nagpur|India  |
#And Click on save button
#And click ok on success popup
#Then Assert work experience details
#|organization|fromMonth|fromYear|toMonth|toYear|designation		 |city  |country|
#|wipro       |JAN      |2020    |NOV    |2020  |Software Engineer|Nagpur|India  |
#|persistant  |FEB      |2019    |APR    |2019  |Software Engineer|Nagpur|India  |
#|Dell        |MAR      |2018    |DEC    |2018  |Software Engineer|Nagpur|India  |
And Click on skills and designation
And fill all skills and designation details "sr.Test Engineer"
|skill		  |Expertiselevel |certificate  |designation      | 
|JAVA         |Basic Knowledge|sun microsoft|sr.Test Engineer |
|advanced java|Intermediate   |ad. java  	|Java Developer   |
|JavaScript   | Expert        |javaScript	|Tester           |
And save the changes
Then Assert skills and designation "sr.Test Engineer"
|skill		  |Expertiselevel |certificate  |designation      | 
|JAVA         |Basic Knowledge|sun microsoft|sr.Test Engineer |
|advanced java|Intermediate   |ad. java  	|Java Developer   |		      
|JavaScript   | Expert        |javaScript	|Tester           |		 
And Click on certificate tab
And fill all certificate details
|certificate      |year|grade |issuing Authority|country|
|best performance |2020|90    |Wipro pvt ltd    |India  |
|cudos            |2019|75    |Dell pvt ltd     |India  |
|Employee of month|2018|86    |Dell pvt ltd     |India  |
And Click on save button
And click ok on success popup
Then Assert the certificate details
|certificate      |year|grade |issuing Authority|country|
|best performance |2020|90    |Wipro pvt ltd    |India  |
|cudos            |2019|75    |Dell pvt ltd     |India  |
|Employee of month|2018|86    |Dell pvt ltd     |India  |
And Click on languages tab
And Fill all language details
|language|proficiency						|certificate            |
|English | Professional working proficiency |Certificate of merit   |
|French  | Limited working proficiency      |Certificate of merit   |
|spanish | Elementary proficiency           |Certificate of persuing|
And Click on save button
And click ok on success popup
Then Assert the languages details
|language|proficiency						|certificate            |
|English |Professional working proficiency  |Certificate of merit   |
|French  |Limited working proficiency       |Certificate of merit   |
|Spanish |Elementary proficiency            |Certificate of persuing|
And Click on Visa Tab
And Fill All the deatils of visa 
|country	|VisaType    |ValidUpto     |
|USA		|Work Visa   |28-Oct-2030   |
|Singapore	|Student Visa|30-Apr-2025	|
|Australia	|Tourist Visa|1-Jan-2023    |
And Click on save button
And click ok on success popup
Then Assert the visa details
|country	|VisaType    |ValidUpto     |
|USA		|Work Visa   |28-Oct-2030   |
|Singapore	|Student Visa|30-Apr-2025	|
|Australia	|Tourist Visa|1-Jan-2023    |
And Click on Experience details tab
And Fill all experience details
|title   |organization|fromDate   |toDate     |technologies |client|
|paypal  |talentxpert |20-Jan-2020|21-Sep-2020|Java selenium|Alexu |
And Click on save button
And click ok on success popup
Then Asert the experirnce deatils
|title   |organization|fromDate   |toDate     |technologies |client|
|paypal  |talentxpert |20-Jan-2020|21-Sep-2020|Java selenium|Alexu |



Examples: 
|Username      |Teamid        |Password|CandidateEmail      |profiletitle	       |Name      |alternateemail     |ContactNumber |alternateContact|UserType |timezone			    |country|currentorganization|currentdesignation |currentduration|jobtype              |shift        |preferredcity|Date         |Gender  |OnNoticePeriod|LastWorkingDay |NoticePeriod|searchkeyword|industry   |experience|CTC   |expectedCTC|City  |CityArea   |ZipCode|Communicationmode|residentialstatus|willingtotravel  |lookingforjob|relocate|cv                                  |
|pemp@gmail.com|pe1@gmail.com |12345   |hirecan14@gmail.com |Sr.software engineer  |hirecan14 |hirecan14@yahoo.com|8596685538    |2586355555      |Candidate|Indian Standard Time    | India |Accenture          |Sr.developer       |2   			|Contractual Full Time|Evening Shift|Pune         |14-Sep-2020  |Female  |Yes           |25-Dec-2020    |25          |can13        |IT software|1.7       |700000|800000     |Nagpur|sita bardi |248966 |Call             |Citizen          |Yes		     	 |No           |No      |C:\\Users\\TLP33\\Documents\\CV.docx|


@training 
Scenario Outline: validate the candidate details when candidate login himself and add profile details
	
Given User must be registered

When title of login page is Home
#And Click register link
And Enter all details on register page "<Name>" "<CandidateEmail>" "<ContactNumber>" "<UserType>" "<timezone>" "<country>"
And Click on Job Seeker(Candidate) Sign In link
And candidate enters valid credentials "<CandidateEmail>","<Password>"
And click on update profile option
#And clck on training tab
#And fill all training details
#|title1               |experirence|reamrk1      |title2                   |attendedYear|remark2    			 |
#|robotic              |1		  |electronics  |antrupeurnship           |2020        |independent 		 |
#|Java workshop        |5		  |java langauge|logical skill development|2017        |develop logical skill|
#|langauge fundamentals|4		  |c,c++        |It Workshop              |2015		   |it firm conducted	 |
#And save the changes
#Then Assert the training deatils
#|title1               |experirence|reamrk1      |title2                   |attendedYear|remark2    			 |
#|robotic              |1		  |electronics  |antrupeurnship           |2020        |independent 		 |
#|Java workshop        |5		  |java langauge|logical skill development|2017        |develop logical skill|
#|langauge fundamentals|4		  |c,c++        |It Workshop              |2015		   |it firm conducted	 |
#And click on social links tab
#And fill all social link details
#|title     |link                                 |
#|linkedin  |https://www.linkedin.com/in/riya     |
#|naukri    |https://www.naukri.com/profile-job s |
#|Facebook  |https://www.Facebook.com/profile-jobs|
#And Click on save button
#And click ok on success popup
#Then Assert the social link details
#|title     |link                                 |
#|linkedin  |https://www.linkedin.com/in/riya     |
#|naukri    |https://www.naukri.com/profile-job s |
#|Facebook  |https://www.Facebook.com/profile-jobs|
And Click on Aditional Details tab
#And fill all Aditional details
Then Assert the additional details

Examples: 
|Username      |Password|CandidateEmail     |
|pemp@gmail.com|12345   |hirecan14@gmail.com|

@assertonemp
Scenario Outline: validate the candidate details when employer added candidate who register himself (with all profile details)

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		      |agytitle       |designation     |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|
|Java dev         |java agency job|developer       |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |
And Select a added job
And Click on add candidate
And enter candidate email "<CandidateEmail>"
And Assert the candidate details when candidate is already register"<Username>","<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<certificate1>","<certificate2>","<certificate3>","<certificateforskill1>" and "<certificateforskill2>"
#And Click on edit close button

Examples: 
|Username      |Teamid        |Password|CandidateEmail      |profiletitle         |Name      |alternateemail     |ContactNumber |alternateContact|UserType |timezone			    |Country|currentorganization|Designation      |currentduration|jobtype              |shift        |preferredcity|Date         |Gender  |OnNoticePeriod|LastWorkingDay|NoticePeriod|searchkeyword|industry   |experience|CTC   |expectedCTC|City  |CityArea   |ZipCode|Communicationmode|residentialstatus|willingtotravel  |lookingforjob|relocate|cv                                  |Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
#|pemp@gmail.com|pe1@gmail.com |12345   |hirecan14@gmail.com |Sr.software engineer |hirecan14 |hirecan14@yahoo.com|8596685538    |2586355555      |Candidate|Indian Standard Time    | India |Accenture          |Sr.developer       |2   			|Contractual Full Time|Evening Shift|Pune         |14-Sep-2020  |Female  |Yes           |25-Dec-2020 |25          |can13        |IT software|1.7       |700000|800000     |Nagpur|sita bardi |248966 |Call             |Citizen          |Yes		     	 |No           |No      |C:\\Users\\TLP33\\Documents\\CV.docx|JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
|pagy@gmail.com|pa1@gmail.com |12345   |hirecan14@gmail.com |Sr.software engineer  |hirecan14 |hirecan14@yahoo.com|8596685538    |2586355555      |Candidate|Indian Standard Time    | India |Accenture          |Sr.developer       |2   			|Contractual Full Time|Evening Shift|Pune         |14-Sep-2020  |Female  |Yes           |25-Dec-2020 |25          |can13        |IT software|1.7       |700000|800000     |Nagpur|sita bardi |248966 |Call             |Citizen          |Yes		     	 |No           |No      |C:\\Users\\TLP33\\Documents\\CV.docx|JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |

