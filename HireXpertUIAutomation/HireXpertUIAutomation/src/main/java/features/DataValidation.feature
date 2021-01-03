Feature: Data validation

@employerAgency1 @data
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
|title		          |agytitle     |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|Software developer 1 |softwareagy 1|developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Give Can see All candidates permission "<Teamid>"
And Click on close button
And Click on add candidate
And Enter All details of "<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
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
And Assert the details on candidate details icon"<Username>","<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<certificate1>","<certificate2>","<certificate3>","<certificateforskill1>" and "<certificateforskill2>"
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
|Username      |Teamid         |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com|pe1@gmail.com  |12345    |hirecan32@gmail.com |jr software developer|hirecan32|8890685538    |Sr.developer  |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
|pagy@gmail.com|pa1@gmail.com  |12345   |hirecan33@gmail.com |software developer|hirecan33|4453255656    |Sr.developer  |03/04/2020      |Male    |Yes           |30          |01/09/2021      |2.5       |700000|800000     | India |Pune  |pune       |455966 |Email            |500000       |8       |Yes             |No      |JAVA    |advanced java|JavaScript|Basic Knowledge | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version      |


#@onupdateprofile @data
#Scenario Outline: Add the Candidate from workbench and verify details on update profile page on candidate login
#
#Given User must be registered
#
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials "<Username>","<Password>"
#And Go to workbench
#And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
#|title		           |agytitle            |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
#|Software developer II |Software Tester III |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
#And Select a added job
#And Click on add candidate
#And Enter All details of "<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
#And verify candidate card is displaying or not in New column "<Name>"
#And Logout from App
#And Click on Job Seeker(Candidate) Sign In link
#And candidate enters valid credentials "<CandidateEmail>","<Password>"
#And click on update profile option
#And Assert the details on candidate profile page "<Username>","<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<certificate1>","<certificate2>","<certificate3>","<certificateforskill1>" and "<certificateforskill2>"
#
#Examples:
#|Username      |Teamid         |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1  |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
##|pemp@gmail.com|pe1@gmail.com  |12345    |hirecan34@gmail.com |jr software developer|hirecan34|7895566669    |Sr.developer  |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Expert  | Intermediate |Basic Knowledge  | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
#|pagy@gmail.com|pa1@gmail.com  |12345   |hirecan35@gmail.com |software developer|hirecan35|3348855656    |Sr.developer  |03/04/2020      |Male    |Yes           |30          |01/09/2021      |2.5       |700000|800000     | India |Pune  |pune       |455966 |Email            |500000       |8       |Yes             |No      |JAVA    |advanced java|JavaScript|Expert  | Intermediate |Basic Knowledge  | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version      |
#
#
#
#
##############Job Validation##########
#
#@jobvalidation @data
#Scenario Outline: Add job and assert all details on edit job page also on team view job page
#	
#Given User must be registered
#
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials "<Username>","<Password>"
#Given team member should be added
#|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
#|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
#|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
#And Go to workbench
#And Add job with all details"<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
#|title              |agytitle         |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea|                                                            
#|candidateJobb      |candidateJobagy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |java|
#And Select a added job
#And Share job with team member
#|EmpTeam|Agyteam|
#|pe1    |pa1    |
#And Click on close button
#And Click on hamburger menu
#And click on edit button
#And Assert details of add jon on edit job page "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
#|title              |agytitle         |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation| functionalArea|                                                                   
#|candidateJobb      |candidateJobagy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |java|
#And Click on close button and confirm Yes button
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials "<Teamid>","<Password>"
#And And Go to workbench
#And Select a added job
#And Click on hamburger menu
#And click on Edit/view job button
#And Assert details of add jon on edit job page "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
#|title             |agytitle         |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|  functionalArea|                                                                  
#|candidateJob      |candidateJobagy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |java|
#
#Examples:
#|Username      |Teamid        |Password|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
##|pemp@gmail.com|pe1@gmail.com|12345   |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
#|pagy@gmail.com|pa1@gmail.com |12345   |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
#
#
#@jobvalidationonAgency @data
#Scenario Outline: Add job and assert all details on edit job page on agency side when job is shared
#	
#Given User must be registered
#
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials "<Username>","<Password>"
#Given team member should be added
#|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
#|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
#|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
#Given agency should be added
#|Name  |         Email     | contact  |
#|pagy  | pagy@gmail.com    | 1234564  |
#And Go to workbench
#And Add job with all details"<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
#|title                  |agytitle         |designation |industry    |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation| functionalArea|                                                                   
#|jobvalidationonAgency1 |candidateJobagy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |java|
#And Select a added job
#And share job with agency "<agencyname>"
#And Click on close button
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials "<agencyname>","<Password>"
#And And Go to workbench
#And Select a added job
#And Click on hamburger menu
#And click on view job button
#And Assert details of add jon on edit job page "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
#|title                 |agytitle         |designation |industry    |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|   functionalArea|                                                                 
#|jobvalidationonAgency1 |candidateJobagy  |Developer   |IT software |talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |java|
#And Click on close button
#And Share job with team member
#|EmpTeam|Agyteam|
#|pe1    |pa1    |
#And Click on close button
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials "pagy@gmail.com","<Password>"
#And And Go to workbench
#And Select a added job
#And Click on hamburger menu
#And click on Edit/view job button
#And Assert details of add jon on edit job page "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
#|title                 |agytitle         |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|  functionalArea|                                                                  
#|jobvalidationonAgency1|candidateJobagy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |java|
#And Click on close button
#
#Examples:
#
#|Username      |agencyname    |Teamid        |Password|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
#|pemp@gmail.com|pagy@gmail.com|pe1@gmail.com|12345   |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
#
#
#@jobvalidationonMarketplace 
#Scenario Outline: assert job details on marketplace when job is shared on marketplace
#	
#Given User must be registered
#
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials "<Username>","<Password>"
#And Go to workbench
#And Add job with all details"<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
#|title                    |agytitle                      |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea|                                                            
#|Marketplacejobvalidation |Marketplacejobvalidation agy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |java|
#And Select a added job
#And Click on share job with market place
#And Click on Employer marketplace tab 
#And Click on shared job
#And Assert the job details on job title "<Skill1>" "<Skill2>" "<Skill3>" "<level1>" "<level2>" "<level3>" "<Weightage1>" "<Weightage2>" "<Weightage3>" "<certificate1>" "<certificate2>" "<certificate3>" "<remark1>" "<remark2>" "<remark3>"
#|title                    |agytitle                      |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea|                                                            
#|Marketplacejobvalidation |Marketplacejobvalidation agy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |java|
#And Click on close button
#And Logout from App
#And Click on Employer-Agency Signin link
#And login as a support user
#And verify shared job is displaying on support login
#And Click on approve
#And Logout as a support user
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials "<agencyname>","<Password>"
#And Go to agency marketplace tab
#And Click on job displaying in marketplace job section
#And Assert the job details on job title "<Skill1>" "<Skill2>" "<Skill3>" "<level1>" "<level2>" "<level3>" "<Weightage1>" "<Weightage2>" "<Weightage3>" "<certificate1>" "<certificate2>" "<certificate3>" "<remark1>" "<remark2>" "<remark3>"
#|title                    |agytitle                      |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea|                                                            
#|Marketplacejobvalidation |Marketplacejobvalidation agy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |java|
#And Click on close button
#Examples:
#|Username      |agencyname    |Teamid        |Password|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
#|pemp@gmail.com|pagy@gmail.com|pe1@gmail.com |12345   |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
#
#
#@onjobboard
#Scenario Outline: assert job details on marketplace when job is shared on marketplace
#	
#Given User must be registered
#
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials "<Username>","<Password>"
#And Go to workbench
#And Add job with all details"<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
#|title                    |agytitle                      |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea|                                                            
#|job1boardjobvalidation   |jobboardjobvalidation agy      |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Contractual Full Time |Yes			      |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |java|
##And Select a added job
#And Logout from App
#And Click on Employer-Agency Signin link
#And login as a support user
#And verify shared job is displaying on support login
#And Click on approve
#And Logout as a support user
#And Click on more jobs
#And Click on view job details button
#And Assert the job details on job board "<Skill1>" "<Skill2>" "<Skill3>" "<level1>" "<level2>" "<level3>" "<Weightage1>" "<Weightage2>" "<Weightage3>" "<certificate1>" "<certificate2>" "<certificate3>" "<remark1>" "<remark2>" "<remark3>"
#|title                    |agytitle                    |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge |maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea|                                                            
#|job1boardjobvalidation   |jobboardjobvalidation agy   |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30    |4			   |20          | Contractual Full Time |Yes			   |No        | Mid-Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |java|
#
#Examples:
#|Username      |agencyname    |Teamid        |Password|jobrole       |designation |industry   |organisation|cc|country|city|location |zipcode|minexp|maxexp|budget|cashBenefit|jobType                |noticePeriod|noofvacancies|totalinterviews|considerRelocation|Shift 		  |ShiftTimings|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
#|pemp@gmail.com|pagy@gmail.com|pe1@gmail.com |12345   |java developer|Developer   |IT software|Talentxpert |BE           |India  |Pune|pune     |442001 |1     |2     |400000|400000     |Contractual Full Time  |20          |2            |4			    |Yes         	   |Mid-Day Shift |9-5         |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
#
#
#########Candidate data validation########
##below all scenarion of candidate data validation require same candidate email
#
#@candidatedetails
#Scenario Outline: validate the candidate details when candidate login himself and add profile details
#	
#Given User must be registered
#When title of login page is Home
#And Click register link
#And Enter all details on register page "<Name>" "<CandidateEmail>" "<ContactNumber>" "<UserType>" "<timezone>" "<country>"
#And Click on Job Seeker(Candidate) Sign In link
#And candidate enters valid credentials "<CandidateEmail>","<Password>"
#And click on update profile option
#Then Enter all the personal and professional details of candidate "<profiletitle>" "<CandidateEmail>" "<ContactNumber>" "<Date>" "<country>" "<CityArea>" "<Name>" "<alternateemail>" "<alternateContact>" "<Gender>" "<City>" "<ZipCode>" "<currentorganization>" "<functionalArea>" "<currentdesignation>" "<currentduration>" "<jobtype>" "<shift>" "<preferredcity>" "<searchkeyword>" "<industry>" "<experience>" "<expectedCTC>" "<residentialstatus>" "<OnNoticePeriod>" "<LastWorkingDay>" "<NoticePeriod>" "<CTC>" "<Communicationmode>" "<willingtotravel>" "<lookingforjob>" "<relocate>" "<cv>"
#And Click on save button
#And click ok on success popup
#And click on qualification tab
#And click on update profile option
#Then Assert the personal and professional details of candidate "<profiletitle>" "<CandidateEmail>" "<ContactNumber>" "<Date>" "<country>" "<CityArea>" "<Name>" "<alternateemail>" "<alternateContact>" "<Gender>" "<City>" "<ZipCode>" "<currentorganization>" "<functionalArea>" "<currentdesignation>" "<currentduration>" "<jobtype>" "<shift>" "<preferredcity>" "<searchkeyword>" "<industry>" "<experience>" "<expectedCTC>" "<residentialstatus>" "<OnNoticePeriod>" "<LastWorkingDay>" "<NoticePeriod>" "<CTC>" "<Communicationmode>" "<willingtotravel>" "<lookingforjob>" "<relocate>" "<cv>"
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
#|organization|fromMonth|fromYear|toMonth|toYear|designation	     |city  |country|
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
#And Click on skills and designation
#And fill all skills and designation details "<currentdesignation>"
#|skill		  |Expertiselevel |certificate  |designation      | 
#|JAVA         |Expert		  |sun microsoft|sr.Test Engineer |
#|advanced java|Intermediate   |ad. java  	|Java Developer   |
#|JavaScript   |Basic Knowledge|javaScript	|Tester           |
#And save the changes
#Then Assert skills and designation "<currentdesignation>"
#|skill		  |Expertiselevel |certificate  |designation      | 
#|JAVA         |Expert		  |sun microsoft|sr.Test Engineer |
#|advanced java|Intermediate   |ad. java  	|Java Developer   |		      
#|JavaScript   |Basic Knowledge|javaScript	|Tester           |		 
#And Click on certificate tab
#And fill all certificate details
#|certificate      |year|grade |issuing Authority|country|
#|best performance |2020|90    |Wipro pvt ltd    |India  |
#|cudos            |2019|75    |Dell pvt ltd     |India  |
#|Employee of month|2018|86    |Dell pvt ltd     |India  |
#And Click on save button
#And click ok on success popup
#Then Assert the certificate details
#|certificate      |year|grade |issuing Authority|country|
#|best performance |2020|90    |Wipro pvt ltd    |India  |
#|cudos            |2019|75    |Dell pvt ltd     |India  |
#|Employee of month|2018|86    |Dell pvt ltd     |India  |
#And Click on languages tab
#And Fill all language details
#|language|proficiency						|certificate            |
#|English | Professional working proficiency |Certificate of merit   |
#|French  | Limited working proficiency      |Certificate of merit   |
#|spanish | Elementary proficiency           |Certificate of persuing|
#And Click on save button
#And click ok on success popup
#Then Assert the languages details
#|language|proficiency						|certificate            |
#|English |Professional working proficiency  |Certificate of merit   |
#|French  |Limited working proficiency       |Certificate of merit   |
#|Spanish |Elementary proficiency            |Certificate of persuing|
#And Click on Visa Tab
#And Fill All the deatils of visa 
#|country	|VisaType    |ValidUpto     |
#|USA		|Work Visa   |28/10/2030   |
#|Singapore	|Student Visa|30/04/2025	|
#|Australia	|Tourist Visa|01/12/2023    |
#And Click on save button
#And click ok on success popup
#Then Assert the visa details
#|country	|VisaType    |ValidUpto   |
#|USA		|Work Visa   |28/10/2030  |
#|Singapore	|Student Visa|30/04/2025  |
#|Australia	|Tourist Visa|01/12/2023  |
#And Click on Experience details tab
#And Fill all experience details
#|title   |organization|fromDate   |toDate     |technologies |client|
#|paypal  |talentxpert |20/01/2020 |21/09/2020 |Java selenium|Alexu |
#And Click on save button
#And click ok on success popup
#Then Asert the experirnce deatils
#|title   |organization|fromDate   |toDate     |technologies |client|
#|paypal  |talentxpert |20/01/2020 |21/09/2020 |Java selenium|Alexu |
#
#Examples: 
#|Username      |Teamid        |Password|CandidateEmail      |profiletitle	       |Name      |alternateemail     |ContactNumber  |alternateContact|UserType |timezone			    |country|currentorganization|currentdesignation |currentduration|jobtype              |shift        |preferredcity|Date         |Gender  |OnNoticePeriod|LastWorkingDay |NoticePeriod|searchkeyword|industry   |experience|CTC   |expectedCTC|City  |CityArea   |ZipCode|Communicationmode|residentialstatus|willingtotravel  |lookingforjob|relocate|cv                                  |functionalArea|
#|pemp@gmail.com|pe1@gmail.com |12345   |hirecan43@gmail.com |Sr.software engineer  |hirecan43 |hirecan43@yahoo.com|88996685538    |9846355555      |Candidate|Indian Standard Time  | India |Accenture          |Sr.developer       |2   			|Contractual Full Time|Evening Shift|Pune         |14/09/2020   |Female  |Yes           |25/12/2020    |25          |hirecan43        |IT software|1.7       |700000|800000     |Nagpur|sita bardi |248966 |Call             |Citizen          |Yes		     	 |No           |No      |C:\\Users\\TLP33\\Documents\\CV.docx|java|
#
##change the email id,name,contact numbeer and search keyword
##Note:- below scenario require same candidate email id as above 
#
#@training 
#Scenario Outline: validate the candidate details when candidate login himself and add profile details
#	
#Given User must be registered
#
#When title of login page is Home
#And Click on Job Seeker(Candidate) Sign In link
#And candidate enters valid credentials "<CandidateEmail>","<Password>"
#And click on update profile option
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
#And Click on Aditional Details tab
#And fill all Aditional details
#Then Assert the additional details
#
#Examples: 
#|Username      |Password|CandidateEmail     |
#|pemp@gmail.com|12345   |hirecan43@gmail.com|
#
#@assertonemp
#Scenario Outline: validate the candidate details when employer added candidate who register himself (with all profile details)
#
#Given User must be registered
#
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials "<Username>","<Password>"
#And Go to workbench
#And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
#|title		      |agytitle       |designation     |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|
#|Java dev         |java agency job|developer       |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |
#And Select a added job
#And Click on add candidate
#And enter candidate email "<CandidateEmail>"
#And Assert the candidate details when candidate is already register"<Username>","<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<certificate1>","<certificate2>","<certificate3>","<certificateforskill1>" and "<certificateforskill2>"
##And Click on edit close button
#
#Examples: 
#|Username      |Teamid        |Password|CandidateEmail      |profiletitle         |Name      |alternateemail     |ContactNumber |alternateContact|UserType |timezone			    |Country|currentorganization|Designation      |currentduration|jobtype              |shift        |preferredcity|Date         |Gender  |OnNoticePeriod|LastWorkingDay|NoticePeriod|searchkeyword|industry   |experience|CTC   |expectedCTC|City  |CityArea   |ZipCode|Communicationmode|residentialstatus|willingtotravel  |lookingforjob|relocate|cv                                  |Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
##|pemp@gmail.com|pe1@gmail.com |12345   |hirecan14@gmail.com |Sr.software engineer |hirecan14 |hirecan14@yahoo.com|8596685538    |2586355555      |Candidate|Indian Standard Time    | India |Accenture          |Sr.developer       |2   			|Contractual Full Time|Evening Shift|Pune         |14-Sep-2020  |Female  |Yes           |25-Dec-2020 |25          |can13        |IT software|1.7       |700000|800000     |Nagpur|sita bardi |248966 |Call             |Citizen          |Yes		     	 |No           |No      |C:\\Users\\TLP33\\Documents\\CV.docx|JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
#|pagy@gmail.com|pa1@gmail.com |12345   |hirecan14@gmail.com |Sr.software engineer  |hirecan14 |hirecan14@yahoo.com|8596685538    |2586355555      |Candidate|Indian Standard Time    | India |Accenture          |Sr.developer       |2   			|Contractual Full Time|Evening Shift|Pune         |14-Sep-2020  |Female  |Yes           |25-Dec-2020 |25          |can13        |IT software|1.7       |700000|800000     |Nagpur|sita bardi |248966 |Call             |Citizen          |Yes		     	 |No           |No      |C:\\Users\\TLP33\\Documents\\CV.docx|JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
#
