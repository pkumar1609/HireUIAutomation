Feature: Task Management

@TaskManagement @task1
Scenario Outline: To verify Review candidate task displaying on task management page on employer side 
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job with All details "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title                |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea|                                                                  
|Taskmanagementjob1   |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Permanent Full Time |Yes			      |No        | Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |Java|
And Select a added job
And Share job with agency "<agency>"
And Click on close button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<agency>","<Password>"
And Go to Workbench
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And move the candidate card from potential candidate to new column
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Task Management tab
And Review Candidate task should display in new column "<Name>"
And Go to Workbench
And Select a added job
And move card from new colum to schedule interview column
And Go to Task Management tab
And Review Candidate task should display in done column "<Name>"
Examples:
|Username      |agency         |Password |CandidateEmail      |profiletitle    |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|jobs    |designation   |mandatorySkills|preferredSkills|optionalSkills|minexp|maxexp|updatedOn|industry   |overBudget|minage|maxage|jobtype            |shift|
|pemp@gmail.com|pagy@gmail.com |12345    |hirecan60@gmail.com |Developer       |hirecan60|7775685538    |Developer     |14/2/1995       |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |JCFW 10 |Developer     |JAVA 			|advanced java  |JavaScript    |1     |2     |         |IT software|No        |25    |30    |Permanent Full Time| Day Shift|


@TaskManagement @task2
Scenario Outline: To verify Schedule interview task displaying on task management page

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
And click on Schedule interview task for "<Name>"
And fill all interview details and click on Submit button
| Title      |ScheduleOn  | Hour | Minute |  Duration  | TimeZone             |Location   |
| Interview1 | 25/02/2021 | 10   | 00     | 30 Minutes | Indian Standard Time |Viman Nagar|
And Click on close button
Then Schedule interview task should display in Done column of task Management page "<Name>"

Examples:
|Username      |Teamid         |Password |CandidateEmail      |profiletitle    |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|jobs    |designation   |mandatorySkills|preferredSkills|optionalSkills|minexp|maxexp|updatedOn|industry   |overBudget|minage|maxage|jobtype            |shift|
|pemp@gmail.com|pe1@gmail.com  |12345    |hirecan58@gmail.com |Developer       |hirecan58|7885685538    |Developer     |14/2/1995       |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |JCFW 10 |Developer     |JAVA 			|advanced java  |JavaScript    |1     |2     |         |IT software|No        |25    |30    |Permanent Full Time| Day Shift|
|pagy@gmail.com|pa1@gmail.com  |12345    |hirecan59@gmail.com |Developer       |hirecan59|8886685538    |Developer     |14/2/1995       |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |JCFW 10 |Developer     |JAVA 			|advanced java  |JavaScript    |1     |2     |         |IT software|No        |25    |30    |Permanent Full Time| Day Shift|

@TaskManagement
Scenario Outline: To verify pending interview task displaying on task management page`

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job with All details "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title              |agytitle 				 |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea|                                                                  
|Taskmanagementjob3 |Taskmanagementjob3 agy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Permanent Full Time |Yes			      |No        | Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |Java|
And Select a added job
And Click on add candidate 
And Enter All details of "<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And move the candidate card from Schedule Interview column to pending interview column
And Go to Task Management tab
Then pending interview task should display on task Management page "<Name>"
And Go to Workbench
And move the candidate card from pending Interview column to any other column
And Go to Task Management tab
Then pending interview task should display in done columne "<Name>"

Examples:
|Username      |Teamid         |Password |CandidateEmail      |profiletitle    |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|jobs    |designation   |mandatorySkills|preferredSkills|optionalSkills|minexp|maxexp|updatedOn|industry   |overBudget|minage|maxage|jobtype            |shift|
|pemp@gmail.com|pe1@gmail.com  |12345    |hirecan58@gmail.com |Developer       |hirecan58|7885685538    |Developer     |14/2/1995       |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |JCFW 10 |Developer     |JAVA 			|advanced java  |JavaScript    |1     |2     |         |IT software|No        |25    |30    |Permanent Full Time| Day Shift|

@TaskManagement
Scenario Outline: To verify offering job, job offered`, joined and Refuse to join task displaying on task management page

Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job with All details "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title              |agytitle 				 |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea|                                                                  
|Taskmanagementjob5 |Taskmanagementjob5 agy  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Permanent Full Time |Yes			      |No        | Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |Java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And move candidate card to offering job column
And Go to Task Management tab
Then offering job task should display in new column "<Name>"
And click on offering job task
And Click on close button
Then offering job task should display in done column "<Name>"
And Go to Workbench
And Select a added job
And move the card from offering job column to job offered column
And Go to Task Management tab
Then job offered task should display in new column "<Name>"
And click on job offered task
And Click on close button
Then job offered task should display in done column "<Name>"
And Go to Workbench
And Select a added job
And move the card from job offered column to joined column
And Go to Task Management tab
Then candidate joined task should display in new column "<Name>"
And click on candidate joined task
And Click on close button
Then candidate joined task should display in done column "<Name>"
And Go to Workbench
And Select a added job
And move the card joined column to refused to joined column
And Go to Task Management tab
Then Refused to joined task should display in new column "<Name>"
And click on Refused to joined task
And Click on close button
Then Refused to joined task should display in done column "<Name>"
Examples:
|Username      |Teamid         |Password |CandidateEmail      |profiletitle    |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|jobs    |designation   |mandatorySkills|preferredSkills|optionalSkills|minexp|maxexp|updatedOn|industry   |overBudget|minage|maxage|jobtype            |shift|
|pemp@gmail.com|pe1@gmail.com  |12345    |hirecan60@gmail.com |Developer       |hirecan60|7775685538    |Developer     |14/2/1995       |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |JCFW 10 |Developer     |JAVA 			|advanced java  |JavaScript    |1     |2     |         |IT software|No        |25    |30    |Permanent Full Time| Day Shift|




