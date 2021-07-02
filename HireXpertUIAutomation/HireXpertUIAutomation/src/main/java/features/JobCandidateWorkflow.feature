Feature: Job Candidate Workflow feature


@JCWF
Scenario Outline: Verify the functionality of Add, Edit & Delete Candidate with Employer login
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench   
And Click on add job button  
And Add job
|title    |agytitle   |designation |industry   |jobrole         |location |budget |minexp|maxexp|minsal|maxsal|totalinterviews|organization|functionalArea|
|Jcwfex   |Jcwfagyex  | developer   |IT software|java developer |pune     |400000 |1     |2     |400000|500000|4|talentxpert|java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And observe candidate is getting added in New column  
And Click on Edit Candidate icon on candidate card "<Name>"
And Make the changes in "<contactnumber1>" field
And Click on save button to save the update details
Examples: 
|Username       |Password | CandidateEmail        |  Name | ContactNumber | Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber1   |
|pemp@gmail.com | 12345   | candidate14@gmail.com | Can14 | 9125671966    | Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789       |
|pagy@gmail.com | 12345   | candidate14@gmail.com | Can14 | 9125671966    | Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789       |


@JCWF
Scenario Outline: To verify the functionality of Update Profile page of candidate
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Click on add job button
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		      |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |  Email         | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 5           |developer        |IT software |pune     |400000 |3     |7     |350000|800000|pe1  | pe1@gmail.com  | 1234564  |2			     |Hirexpert   |rahitech       |Software Programming|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And verify candidate card is displaying or not in New column "<Name>"
And logout as employer and login as new candidate added by employer "<CandidateEmail>" "<Password>"
And Click on Profile tab
Then verify the Auto Populated fields on candidate update profile popup window "<Username>","<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<relocate>"
And Add mandatory details on candidate profile page and save the details "<Jobtype>" "<Shift>" "<ProfileTitle>"
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
And Now Click on Add Skill button to add more than ten skills for candidate
Then Verify that user get an alert message as "You can not add more than 10 skills." for adding more than ten skills
And click on ok button
And click on Delete Skill button in front of any skill for candidate
And click on Add Designation button
And add duplicate designation "<Designation>" 
And Click on save btn for designation 
Then Verify that user get an alert message as "Same designation entered more than one time." for adding duplicate designations
And click on ok button
And delete duplicate designation
And Now Click on Add designation button to add more than ten designation
Then Verify that user get an alert message as "You can not add more than 5 designations." for adding more than ten designation
And click on ok button
And click on Personal & Professional tab
And set looking for job as No
And Click on save btn
And click on ok button
Examples:
|Username        |Teamid         |Password |CandidateEmail       | ProfileTitle          |Name      |ContactNumber |Designation  |Date       |Gender |OnNoticePeriod|NoticePeriod |LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1 |Skill2       |Skill3    |level1         |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2         |remark3         |certificateforskill1|certificateforskill2|functionalArea|Jobtype               |Shift         |
|pemp@gmail.com  |pe1@gmail.com  |12345    |hirecand18@gmail.com | Jr software developer |hirecand18| 9891008789   |Sr.developer |14/02/1995 |Female |Yes           | 25          |01/09/2021    |4         |600000|800000     | India |Mumbai|Thane    |455966 |Call             | 770000      |4       |No              |No      |JAVA   |Advanced java|JavaScript|Basic Knowledge| Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|Spring, Hybernet|Advanced version|Sun microsoft       |Advanced version    |Java          |Contractual Full Time |Mid-Day Shift |


# TC :- 25,64,104,129,296        [Job candidate Workflow Regression TC] 
# TC :- 36,37,38,39,92,228,229   [Job Candidate Workbench BVT TC ]

 @JCWF
