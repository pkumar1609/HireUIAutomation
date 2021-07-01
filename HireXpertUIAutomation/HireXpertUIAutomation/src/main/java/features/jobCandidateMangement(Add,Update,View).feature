Feature: Job Candidate Management (Add,update,view) feature

@BVT @JobCandidateManagement @jobcan1
Scenario Outline: Verify the functionality of hide candidate contacts for candidate added by agency
Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"  
And Go to Workbench
And Click on add job button
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		      |agytitle             |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW Rejected    |JCFW Rejected Agy    |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			    |Hirexpert    |rahitech       |java         |
And Select a added job
And click on share with agency 
And search the agency "<agencyName>" and share job with it
And click on Close button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Agency>","<Password>"
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
And Employer enters valid credentials "<Agency>","<Password>"
And Go to Workbench
And Select a added job
And Click on Edit Candidate icon on candidate card "<Name>"
And set hide contacts drop-down value as "Yes"
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

Examples: 
|Agency        |agencyName|Username         |edit           |Teamid         |Password |CandidateEmail      |CandidateEmail2    |profiletitle         |Name     |Name2    |ContactNumber |Designation   |Date       |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|CandidateEmail1    |Nolevel1     |Nolevel2|
|pagy@gmail.com|pagy      |pemp@gmail.com   |pagy@gmail.com |pa1@gmail.com  |12345    |hirecan48@gmail.com |hirecan49@gmail.com|jr software developer|hirecan48|hirecan49|7895866385    |Sr.developer  |19/04/1995 |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  |Intermediate  | Expert | Mandatory |Preferred |Optional  |No          |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |hirecan26@gmail.com| Not Answered|Not Answered|

# TC=582,583
 
@jobcan2 @JobCandidateManagement
Scenario Outline: Verify agency can change hide contacts value of candidate added by Agency team member and vise versa 
Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<AddJobBy>","<Password>"  
Given Employee should be added
|Name|         Email   | contact  |Nameagy   |    Emailagy     | contact     |Role          |Roleagy|
|pe1 | pe1@gmail.com   | 1234564  | pa1      | pa1@gmail.com   |1234556      |Recruitment HR|Recruitment Agency Head|
And Go to Workbench
And Click on add job button
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		      |agytitle             |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW Rejected    |JCFW Rejected Agy    |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And click on share with Team
And search the team "<Team>" and share job with it
And click on Close button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Agency>","<Password>"
And Go to Workbench
And Select a added job
And Click on add candidate
And verify By default hide contacts drop-down value is "No" for "<CandidateEmail>"
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>" and select "Yes" in Hide Candidate Contact
And move the candidate card from potential candidate to new column
And verify candidate card is displaying or not in New column "<Name>"
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
And Employer enters valid credentials "<EditCandidateBy>","<Password>"
And Go to Workbench
And Select a added job
And Click on Edit Candidate icon on candidate card "<Name>"
And set hide contacts drop-down value as "Yes"
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
Examples: 
|Agency        |EditCandidateBy|AddJobBy      |Username       |Team|Teamid         |Password |CandidateEmail      |CandidateEmail2    |profiletitle         |Name     |Name2    |ContactNumber |Designation   |Date       |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|CandidateEmail1    |Nolevel1     |Nolevel2|
|pagy@gmail.com|pa1@gmail.com  |pagy@gmail.com|pemp@gmail.com |pa1 |pa1@gmail.com  |12345    |hirecan410@gmail.com |hirecan411@gmail.com|jr software developer|hirecan410|hirecan411|7895866385    |Sr.developer  |19/04/1995 |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  |Intermediate  | Expert | Mandatory |Preferred |Optional  |No          |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |hirecan26@gmail.com| Not Answered|Not Answered|
|pa1@gmail.com |pagy@gmail.com |pagy@gmail.com|pemp@gmail.com |pa1 |pa1@gmail.com  |12345    |hirecan412@gmail.com |hirecan413@gmail.com|jr software developer|hirecan412|hirecan413|7895866385    |Sr.developer  |19/04/1995 |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  |Intermediate  | Expert | Mandatory |Preferred |Optional  |No          |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |hirecan26@gmail.com| Not Answered|Not Answered|
  
#TC=584,585


@jobcan3 @JobCandidateManagement
Scenario Outline: Verify agency can change hide contacts value of candidate added by Agency team member and vise versa 
Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"  
And Go to Workbench
And Click on add job button
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		     |agytitle    |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 6          |JCFW Agy 6  |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And move the candidate card from potential candidate to new column
And verify candidate card is displaying or not in New column "<Name>"
And Click on Questionnaire tab
And Enter first question "<QUESTION1>" and marks "<QMARKS1>" 
And Enter the answer "<ANSWER1>" "<ANSWER2>"  and enter Marks "<MARKS1>" "<MARKS2>" for first question
And click on Save Changes button
And Enter the cutoff & rejection percentage "<Cuttoffpercentage>" "<Rejectionpercentage>" 
And click on submit
And Click on  Collect Answers icon on candidate card.
And Fill all the Questions answers "<QUESTION1>" "<ANSWER1>"
And click on submit
And candidate card should display in screened column
And Click on Questionnaire tab
And Select the same question and edit the question and answers "<QUESTION1>" "<QUESTION2>"
And click on submit
And Click on  Collect Answers icon on candidate card
And Verify both old and new question should display in sections "<QUESTION1>" "<QUESTION2>"
And In Revised job question section (New question ) Give answer "<QUESTION2>" "<ANSWER2>"
And click on submit
And Verify the result should be correct 
Examples: 
|Username       |Password |	CandidateEmail      |  Name     | ContactNumber | Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber1   | QUESTION1     | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | QUESTION2    | QMARKS2 | ANSWER3 | ANSWER4 | MARKS3 | MARKS4 |QUESTION3  | QMARKS3 | ANSWER5 | ANSWER6     | MARKS5 | MARKS6 | Cuttoffpercentage | Rejectionpercentage | question      | OrganizationName |Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com | 12345   |hirecan101@gmail.com | hirecan101| 9125571967    | Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789        | NP Negotiable |  50     |  Yes    |   No    |  50    |  20    |Can Relocate? | 50      |  Yes    |  No     |  50    |   0    | Work Exp  |  100    | Fresher | Experienced | 50     |  50    |   100             |      00             | NP Negotiable |  EmpOrg          |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |

@jobcan4 @JobCandidateManagement
Scenario Outline: Check the functionality of add candidate by uploading resume.(employer login)
Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"  
And Go to Workbench
And Click on add job button
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		|agytitle    |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 6     |JCFW Agy 6  |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Upload the resume and click on find button
And Enter all required details of candidate "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"
Examples: 
|Username		 	|Password |CandidateEmail      |title                |Name     |ContactNumber |Designation   |Date       |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|CandidateEmail1    |Nolevel1     |Nolevel2    | 
|pemp@gmail.com     |12345    |hirecan63@gmail.com |jr software developer|hirecan63|7895866385    |Sr.developer  |19/04/1995 |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  |Intermediate  | Expert | Mandatory |Preferred |Optional  |No          |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |hirecan.63@gmail.com| Not Answered|Not Answered|
|pagy@gmail.com     |12345    |hirecan64@gmail.com |jr software developer|hirecan64|8795866385    |Sr.developer  |19/04/1995 |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  |Intermediate  | Expert | Mandatory |Preferred |Optional  |No          |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |hirecan.64@gmail.com| Not Answered|Not Answered|