#Candidate reject Task
@TaskManagement
Scenario Outline: To verify Candidate rejected task displaying on task management page for agency`

Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job with All details "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title                |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea|                                                                  
|Taskmanagementjob6   |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Permanent Full Time |Yes			      |No        | Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |Java|
And Select a added job
And Share job with agency "<agency>"
And Click on close button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<agency>","<Password>"
And Go to Workbench
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And move the candidate card from potential candidate to Schedule Interview column
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Select a added job
And move candidate card to reject column
And confirmation popup should diplay with Yes and No button and click on Yes buton "<Name>"
And select the reason of rejection and cick on submit button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<agency>","<Password>"
And Go to Task Management tab
And Candidate rejected task should display in new column "<Name>"
And click on candidate Rejected task
And Click on close button
And Candidate rejected task should display in done column "<Name>"

Examples:
|Username      |agency         |Password |CandidateEmail      |profiletitle    |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|jobs    |designation   |mandatorySkills|preferredSkills|optionalSkills|minexp|maxexp|updatedOn|industry   |overBudget|minage|maxage|jobtype            |shift|
|pemp@gmail.com|pagy@gmail.com |12345    |hirecan60@gmail.com |Developer       |hirecan60|7775685538    |Developer     |14/2/1995       |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |JCFW 10 |Developer     |JAVA 			|advanced java  |JavaScript    |1     |2     |         |IT software|No        |25    |30    |Permanent Full Time| Day Shift|


@TaskManagement
Scenario Outline: To verify shared job task displaying on task management page for agency`

Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job with All details "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title                |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea|                                                                  
|Taskmanagementjob9  |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Permanent Full Time |Yes			      |No        | Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |Java|
And Select a added job
And Share job with agency "<agency>"
And Click on close button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<agency>","<Password>"
And Go to Task Management tab
And job Shared task should display in new column "<Name>"
And click on job Shared task
And Click on close button
And job Shared task should display in done column "<Name>"

Examples:
|Username      |agency         |Password |CandidateEmail      |profiletitle    |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|jobs    |designation   |mandatorySkills|preferredSkills|optionalSkills|minexp|maxexp|updatedOn|industry   |overBudget|minage|maxage|jobtype            |shift|
|pemp@gmail.com|pagy@gmail.com |12345    |hirecan60@gmail.com |Developer       |hirecan60|7775685538    |Developer     |14/2/1995       |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |JCFW 10 |Developer     |JAVA 			|advanced java  |JavaScript    |1     |2     |         |IT software|No        |25    |30    |Permanent Full Time| Day Shift|

