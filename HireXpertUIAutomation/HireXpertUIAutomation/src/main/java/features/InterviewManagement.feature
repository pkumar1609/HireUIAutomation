Feature: Interview Management

@BVTC @Regression @interview
Scenario Outline: To verify the functionality of scheduled interview with Employer and Agency login
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Click on add job button
And Add job
|title          |agytitle        |designation  |industry   |jobrole         |location     |budget |minexp|maxexp|minsal|maxsal|totalinterviews|organization|functionalArea|
|Interview Job  |Interview Agy Job| developer   |IT software|java developer  |Viman nagar  |400000 |1     |2     |400000|500000|4|talentxpert|java|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And move the candidate card from potential candidate to new column
And verify candidate card is displaying or not in New column "<Name>"
And click on Schedule Interview icon from candidate card
And fill all interview details and click on Submit button "<Title>" "<scheduleon>" "<Hour>" "<Minute>" "<DurationHour>" "<DurationMinute>" "<TimeZone>" "<interviewerName>" "<interviewerEmail>"
And click on close button from Interview details page
And click on Reload Candidate button and observe
And observe the interview date and time displayed on candidate card below Assign To field "<Name>"    
And click on Reload Candidate button and observe
And click on Edit Interview icon in front of interview details like date and time
And make some changes in interview details and click on Submit button "<interviewerName>" "<DurationMinute1>"
Then User should be able to update scheduled interview details and updated details should display properly "<Name>"  
And click on close button from Interview details page
And now click on Schedule interview icon on candiadte card
And click on Edit Interview icon present on the left corner just beside of Cancel Interview icon "<Title>"
And make some changes and click on Submit button "<scheduleon1>"
And click on close button from Interview details page
And click on Reload Candidate button and observe
And observe the interview date and time displayed on candidate card below Assign To field "<Name>"
And click on Interviews tab
And Select the filters for which you want candidate interview details and click on Search button "<scheduleon1>"
Then Interview details should be reflect according to the filter applied "<scheduleon1>" "<Name>"  
Examples: 
|Username       |Password | CandidateEmail      |  Name     | ContactNumber | Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber   | Title      | Hour | Minute |  DurationHour  | DurationMinute|TimeZone                     					 | hour | DurationMinute1  | scheduleon   |scheduleon1 |interviewerName|interviewerEmail|
|pemp@gmail.com | 12345   | hirecan15@gmail.com | hirecan15 | 9125671966    | Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789       | Interview1 | 20   | 00     |   0			  |   15 Minutes  |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi   |  20  | 30 Minutes       | 20/5/2021   |23/5/2021  |pe2			  |pe2@gmail.com   |
|pagy@gmail.com | 12345   | hirecan16@gmail.com | hirecan16 | 9125671966    | Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789       | Interview1 | 20   | 00     |   0     		  |   15 Minutes  |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi   |  20  | 30 Minutes       | 20/5/2021   |23/5/2021  |pe1            |pe1@gmail.com   |


#TC ID :- 106,108,107,338
@interview
Scenario Outline: To verify the functionality of scheduled Edit and check jobUpdates for interview with Employer login
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Click on add job button
And Add job
|title          |agytitle         |designation  |industry   |jobrole        |location     |budget |minexp|maxexp|minsal |maxsal|totalinterviews|organization|functionalArea |
|Interview Job  |Interview Agy Job| developer   |IT software|Java developer |Viman nagar  |400000 |2     |4      |300000|550000| 2             |talent1xpert|Software Development|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And Move the card to Schedule Interview column
And click on Schedule Interview icon from candidate card
And fill all interview details and click on Submit button "<Title>" "<scheduleon>" "<Hour>" "<Minute>" "<DurationHour>" "<DurationMinute>" "<TimeZone>" "<interviewerName>" "<interviewerEmail>"
And click on close button from Interview details page
And click on Reload Candidate button and observe	
And observe the interview date and time displayed on candidate card below Assign To field "<Name>"    
And click on Reload Candidate button and observe
And click on Edit Interview icon in front of interview details like date and time
And make some changes in interview details and click on Submit button "<interviewerName>" "<DurationMinute1>"
Then User should be able to update scheduled interview details and updated details should display properly "<Name>"  
And click on close button from Interview details page
And now click on Schedule interview icon on candiadte card
And click on Edit Interview icon present on the left corner just beside of Cancel Interview icon "<Title>"
And make some changes and click on Submit button "<scheduleon1>"
And click on close button from Interview details page
And click on Reload Candidate button and observe
And observe the interview date and time displayed on candidate card below Assign To field "<Name>"
And click on Interviews tab
And Select the filters for which you want candidate interview details and click on Search button "<scheduleon1>"
Then Interview details should be reflect according to the filter applied "<scheduleon1>" "<Name>"  
And Interview updated entry should be created in Job update menu "<EmployerName>","<Name>"
Examples: 
|Username       |Password |EmployerName |CandidateEmail      |  Name    | ContactNumber | Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode | Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber   | Title      | Hour | Minute |  DurationHour  | DurationMinute|TimeZone                     					| hour | DurationMinute1 | scheduleon |scheduleon1 |interviewerName|interviewerEmail|
|pemp@gmail.com | 12345   | pemp        |hireddk01@gmail.com | hireddk01 | 9125671966   | Software Tester |  04/08/1999 | Male   |  No            |   30         |  2.5      | 450000 | 550000      | India  | Pune | Viman Nagar | 411014 |   SMS             | 520000      | 4      | No             | No     |   EmpOrg          |   123456789       | Interview1 | 20   | 00     |   0			  |   15 Minutes  |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi  |  20  | 30 Minutes      | 20/5/2021  |23/5/2021   |pe1			   |pe1@gmail.com|


