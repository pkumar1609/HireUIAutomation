Feature: Job Candidate Management (Add,update,view) feature

@BVT @JobCandidateManagement
Scenario Outline: Verify the functionality of hide candidate contacts
Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"  
And Go to Workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		      |agytitle             |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW Rejected    |JCFW Rejected Agy    |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Share job with agency "<agency>"
And click on Close button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<agency>","<Password>"
Given "team" should be added
|Name|         Email   | contact  |Nameagy   |    Emailagy     | contactagy  |
|pe1 | pe1@gmail.com   | 1234564  | pa1      | pa1@gmail.com   |1234556      |
|pe2 | pe2@gmail.com   | 1234564  | pa2      | pa2@gmail.com   |1234566      | 
And Go to Workbench
And Select a added job
And Click on add candidate
And verify By default hide contacts drop-down value is "No" for "<CandidateEmail>"
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>" and select "Yes" in Hide Candidate Contact

And verify candidate card is displaying or not in New column "<Name>"
And move the candidate card from potential candidate to new column
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Select a added job
And Click on Candidate name from candidate card "<Name>"
And Verify Email and contact no should not display for employer 
And Click on close button
And Click on Edit Candidate icon on candidate card "<Name>"
And Verify Email and contact no should not display for employer on edit candidate page
And Click on close button and confirm Yes button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<agency>","<Password>"
And Go to Workbench
And Select a added job
And Click on Edit Candidate icon on candidate card "<Name>"
And set hide contacts drop-down value as "Yes"
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Click on Candidate name from candidate card "<Name>"
And Verify Email "<CandidateEmail>" and contact no "<ContactNumber>" should display for employer 
And Click on close button
And Click on Edit Candidate icon on candidate card "<Name>"
And Verify Email "<CandidateEmail>" and contact no "<ContactNumber>" should display for employer on edit candidate page

Examples: 
|agency        |Username          |Teamid         |Password |CandidateEmail      |CandidateEmail2    |profiletitle         |Name     |Name2    |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|CandidateEmail1    |Nolevel1     |Nolevel2|
|pagy@gmail.com|pemp@gmail.com    |pa1@gmail.com  |12345    |hirecan48@gmail.com |hirecan49@gmail.com|jr software developer|hirecan48|hirecan49|7895866385    |Sr.developer  |19/04/1995      |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  |Intermediate  | Expert | Mandatory |Preferred |Optional  |No          |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |hirecan26@gmail.com| Not Answered|Not Answered|
#|pa1@gmail.com |pemp@gmail.com    |pa2@gmail.com  |12345    |hirecan48@gmail.com |hirecan49@gmail.com|jr software developer|hirecan48|hirecan49|7895866385    |Sr.developer  |19/04/1995      |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  |Intermediate  | Expert | Mandatory |Preferred |Optional  |No          |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |hirecan26@gmail.com| Not Answered|Not Answered|
 
# TC=582,583
 