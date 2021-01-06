Feature: Job Candidate Workflow feature

@cleanup
Scenario Outline: cleanup

Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench 
And close all job  
Examples:
|Username      |Password|
|pemp@gmail.com|12345   |
|pagy@gmail.com|12345   |


@BVTC @JCWF @JCWFbvt1
Scenario Outline: Verify the functionality of Add, Edit & Delete Candidate with Employer login

Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench     
And Add job
|title    |agytitle      |designation |industry   |jobrole        |location |budget |minexp|maxexp|minsal|maxsal|totalinterviews|organization|functionalArea|
|Jcwfex   |Jcwfagyex     | developer   |IT software|java developer |pune     |400000 |1     |2     |400000|500000|4|talentxpert|java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And observe candidate is getting added in New column  
And Click on Edit Candidate icon on candidate card "<Name>"
And Make the changes in "<contactnumber1>" field
And Click on save button to save the update details
Then click on Delete Candidate icon on Candidate card "<Name>"
And Verify candidate is displayed on workbench after deleting


Examples: 
|Username       |Password |		CandidateEmail      |  Name   |    ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber1   |
|pemp@gmail.com | 12345   | candidate14@gmail.com   | Can14   |   9125671966     |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789       |
|pagy@gmail.com | 12345   | candidate14@gmail.com   | Can14   |   9125671966     |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789       |

  
# TC ID 55, 28, 233 [Job Candidate Workflow BVT TC]
  
# If DB clear, register the employer first = employermain01@gmail.com and agency = agencymain01@gmail.com . 
#otherwise no change required

  
@BVTC @JCWFbvt2 @Questionary @JCWF
Scenario Outline: Verify the functionality of Add Questionary, Edit question on questionary page and delete Questionary by Delete Questionnaire button and Delete icon.

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench 
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
And Enter the cutoff & rejection percentage "<cuttoffpercentage>" "<rejectionpercentage>" 
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
And click on ReloadCandidate button
Then Collect Answer icon should not reflect on candidates card for giving answers 

Examples:
|Username       |Password |		CandidateEmail      |  Name       |    ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber1   | QUESTION1     | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | QUESTION2    | QMARKS2 | ANSWER3 | ANSWER4 | MARKS3 | MARKS4 |QUESTION3  | QMARKS3 | ANSWER5 | ANSWER6     | MARKS5 | MARKS6 | cuttoffpercentage | rejectionpercentage | question      | OrganizationName |
|pemp@gmail.com | 12345   | hirecan15@gmail.com     | hirecan14   |   9125671966      |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789        | NP Negotiable |  50     |  Yes    |   No    |  30    |  20    |Can Relocate? | 50      |  Yes    |  No     |  50    |   0    | Work Exp  |  100    | Fresher | Experienced | 50     |  50    |   80              |      20             | NP Negotiable |  EmpOrg          |

#TC :- 120, 122, 138, 234 [Job Candidate Workflow BVT TC]
#TC :- 136 [Job Candidate Workflow Regression TC]

# If DB clear, register the employer first = employermain01@gmail.com. otherwise no change required

 
@BVTC @JCWFbvt3 @JCWF
Scenario Outline: Verify the functionality of Screening tab 

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench 
And Add job
|title  	   	 |agytitle   		   |designation  |industry   |jobrole        |location |budget |minexp|maxexp|minsal|maxsal|totalinterviews|organization|functionalArea|
|Jcwf Screening1 |Jcwfagy Screening1 3 | developer   |IT software|java developer |Pune     |400000 |1     |2     |400000|500000|4|talentxpert|java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And observe candidate is getting added in New column
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


Examples:
|Username       |Password |		CandidateEmail      |  Name   |    ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber1   | QUESTION1     | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | QUESTION2    | QMARKS2 | ANSWER3 | ANSWER4 | MARKS3 | MARKS4 |QUESTION3  | QMARKS3 | ANSWER5 | ANSWER6     | MARKS5 | MARKS6 | cuttoffpercentage | rejectionpercentage | question      | OrganizationName |
|pemp@gmail.com | 12345   | candidate14@gmail.com   | Can14   |   9125671966      |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789        | NP Negotiable |  50     |  Yes    |   No    |  30    |  20    |Can Relocate? | 50      |  Yes    |  No     |  50    |   0    | Work Exp  |  100    | Fresher | Experienced | 50     |  50    |   80              |      20             | NP Negotiable |  EmpOrg          |

#TC ID :- 125 [Job Candidate Workflow BVT TC]

# If DB clear, register the employer first = employermain01@gmail.com. otherwise no change required



#@BVTC @JCWF4 
#Scenario Outline: To verify that Questionnarie and Screening tab not displayed when log in with Agency and To verify 'Interviewer'dropdown 
#on Schedule interview popup when login with Agency
#
#Given User must be registered
#
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials "<Username>","<Password>"
#And Go to Workbench 
##And close all job    
#And Add job
#|title  |agytitle   |designation |industry   |jobrole        |location |budget |minexp|maxexp|minsal|maxsal|totalinterviews|organization|functionalArea|
#|Jcwf 4 |Jcwfagy 4 | developer   |IT software|java developer |Pune     |400000 |1     |2     |400000|500000|4|talentxpert|java|
#And Select a added job
#And Click on add candidate
#And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
#And observe candidate is getting added in New column
#And Verify that Questionnarie and Screening tab is not displayed when login with Agency
#And Click on Schedule interview icon 
##And Click interviewer from Interviewer drop down "<interviewer>"
#And Fill all mandatory details "<title>" "<scheduleon>" "<hour>" "<minute>" "<interviewduration>" "<timezone>" "<interviewer>"
#And click on submit
#And click on close button

#Examples:
#|Username       |Password |		CandidateEmail      |  Name   |    ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber1   | interviewer | title     | scheduleon  | hour | minute | interviewduration | timezone                                       |
#|pagy@gmail.com | 12345   | candidate14@gmail.com   | Can14   |   9125671966      |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789        | emp         | Interview |  25/12/2020  | 11   | 30     |  1 hour           | (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi |

#TC ID :- 109, 137 [Job Candidate Workflow BVT TC]

#Examples:
#| JobTitle | JobDesignation   | Industry    | MinExp | MaxExp | MinSalary  | MaxSalary | NoOfInterviews | JobNoticePeriod  |  JobSkill1  |  JobSkill2  | interviewer | title     | scheduleon  | hour | minute | interviewduration | timezone             |   CandidateEmail         |Name     |ContactNumber|Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate| OrganizationName |
#| Engineer | Test Engineer    | IT-Software | 2      | 3      |  500000    | 600000    | 3              |    60            | Agile       |    Java     | emp         | Interview |  25/12/2020 | 11   | 30     |  1 hour           | Indian Standard Time | candidate020@gmail.com   |can020   |8956652538   |jr.developer  |04/08/1999      |Female  |No            |25          |2.0       |400000|800000     |India  |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |  EmpOrg          |



#Change interview date and time
# If DB clear, register the agency first = agencymain01@gmail.com. otherwise no change required
  

#REGRESSION TCs

@Regression @reg1 @JCWF
Scenario Outline: To verify the functionality of Update Profile page of candidate

Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		      |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 5           |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"
And logout as employer and login as new candidate added by employer "<CandidateEmail>" "<Password>"
#And click on ok button of confirmation popup
And Click on Profile tab
Then verify the Auto Populated fields on candidate update profile popup window "<Username>","<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<relocate>"
And Select the On Notice Period field and set Last working day on Update Profile page "<OnNoticePeriod>","<LastWorkingDay>"
And set looking for job as yes
And Click on save btn
And click on ok button
And click on Skills & Roles tab
And add skill, expertise level and certificate "<Skill1>" "<level1>"
And add same skill, expertise level and certificate "<Skill1>" "<level1>"
And Click on save btn for skill
Then Verify that user get an alert message as "Same skill entered more than one time." for adding duplicate skills
And click on ok button
And delete duplicate skill
And click on ok button
And Now Click on Add Skill button to add more than ten skills
Then Verify that user get an alert message as "Skills adding limit is 10." for adding more than ten skills
And click on ok button
And click on Delete Skill button in front of any skill for candidate
And click on Add Designation button
And add duplicate designation "<Designation>" 
And Click on save btn for designation 
Then Verify that user get an alert message as "Same designation entered more than one time." for adding duplicate designations
And click on ok button
And delete duplicate designation
And Now Click on Add designation button to add more than ten designation
#And Click on save btn for designation
Then Verify that user get an alert message as "Designations adding limit is 10." for adding more than ten designation
And click on ok button
#And click on Delete designation button in front of any designation for candidate
And click on Personal & Professional tab
And set looking for job as No
And Click on save btn
And click on ok button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"

Examples:
|Username      |Teamid         |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod |LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|functionalArea|
|pemp@gmail.com|pe1@gmail.com  |12345    |hirecan37@gmail.com |jr software developer|hirecan37|9899648538    |Sr.developer  |14/02/1995      |Female  |Yes            |25          |01/09/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |java|

# TC :- 25,64,104,129,296        [Job candidate Workflow Regression TC] 
# TC :- 36,37,38,39,92,228,229   [Job Candidate Workbench BVT TC ]

#change email id of candidate [enter candidate email id not presnet in system]
  
#  change email id evrytime new one

@Regression @reg2 @JCWF
Scenario Outline: To verify the Notice Period field on candidate page 
Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		     |agytitle    |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 6          |JCFW Agy 6  |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"
And Click on Edit Candidate icon on candidate card "<Name>"
And change the set notice period days "<NoticePeriod1>" 
And click on Close button
Then confirmation popup message should display with Yes and No buttons and Click on No button
And Click on save button to save the updated changes
And if confirmation popup is displayed click on ok button
And Click on Edit Candidate icon on candidate card "<Name>"
And verify that notice period field is having updated notice period "<NoticePeriod1>"
And Set on Notice period field as "Yes" and enter "<LastWorkingDay>"
And Click on save button to save the updated changes
#And if confirmation popup is displayed click on ok button
And Click on Edit Candidate icon on candidate card "<Name>"
And verify that on Notice period field is set as "Yes"
And Set on Notice period field as "No" and enter "<NoticePeriod>"

Examples:
|Username       |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|NoticePeriod1|LastWorkingDay  |experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|functionalArea|
|pemp@gmail.com |12345    |hirecan60@gmail.com |jr software developer|hirecan60|9455866385    |Sr.developer  |14/02/1995      |Female  |No            |25          |45           |2/1/2021        |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |java|
|pagy@gmail.com |12345    |hirecan61@gmail.com |jr software developer|hirecan61|6796485538    |Sr.developer  |14/02/1995      |Female  |No            |25          |45           |2/1/2021        |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |java|


#TC ID: 59,70,134,263  [Job candidate Workflow Regression TC]

# If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com .
# Change the candidate name & email everytime, add a new candidate which is not present in system
# Also check the last working day 
  
  
@Regression @reg3 @JCWF
Scenario Outline: Verify user is able to add comment for candidate

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		    |agytitle    |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 7         |JCFW Agy  |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"
And Click on Comment icon from candidate card to add comment "<Name>"
And Add a comment greater than 512 characters
Then Verify that user get an error message as "Comment to be max 512 characters." for adding comment greater than specified characters
And error message should display and Save button should be disabled
And add comment with or below 512 characters and click on Save button
Then comment should get added below Save button with Delete Comment icon
And click on Delete Comment icon to delete the comment and comment should get deleted
And click on Close button


Examples:
|Username       |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com |12345    |hirecan22@gmail.com |jr software developer|hirecan22|4855866385    |Sr.developer  |14/02/1995      |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
|pagy@gmail.com |12345    |hirecan21@gmail.com |jr software developer|hirecan21|7896485538    |Sr.developer  |14/02/1995      |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |

#TC : 317     [Job candidate workfloww Regression TC]
# If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com . otherwise no change required


@Regression @reg4 @JCWF
Scenario Outline: Verify user able to move rejected candidate from Rejected column to any other column

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		      |agytitle    |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|Jcwf8new         |JCFWagy 81  |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"
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

Examples:     
|Username       |Password  |  CandidateEmail       |  Name      |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  QUESTION1          | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | cuttoffpercentage | rejectionpercentage | OrganizationName |Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com |12345     |  hirecan23@gmail.com  | Cherry03   |   91345799666    |   Software Tester |  04/08/1999 | Male   |     No         |     0        |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     | Ready to Relocate ? | 100     |  Yes    |  No     | 100    | 0      | 80                |  20                 | EmpOrg           |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |


# TC :- 292 [Job candidate workfloww Regression TC]

# If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com . otherwise no change required


@Regression @reg5 @JCWF
Scenario Outline: Verify one after one rejected candidate listed in Rejected Column

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		   |agytitle    |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 91       |JCFWagy 9  |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"
And Click on add candidate
And Enter All details of "<CandidateEmail1>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"
And move both candidates in Interview Pending one column
And Click on Reject Candidate icon from candidate card and reject that candidate "<Name>"
Then Observe candidate get moved in Rejected column automatically
And Click on Reject Candidate icon from candidate card for second candidate "<Name1>"
And click on No from confirmation popup and observe
And Click on show all rejected candidate checkbox
Then both candidates should not display in same column


Examples:
|Username       |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|CandidateEmail1    |ContactNumber1|Name1    |
|pemp@gmail.com |12345    |hirecan22@gmail.com |jr software developer|hirecan22|4855866385    |Sr.developer  |14/02/1995      |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |hirecan24@gmail.com|8789566562    |hirecan24|


# TC :- 467 [Job candidate workfloww Regression TC]

# If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com . otherwise no change required


@Regression @reg6 @JCWF
Scenario Outline: To verify the functionality of Upload Resume on emp/agy profile
	
Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		      |agytitle     |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 101         |JCFW Agy 101  |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"	
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


Examples: 
|Username            |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com      |12345    |hirecan21@gmail.com |jr software developer|hirecan21|4855866385    |Sr.developer  |14/02/1995      |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
|pagy@gmail.com      |12345    |hirecan22@gmail.com |jr software developer|hirecan22|7896485538    |Sr.developer  |14/02/1995      |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |


@Regression @reg7 @JCWF
Scenario Outline: To verify the functionality of Upload Resume on candidate profile
	
Given User must be registered

When title of login page is Home
And click on Job Seeker(Candidate) Sign In link
And enter candidate email and password "<CandidateEmail>" "<Password>" 
And click on Signin button
And Click on Profile tab
Then verify the Auto Populated fields on candidate update profile popup window "<Username>","<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<relocate>"
And Add mandatory details on candidate profile page and save the details "<jobtype>" "<shift>"
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

Examples:
|Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation          |Date            |Gender  |OnNoticePeriod |NoticePeriod|LastWorkingDay  |experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|jobtype               |shift         |
|12345    |hirecan15@gmail.com |jr software developer|hirecan15|7895456523    |Senior Web Designer  |14/02/1995      |Male    |No            |25          |01/09/2021      |0         |800000|800000     | India |wardha|sindi  |529599 |Email             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft     |advanced version    | Contractual Full Time| Evening Shift|


# TC ID :- 26 [Job candidate workfloww Regression TC]
# Change the candidate name & candidate email every time


@Regression @reg8 @JCWF
 Scenario Outline: To verify user is able to update skills and No. of Interviews for the job with Employer login
	
Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		     |agytitle     |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 11         |JCFWagy 11   |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"	
And click on Edit Job button to update skills and number of interview
And select number of interview except previously selected number "<NoOfInterviews1>"
And click on submit button
And again click on Edit Job button and observe the number of interviews "<NoOfInterviews1>"
And click on Add Skill button and add one new skill "<Skill4>"
And Click on Edit Candidate icon on candidate card "<Name>"
Then Newly Added skills should be reflect in candidate profile which are already added for that job "<Skill4>"
And Click on close button

Examples: 
|Username            |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|NoOfInterviews1|Skill4|
|pemp@gmail.com      |12345    |hirecan26@gmail.com |jr software developer|hirecan26|7895866385    |Sr.developer  |19/04/1995      |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |5			   |Spring|   
    
#Reg TC ID: 112,324 [Job candidate workfloww Regression TC]
# If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com . otherwise no change required
    

@Regression @reg9 @JCWF
Scenario Outline: To verify deleted skill on Candidate Details page and when employer is adding new candidate for the job
  
Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		      |agytitle     |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 9B          |JCFW Agy 13  |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"	
And Click on Candidate name from candidate card and observe the skills 
And click on Close button from candidate Details page
And click on Edit Job button to make changes in job
And Delete one skill from Skills section
And click on submit button
And Click on Edit Candidate icon on candidate card "<Name>"
And observe deleted skill not displayed "<Skill3>"
And click on Close button from Edit Candidate page
And Click on Candidate name from candidate card and observe the skills
Then deleted skills should display on Candidate Details page "<Skill3>"
And click on Close button from candidate Details page
And click on Edit Job button to make changes in job
And delete all added skills
And click on submit button
And Click on add candidate
And Enter valid "<CandidateEmail1>"
And click on find button
And click on ok button
Then observe deleted job skill should not show when employer is going to add new candidate "<Skill1>" "<Skill2>" "<Skill3>"
And Click on close button

Examples: 
|Username            |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|CandidateEmail1    |
|pemp@gmail.com      |12345    |hirecan27@gmail.com |jr software developer|hirecan27|9875866385    |Sr.developer  |19/04/1995      |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |hirecan26@gmail.com|   
   
   #Reg TC ID: 335,349 [Job candidate workfloww Regression TC]
   # If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com . otherwise no change required
   

@Regression @reg10 @JCWF
Scenario Outline: Verify the functionality of adding a candidate to the job that is shared by agency team member
    
Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<email address>","<Password>"
Given team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<agyteam>","<Password>"
And click on Workbench tab
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		      |agytitle      |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 14         |JCFW Agy 14  |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<email address>","<Password>"
And click on Workbench tab
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"	

Examples:
|    email address    |  Password  |agyteam      |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|CandidateEmail1    |
|  pagy@gmail.com     |   12345    |pa1@gmail.com|hirecan27@gmail.com |jr software developer|hirecan27|9875866385    |Sr.developer  |19/04/1995      |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |hirecan26@gmail.com|   

#Reg TC ID: 239  [Job candidate workfloww Regression TC]

# If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com . otherwise no change required

@Regression @reg11 @JCWF
Scenario Outline: Verify functionality of bell icon on candidate card.

Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		     |agytitle     |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 14         |JCFWagy 14  |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Enter All details except skills "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>"
And enter as expertise level as "Not Answered"
And Click on Save Button
Then The candidate whose skill expert level is set as Not answer for that candidate card there should show bell icon
And Click on Edit Candidate icon on candidate card "<Name>"
And select different expertise level for the skill which is having expert level as not answer "<level1>" "<level2>" "<level2>"
And Click on save button for edit candidate
And click on ReloadCandidate button
Then when user set expertise level other than Not answer in edit candidate at that time bell icon should removed from candidate card

Examples: 
|Username            |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|CandidateEmail1    |Nolevel1     |Nolevel2|
|pemp@gmail.com      |12345    |hirecan30@gmail.com |jr software developer|hirecan30|9545866385    |Sr.developer  |19/04/1995      |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  |Intermediate  | Expert | Mandatory |Preferred |Optional  |No          |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |hirecan26@gmail.com| Not Answered|Not Answered|
 
#  TC :- 374  [Job candidate workfloww Regression TC]

# If DB clear, register the employer & agency first, employermain01@gmail.com & agencymain01@gmail.com . otherwise no change required

@Regression @reg12 @JCWF
Scenario Outline: Verify there is asking reason when user manually drag the candidate card in rejection column from employer login, employer team member login, agency login, agency team member login

Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		      |agytitle        |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 121         |JCFW Agy 122   |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"	
And Drag the candidate card from that column to rejected column
And confirmation popup should diplay with Yes and No button and click on Yes buton "<Name>"
And select the reason of rejection and cick on submit button
And Click on show all rejected candidate checkbox
Then drag the candidate card from rejected column to any other column
And Add team member
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Teamid>","<Password>"
And Go to Workbench 
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		       |agytitle       |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 121          |JCFW Agy 121   |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail2>","<Name2>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name2>"	
And Drag the candidate card from that column to rejected column
And confirmation popup should diplay with Yes and No button and click on Yes buton "<Name2>"
And select the reason of rejection and cick on submit button
And Click on show all rejected candidate checkbox
Then drag the candidate card from rejected column to any other column

Examples: 
|Username          |Teamid         |Password |CandidateEmail      |CandidateEmail2    |profiletitle         |Name     |Name2    |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|CandidateEmail1    |Nolevel1     |Nolevel2|
|pemp@gmail.com    |pe1@gmail.com  |12345    |hirecan48@gmail.com |hirecan49@gmail.com|jr software developer|hirecan48|hirecan49|7895866385    |Sr.developer  |19/04/1995      |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  |Intermediate  | Expert | Mandatory |Preferred |Optional  |No          |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |hirecan26@gmail.com| Not Answered|Not Answered|
|pagy@gmail.com    |pa1@gmail.com  |12345    |hirecan50@gmail.com |hirecan51@gmail.com|jr software developer|hirecan50|hirecan51|7985866385    |Sr.developer  |19/04/1995      |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  |Intermediate  | Expert | Mandatory |Preferred |Optional  |No          |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |hirecan26@gmail.com| Not Answered|Not Answered|
 
# TC = 533
