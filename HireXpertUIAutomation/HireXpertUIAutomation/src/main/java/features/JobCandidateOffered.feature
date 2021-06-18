Feature: Job Candidate Offered

@JobCandidteOffered1
Scenario Outline:  Verify Offered job candidate is displayed on the Job Offered Tab on Employer login.
Given User logged in to HireXpert "<Username>" and "<Password>" 
And Logged-In user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |   1             | Hirexpert    | rahitech        | java           |
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And click on Schedule Interview icon from candidate card
And fill all interview details and click on Submit button "<Title>" "<ScheduledOn>" "<Hour>" "<Minute>" "<DurationHour>" "<DurationMinute>" "<TimeZone>" "<InterviewerName>" "<InterviewerEmail>"
And click on close button from Interview details page
When Candidate card is dragged to Job Offered column
Then Verify on Job Offerred menu Candidate should display in the Incomplete information column "<Name>" 
And Employer is able to edit candidate from Job Offerred menu "<Name>"
Examples:
|Username       |Password| CandidateEmail          | Name           | ContactNumber | Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|OrganizationName|contactnumber|Title      | Hour | Minute |  DurationHour |DurationMinute|TimeZone                     				    |ScheduledOn|InterviewerName|InterviewerEmail|
|pemp@gmail.com | 12345  | hirecanJCO03@gmail.com | hirecanJCOF03  | 9121601966    | Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         |             | 4      | No             | No     | EmpOrg         |123456789    |Interview1 | 20   | 00     |   0			 | 15 Minutes   |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi| 18/6/2021  | pe2		     |pe2@gmail.com   |