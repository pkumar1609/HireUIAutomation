Feature: Hire Express 

@HireExpress
Scenario Outline: To verify user can add job,add candidate to that job, close that job, clone the job
Given Open browser
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to HireExpress
And Click on add job button on hireXpress page
And Add job from hire Express
|designation  |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|developer    |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert   |rahitech       |Java          |
And Click on Add Candidate button on hireExpress
And select the added job
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"

 Examples: 
|Username       |Password |		CandidateEmail      |  Name       |    ContactNumber |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber   | Title      | Hour | Minute |  Duration  | TimeZone                     					    | hour | duration   | scheduleon   |scheduleon1 |interviewerName|interviewerEmail|
|pemp@gmail.com | 12345   | hirecan15@gmail.com     | hirecan15   |   9125671966     |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789       | Interview1 | 20   | 00     | 15 Minutes |   (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi   |  20  | 30 Minutes | 20/3/2021   |23/3/2021  |pe2			  |pe2@gmail.com   |
|pagy@gmail.com | 12345   | hirecan16@gmail.com     | hirecan16   |   9125671966     |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789       | Interview1 | 20   | 00     | 15 Minutes |   (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi   |  20  | 30 Minutes | 20/3/2021   |23/3/2021  |pe1            |pe1@gmail.com   |

