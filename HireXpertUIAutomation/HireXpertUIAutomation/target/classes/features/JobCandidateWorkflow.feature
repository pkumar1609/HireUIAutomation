Feature: Hirexpert Job Candidate Workflow feature

@BVT
Scenario Outline: Verify the functionality of Add, Edit & Delete Candidate with Employer login

Given Open browser
And click on Login link
When click on Employer-Agency SignIn link
And login with Employer credential
And Go to Workbench 
And Add a new Job as employer "<JobTitle>" "<Industry>" "<JobDesignation>" "<MinSalary>" "<MaxSalary>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<CityArea>" "<ZipCode>" "<JobNoticePeriod>" "<JobSkill1>" "<JobSkill2>" 
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume
And Click on save button 
And if confirmation popup is displayed click on ok button
And Verify candidate is displayed on workbench
And Click on Edit Candidate icon on candidate card "<Name>"
And Make the changes in "<contactnumber>" field
And Click on save button to save the update details
Then click on Delete Candidate icon on Candidate card "<Name>"
And Verify candidate is displayed on workbench after deleting
And click on close job button and delete the job
And click on employer tab and delete the employer if login as agency

Examples:
   | JobTitle | JobDesignation | Industry    | MinExp | MaxExp | MinSalary  | MaxSalary | NoOfInterviews | JobNoticePeriod | JobSkill1 | JobSkill2 |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod | LastWorkingDay |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  contactnumber   | OrganizationName |
   | Engineer | Test Engineer  | IT-Software | 2      | 3      |   300000   |  500000   | 3              |      90         | Agile     |  Java     | candidate05@gmail.com   | Can05   |   912349699666   |   Software Tester |  04/08/1999 | Male   |     No         |     30       |    30/11/2020  |    2.5    | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   123456789      | EmpOrg           |
  
#TC ID  232, 62,  24,  29 [Job Candidate Workflow BVT TC]
#
# If DB clear, register the employer first = employermain01@gmail.com and agency = agencymain01@gmail.com . 

 
 
@BVT
Scenario Outline: Verify the functionality of Add, Edit & Delete Candidate with Agency login

Given Open browser
And click on Login link
When click on Employer-Agency SignIn link
And login with Agency credential
And Go to Workbench 
And Add a new Job as agency "<JobTitle>" "<Industry>" "<JobDesignation>" "<MinSalary>" "<MaxSalary>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<CityArea>" "<ZipCode>" "<JobNoticePeriod>" "<JobSkill1>" "<JobSkill2>" 
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume
And Click on save button 
And if confirmation popup is displayed click on ok button
And Verify candidate is displayed on workbench
And Click on Edit Candidate icon on candidate card "<Name>"
And Do changes in "<noticeperiod>" field
And Click on save button to save the update details
Then click on Delete Candidate icon on Candidate card "<Name>"
And Verify candidate is displayed on workbench after deleting
And click on close job button and delete the job
And click on employer tab and delete the employer if login as agency

  Examples:
  
  | JobTitle | JobDesignation   | Industry    | MinExp | MaxExp  | MinSalary  | MaxSalary| NoOfInterviews | JobNoticePeriod | JobSkill1 | JobSkill2     |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod | LastWorkingDay |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  noticeperiod   | OrganizationName |
  | Engineer | Test Engineer    | IT-Software | 2      | 3       |300000      | 500000   | 3              |       60        | Java      |  Agile        | candidate07@gmail.com   | Can07   |   912349699666   |   Software Tester |  04/08/1999 | Male   |     No         |     30       |    30/11/2020  |    2.5    | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   60            | Emporg           |
  
  
# TC ID 55, 28, 233 [Job Candidate Workflow BVT TC]
  
# If DB clear, register the employer first = employermain01@gmail.com and agency = agencymain01@gmail.com . 
#otherwise no change required

  
  @BVT
Scenario Outline: Verify the functionality of Add Questionary, Edit question on questionary page and delete Questionary by Delete Questionnaire button and Delete icon.

Given Open browser
And click on Login link
When click on Employer-Agency SignIn link
And login with Employer credential
And Go to Workbench 
And Add a new Job as employer "<JobTitle>" "<Industry>" "<JobDesignation>" "<MinSalary>" "<MaxSalary>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<CityArea>" "<ZipCode>" "<JobNoticePeriod>" "<JobSkill1>" "<JobSkill2>" 
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume
And Click on save button 
And if confirmation popup is displayed click on ok button
And Verify candidate is displayed on workbench
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
And Enter the cutoff & rejection percentage "<cuttoffpercentage>" "<rejectionpercentage>" 
And click on submit
And Click on Questionnaire tab
And Click on edit button of question to edit the following question "<question>" and save the changes by clicking on Save Changes button
And click on submit
Then Collect Answer icon should reflect on candidates card for giving answers 
And Click on Questionnaire tab
And click on delete icon to delete any one of question
And click on submit
And Click on Questionnaire tab
And Click on Delete Questionnarie button
And click on ReloadCandidate button
Then Collect Answer icon should reflect on candidates card for giving answers 
And click on close job button and delete the job
And click on employer tab and delete the employer if login as agency