#TC ID :- 261,118,224,813
#@interview1
Scenario Outline: To Edit Interview with Employer login
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials "<Username>","<Password>"
And Go to Workbench
And Click on add job button
And Add job
|title          |agytitle         |designation  |industry   |jobrole        |location     |budget |minexp|maxexp|minsal |maxsal|totalinterviews|organization|functionalArea |
|Interview Job  |Interview Agy Job| developer   |IT software|Java developer |Viman nagar  |400000 |2     |4      |300000|550000| 2             |talent1xpert|Software Development|
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And Move the card to Schedule Interview column
And click on Schedule Interview icon from candidate card
And fill all interview details and click on Submit button "<Title>" "<scheduleon>" "<Hour>" "<Minute>" "<DurationHour>" "<DurationMinute>" "<TimeZone>" "<interviewerName>" "<interviewerEmail>"
And click on close button from Interview details page
And click on Reload Candidate button and observe	
And observe the interview date and time displayed on candidate card below Assign To field "<Name>"   
And click on Edit Interview icon in front of interview details like date and time
And User is able to add comments
And User is able to delete the addded comment
And User is able to delete the interviewer "<interviewerEmail>"
Examples: 
|Username        |Password |EmployerName |CandidateEmail      |  Name      | ContactNumber | Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode | Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber   | Title      | Hour | Minute |  DurationHour  | DurationMinute|TimeZone                     					| hour | DurationMinute1 | scheduleon |scheduleon1 |interviewerName|interviewerEmail|
|pemp@gmail.com | 12345  | pemp        |hireddk01@gmail.com | hireddk01 | 9125671966   | Software Tester |  04/08/1999 | Male   |  No            |   30         |  2.5      | 450000 | 550000      | India  | Pune | Viman Nagar | 411014 |   SMS             | 520000      | 4      | No             | No     |   EmpOrg          |   123456789       | Interview1 | 20   | 00     |   0			  |   15 Minutes  |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi  |  20  | 30 Minutes      | 20/5/2021  |23/5/2021   |pe1			   |pe1@gmail.com|


#TC ID :- 373
@interview
Scenario Outline: To verify Interview schedule by Employer is displayed in Candidate card on Agency login
Given User logged in to HireXpert "<Username>" and "<Password>" 
Given job must be added and share with agency "<AgencyName>" 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
And Agency selects the shared job from dashboard "<AgencyName>" and "<Password>"
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And move the candidate card from potential candidate to new column
And Employer schedules interview for candidate added by agency "<Username>" and "<Password>" 
And Move the card to Schedule Interview column
And click on Schedule Interview icon from candidate card
And fill all interview details and click on Submit button "<Title>" "<scheduleon>" "<Hour>" "<Minute>" "<DurationHour>" "<DurationMinute>" "<TimeZone>" "<interviewerName>" "<interviewerEmail>"
And click on close button from Interview details page
And click on Reload Candidate button and observe	
And observe the interview date and time displayed on candidate card below Assign To field "<Name>"   
Examples: 
|Username       |Password|EmployerName |AgencyName      |CandidateEmail      |  Name     | ContactNumber| Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode | Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber   | Title      | Hour | Minute |  DurationHour  | DurationMinute|TimeZone                     					| hour | DurationMinute1 | scheduleon |scheduleon1 |interviewerName|interviewerEmail|
|pemp@gmail.com | 12345  | pemp        | pagy@gmail.com |hireagk01@gmail.com | hireagk01 | 9125671966   | Software Tester |  04/08/1999 | Male   |  No            |   30         |  2.5      | 450000 | 550000      | India  | Pune | Viman Nagar | 411014 |   SMS             | 520000      | 4      | No             | No     |   EmpOrg          |   123456789       | Interview1 | 20   | 00     |   0			  |   15 Minutes  |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi  |  20  | 30 Minutes      | 20/5/2021  |23/5/2021   |pe1			   |pe1@gmail.com|

