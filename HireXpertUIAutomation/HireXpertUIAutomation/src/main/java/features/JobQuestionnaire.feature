Feature: Job Questionnaire

@JobQuestionary
Scenario Outline: Verify the functionality of Add Questionary, Edit question on questionary page and delete Questionary by Delete Questionnaire button and Delete icon.
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench 
And Click on add job button
And Add job
|title            |agytitle            |designation |industry   |jobrole        |location |budget |minexp|maxexp|minsal|maxsal|totalinterviews|organization|functionalArea|
|Jcwf Questionary |Jcwfagy Questionary | developer   |IT software|java developer |pune     |400000 |1     |2     |400000|500000|4|talentxpert|java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And observe candidate is getting added in New column
And Verify Collect Answer icon when no questionary is added for that job
And Click on Questionnaire tab
And Enter first question "<QUESTION1>" and marks "<QMARKS1>" 
And Enter the answer "<ANSWER1>" "<ANSWER2>"  and enter Marks "<MARKS1>" "<MARKS2>" for first question
And click on Save Changes button
And Enter second question "<QUESTION2>" and marks "<QMARKS2>" 
And Enter the answer "<ANSWER3>" "<ANSWER4>"  and enter Marks "<MARKS3>" "<MARKS4>" for second question
And click on Save Changes button
And Enter thrid question "<QUESTION3>" and marks "<QMARKS3>" 
And Enter the answer "<ANSWER5>" "<ANSWER6>" and enter Marks "<MARKS5>" "<MARKS6>"  for thrid question
And click on Save Changes button
And Enter the cutoff & rejection percentage "<Cuttoffpercentage>" "<Rejectionpercentage>" 
And click on submit
And Click on Questionnaire tab
And Click on edit button of question to edit the following question "<question>" and save the changes by clicking on Save Changes button
And click on submit
And Click on Questionnaire tab
And Click on edit button of question to edit the following question "<question>" and save the changes by clicking on Save Changes button
And click on submit
Then Collect Answer icon should reflect on candidates card for giving answers 
And Click on Questionnaire tab
And click on delete icon to delete any one of question
And click on submit
Then Collect Answer icon should reflect on candidates card for giving answers 
And Click on Questionnaire tab
And Click on Delete Questionnarie button
Then Collect Answer icon should not reflect on candidates card for giving answers 
Examples:
|Username       |Password | CandidateEmail      |  Name     | ContactNumber | Designation     | Date       | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea   |ZipCode | Communicationmode |Salaryoffered|distance|permanentAddress|relocate| OrganizationName | contactnumber1 | QUESTION1     | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | QUESTION2    | QMARKS2 | ANSWER3 | ANSWER4 | MARKS3 | MARKS4 |QUESTION3  | QMARKS3 | ANSWER5 | ANSWER6     | MARKS5 | MARKS6 | Cuttoffpercentage | Rejectionpercentage | question      | OrganizationName |
|pemp@gmail.com | 12345   | hirecanQ01@gmail.com | hirecanQ | 9125671966    | Software Tester | 04/08/1999 | Male   |     No         |     30       |  4.5      | 450000 |  550000     | India  | Pune | Viman Nagar| 411014 |   SMS             | 540000      | 4      | No             | No     | EmpOrg           | 123456789      | NP Negotiable |  50     |  Yes    |   No    |  30    |  20    |Can Relocate? | 50      |  Yes    |  No     |  50    |   0    | Work Exp  |  100    | Fresher | Experienced | 50     |  50    |   80              |      20             | NP Negotiable |  EmpOrg          |