Examples:
| JobTitle | JobDesignation   | Industry    | MinExp | MaxExp | MinSalary  | MaxSalary | NoOfInterviews | JobNoticePeriod | JobSkill1 | JobSkill2 | CandidateEmail   |  Name   |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate| QUESTION1     | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | QUESTION2    | QMARKS2 | ANSWER3 | ANSWER4 | MARKS3 | MARKS4 |QUESTION3  | QMARKS3 | ANSWER5 | ANSWER6     | MARKS5 | MARKS6 | cuttoffpercentage | rejectionpercentage | question      | OrganizationName |
| Engineer | Test Engineer    | IT-Software | 2      | 3      | 250000     | 450000    | 3              |   60            | Agile     | Java      |rahul@gmail.com   | Rahul   |   912349699666   |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     | NP Negotiable |  50     |  Yes    |   No    |  30    |  20    |Can Relocate? | 50      |  Yes    |  No     |  50    |   0    | Work Exp  |  100    | Fresher | Experienced | 50     |  50    |   80              |      20             | NP Negotiable |  Emporg          |

#TC :- 120, 122, 138, 234 [Job Candidate Workflow BVT TC]
#TC :- 136 [Job Candidate Workflow Regression TC]

# If DB clear, register the employer first = employermain01@gmail.com. otherwise no change required

 
  @BVT
Scenario Outline: Verify the functionality of Screening tab 

Given Open browser
And click on Login link
When click on Employer-Agency SignIn link
And login with Employer credential
And Go to Workbench 
And Add a new Job as employer "<JobTitle>" "<Industry>" "<JobDesignation>" "<MinSalary>" "<MaxSalary>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<CityArea>" "<ZipCode>" "<JobNoticePeriod>" "<JobSkill1>" "<JobSkill2>" 
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume
And Click on save button 
And if confirmation popup is displayed click on ok button
And Verify candidate is displayed on workbench
And Click on Add Questionnaire 
And Add question and click on save changes button "<QUESTION1>" "<QMARKS1>" "<ANSWER1>" "<ANSWER2>" "<MARKS1>" "<MARKS2>" 
And Enter the cutoff & rejection percentage "<cuttoffpercentage>" "<rejectionpercentage>"
And click on submit
And Click on  Collect Answers icon on candidate card.
And Fill all the Questions answers 
And click on submit
And Click on screening tab
Then verify the status of candidate 
And click on close button
And click on close job button and delete the job
And click on employer tab and delete the employer if login as agency

Examples:

| JobTitle | JobDesignation   | Industry    | MinExp | MaxExp | NoOfInterviews | JobNoticePeriod  |  JobSkill1 |  JobSkill2 |      CandidateEmail     |  Name   |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode | Salaryoffered | distance | permanentAddress | relocate | QUESTION1      | QMARKS1  | ANSWER1 | ANSWER2 | MARKS1  | MARKS2 | cuttoffpercentage | rejectionpercentage | OrganizationName |
| Engineer | Test Engineer    | IT-Software | 2      | 3      | 3              |    60            | Agile      |    Java    |candidate03@gmail.com    | can03   |   912349699666   |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000        | 4        | No               | No       |  NP Negotiable |  100     |  Yes    |   No    |  100    |  0     |   80              |      20             | Emporg           |

#TC ID :- 125 [Job Candidate Workflow BVT TC]

# If DB clear, register the employer first = employermain01@gmail.com. otherwise no change required



@BVT
Scenario Outline: To verify that Questionnarie and Screening tab not displayed when log in with Agency and To verify 'Interviewer'dropdown 
on Schedule interview popup when login with Agency

Given Open browser
And click on Login link
And click on Employer-Agency SignIn link
And login with Agency credential
And Go to Workbench 
And Add a new Job as agency "<JobTitle>" "<Industry>" "<JobDesignation>" "<MinSalary>" "<MaxSalary>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<CityArea>" "<ZipCode>" "<JobNoticePeriod>" "<JobSkill1>" "<JobSkill2>" 
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume
And Click on save button
And if confirmation popup is displayed click on ok button
And Verify that Questionnarie and Screening tab is not displayed when login with Agency
And Click on Schedule interview icon 
And Click interviewer from Interviewer drop down "<interviewer>"
And Fill all mandatory details "<title>" "<scheduleon>" "<hour>" "<minute>" "<interviewduration>" "<timezone>"
And click on submit
And click on close button
And click on close job button and delete the job
And click on employer tab and delete the employer
And click on employer tab and delete the employer if login as agency

Examples:
| JobTitle   | JobDesignation   | Industry    | JobRole  | JobLocation | JobBudget | MinExp | MaxExp | MinSalary  | MaxSalary | NoOfInterviews | JobNoticePeriod |  JobSkill1 |  JobSkill2  | interviewer | title     | scheduleon  | hour | minute | interviewduration | timezone             |   CandidateEmail        |Name    |ContactNumber|Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate| OrganizationName |
| Engineer   | Test Engineer    | IT-Software | Engineer | Viman Nagar | 500000    | 2      | 3      | 300000     | 500000    | 3              |        60       |    Agile   |    Java     | emp         | Interview |  25/12/2020 | 11   | 30     |  1 hour           | Indian Standard Time | candidate01@gmail.com   |can01   |8956652538   |jr.developer  |04/08/1999      |Female  |No            |25          |2.0       |400000|800000     |India  |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |  Emporg          |

#TC ID :- 109, 137 [Job Candidate Workflow BVT TC]

#Change interview date and time
# If DB clear, register the agency first = agencymain01@gmail.com. otherwise no change required
  
  
  
 
#REGRESSION TCs  



@Regression
Scenario Outline: To verify the functionality of Update Profile page of candidate
	
Given Open browser
And click on Login link
When click on Employer-Agency SignIn link
And login with Employer credential
And Go to Workbench
And Add a new Job as employer "<JobTitle>" "<JobDesignation>" "<Industry>" "<JobRole>" "<JobLocation>" "<JobBudget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<JobNoticePeriod>>" "<JobSkill1>" "<JobSkill2>"
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And click on Add Candidate button
And enter email id of candidate which is not registered previously and click on Find button "<CandidateEmail>" 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume and click on save button
And if confirmation popup is displayed click on ok button
Then user should able to add new candidate and candidate should get added in New column
And logout as employer and login as new candidate added by employer "<CandidateEmail>" "<password>"
And click on ok button of confirmation popup
And Click on Profile tab
Then verify the Auto Populated fields on candidate update profile popup window
And Select the On Notice Period field and set Last working day on Update Profile page "<LastWorkingDay>"
And set looking for job as yes
And Click on save btn 
And click on ok button
And click on Skills & Roles tab
And add skill, expertise level and certificate "<Skill1>" "<ExpertiseLevel>"
And add same skill, expertise level and certificate "<Skill2>" "<ExpertiseLevel>"
And Click on save btn for skill 
Then Verify that user get an alert message as "Same skill entered more than one time." for adding duplicate skills
And click on ok button
And delete duplicate skill
And Now Click on Add Skill button to add more than ten skills
Then Verify that user get an alert message as "Skills adding limit is 10." for adding more than ten skills
And click on ok button
And click on Delete Skill button in front of any skill for candidate
And click on Add Role button
And add duplicate role "<JobRole>"
And Click on save btn for role 
Then Verify that user get an alert message as "Same role entered more than one time." for adding duplicate roles
And click on ok button
And delete duplicate role
And Now Click on Add Role button to add more than ten skills
Then Verify that user get an alert message as "Roles adding limit is 10." for adding more than ten roles
And click on ok button
And click on Delete Role button in front of any role for candidate
And click on Personal & Professional tab
And set looking for job as No
And Click on save btn 
And click on ok button
And logout as candidate and login as same employer 
And go to workbench and select the same job
And click on close job button and delete the job
And click on employer tab and delete the employer if login as agency
And close the browser

 
 
 Examples:
	| JobTitle | JobDesignation   | Industry    | JobRole  | JobLocation    | JobBudget | MinExp | MaxExp | NoOfInterviews | JobNoticePeriod |  JobSkill1 |  JobSkill2 |   CandidateEmail |  Name   |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate| password | LastWorkingDay | Skill1 | Skill2 | ExpertiseLevel |
	| Engineer | Test Engineer    | IT-Software | Engineer | Viman Nagar    | 500000    | 2      | 3      | 3              |     50          |   Agile    |   Java     |  NR13@gmail.com  | nr13    |   91345799666    |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     | 12345    | 1/9/2020       | Java   | Java   |  Expert        |
	 
# TC :- 25,64,104,129,296        [Job candidate Workflow Regression TC] 
# TC :- 36,37,38,39,92,228,229   [Job Candidate Workbench BVT TC ]

#change email id of candidate [enter candidate email id not presnet in system]
  
  
  
 Scenario Outline: To verify the Notice Period field on candidate page 
	
Given Open browser
And click on Login link
And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
And Go to Workbench 
And click on Add Job button and fill all mandatory details on Add Job popup window "<JobTitle>" "<JobDesignation>" "<Industry>" "<JobRole>" "<JobLocation>" "<JobBudget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<JobNoticePeriod>" "<JobSkill1>" "<JobSkill2>"
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume
And click on Close button
Then confirmation popup message should display with Yes and No buttons and Click on No button
And Click save button
And if confirmation popup is displayed click on ok button
And Click on Edit Candidate icon on candidate card "<Name>"
And change the set notice period days
And click on Close button
Then confirmation popup message should display with Yes and No buttons and Click on No button
And Click on save button to save the updated changes
And if confirmation popup is displayed click on ok button
And Click on Edit Candidate icon on candidate card "<Name>"
And Select the On Notice Period field and set Last working day on Update Profile page "<LastWorkingDay>"
And Click on save button to save the updated changes
And if confirmation popup is displayed click on ok button
And Click on Edit Candidate icon on candidate card "<Name>"
And set on notice period field as no and enter notice period days
And Click on save button to save the updated changes
And if confirmation popup is displayed click on ok button
And click on close job button and delete the job
And click on employer tab and delete the employer if login as agency
	

Examples:
      
|    email address            |  password   | JobTitle | JobDesignation | Industry    | JobRole  | JobLocation | JobBudget | MinExp | MaxExp | NoOfInterviews |JobNoticePeriod | JobSkill1 | JobSkill2 |  CandidateEmail       |  Name       |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|LastWorkingDay | OrganizationName |
|  employermain01@gmail.com   | 12345       | Engineer | Test Engineer  | IT-Software | Engineer | Viman Nagar | 500000    | 2      | 3      | 3              |       90       |  Agile    |   JAVA    | petertom14@gmail.com  | PeterTom14  |   91345799666    |   Software Tester |  04/08/1999 | Male   |     No         |     0        |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     | 30/09/2020    |  Emporg          |
|   agencymain01@gmail.com    |  12345      | Engineer | Tester         | IT-Software | Engineer | Viman Nagar | 500000    | 0      | 3      | 4              |      90        |  Agile    |    Java   | tompeter04@gmail.com  | TomPeter04  |   91852649666    |   Software Tester |  04/08/1999 | Male   |     No         |     0        |      1    | 200000 |     400000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     | 30/10/2020    |  EmployerOrg     |


#TC ID: 59,70,134,263  [Job candidate Workflow Regression TC]

# If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com .
# Change the candidate name & email everytime, add a new candidate which is not present in system
# Also check the last working day 
  
  
  
Scenario Outline: Verify user is able to add comment for candidate

Given Open browser
And click on Login link
And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
And Go to Workbench 
And click on Add Job button and fill all mandatory details on Add Job popup window "<JobTitle>" "<JobDesignation>" "<Industry>" "<JobRole>" "<JobLocation>" "<JobBudget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<JobNoticePeriod>" "<JobSkill1>" "<JobSkill2>"
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume and click on save button
And if confirmation popup is displayed click on ok button
And Verify candidate is displayed on workbench
And Click on Comment icon from candidate card to add comment "<Name>"
And Add a comment greater than 512 characters
Then Verify that user get an error message as "Comment to be max 512 characters." for adding comment greater than specified characters
And error message should display and Save button should be disabled
And add comment with or below 512 characters and click on Save button
Then comment should get added below Save button with Delete Comment icon
And click on Delete Comment icon to delete the comment and comment should get deleted
And click on Close button
And click on close job button and delete the job
And click on employer tab and delete the employer if login as agency


Examples:
      
|    email address            |  password   | JobTitle | JobDesignation | Industry    | JobRole  | JobLocation  | JobBudget | MinExp | MaxExp | NoOfInterviews | JobNoticePeriod |JobSkill1 | JobSkill2  |  CandidateEmail      |  Name    |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate| OrganizationName |
|   employermain01@gmail.com  |  12345      | Engineer | Test Engineer  | IT-Software | Engineer | Viman Nagar  | 500000    | 2      | 3      | 3              |    60           |  Agile   | Java       |  tj01@gmail.com      | TJ01     |   91345799666    |   Software Tester |  04/08/1999 | Male   |     No         |     0        |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     | Emporg           |
|   agencymain01@gmail.com    |  12345      | Engineer | Tester         | IT-Software | Engineer | Viman Nagar  | 500000    | 0      | 3      | 4              |    60           |  Agile   | Java       |  tj02@gmail.com      | TJ02     |   91852649666    |   Software Tester |  04/08/1999 | Male   |     No         |     0        |      1    | 200000 |     400000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     | Emporg           |

#TC : 317     [Job candidate workfloww Regression TC]
# If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com . otherwise no change required


Scenario Outline: Verify user able to move rejected candidate from Rejected column to any other column
	
Given Open browser
And click on Login link
When click on Employer-Agency SignIn link
And login with Employer credential
And Go to Workbench 
And Add a new Job as employer "<JobTitle>" "<JobDesignation>" "<Industry>" "<JobRole>" "<JobLocation>" "<JobBudget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<JobNoticePeriod>>" "<JobSkill1>" "<JobSkill2>"
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume and click on save button
And if confirmation popup is displayed click on ok button
And Click on Reject Candidate icon from candidate card to reject the candidate "<Name>"
Then Observe candidate get moved in Rejected column automatically
And Now move that candidate from Rejected column to any other column and observe
And Click on Questionnaire tab
And Enter first question "<QUESTION1>" and marks "<QMARKS1>" 
And Enter the answer "<ANSWER1>" "<ANSWER2>"  and enter Marks "<MARKS1>" "<MARKS2>" for first question
And click on Save Changes button
And Enter the cutoff & rejection percentage "<cuttoffpercentage>" "<rejectionpercentage>" 
And click on submit
Then Collect Answer icon should reflect on candidates card for giving answers
And Click on Reject Candidate icon from candidate card to reject the candidate "<Name>"
Then Observe candidate get moved in Rejected column automatically
And Now move that candidate from Rejected column to any other column and observe
And click on close job button and delete the job
And click on employer tab and delete the employer if login as agency
And close the browser

Examples:
      
| JobTitle | JobDesignation | Industry    | JobRole  | JobLocation | JobBudget | MinExp | MaxExp | NoOfInterviews | JobNoticePeriod | JobSkill1 | JobSkill2 |  CandidateEmail      |  Name      |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  QUESTION1          | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | cuttoffpercentage | rejectionpercentage | OrganizationName |
| Engineer | Test Engineer  | IT-Software | Engineer | Viman Nagar | 500000    | 2      | 3      | 3              |     50          | Agile     |  Java     |  cherry03@gmail.com  | Cherry03   |   91345799666    |   Software Tester |  04/08/1999 | Male   |     No         |     0        |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     | Ready to Relocate ? | 100     |  Yes    |  No     | 100    | 0      | 80                |  20                 | Emporg           |


# TC :- 292 [Job candidate workfloww Regression TC]

# If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com . otherwise no change required



Scenario Outline: Verify one after one rejected candidate listed in Rejected Column
	
Given Open browser
And click on Login link
When click on Employer-Agency SignIn link
And login with Employer credential
And Go to Workbench 
And Add a new Job as employer "<JobTitle>" "<JobDesignation>" "<Industry>" "<JobRole>" "<JobLocation>" "<JobBudget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<JobNoticePeriod>>" "<JobSkill1>" "<JobSkill2>"
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume and click on save button
And if confirmation popup is displayed click on ok button
And Click on Add Candidate button
And Enter valid "<CandidateEmail1>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume and click on save button
And if confirmation popup is displayed click on ok button
And move both candidates in Interview Pending one column
And Click on Reject Candidate icon from candidate card and reject that candidate "<Name>"
Then Observe candidate get moved in Rejected column automatically
And Click on Reject Candidate icon from candidate card for second candidate "<Name1>"
And click on No from confirmation popup and observe
Then both candidates should not display in same column
And click on close job button and delete the job
And click on employer tab and delete the employer if login as agency
And close the browser



Examples:
      
| JobTitle | JobDesignation   | Industry    | JobRole  | JobLocation  | JobBudget | MinExp | MaxExp | NoOfInterviews | JobNoticePeriod | JobSkill1 | JobSkill2 |   CandidateEmail     |  Name      |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate |  CandidateEmail1      |  Name1       |   ContactNumber1 | OrganizationName |
| Engineer | Test Engineer    | IT-Software | Engineer | Viman Nagar  | 500000    | 2      | 3      | 3              |   60            | Agile     |  Java     |  donald01@gmail.com  | donald01   |   91345799666    |   Software Tester |  04/08/1999 | Male   |     No         |     0        |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No      |   harry01@gmail.com   |   Harry01    |     123456789    | Emporg           |


# TC :- 467 [Job candidate workfloww Regression TC]

# If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com . otherwise no change required



Scenario Outline: To verify the functionality of Upload Resume on candidate profile
	
Given Open browser
And click on Login link
When click on Employer-Agency SignIn link
And login with Employer credential
And Go to Workbench 
And Add a new Job as employer "<JobTitle>" "<JobDesignation>" "<Industry>" "<JobRole>" "<JobLocation>" "<JobBudget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<JobNoticePeriod>>" "<JobSkill1>" "<JobSkill2>"
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume in document format
And Click on Save Button 
And if confirmation popup is displayed click on ok button
And Click on Edit Candidate icon on candidate card "<Name>"
And upload candidate resume in zip file format
And verify the error message displayed as "Only .pdf, .docx , .txt and .doc format files are supported."
And click on ok button
And upload candidate resume in pdf file format
And Click on save button for edit candidate
And if confirmation popup is displayed click on ok button
And Click on Edit Candidate icon on candidate card "<Name>"
And upload candidate resume in text file format
And Click on save button for edit candidate
And if confirmation popup is displayed click on ok button
And Click on Edit Candidate icon on candidate card "<Name>"
And upload candidate resume in PNG file format
And verify the error message displayed as "Only .pdf, .docx , .txt and .doc format files are supported."
And click on ok button
And Click on save button for edit candidate
And if confirmation popup is displayed click on ok button
And click on close job button and delete the job
And click on employer tab and delete the employer if login as agency
And close the browser

Given Open browser
And click on Login link
When click on Employer-Agency SignIn link 
And login with Agency credential
And Go to Workbench 
And Add a new Job as agency "<JobTitle>" "<JobDesignation>" "<Industry>" "<JobRole>" "<JobLocation>" "<JobBudget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<JobNoticePeriod>" "<JobSkill1>" "<JobSkill2>"
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume in document format
And Click on Save Button 
And if confirmation popup is displayed click on ok button
And Click on Edit Candidate icon on candidate card "<Name>"
And upload candidate resume in zip file format
And verify the error message displayed as "Only .pdf, .docx , .txt and .doc format files are supported."
And click on ok button
And upload candidate resume in pdf file format
And Click on save button for edit candidate
And if confirmation popup is displayed click on ok button
And Click on Edit Candidate icon on candidate card "<Name>"
And upload candidate resume in text file format
And Click on save button for edit candidate
And if confirmation popup is displayed click on ok button
And Click on Edit Candidate icon on candidate card "<Name>"
And upload candidate resume in PNG file format
And verify the error message displayed as "Only .pdf, .docx , .txt and .doc format files are supported."
And click on ok button
And Click on save button for edit candidate
And if confirmation popup is displayed click on ok button
And click on close job button and delete the job
And click on employer tab and delete the employer if login as agency
And close the browser

Given Open browser
And click on Login link
And click on Job Seeker(Candidate) Sign In link
And enter candidate email and password "<CandidateEmail>" "<password>" 
And click on Signin button
And click on ok button of confirmation popup
And Click on Profile tab
Then verify the Auto Populated fields on candidate update profile popup window
And upload candidate resume in document format
And Click on Save Button 
And click on ok button
And upload candidate resume in zip file format
And verify the error message displayed as "Only .pdf, .docx , .txt and .doc format files are supported."
And click on ok button
And upload candidate resume in pdf file format
And Click on Save Button 
And click on ok button
And upload candidate resume in text file format
And Click on Save Button 
And click on ok button
And upload candidate resume in PNG file format
And verify the error message displayed as "Only .pdf, .docx , .txt and .doc format files are supported."
And click on ok button
And Click on Save Button 
And click on ok button
And close the browser

Examples:
      
| JobTitle | JobDesignation   | Industry    | JobRole  | JobLocation | JobBudget | MinExp | MaxExp | NoOfInterviews | JobNoticePeriod | JobSkill1 | JobSkill2 | OrganizationName |  CandidateEmail      |  Name      |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate | password |
| Engineer | Test Engineer    | IT-Software | Engineer | Viman Nagar | 500000    | 2      | 3      | 3              |     60          | Agile     | Java      | Emporg           |  donald02@gmail.com  | donald02   |   91345799666    |   Software Tester |  04/08/1999 | Male   |     No         |     0        |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No      | 12345    |                 


# TC ID :- 26 [Job candidate workfloww Regression TC]
# Change the candidate name & candidate email every time



 Scenario Outline: To verify user is able to update skills and No. of Interviews for the job with Employer login
  
Given Open browser
And click on Login link
And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
And click on Workbench tab
And click on Add Job button and fill all mandatory details on Add Job popup window "<JobTitle>" "<JobDesignation>" "<Industry>" "<JobRole>" "<JobLocation>" "<JobBudget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<JobNoticePeriod>" "<JobSkill1>" "<JobSkill2>"
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume and click on save button
And if confirmation popup is displayed click on ok button
And click on Edit Job button to update skills and number of interview
And select number of interview except previously selected number  "<NoOfInterviews1>"
And click on submit button
And again click on Edit Job button and observe the number of interviews
And click on Add Skill button and add one new skill
And Click on Edit Candidate icon on candidate card "<Name>"
Then Newly Added skills should be reflect in candidate profile which are already added for that job
And click on close job button and delete the job
And click on employer tab and delete the employer if login as agency
And close the browser

Examples:
|    email address            |  password  | JobTitle | JobDesignation | Industry    | JobRole  | JobLocation | JobBudget | MinExp | MaxExp | NoOfInterviews |  JobNoticePeriod | JobSkill1 | JobSkill2 | OrganizationName |  CandidateEmail      |  Name      |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate | NoOfInterviews1 |
|  employermain01@gmail.com   |   12345    | SDET     | QA Analyst     | IT-Industry | Tester   | Pune        | 700000    | 3      | 5      |   2            |    60            | Agile     |  Java     | Emporg           |   donald01@gmail.com | donald01   |   91345799666    |   Software Tester |  04/08/1999 | Male   |     No         |     0        |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No      |      3          |    

    
    #Reg TC ID: 112,324 [Job candidate workfloww Regression TC]
    # If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com . otherwise no change required
    


Scenario Outline: To verify deleted skill on Candidate Details page and when employer is adding new candidate for the job
  
Given Open browser
And click on Login link
And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
And click on Workbench tab
And click on Add Job button and fill all mandatory details on Add Job popup window "<JobTitle>" "<JobDesignation>" "<Industry>" "<JobRole>" "<JobLocation>" "<JobBudget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<JobNoticePeriod>" "<JobSkill1>" "<JobSkill2>"
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume and click on save button 
And if confirmation popup is displayed click on ok button
And Click on Candidate name from candidate card and observe the skills 
And click on Close button from candidate Details page
And click on Edit Job button to make changes in job
And Delete one skill from Skills section 
And click on submit button
And Click on Edit Candidate icon on candidate card "<Name>"
And observe deleted skill not displayed
And click on Close button from Edit Candidate page
And Click on Candidate name from candidate card and observe the skills
Then deleted skills should display on Candidate Details page 
And click on Close button from candidate Details page 
And click on Edit Job button to make changes in job
And delete all added skills
And click on submit button
And Click on Add Candidate button
And Enter valid "<CandidateEmail1>" 
And click on find button 
Then observe deleted job skill should not show when employer is going to add new candidate
And click on close job button and delete the job
And click on employer tab and delete the employer if login as agency
And close the browser
    
    Examples:
|    email address            |  password  | JobTitle | JobDesignation | Industry    | JobRole  | JobLocation | JobBudget | MinExp | MaxExp | NoOfInterviews | JobNoticePeriod | JobSkill1 | JobSkill2 | OrganizationName  |  CandidateEmail      |  Name      |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate | CandidateEmail1 |
|  employermain01@gmail.com   |   12345    | SDET     | QA Analyst     | IT-Industry | Tester   | Pune        | 700000    | 3      | 5      |   2            | 60              | Agile     | Java      | Emporg            |   donald01@gmail.com | donald01   |   91345799666    |   Software Tester |  04/08/1999 | Male   |     No         |     0        |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No      | peter@gmail.com |    
    
    
   #Reg TC ID: 335,349 [Job candidate workfloww Regression TC]
   # If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com . otherwise no change required
   


Scenario Outline: Verify the functionality of adding a candidate to the job that is shared by agency team member
    
Given Open browser
And click on Login link
And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
And click on Team tab and add one new team member by clicking on Add button for agency "<AgencyteammemberemailId>" "<AgencyteammemberName>" "<AgencyteammemberNo>"
And click on Close button from Team Members window
And logout with agency owner
And enter valid user "<AgencyteammemberemailId>" and "<password>" for registered employer and agency and click on Sign in button
And click on Workbench tab
And click on Add Job button and fill all mandatory details on Add Job popup window "<JobTitle>" "<JobDesignation>" "<Industry>" "<JobRole>" "<JobLocation>" "<JobBudget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<JobNoticePeriod>" "<JobSkill1>" "<JobSkill2>"    
Then Job should get successfully added and Job should be visible in Job drop down
And logout with agency team member
And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button   
And click on Workbench tab and select the job which is added by agency team member
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume and click on save button 
And if confirmation popup is displayed click on ok button
Then new candidate should get added in New column
And click on close job button and delete the job
And delete the agency team member "<AgencyteammemberemailId>"
And logout with agency owner
And enter valid user "<AgencyteammemberemailId>" and "<password>" for registered employer and agency and click on Sign in button
And click on Workbench tab
And click on reload button    
And click on employer tab and delete the employer if login as agency
And close the browser
    
     Examples:
|    email address            |  password  | AgencyteammemberemailId  | AgencyteammemberName    |  AgencyteammemberNo | JobTitle | JobDesignation | Industry    | JobRole  | JobLocation | JobBudget | MinExp | MaxExp | NoOfInterviews | JobNoticePeriod | JobSkill1 | JobSkill2 | OrganizationName  |  CandidateEmail      |  Name      |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate |
|  agencymain01@gmail.com     |   12345    | teamagencymain@gmail.com |      TeamAgencymain     |  852963741          | SDET     | QA Analyst     | IT-Industry | Tester   | Pune        | 700000    | 3      | 5      |   2            |    60           | Agile     | Java      | Emporg            |   tina01@gmail.com   | Tina01     |   91345799666    |   Software Tester |  04/08/1999 | Male   |     No         |     0        |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No      |   
       
    
  
#Reg TC ID: 239  [Job candidate workfloww Regression TC]

# If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com . otherwise no change required

Scenario Outline: Verify functionality of bell icon on candidate card.

