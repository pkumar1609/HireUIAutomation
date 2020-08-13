Feature: Adding Candidate from workbench

@employerAgency
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
And Add job "<skill1>","<skill2>","<skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title             |agytitle         |  designation |industry   |jobrole        |location |budget |minexp|maxexp|
|Assertjob         |Software tester  |developer     |IT software|java developer |pune     |400000 |1     |2     |
And Select a added job
#And Share job with team member
#|EmpTeam|Agyteam|
#|pe1    |pa1    |
#And Give Can see All candidates permission "<Teamid>"
#And Click on close button
#And Click on add candidate
#And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<skill1>","<skill2>","<skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"
And Click on Edit Candidate icon on candidate card "<Name>"
And Assert the details of candidate "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>" 
And Click on close button
And get the logged in user details
And Click Candidate details eye icon on candidate card "<Name>"
And Assert the details on candidate details icon"<Username>","<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>" 
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Teamid>","<Password>"
And And Go to workbench
And Select a added job
And Click on Edit Candidate icon on candidate card "<Name>"
And Assert the details of candidate "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>" 

Examples:

|Username      |Teamid        |Password|CandidateEmail         |Name     |ContactNumber|Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|skill1  |skill2       |skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com|pe1@gmail.com |12345   |hirecan04@gmail.com    |hirecan04|74216685538   |jr.developer  |08/08/1999      |Male    |No            |25          |2         |400000|800000     |India  |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |java    |advanced java|javaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version|
#|pagy@gmail.com|pa1@gmail.com |12345   |Abhijit@gmail.com      |abhi     |8453255656   |Sr.developer  |03/04/2020      |Male    |No            |30          |2.5       |700000|800000     |India  |pune  |pune       |455966 |Email            |500000       |8      |Yes             |No      |java    |advanced java|javaScript|Basic Knowledge | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version|