@JobQuestionary
Scenario Outline: To Verify Revise Questionnaire functionality.
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench 
And Click on add job button
And Add job
|title            |agytitle            |designation |industry   |jobrole        |location |budget |minexp|maxexp|minsal|maxsal|totalinterviews|organization|functionalArea|
|Jcwf Questionary |Jcwfagy Questionary | developer   |IT software|java developer |pune     |400000 |1     |2     |400000|500000|4|talentxpert|java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And observe candidate is getting added in New column
And Verify Collect Answer icon when no questionary is added for that job
And Click on Questionnaire tab
And Enter first question "<QUESTION1>" and marks "<QMARKS1>" 
And Enter the answer "<ANSWER1>" "<ANSWER2>"  and enter Marks "<MARKS1>" "<MARKS2>" for first question
And click on Save Changes button
And Enter the cutoff & rejection percentage "<Cuttoffpercentage>" "<Rejectionpercentage>" 
And click on submit
Then Click on  Collect Answers icon on candidate card
And Answer the same question
And click on submit
And Click on Questionnaire tab
And Edit the same question
And click on Save Changes button
And click on submit
And Click on Questionnaire tab
And Enter second question "<QUESTION2>" and marks "<QMARKS2>" 
And Enter the answer "<ANSWER3>" "<ANSWER4>"  and enter Marks "<MARKS3>" "<MARKS4>" for second question
And click on Save Changes button
And click on submit
Then Click on  Collect Answers icon on candidate card
Then Verify revised question is displayed
Examples:
|Username       |Password | CandidateEmail      |  Name     | ContactNumber | Designation     | Date       | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea   |ZipCode | Communicationmode |Salaryoffered|distance|permanentAddress|relocate| OrganizationName | contactnumber1 | QUESTION1     | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | QUESTION2    | QMARKS2 | ANSWER3 | ANSWER4 | MARKS3 | MARKS4 |QUESTION3  | QMARKS3 | ANSWER5 | ANSWER6     | MARKS5 | MARKS6 | QUESTION4        |QMARKS4 | ANSWER7            | ANSWER8        |MARKS7 | MARKS8 |Cuttoffpercentage | Rejectionpercentage | question      | OrganizationName |
|pemp@gmail.com | 12345   | hirecanQ2@gmail.com | hirecanQ | 9125671966    | Software Tester | 04/08/1999 | Male   |     No         |     30       |  4.5      | 450000 |  550000     | India  | Pune | Viman Nagar| 411014 |   SMS             | 540000      | 4      | No             | No     | EmpOrg           | 123456789      | NP Negotiable |  50     |  Yes    |   No    |  30    |  20    |Can Relocate? | 50      |  Yes    |  No     |  50    |   0    | Work Exp  |  100    | Fresher | Experienced | 50     |  50    | What is Selenium | 100    | Automation Testing | Manual Testing | 80    |  20    |  80              |      20             | NP Negotiable |  EmpOrg          |


@JobQuestionary
Scenario Outline: Verify the functionality of Screening tab 
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench 
And Click on add job button
And Add job
|title  	   	 |agytitle   		   |designation  |industry   |jobrole        |location |budget |minexp|maxexp|minsal|maxsal|totalinterviews|organization|functionalArea|
|Jcwf Screening1 |Jcwfagy Screening1 3 | developer   |IT software|java developer |Pune     |400000 |1     |2     |400000|500000|4|talentxpert|java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And observe candidate is getting added in New column
And Click on Add Questionnaire 
And Add question and click on save changes button "<QUESTION1>" "<QMARKS1>" "<ANSWER1>" "<ANSWER2>" "<MARKS1>" "<MARKS2>" 
And Enter the cutoff & rejection percentage "<Cuttoffpercentage>" "<Rejectionpercentage>"
And click on submit
And Click on  Collect Answers icon on candidate card.
And Fill all the Questions answers "<QUESTION1>" "<ANSWER1>"
And click on submit
And Click on screening tab
Then verify the status of candidate 
And click on close button
Examples:
|Username       |Password |	CandidateEmail      |  Name    | ContactNumber | Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber1   | QUESTION1     | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | QUESTION2    | QMARKS2 | ANSWER3 | ANSWER4 | MARKS3 | MARKS4 |QUESTION3  | QMARKS3 | ANSWER5 | ANSWER6     | MARKS5 | MARKS6 | Cuttoffpercentage | Rejectionpercentage | question      | OrganizationName |
|pemp@gmail.com | 12345   | hirecanQ3@gmail.com | hirecanQ | 9125671966    | Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789        | NP Negotiable |  50     |  Yes    |   No    |  30    |  20    |Can Relocate? | 50      |  Yes    |  No     |  50    |   0    | Work Exp  |  100    | Fresher | Experienced | 50     |  50    |   80              |      20             | NP Negotiable |  EmpOrg          |