Scenario Outline: To verify the Notice Period field on candidate page 
Given User must be registered
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
And verify candidate card is displaying or not in New column "<Name>"
And Click on Edit Candidate icon on candidate card "<Name>"
And Set on Notice period field as "No" and enter "<NoticePeriod>"
And Click on save button to save the updated changes
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
And Click on Edit Candidate icon on candidate card "<Name>"
And verify that on Notice period field is set as "Yes"
Examples:
|Username       |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|NoticePeriod1|LastWorkingDay  |experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|functionalArea|
|pemp@gmail.com |12345    |hirecan60@gmail.com |jr software developer|hirecan60|9455866385    |Sr.developer  |14/02/1995      |Female  |No            |25          |45           |2/1/2021        |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |java|
|pagy@gmail.com |12345    |hirecan61@gmail.com |jr software developer|hirecan61|6796485538    |Sr.developer  |14/02/1995      |Female  |No            |25          |45           |2/1/2021        |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |java|


#TC ID: 59,70,134,263  [Job candidate Workflow Regression TC]
@JCWF
Scenario Outline: Verify user is able to add comment for candidate
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Click on add job button
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		    |agytitle  |designation |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name | Email         | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 7         |JCFW Agy  |developer   |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com | 1234564  |2			   |Hirexpert |rahitech       |java|
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


@JCWF
Scenario Outline: Verify user able to move rejected candidate from Rejected column to any other column
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Click on add job button
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		      |agytitle    |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|Jcwf8new         |JCFWagy 81  |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And Click on Reject Candidate icon from candidate card to reject the candidate "<Name>"
Then drag the candidate card from rejected column to any other column
And Click on Questionnaire tab
And Enter first question "<QUESTION1>" and marks "<QMARKS1>" 
#And Enter the answer "<ANSWER1>" "<ANSWER2>"  and enter Marks "<MARKS1>" "<MARKS2>" for first question
And Enter the answer "<ANSWER1>" "<ANSWER2>"  and enter Marks "<MARKS1>" "<MARKS2>" for first question
And click on Save Changes button
And Enter the cutoff & rejection percentage "<Cuttoffpercentage>" "<Rejectionpercentage>" 
And click on submit
Then Collect Answer icon should reflect on candidates card for giving answers
And Click on Collect Answer icon
And Fill all the Questions answers "<QUESTION1>" "<ANSWER1>"
And click on submit
And Click on Reject Candidate icon from candidate card to reject the candidate "<Name>"
And Now move that candidate from Rejected column to any other column and observe
Examples:     
|Username       |Password  |  CandidateEmail       |  Name      |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  QUESTION1          | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | Cuttoffpercentage | Rejectionpercentage | OrganizationName |Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com |12345     |  hirecan23@gmail.com  | Cherry03   |   91345799666    |   Software Tester |  04/08/1999 | Male   |     No         |     0        |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     | Ready to Relocate ? | 100     |  Yes    |  No     | 100    | 0      | 80                |  20                 | EmpOrg           |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |


@JCWF
Scenario Outline: To verify the functionality of Upload Resume on emp/agy profile	
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
Given Employee should be added
|Name|         Email   | contact  |Nameagy | Emailagy      | contact |Role           |Roleagy |
|pe1 | pe1@gmail.com   | 1234564  | pa1    | pa1@gmail.com |1234556  |Recruitment HR |Recruitment Agency Head|
|pe2 | pe2@gmail.com   | 1234564  | pa2    | pa2@gmail.com |1234566  |Recruitment HR |Recruitment Agency Head|   
And Go to Workbench
And Click on add job button
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
|Username       |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date       |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com |12345    |hirecan21@gmail.com |jr software developer|hirecan21|4855866385    |Sr.developer  |14/02/1995 |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |
|pagy@gmail.com |12345    |hirecan22@gmail.com |jr software developer|hirecan22|7896485538    |Sr.developer  |14/02/1995 |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |


@JCWF
Scenario Outline: To verify the functionality of Upload Resume on candidate profile	
Given User must be registered
When title of login page is Home
And click on Job Seeker(Candidate) Sign In link
And enter candidate email and password "<CandidateEmail>" "<Password>" 
And click on Signin button
And Click on Profile tab
Then verify the Auto Populated fields on candidate update profile popup window "<Username>","<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<relocate>"
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
|Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod |NoticePeriod|LastWorkingDay |experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1          |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2| Jobtype               | Shift        |Industry|
|12345    |hirecan18@gmail.com |jr software developer|hirecan18|9899648789    |Sr.developer  |14/02/1995      |Female  |Yes            |25          |01/09/2021     |5         |600000|800000     | India |wardha|Arvi naka  |455966 |Call             |750000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft     |advanced version      | Contractual Full Time | Evening Shift|IT-Software|


@JCWF
Scenario Outline: To verify user is able to update skills and No. of Interviews for the job with Employer login
Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Click on add job button
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		     |agytitle     |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 13         |JCFWagy 13   |developer        |IT software |pune     |400000 |2     |7     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And move the candidate card from potential candidate to new column
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
|Username       |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|NoOfInterviews1|Skill4|
|pemp@gmail.com |12345    |hirecan26@gmail.com |jr software developer|hirecan26|7895866385    |Sr.developer  |19/04/1995      |Female  |No            |25          |1/9/2021      |5         |500000|650000     | India |wardha|Arvi naka  |455966 |Call             |620000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |5			  |Spring|   
    

@JCWF
Scenario Outline: To verify deleted skill on Candidate Details page and when employer is adding new candidate for the job
Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Click on add job button
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title		      |agytitle     |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 9B          |JCFW Agy 13  |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And move the candidate card from potential candidate to new column
And verify candidate card is displaying or not in New column "<Name>"	
And Click on Candidate name from candidate card and observe the skills 
And click on Close button from candidate Details page
And click on Edit Job button to make changes in job
And Delete one skill from Skills section
And click on submit button
And Click on Edit Candidate icon on candidate card "<Name>"
And observe deleted skill not displayed "<Skill3>"
And Click on close button
And Click on Candidate name from candidate card and observe the skills
Then deleted skills should display on Candidate Details page "<Skill3>"
And click on Close button from candidate Details page
And click on Edit Job button to make changes in job
And delete all added skills
And click on submit button
And Click on add candidate
And Enter valid "<CandidateEmail1>"
And click on find button
Then observe deleted job skill should not show when employer is going to add new candidate "<Skill1>" "<Skill2>" "<Skill3>"
And Click on close button
Examples: 
|Username       |Password |CandidateEmail      | profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea  |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|CandidateEmail1    |
|pemp@gmail.com |12345    |hirecan27@gmail.com | jr software developer|hirecan27|9875866385    |Sr.developer  |19/04/1995      |Female  |No            |25          |1/9/2021      |5         |550000|670000     | India |wardha|Arvi naka |455966 |Call             |650000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|Sun Microsoft       |advanced version    |hirecan26@gmail.com|   

   
 #Reg TC ID: 335,349 [Job candidate workflow TC]
 @JCWF
Scenario Outline: Verify the functionality of adding a candidate to the job that is shared by agency with its Team member    
Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<UNAgency>","<Password>"
Given Employee should be added
|Name| Email         | contact |Nameagy  | Emailagy     | contact |Role          |Roleagy |
|pe1 | pe1@gmail.com | 1234564 | pa1    | pa1@gmail.com |1234556  |Recruitment HR|Recruitment Agency Head|
And click on Workbench tab
And Click on add job button
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title	  |agytitle     |designation |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name | Email         | contact |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 142 |JCFW Agy 142 |developer   |IT software |pune     |400000 |4     |7     |500000|700000|pe1  | pe1@gmail.com | 1234564 |2			    |Hirexpert   |rahitech       |java|
And Select a added job
And click on share with Team 
And search the team "<team>" and share job with it
And Click on close button
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<agencyTeamMbrEmail>","<Password>"
And Go to Workbench
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And move the candidate card from potential candidate to new column
And verify candidate card is displaying or not in New column "<Name>"
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<UNAgency>","<Password>"
And Go to Workbench
And Select a added job
And verify candidate card is displaying or not in New column "<Name>"
And Logout from App
Examples:
| UNAgency       |Password |team |agencyTeamMbrEmail|CandidateEmail      |profiletitle         |Name      |ContactNumber|Designation |Date       |Gender |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1          |level2       |level3 |Weightage1|Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3          |certificateforskill1|certificateforskill2|
| pagy@gmail.com |12345    |pa1  | pa1@gmail.com    |hirecada01@gmail.com|jr software developer|hirecada01|9875866385   |Sr.developer|19/04/1995 |Female |No            |25          |1/9/2021      |5         |600000|700000     | India |wardha|Arvi naka  |455966 |Call             |670000       |4       |No              |No      |JAVA    |Advanced Java|JavaScript|Basic Knowledge | Intermediate| Expert| Mandatory|Preferred |Optional  |Yes         |No          |No          |provide certificate|Spring, Hybernet|Advanced version|Sun Microsoft       |advanced version    |   


@JCWF
Scenario Outline: Verify functionality of bell icon on candidate card.
Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Click on add job button
And Add job "<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>" and "<remark3>"
|title	|agytitle   |designation|industry    |location |budget |minexp|maxexp|minsal|maxsal|Name | Email         |contact |totalinterviews|organization|agyorganization|functionalArea|
|JCFW 14|JCFWagy 14 |developer  |IT software |pune     |800000 |3     |6     |450000|700000|pe1  | pe1@gmail.com |1234564 |2			  |Hirexpert   |rahitech       |java |
And Select a added job
And Click on add candidate
And Enter All details except skills "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>"
And enter as expertise level as "Not Answered"
And Click on Save Button
Then The candidate whose skill expert level is set as Not for that candidate card there should show bell icon
And Click on Edit Candidate icon on candidate card "<Name>"
And select different expertise level for the skill which is having expert level as not answer "<level1>" "<level2>" "<level2>"
And Click on save button for edit candidate
And click on ReloadCandidate button
Then when user set expertise level other than Not answer in edit candidate at that time bell icon should removed from candidate card
Examples: 
|Username        |Password |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|CandidateEmail1    |Nolevel1     |Nolevel2|
|pemp@gmail.com  |12345    |hirecan30@gmail.com |jr software developer|hirecan30|9545866385    |Sr.developer  |19/04/1995      |Female  |No            |25          |1/9/2021      |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  |Intermediate  | Expert | Mandatory |Preferred |Optional  |No          |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |hirecan26@gmail.com| Not Answered|Not Answered|
 
 
#  TC :- 374
@JCWF
Scenario Outline: Verify Rejection reason is accepted when candidate card is moved to Reject column for user employer, employer team member, agency, agency team member login
Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Logged-In user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 200000 | 400000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And move the candidate card from potential candidate to new column
And verify candidate card is displaying or not in New column "<Name>"	
And Drag the candidate card from that column to rejected column
And select the reason of rejection and cick on submit button
Then drag the candidate card from rejected column to any other column
And Go to dashboard
Given Employee should be added
|Name| Email           | contact  |Nameagy  | Emailagy       | contact |Role          |Roleagy|
|pe1 | pe1@gmail.com   | 1234564  | pa1     | pa1@gmail.com  |1234556  |Recruitment HR|Recruitment Agency Head|
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Teamid>","<Password>"
And Logged-In user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 200000 | 400000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
And Click on add candidate
And Enter All details of "<CandidateEmail2>","<Name2>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And move the candidate card from potential candidate to new column
And verify candidate card is displaying or not in New column "<Name2>"	
And Drag the candidate card from that column to rejected column
And select the reason of rejection and cick on submit button
Then drag the candidate card from rejected column to any other column
Examples:
|Username        |Teamid        |Password |CandidateEmail       | CandidateEmail1     |CandidateEmail2     |profiletitle         |Name      |Name2     |ContactNumber |Designation |Date      |Gender |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|
|pemp@gmail.com  |pe1@gmail.com |12345    |hireccan01@gmail.com | hirecan26@gmail.com |hireccan02@gmail.com|jr software developer|hireccan01|hireccan02|7895806385    |Sr.developer|19/04/1995|Female |No            |25          |1/9/2021      |2         |220000|350000     | India |wardha|Arvi naka|455966 |Call             |320000       |4       |No              |No      | 
|pagy@gmail.com  |pa1@gmail.com |12345    |hireccan03@gmail.com |hireccan04@gmail.com |hirecan26@gmail.com |jr software developer|hireccan03|hireccan04|7985816385    |Sr.developer|19/04/1995|Female |No            |25          |1/9/2021      |2.5       |280000|350000     | India |wardha|Arvi naka|455966 |Call             |330000       |4       |No              |No      |
 
