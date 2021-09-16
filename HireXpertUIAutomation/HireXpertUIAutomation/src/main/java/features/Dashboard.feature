Feature: Dashboard 

@Dashboard
Scenario Outline: To Verify user can able to search job,sort job, filters & Summary functionality 
on dashboard (Employer/agency)
Given User logged in to HireXpert "<Username>" and "<Password>" 
And On Dashboard open add dialog and enter all required fields
| title     | agytitle         | designation  | industry    |budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | 
| Developer | Agynew Developer | developer1   | IT software |400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        |
When Job provider clicks on the Submit button.
Then Added job should display in the Jobs section 
And Add Two-Three more jobs
| title     | agytitle         | designation  | industry    | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | 
| Developer | Agynew Developer | developer1   | IT software | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        |
And Job related updates should display in Latest Updates section on dashboard
And Search or enter any value/text related to job
Then Data should be display accordingly in “Latest job” section
And Now click on the “filters & Summary” icon
And Apply some filter criteria and hit the “Apply filter” button
Then Data should be display according to the filter set criteria
And Now click on the Clear filter icon
Then Default Job data should display
And Now search the job
Then Job which is searched should display in Jobs section
Examples: 
| Username       | Password | 
|pemp@gmail.com  | 12345    | 	
|pagy@gmail.com  | 12345    |

@Dashboard
Scenario Outline: Verify upcomings interviews on dashboard(Employer/agency)
Given User logged in to HireXpert "<Username>" and "<Password>" 
And On Applicant Tracking,Open add job dailog and fill all details
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
When User click on submit button
Then Added job should display in Job drop-down
And Add one candidate for that job "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
Then Newly added candidate should display in applicant tracking page as well as in “Upcoming Interviews” section on dashboard"<Title>" "<scheduleon>" "<Hour>" "<Minute>" "<DurationHour>" "<DurationMinute>" "<TimeZone>" "<interviewerName>" "<interviewerEmail>"
And User should be able to view all the interview details in read only mode after clicking on “View” link on dashboard
And Click on the “More Interviews” link and edit the interview details "<interviewerName1>" "<DurationMinute1>"
Then Updated interview details should also display on interview tab, applicant tracking and on dashboard page "<Name>" 
And Now Share job with employer employee "<Team>"
And Click on Employer-Agency Signin link "<Teamid>", "<Password>"
And At employee side, Add one candidate into that job which is shared by employer and move the candidate card into new column "<CandidateEmail1> ","<Name1>","<ContactNumber1>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"" 
And Schedule one interview for that candidate "<Title>" "<scheduleon>" "<Hour>" "<Minute>" "<DurationHour>" "<DurationMinute>" "<TimeZone>" "<interviewerName>" "<interviewerEmail>"
Then At employer side,candidate added by employee member and Scheduled Interview details should be display on applicant tracking, Interviews tab and also on dashboard page 
Examples: 
|Username        |Password | CandidateEmail   |CandidateEmail1   |  Name     |Name1|ContactNumber |ContactNumber1|Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber   | Title      | Hour | Minute |  DurationHour  | DurationMinute|TimeZone                     					 | hour | DurationMinute1  | scheduleon   |scheduleon1 |interviewerName|interviewerEmail |interviewerName1|Team|Teamid|     
|pemp@gmail.com | 12345   | hirecan01@gmail.com| hirecan02@gmail.com|hirecan04 | hirecan02|9125671966 |9125671969 |Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789       | Interview1 | 20   | 00     |   0			  |   15 Minutes  |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi   |  20  | 30 Minutes       | 20/5/2021   |23/5/2021        |pe2			       |pe2@gmail.com         |pemp2   |pe2|pe2@gmail.com|
#|pagy@gmail.com | 12345   | hirecan03@gmail.com |hirecan04@gmail.com| hirecan03 |hirecan04 |9125671966 | 9125671969|Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789       | Interview1 | 20   | 00     |   0     		  |   15 Minutes  |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi   |  20  | 30 Minutes       | 20/5/2021   |23/5/2021  |pe1            |pe1@gmail.com   |pemp1		|pa1|pa1@gmail.com|










