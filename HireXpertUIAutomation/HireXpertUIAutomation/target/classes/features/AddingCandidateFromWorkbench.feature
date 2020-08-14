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
|title             |agytitle         |  designation |industry   |jobrole        |location |budget |minexp|maxexp|
|Assertjob         |Software tester  |developer     |IT software|java developer |pune     |400000 |1     |2     |
And Select a added job
#And Share job with team member
#|EmpTeam|Agyteam|
#|pe1    |pa1    |
#And Give Can see All candidates permission "<Teamid>"
#And Click on close button
#And Click on add candidate
#And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
#And verify candidate card is displaying or not in New column "<Name>"
#And Click on Edit Candidate icon on candidate card "<Name>"
#And Assert the details of candidate "<Username>","<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<certificate1>","<certificate2>","<certificate3>","<certificateforskill1>" and "<certificateforskill2>"
#And Click on close button
#And get the logged in user details
#And click on Schedule Interview icon from candidate card
#And fill all interview details and click on Submit button
#| Title      |ScheduleOn  | Hour | Minute |  Duration  | TimeZone             |Location   |
#| Interview1 | 25/10/2020 | 10   | 00     | 30 Minutes | Indian Standard Time |Viman Nagar|
#And Click on close button
#And Click Candidate details eye icon on candidate card "<Name>"
#And Assert the details on candidate details icon"<Username>","<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<certificate1>","<certificate2>","<certificate3>","<certificateforskill1>" and "<certificateforskill2>"
#And Click on close button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Teamid>","<Password>"
And And Go to workbench
And Select a added job
And Click on Edit Candidate icon on candidate card "<Name>"
And Assert the details of candidate "<Username>","<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<certificate1>","<certificate2>","<certificate3>","<certificateforskill1>" and "<certificateforskill2>"
And Click on close button
And Click Candidate details eye icon on candidate card "<Name>"
And Assert the details on candidate details icon"<Username>","<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<certificate1>","<certificate2>","<certificate3>","<certificateforskill1>" and "<certificateforskill2>"
And Click on close button

Examples:
|Username      |Teamid        |Password|CandidateEmail      |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
#|pemp@gmail.com|pe1@gmail.com |12345   |hirecan06@gmail.com |hirecan06|9890685538    |Sr.developer  |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
|pagy@gmail.com|pa1@gmail.com |12345   |hirecan06@gmail.com |hirecan06|8453255656    |Sr.developer  |03/04/2020      |Male    |Yes           |30          |01/09/2021      |2.5       |700000|800000     | India |Pune  |pune       |455966 |Email            |500000       |8       |Yes             |No      |JAVA    |advanced java|JavaScript|Basic Knowledge | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version      |


@onupdateprofile
Scenario Outline: Add the Candidate from workbench and verify details on update profile page on candidate login
	
Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title             |agytitle         |  designation |industry   |jobrole        |location |budget |minexp|maxexp|
|Assertjob         |Software tester  |developer     |IT software|java developer |pune     |400000 |1     |2     |
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"
And Logout from App
And Click on Job Seeker(Candidate) Sign In link
And Employer enters valid credentials "<CandidateEmail>","<Password>"
And click on update profile option
And Assert the details on candidate profile page "<Username>","<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<certificate1>","<certificate2>","<certificate3>","<certificateforskill1>" and "<certificateforskill2>"

Examples:
|Username      |Teamid        |Password|CandidateEmail      |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com|pe1@gmail.com |12345   |hirecan06@gmail.com |hirecan06|9890685538    |Sr.developer  |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
|pagy@gmail.com|pa1@gmail.com |12345   |hirecan06@gmail.com |hirecan06|8453255656    |Sr.developer  |03/04/2020      |Male    |Yes           |30          |01/09/2021      |2.5       |700000|800000     | India |Pune  |pune       |455966 |Email            |500000       |8       |Yes             |No      |JAVA    |advanced java|JavaScript|Basic Knowledge | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |