Feature: Hirexpert Job Candidate Workflow feature

#@BVT
#Scenario Outline: Verify the functionality of Add, Edit & Delete Candidate with Employer login
#
#Given Open browser
#And click on Login link
#When click on Employer-Agency SignIn link
#And login with Employer credential
#And Go to Workbench 
#And Add a new Job as employer "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
##And Verify that job is added or not "<JobName>"
#And Select the same job from job drop down
#And Click on Add Candidate button.
#And Enter valid "<CandidateEmail>" 
#And click on find button 
#And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
#And upload candidate resume
#And Click on save button 
#And Verify candidate is displayed on workbench
#And Click on Edit Candidate icon on candidate card "<Name>"
#And Make the changes in "<contactnumber>" field
#And Click on save button to save the update details
#Then click on Delete Candidate icon on Candidate card "<Name>"
#And Verify candidate is displayed on workbench after deleting
#And click on close job button and delete the job
#
#Examples:
#   | Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews |JobName                     |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  contactnumber   | 
#   | Engineer | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              | Engineer - EmpOrg - Active | candidate05@gmail.com   | Can05   |   912349699666   |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   123456789      |
#  
 # 232, 62,  24,  29 
 
 
 
#@BVT
#Scenario Outline: Verify the functionality of Add, Edit & Delete Candidate with Agency login
#
#Given Open browser
#And click on Login link
#When click on Employer-Agency SignIn link
#And login with Agency credential
#And Go to Workbench 
#And Add a new Job as agency "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
##And Verify that job is added or not "<JobName>"
#And Select the same job from job drop down
#And Click on Add Candidate button.
#And Enter valid "<CandidateEmail>" 
#And click on find button 
#And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
#And upload candidate resume
#And Click on save button 
#And Verify candidate is displayed on workbench
#And Click on Edit Candidate icon on candidate card "<Name>"
#And Do changes in "<noticeperiod>" field
#And Click on save button to save the update details
#Then click on Delete Candidate icon on Candidate card "<Name>"
#And Verify candidate is displayed on workbench after deleting
#And click on close job button and delete the job
#And click on employer tab and delete the employer
#
#Examples:
#  | Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Gender | NoticePeriod | Location    |  Communicationmode |   noticeperiod  | 
#  | Engineer | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              | candidate06@gmail.com   | Can06   |   912349699666   |   Software Tester | Male   |      30      | pune        |        SMS         |   60            |
#  
#  55, 28, 233, 29
  
  
# If DB clear, register the employer first = employermain01@gmail.com and agency = agencymain01@gmail.com . 
#otherwise no change required

  
# @BVT
#Scenario Outline: Verify the functionality of Add Questionary, Edit question on questionary page and delete Questionary by Delete Questionnaire button and Delete icon.
#
#Given Open browser
#And click on Login link
#When click on Employer-Agency SignIn link
#And login with Employer credential
#And Go to Workbench 
#And Add a new Job as employer "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
#And Select the same job from job drop down
#And Click on Add Candidate button.
#And Enter valid "<CandidateEmail>" 
#And click on find button 
#And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
#And upload candidate resume
#And Click on save button 
#And Verify candidate is displayed on workbench
#And Verify Collect Answer icon when no questionary is added for that job
#And Click on Questionnaire tab
#And Enter first question "<QUESTION1>" and marks "<QMARKS1>" 
#And Enter the answer "<ANSWER1>" "<ANSWER2>"  and enter Marks "<MARKS1>" "<MARKS2>" for first question
#And click on Save Changes button
#And Enter second question "<QUESTION2>" and marks "<QMARKS2>" 
#And Enter the answer "<ANSWER3>" "<ANSWER4>"  and enter Marks "<MARKS3>" "<MARKS4>" for second question
#And click on Save Changes button
#And Enter thrid question "<QUESTION3>" and marks "<QMARKS3>" 
#And Enter the answer "<ANSWER5>" "<ANSWER6>" and enter Marks "<MARKS5>" "<MARKS6>"  for thrid question
#And click on Save Changes button
#And Enter the cutoff & rejection percentage "<cuttoffpercentage>" "<rejectionpercentage>" 
#And click on submit
#And Click on Questionnaire tab
#And Click on edit button of question to edit the following question "<question>" and save the changes by clicking on Save Changes button
#And click on submit
#Then Collect Answer icon should reflect on candidates card for giving answers 
#And Click on Questionnaire tab
#And click on delete icon to delete any one of question
#And click on submit
#And Click on Questionnaire tab
#And Click on Delete Questionnarie button
#And click on ReloadCandidate button
#Then Collect Answer icon should reflect on candidates card for giving answers 
#And click on close job button and delete the job
#
#Examples:
#| Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews | CandidateEmail   |  Name   |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate| QUESTION1     | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | QUESTION2    | QMARKS2 | ANSWER3 | ANSWER4 | MARKS3 | MARKS4 |QUESTION3  | QMARKS3 | ANSWER5 | ANSWER6     | MARKS5 | MARKS6 | cuttoffpercentage | rejectionpercentage | question      |
#| Engineer | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              |rahul@gmail.com   | Rahul   |   912349699666   |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     | NP Negotiable |  50     |  Yes    |   No    |  30    |  20    |Can Relocate? | 50      |  Yes    |  No     |  50    |   0    | Work Exp  |  100    | Fresher | Experienced | 50     |  50    |   80              |      20             | NP Negotiable |  

#TC :- 120, 122, 138, 234, 136, 

# If DB clear, register the employer first = employermain01@gmail.com. otherwise no change required

 
#  @BVT
#Scenario Outline: Verify the functionality of Screening tab 
#
#Given Open browser
#And click on Login link
#When click on Employer-Agency SignIn link
#And login with Employer credential
#And Go to Workbench 
#And Add a new Job as employer "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
#And Select the same job from job drop down
#And Click on Add Candidate button.
#And Enter valid "<CandidateEmail>" 
#And click on find button 
#And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
#And upload candidate resume
#And Click on save button 
#And Verify candidate is displayed on workbench
#And Click on Add Questionnaire 
#And Add question and click on save changes button "<QUESTION1>" "<QMARKS1>" "<ANSWER1>" "<ANSWER2>" "<MARKS1>" "<MARKS2>" 
#And Enter the cutoff & rejection percentage "<cuttoffpercentage>" "<rejectionpercentage>"
#And click on submit
#And Click on  Collect Answers icon on candidate card.
#And Fill all the Questions answers 
#And click on submit
#And Click on screening tab
#Then verify the status of candidate 
#And click on close button
#And click on close job button and delete the job
#
#Examples:
#
#| Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews |    CandidateEmail        |  Name   |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode | Salaryoffered | distance | permanentAddress | relocate | QUESTION1      | QMARKS1  | ANSWER1 | ANSWER2 | MARKS1  | MARKS2 | cuttoffpercentage | rejectionpercentage |
#| Engineer | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              | candidate03@gmail.com    | can03   |   912349699666   |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000        | 4        | No               | No       |  NP Negotiable |  100     |  Yes    |   No    |  100    |  0     |   80              |      20             |

# 125 

# If DB clear, register the employer first = employermain01@gmail.com. otherwise no change required


#@BVT
#Scenario Outline: To verify that Questionnarie and Screening tab not displayed when log in with Agency and To verify 'Interviewer'dropdown 
#on Schedule interview popup when login with Agency
#
#Given Open browser
#And click on Login link
#And click on Employer-Agency SignIn link
#And login with Agency credential
#And Go to Workbench 
#And Add a new Job as agency "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
#And Select the same job from job drop down
#And Add Candidate to that job "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
#And upload candidate resume
#And Click on save button
#And Verify that Questionnarie and Screening tab is not displayed when login with Agency
#And Click on Schedule interview icon 
#And Click interviewer from Interviewer drop down "<interviewer>"
#And Fill all mandatory details "<title>" "<scheduleon>" "<hour>" "<minute>" "<interviewduration>" "<timezone>"
#And click on submit
#And click on close button
#And click on close job button and delete the job
#And click on employer tab and delete the employer
#
#Examples:
#| Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews | interviewer | title     | scheduleon  | hour | minute | interviewduration | timezone             |   CandidateEmail        |Name    |ContactNumber|Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|
#| Engineer | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              | emp         | Interview |  25/12/2020 | 11   | 30     |  1 hour           | Indian Standard Time | candidate01@gmail.com   |can01   |8956652538   |jr.developer  |04/08/1999      |Female  |No            |25          |2.0       |400000|800000     |India  |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      | 

# 109, 137


#Change interview date and time
# If DB clear, register the agency first = agencymain01@gmail.com. otherwise no change required
  
  
  
 
#REGRESSION TCs  