@TaskManagement @invoice
Scenario Outline: To verify Generate invoice and pending invoice task displaying on task management page for agency`

Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job with All details "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title     |designation |industry   |organization|qualification|country|city|location |zipcode|address    |noofvacancies|minexp|maxexp|minsal|maxsal|cashBenefit|minAge|maxAge|totalinterviews|noticePeriod|jobType                |considerRelocation|OverBudget|Shift          |ShiftTimings|FromEmail     |FromEmailagy  |EmailSubject  |Employer|emporganzation|functionalArea|                                                                  
|Invoice   |Developer   |IT software|talentxpert |BE           |India  |Pune|pune     |442001 |viman nagar|2            |1     |2     |400000|800000|400000     |25     |30   |4			    |20          | Permanent Full Time |Yes			      |No        | Day Shift |9-5         |pemp@gmail.com|pagy@gmail.com|want candidate|pemp    |dsfsdfdsfs    |Java|
And Select a added job
And Share job with agency "<agency>"
And Click on close button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<agency>","<Password>"
And Go to Workbench
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And move the candidate card from potential candidate to new column
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Select a added job
And move the candidate card from potential candidate to joined column
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<agency>","<Password>"
And Go to Task Management tab
And apply filter of task type as " Generate Invoice "
And Generate invoice task should display in new column "<Name>"
And click on Generate invoice task
And Fill all details of invoice
| invoiceNumber| amount| tax | description                                                             |attachment                                   |
| snwq26       | 4000  | 540 | you're charging for along with payment terms, amongst other information |C:\Users\TLP33\Documents\Testdata\invoice.pdf|
And Generate invoice task should display in done column "<Name>"
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Task Management tab
And click on reload task
And apply filter of task type as " Pending Invoice "
And Pending invoice task should display in new column "<Name>"
And Go to invoice tab
And move the invoice card from pending invoice to paid invoice
And Go to Task Management tab
And Pending invoice task should display in done column "<Name>"
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<agency>","<Password>"
And Go to invoice tab
And move the invoice card from paid invoice to Invoice payment recieved column
And Go to Task Management tab
And click on reload task
And apply filter of task type as " Invoice Payment "
And Invoice Payment task should display in new column "<Name>"
And Go to invoice tab
#And move the invoice card from paid Invoice payment recieved to Closed column
And click on Yes button on Confirmation popup
And Invoice Payment task should display in done column "<Name>"

Examples:
|Username      |agency         |Password |CandidateEmail      |profiletitle    |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|jobs    |designation   |mandatorySkills|preferredSkills|optionalSkills|minexp|maxexp|updatedOn|industry   |overBudget|minage|maxage|jobtype            |shift|
|pemp@gmail.com|pagy@gmail.com |12345    |hirecan60@gmail.com |Developer       |hirecan60|7775685538    |Developer     |14/2/1995       |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |JCFW 10 |Developer     |JAVA 			|advanced java  |JavaScript    |1     |2     |         |IT software|No        |25    |30    |Permanent Full Time| Day Shift|



@TaskManagement @marketplace 
Scenario Outline: To verify Generate invoice and pending invoice task displaying on task management page for agency`
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And user enters valid credentials "<Employer>","<Password>"
And Go to workbench
And Add job
|title		   |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|Biii Developer|developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |Java|
And Select a added job
And Click on share job with market place
And change information and click on submit
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
|8.33                 |30 Days       |60 Days      |90 Days           |
And Click on Employer marketplace tab
Then Job should be list out in market place page on employer side.
And Logout from App
And Click on Employer-Agency Signin link
And login as a support user
And verify shared job is displaying on support login
And Click on approve
And Logout as a support user
And Click on Employer-Agency Signin link
And user enters valid credentials "<Agency>","<Password>"
And Go to agency marketplace tab
Then All shared job by any employer should be show for all register agencies
And Click on Apply button of job
And Logout from App
And Click on Employer-Agency Signin link
And user enters valid credentials "<Employer>","<Password>"
And Go to Task Management tab
And click on reload task
And apply filter of task type as " Proposal Received "
And Proposal Received task should display in "New" column with agency name "<Agency>"
And move the "Proposal Received" task from "New" to "Done" column
And user should not able to move Proposal Received task to done column
And click on Employer marketplace tab
And Select that job in filter on job proposal section
And Click on Review button
And Now click on accept and sign button
And Go to Task Management tab
And click on reload task
And apply filter of task type as " Proposal Received "
And move the "Proposal Received" task from "New" to "Done" column
And user should be able to move Proposal Received task to done column
And Logout from App
And Click on Employer-Agency Signin link
And user enters valid credentials "<Agency>","<Password>"
And Go to Task Management tab
And apply filter of task type as " Update Agreement "
And "Update Agreement" task should display in "New" column with agency name "<Agency>"
And Click on "Update Agreement" task
And Now click on accept and sign button
And move the "Update Agreement" task from "New" to "Done" columnAnd Logout from App
And Click on Employer-Agency Signin link
And user enters valid credentials "<Employer>","<Password>"
And Go to Task Management tab
And apply filter of task type as " Update Agreement "
And "Update Agreement" task should display in "New" column with agency name "<Agency>"
And Click on "Update Agreement" task
And Click on close button
And move the "Update Agreement" task from "New" to "Done" columnAnd Logout from App


Examples:
|Employer	   |Password |Agency        |Agency2        |
|pemp@gmail.com|12345    |kagy@gmail.com|pagy1@gmail.com|




