Given Open browser
When click on Employer-Agency SignIn link
And login with Employer credential
And Go to Workbench 
And Add a new Job as employer "<JobTitle>" "<JobDesignation>" "<Industry>" "<JobRole>" "<JobLocation>" "<JobBudget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<JobNoticePeriod>>" "<JobSkill1>" "<JobSkill2>"
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume
And Keep expertise level as Not answer "<ExpertiseLevel1>" "<ExpertiseLevel2>"
And Click on Save Button 
Then The candidate whose skill expert level is set as Not answer for that candidate card there should show bell icon
And Click on Edit Candidate icon on candidate card "<Name>"
And select different expertise level for the skill which is having expert level as not answer "<expertiselevel1>" "<expertiselevel2>"
And Click on save button for edit candidate
Then when user set expertise level other than Not answer in edit candidate at that time bell icon should removed from candidate card
And click on close job button and delete the job
And click on employer tab and delete the employer if login as agency


Examples:
   | JobTitle | JobDesignation | Industry    | JobRole  | JobLocation | JobBudget | MinExp | MaxExp | NoOfInterviews | JobNoticePeriod | JobSkill1 | JobSkill2 | OrganizationName |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|   contactnumber   | ExpertiseLevel1 | ExpertiseLevel2 | expertiselevel1 | expertiselevel2 |
   | Engineer | Test Engineer  | IT-Software | Engineer | Viman Nagar | 500000    | 2      | 3      | 3              | 60              | Agile     | Java      | Emporg           | candidate02@gmail.com   | Can02   |   912349699666   |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     | 1234567891        | Not Answered    |  Not Answered   |  Expert         | Intermediate    |
  
#  TC :- 374  [Job candidate workfloww Regression TC]

# If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com . otherwise no change required

Scenario Outline: Verify there is asking reason when user manually drag the candidate card in rejection column from employer login, employer team member login, agency login, agency team member login


Given Open browser
When click on Employer-Agency SignIn link
And login with Employer credential
And Go to Workbench 
And Add a new Job as employer "<JobTitle>" "<JobDesignation>" "<Industry>" "<JobRole>" "<JobLocation>" "<JobBudget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<JobNoticePeriod>>" "<JobSkill1>" "<JobSkill2>"
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume and click on save button
And Verify candidate is displayed on workbench
And Drag the candidate card from that column to rejected column
And confirmation popup should diplay "Are you sure you want to reject Can02 ?" with Yes and No button and click on Yes buton
And select the reason of rejection and cick on submit button
Then drag the candidate card from rejected column to any other column
And click on close job button and delete the job
And add a team member to employer
And logout with employer and login as employer team member
And Go to Workbench 
And Add a new Job as employer "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
And Verify that job is added or not
And Select the same job from job drop down
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume and click on save button 
And Verify candidate is displayed on workbench
And Drag the candidate card from that column to rejected column
And confirmation popup should diplay "Are you sure you want to reject Can02 ?" with Yes and No button and click on Yes buton
And select the reason of rejection and cick on submit button
Then drag the candidate card from rejected column to any other column
And click on close job button and delete the job
And logout as employer team member and login as employer
And delete the team member

Given Open browser
When click on Employer-Agency SignIn link
And login with Agency credential
And Go to Workbench 
And Add a new Job as agency "<JobTitle>" "<JobDesignation>" "<Industry>" "<JobRole>" "<JobLocation>" "<JobBudget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<JobNoticePeriod>" "<JobSkill1>" "<JobSkill2>"
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume and click on save button
And Verify candidate is displayed on workbench
And Drag the candidate card from that column to rejected column
And confirmation popup should diplay "Are you sure you want to reject Can02 ?" with Yes and No button and click on Yes buton
And select the reason of rejection and cick on submit button
Then drag the candidate card from rejected column to any other column
And click on close job button and delete the job
And add a team member to agency
And logout with agency and login as agency team member
And Go to Workbench 
And Add a new Job as agency "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
And Verify that job is added or not
And Select the same job from job drop down
And Click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>", "<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume and click on save button 
And Verify candidate is displayed on workbench
And Drag the candidate card from that column to rejected column
And confirmation popup should diplay "Are you sure you want to reject Can02 ?" with Yes and No button and click on Yes buton
And select the reason of rejection and cick on submit button
Then drag the candidate card from rejected column to any other column
And click on close job button and delete the job
And logout as agency team member and login as agency
And delete the team member

Examples:
   | JobTitle    | JobDesignation   | Industry    | JobRole  | JobLocation | JobBudget | MinExp | MaxExp | NoOfInterviews | JobNoticePeriod | JobSkill1 | JobSkill2 | OrganizationName |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  contactnumber   | 
   | Engineer    | Test Engineer    | IT-Software | Engineer | Viman Nagar | 500000    | 2      | 3      | 3              |    60           | Agile     | Java      | Emporg           | candidate02@gmail.com   | Can02   |   9128529666     |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   123456789      |
  

# TC = 533





































