#@Regression
#Scenario Outline: To verify the functionality of Update Profile page of candidate
#	
#Given Open browser
#And click on Login link
#When click on Employer-Agency SignIn link
#And login with Employer credential.
#And Go to Workbench
#And Add a new Job as employer "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
#And Select the same job from job drop down
#And click on Add Candidate button
#And enter email id of candidate which is not registered previously and click on Find button "<CandidateEmail>" 
#And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
#And upload candidate resume and click on save button
##And click on Yes button if probability related fields are not filled and observe
#Then user should able to add new candidate and candidate should get added in New column
#And logout as employer and login as new candidate added by employer "<CandidateEmail>" "<password>"
#And click on ok button of confirmation popup
#And Click on Profile tab
#Then verify the Auto Populated fields on candidate update profile popup window
#And Select the On Notice Period field and set Last working day on Update Profile page "<LastWorkingDay>"
#And set looking for job as yes
#And Click on save btn 
#And click on ok button
#And click on Skills & Roles tab
#And add skill, expertise level and certificate "<Skill1>" "<ExpertiseLevel>"
#And add same skill, expertise level and certificate "<Skill2>" "<ExpertiseLevel>"
#And Click on save btn 
#Then Verify that user get an alert message as "Same skill entered more than one time." for adding duplicate skills
#And click on ok button
#And delete duplicate skill
#And Now Click on Add Skill button to add more than ten skills
#Then Verify that user get an alert message as "Skills adding limit is 10." for adding more than ten skills
#And click on ok button
#And click on Delete Skill button in front of any skill for candidate
#And click on Add Role button
#And add duplicate role "<JobRole>"
#And Click on save btn for role 
#Then Verify that user get an alert message as "Same role entered more than one time." for adding duplicate roles
#And click on ok button
#And delete duplicate role
#And Now Click on Add Role button to add more than ten skills
#Then Verify that user get an alert message as "Roles adding limit is 10." for adding more than ten roles
#And click on ok button
#And click on Delete Role button in front of any role for candidate
#And click on Personal & Professional tab
#And set looking for job as No
#And Click on save btn 
#And click on ok button
#And logout as candidate and login as same employer 
#And go to workbench and select the same job
#And click on close job button and delete the job
#And close the browser
#
# 
# 
# Examples:
#	| Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews |  CandidateEmail  |  Name   |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate| password | LastWorkingDay | Skill1 | Skill2 | ExpertiseLevel |
#	| Engineer | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              |  NR10@gmail.com  | nr10    |   91345799666    |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     | 12345    | 1/9/2020       | Java   | Java   |  Expert        |
#	 
# TC :- 25,64,104,129,296        [Job candidate Workflow Regression TC] 
# TC :- 36,37,38,39,92,228,229   [Job Candidate Workbench BVT TC ]
  
  
  
 Scenario Outline: To verify the Notice Period field on candidate page
	
Given Open browser
And click on Login link
When click on Employer-Agency SignIn link
And login with Employer credential.
And click on Workbench tab and observe Add Candidate button
And Add a new Job as employer "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
And Select the same job from job drop down
And select job from Jobs drop down and observe Add Candidate button
And click on Add Candidate button
And Enter valid "<CandidateEmail>" 
And click on find button
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume
And click on Close button
Then confirmation popup message should display with Yes and No buttons and Click on No button
And Click save button
And Click on Edit Candidate icon on candidate card "<Name>"
And change the set notice period days
And click on Close button
Then confirmation popup message should display with Yes and No buttons and Click on No button
And Click on save btn
And Click on Edit Candidate icon on candidate card "<Name>"
And Select the On Notice Period field and set Last working day on Update Profile page "<LastWorkingDay>"
And Click on save btn
And click on close job button and delete the job
	
Given Open browser
And click on Login link
When click on Employer-Agency SignIn link	
And login with Agency credential
And click on Workbench tab and observe Add Candidate button	
And Add a new Job as agency "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
And Select the same job from job drop down
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume
And click on Close button
Then confirmation popup message should display with Yes and No buttons and Click on No button
And Click save button
And Click on Edit Candidate icon on candidate card "<Name>"
And change the set notice period days
And click on Close button
Then confirmation popup message should display with Yes and No buttons and Click on No button
And Click on save btn
And Click on Edit Candidate icon on candidate card "<Name>"
And Select the On Notice Period field and set Last working day on Update Profile page "<LastWorkingDay>"
And Click on save btn
And click on close job button and delete the job
And click on employer tab and delete the employer
	
Examples:
      
| Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews |  CandidateEmail        |  Name       |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|LastWorkingDay |
| Engineer | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              |  petertom09@gmail.com  | PeterTom09  |   91345799666    |   Software Tester |  04/08/1999 | Male   |     No         |     0        |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     | 30/09/2020    |
#TC ID: 59,70,134,263
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  