@JobQuestionary
Scenario Outline: Verify Collect answer icon functionality for Correct Answer 
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench 
And Click on add job button
And Add job
|title  	   	 |agytitle   		   |designation  |industry   |jobrole        |location |budget |minexp|maxexp|minsal|maxsal|totalinterviews|organization|functionalArea|
|Jcwf Screening1 |Jcwfagy Screening1 3 | developer   |IT software|java developer |Pune     |400000 |1     |2     |400000|500000|4|talentxpert|java|
And Select a added job
And Click on Add Questionnaire
And Add question and click on save changes button "<QUESTION1>" "<QMARKS1>" "<ANSWER1>" "<ANSWER2>" "<MARKS1>" "<MARKS2>" 
And Enter the cutoff & rejection percentage "<Cuttoffpercentage>" "<Rejectionpercentage>"
And click on submit 
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And Candidate is moved to New column
And Click on  Collect Answers icon on candidate card.
And Fill all the Questions answers "<QUESTION1>" "<ANSWER1>"
And click on submit
Examples:
|Username       |Password |	CandidateEmail       |  Name    | ContactNumber | Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber1   | QUESTION1     | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | Cuttoffpercentage | Rejectionpercentage | question      | OrganizationName |
|pemp@gmail.com | 12345   | hirecanQ04@gmail.com | hirecanQ | 9125671966    | Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789        | NP Negotiable |  50     |  Yes    |   No    |  40    |  10    |   40              |      10             | NP Negotiable |  EmpOrg          |


@JobQuestionary
Scenario Outline: Verify candidate gets moved to Rejected column for Wrong Answer 
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench 
And Click on add job button
And Add job
|title  	   	 |agytitle   		   |designation  |industry   |jobrole        |location |budget |minexp|maxexp|minsal|maxsal|totalinterviews|organization|functionalArea|
|Jcwf Screening1 |Jcwfagy Screening1 3 | developer   |IT software|java developer |Pune     |400000 |1     |2     |400000|500000|4|talentxpert|java|
And Select a added job
And Click on Add Questionnaire
And Add question and click on save changes button "<QUESTION1>" "<QMARKS1>" "<ANSWER1>" "<ANSWER2>" "<MARKS1>" "<MARKS2>" 
And Enter the cutoff & rejection percentage "<Cuttoffpercentage>" "<Rejectionpercentage>"
And click on submit 
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And Candidate is moved to New column
And Click on  Collect Answers icon on candidate card.
And Fill all the Questions answers "<QUESTION1>" "<ANSWER2>"
And click on submit
And Verify candidate present in Reject column
Examples:
|Username       |Password |	CandidateEmail       |  Name    | ContactNumber | Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber1   | QUESTION1     | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | Cuttoffpercentage | Rejectionpercentage |OrganizationName |
|pemp@gmail.com | 12345   | hirecanQ05@gmail.com | hirecanQ | 9125671966    | Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789        | NP Negotiable |  40     |  Yes    |   No    |  30    |  10    |   80              |      30             | EmpOrg          |


@JobQuestionary
Scenario Outline: Verify from Candidate dashboard Candidate should be able to provide an answer for the question which is added by employer 
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench 
And Click on add job button
And Add job
|title  	   	 |agytitle   		   |designation  |industry   |jobrole        |location |budget |minexp|maxexp|minsal|maxsal|totalinterviews|organization|functionalArea|
|Jcwf Screening1 |Jcwfagy Screening1 3 | developer   |IT software|java developer |Pune     |400000 |1     |2     |400000|500000|4|talentxpert|java|
And Select a added job
And Click on Add Questionnaire
And Add question and click on save changes button "<QUESTION1>" "<QMARKS1>" "<ANSWER1>" "<ANSWER2>" "<MARKS1>" "<MARKS2>" 
And Enter the cutoff & rejection percentage "<Cuttoffpercentage>" "<Rejectionpercentage>"
And click on submit 
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And Candidate is moved to New column
And logout as employer and login as new candidate added by employer "<CandidateEmail>" "<Password>"
Then On candidate dashboard in Job section click on Screening for that job to which candidate is added
And Fill all the Questions answers "<QUESTION1>" "<ANSWER1>"
And click on submit
And Verify candidate status
And On Employer login verify candidate card is moved to screening column
Examples:
|Username       |Password |	CandidateEmail       |  Name    | ContactNumber | Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber1   | QUESTION1     | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | Cuttoffpercentage | Rejectionpercentage | question      | OrganizationName |
|pemp@gmail.com | 12345   | hirecanQ06@gmail.com | hirecanQ | 9125671966    | Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789        | NP Negotiable |  50     |  Yes    |   No    |  40    |  10    |   40              |      10             | NP Negotiable |  EmpOrg          |













