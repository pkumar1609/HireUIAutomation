Feature: Job Candidate Offered

@JobCandidteOffered
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
|Username       |Password| CandidateEmail      | Name     | ContactNumber| Designation    |Date      | Gender|OnNoticePeriod | NoticePeriod |experience | CTC    |expectedCTC | Country|City  |CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|OrganizationName|contactnumber|Title      | Hour | Minute |DurationHour|DurationMinute|TimeZone                     				      |ScheduledOn|InterviewerName|InterviewerEmail|
|pemp@gmail.com | 12345  | hirreck01@gmail.com | hirreck01 | 9121601966   | Software Tester|04/08/1999| Male  |   No          |  30          |  3        | 450000 | 600000     | India  | Pune | Viman Nagar| 411014 |        SMS         |             | 4      | No             | No     | EmpOrg         |123456789    |Interview1 | 20   | 00     |   0		   | 15 Minutes   |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi| 18/6/2021 | pe2		      |pe2@gmail.com   |


@JobCandidteOffered
Scenario Outline:  Verify on Agency login Offered job candidate is displayed on the Job Offered Tab.
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
|Username       |Password| CandidateEmail  | Name | ContactNumber | Designation     |Date       | Gender |OnNoticePeriod | NoticePeriod |experience | CTC    |expectedCTC | Country|City  |CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|OrganizationName|contactnumber|Title      | Hour | Minute |DurationHour|DurationMinute|TimeZone                     				      |ScheduledOn|InterviewerName|InterviewerEmail|
|pagy@gmail.com | 12345  | hcrk01@gmail.com | hcrk01| 9121601966    | Software Tester |04/08/1999 | Male   |   No          |  30          |  2.5      | 450000 | 600000     | India  | Pune | Viman Nagar| 411014 |        SMS         |             | 4      | No             | No     | EmpOrg         |123456789    |Interview1 | 20   | 00     |   0		   | 15 Minutes   |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi| 18/6/2021 | pe2		      |pe2@gmail.com   |


@JobCandidteOffered
Scenario Outline: Verify on Employee login candidate is displaying in green column in Job Offered menu when Salary Offered value is provided to candidate and candidate card can be edited.
Given User logged in to HireXpert "<Username>" and "<Password>" 
And Logged-In user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |   1             | Hirexpert    | rahitech        | java           |
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
When Candidate card is dragged to Job Offered column
And On Job Offerred tab click on Edit icon of candidate added "<Name>"
And Add Salary Offered value and save changes "<Salaryoffered2>"
Then Verify on Job Offerred menu Candidate should display in the Green column "<Name>" 
And Logout from App
Examples:
|Username       |Password| CandidateEmail    | Name   | ContactNumber|Designation    |Date       | Gender |OnNoticePeriod | NoticePeriod |experience | CTC    |expectedCTC | Country|City  |CityArea    |ZipCode |Communicationmode |Salaryoffered|Salaryoffered2|distance|permanentAddress|relocate|OrganizationName|contactnumber|TimeZone                     				   |
|pemp@gmail.com | 12345  | hxcfd01@gmail.com | hxcfd01| 9105601966   |Software Tester|04/08/1999 | Male   |   No          |  30          |  2.5      | 300000 | 400000     | India  | Pune | Viman Nagar| 411014 |  SMS             |             |380000        |4      | No             | No     | EmpOrg         |123456789     |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|


@JobCandidteOffered
Scenario Outline: To verify the Active job count on the candidate card at employer side.
Given User logged in to HireXpert "<Username>" and "<Password>" 
And Logged-In user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |   1             | Hirexpert    | rahitech        | java           |
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
When Candidate card is dragged to Job Offered column
Then Verify on Job Offerred menu Candidate should display in the Incomplete information column "<Name>" 
And Logout from App
And Newly registered user logged in to Application "<Name2>" "<Username2>" "9410123214" "Employer" "<TimeZone>" "<Country>" "<Password>" "Hyderabad" "ABCORG" "ABCORG.com" "Hyderabad" 
And Newly registered user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |   1             | Hirexpert    | rahitech        | java           |
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
When Candidate card is dragged to Job Offered column
And Logout from App
Given User logged in to HireXpert "<Username>" and "<Password>" 
And On Job Offerred tab click on Edit icon of candidate added "<Name>"
And Add Salary Offered value and save changes "<Salaryoffered2>"
Then Verify on Job Offerred menu Candidate should display in the Green column "<Name>"
Then Verify Count of Active job on same candidate card 
Examples:
|Username        |Username2          |Password| CandidateEmail    | Name     |Name2    |ContactNumber|Designation    |Date       | Gender |OnNoticePeriod | NoticePeriod |experience | CTC    |expectedCTC | Country|City  |CityArea    |ZipCode |Communicationmode |Salaryoffered|Salaryoffered2|distance|permanentAddress|relocate|OrganizationName|contactnumber|TimeZone                    				   |
|pemp@gmail.com  |EmpNew01@gmail.com |12345   | hxcadw01@gmail.com| hxcadw01 |EmpNew01 |9121601966   |Software Tester|04/08/1999 | Male   |   No          |  30          |  2.5      | 300000 | 400000     | India  | Pune | Viman Nagar| 411014 |  SMS             |             |  380000      |4       | No             | No     | EmpOrg         |123456789    |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|


@JobCandidteOffered
Scenario Outline: To verify the Active job count on the candidate card at agency side
Given User logged in to HireXpert "<AgencyLogin>" and "<Password>"
And Logged-In user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |   1             | Hirexpert    | rahitech        | java           |
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<CandidateName>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
When Candidate card is dragged to Job Offered column
Then Verify on Job Offerred menu Candidate should display in the Incomplete information column "<CandidateName>" 
And Logout from App
And Newly registered user logged in to Application "<NewAgencyName>" "<NewAgencyLogin>" "9100123214" "Agency" "<TimeZone>" "<Country>" "<Password>" "Hyderabad" "AGABCORG" "AGABCORG.com" "Hyderabad" 
And Newly registered user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |   1             | Hirexpert    | rahitech        | java           |
And Click on add candidate
And Enter All details of "<CandidateEmail>","<CandidateName>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
When Candidate card is dragged to Job Offered column
And Logout from App
Given User logged in to HireXpert "<AgencyLogin>" and "<Password>" 
And On Job Offerred tab click on Edit icon of candidate added "<CandidateName>"
And Add Salary Offered value and save changes "<Salaryoffered2>"
Then Verify on Job Offerred menu Candidate should display in the Green column "<CandidateName>"
Then Verify Count of Active job on same candidate card 
Examples:
|AgencyLogin    |NewAgencyLogin        |Password| CandidateEmail    | CandidateName |NewAgencyName |ContactNumber|Designation    |Date       | Gender |OnNoticePeriod | NoticePeriod |experience | CTC    |expectedCTC | Country|City  |CityArea    |ZipCode |Communicationmode |Salaryoffered|Salaryoffered2|distance|permanentAddress|relocate|OrganizationName|contactnumber|TimeZone                     		   |
|pagy@gmail.com |agencyNew01@gmail.com |12345   | hxcadq01@gmail.com| hxcadq01      |agencyNew01   |9101601966   |Software Tester|04/08/1999 | Male   |   No          |  30          |  2.5      | 300000 | 400000     | India  | Pune | Viman Nagar| 411014 |  SMS             |             |  380000      |4       | No             | No     | EmpOrg         |123456789    |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|


@JobCandidteOffered
Scenario Outline: To verify Active interview count on candidate card on Employer login
Given User logged in to HireXpert "<EmployerLogin>" and "<Password>" 
And Logged-In user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |   1             | Hirexpert    | rahitech        | java           |
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<CandidateName>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
When Candidate card is dragged to Job Offered column
Then Verify on Job Offerred menu Candidate should display in the Incomplete information column "<CandidateName>" 
And Logout from App
And Newly registered user logged in to Application "<NewEmployerName>" "<NewEmployerLogin>" "9410123214" "Employer" "<TimeZone>" "<Country>" "<Password>" "Hyderabad" "EmpNewj01ORG" "EmpNewj01ORG.com" "Hyderabad" 
And Newly registered user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |   1             | Hirexpert    | rahitech        | java           |
And Click on add candidate
And Enter All details of "<CandidateEmail>","<CandidateName>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
And Move the card to Schedule Interview column
And Logout from App
Given User logged in to HireXpert "<EmployerLogin>" and "<Password>" 
And On Job Offerred tab click on Edit icon of candidate added "<CandidateName>"
And Add Salary Offered value and save changes "<Salaryoffered2>"
Then Verify on Job Offerred menu Candidate should display in the Green column "<CandidateName>"
Then Verify Count of Active Interview on same candidate card "<CandidateName>"
Examples:
|EmployerLogin  |NewEmployerLogin   |Password| CandidateEmail    | CandidateName|NewEmployerName |ContactNumber|Designation    |Date       | Gender |OnNoticePeriod | NoticePeriod |experience | CTC    |expectedCTC | Country|City  |CityArea    |ZipCode |Communicationmode |Salaryoffered|Salaryoffered2|distance|permanentAddress|relocate|OrganizationName|contactnumber|TimeZone                        				|
|pemp@gmail.com |EmpNewk01@gmail.com|12345   | hxcadj01@gmail.com| hxcadj01     |EmpNewk01       |9120301966   |Software Tester|04/08/1999 | Male   |   No          |  30          |  2.5      | 300000 | 400000     | India  | Pune | Viman Nagar| 411014 |  SMS             |             |  380000      |4       | No             | No     | EmpOrg         |123456789    |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|


@JobCandidteOffered
Scenario Outline: To verify the Offer Taken count on candidate card.
Given User logged in to HireXpert "<Username>" and "<Password>" 
And Logged-In user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |   1             | Hirexpert    | rahitech        | java           |
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
When Candidate card is dragged to Job Offered column
Then Verify on Job Offerred menu Candidate should display in the Incomplete information column "<Name>" 
And Logout from App
And Newly registered user logged in to Application "<Name2>" "<Username2>" "9410123214" "Employer" "<TimeZone>" "<Country>" "<Password>" "Hyderabad" "EmpNewkORG" "EmpNewkORG.com" "Hyderabad" 
And Newly registered user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |   1             | Hirexpert    | rahitech        | java           |
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
When Candidate card is dragged to Job Offered column
And Logout from App
Given User logged in to HireXpert "<Username>" and "<Password>" 
And On Job Offerred tab click on Edit icon of candidate added "<Name>"
And Add Salary Offered value and save changes "<Salaryoffered2>"
Then Verify on Job Offerred menu Candidate should display in the Green column "<Name>"
#Then Verify Count of Offer Taken on candidate card "<Name>"
Examples:
|Username        |Username2          |Password | CandidateEmail     | Name      |Name2    |ContactNumber|Designation    |Date       | Gender |OnNoticePeriod | NoticePeriod |experience | CTC    |expectedCTC | Country|City  |CityArea    |ZipCode |Communicationmode |Salaryoffered|Salaryoffered2|distance|permanentAddress|relocate|OrganizationName|contactnumber|TimeZone                    				   |
|pemp@gmail.com  |EmpNew01@gmail.com |12345    | hxcadgk01@gmail.com| hxcadgk01 |EmpNew01 |9120601966   |Software Tester|04/08/1999 | Male   |   No          |  30          |  2.5      | 300000 | 400000     | India  | Pune | Viman Nagar| 411014 |  SMS             |             |  380000      |4       | No             | No     | EmpOrg         |123456789    |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|


@JobCandidteOffered
Scenario Outline: To verify the count of offer more than your offered salary.
Given User logged in to HireXpert "<Username>" and "<Password>" 
And Logged-In user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact    | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      2 |  4     | 200000 | 370000 | pe1  | pe1@gmail.com | 9123456412 |   1             | Hirexpert    | rahitech        | java           |
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
When Candidate card is dragged to Job Offered column
Then Verify on Job Offerred menu Candidate should display in the Incomplete information column "<Name>" 
And On Job Offerred tab click on Edit icon of candidate added "<Name>"
And Add Salary Offered value and save changes "<Salaryoffered2>"
And Logout from App
And Newly registered user logged in to Application "<Name2>" "<Username2>" "9410143214" "Employer" "<TimeZone>" "<Country>" "<Password>" "Hyderabad" "EmpNew02ORG" "EmpNew02ORG.com" "Hyderabad" 
And Newly registered user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact    | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      2 |  4     | 200000 | 370000 | pe1  | pe1@gmail.com | 9123456412 |   1             | Hirexpert    | rahitech        | java           |
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
When Candidate card is dragged to Job Offered column
Then Verify on Job Offerred menu Candidate should display in the Incomplete information column "<Name>"
And On Job Offerred tab click on Edit icon of candidate added "<Name>"
And Add Salary Offered value and save changes "<Salaryoffered3>"
And Logout from App
Given User logged in to HireXpert "<Username>" and "<Password>" 
Then Verify on Job Offerred menu Candidate should display in the Red column "<Name>"
Then Verify Count of Offered Salary count is increased on candidate card
Then Verify Count of Offer Taken After Your Offer on candidate card
Examples:
|Username       |Username2          |Password| CandidateEmail    | Name     |Name2    |ContactNumber|Designation    |Date       | Gender |OnNoticePeriod | NoticePeriod |experience | CTC    |expectedCTC | Country|City  |CityArea    |ZipCode |Communicationmode |Salaryoffered|Salaryoffered2|Salaryoffered3|distance|permanentAddress|relocate|OrganizationName|contactnumber|TimeZone                    				   |
|pemp@gmail.com |EmpNew02@gmail.com |12345   | hxcadt01@gmail.com| hxcadt01 |EmpNew02 |9120601966   |Software Tester|04/08/1999 | Male   |   No          |  30          |  2.5      | 300000 | 400000     | India  | Pune | Viman Nagar| 411014 |  SMS             |             |  380000      |400000        |4       | No             | No     | EmpOrg         |123456789    |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|


#@JobCandidteOffered
Scenario Outline: To verify candidate card being moved to Yellow automatically.
Given User logged in to HireXpert "<Username>" and "<Password>" 
And Logged-In user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact    | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      2 |  4     | 200000 | 370000 | pe1  | pe1@gmail.com | 9123456412 |   1             | Hirexpert    | rahitech        | java           |
And Select a added job
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
When Candidate card is dragged to Offering Job column
Then Verify on Job Offerred menu Candidate should display in the Incomplete information column "<Name>" 
And On Job Offerred tab click on Edit icon of candidate added "<Name>"
And Add Salary Offered value and save changes "<Salaryoffered2>"
And Logout from App
And Newly registered user logged in to Application "<Name2>" "<Username2>" "9410143214" "Employer" "<TimeZone>" "<Country>" "<Password>" "Hyderabad" "EmpNewv01ORG" "EmpNewv01ORG.com" "Hyderabad" 
And Newly registered user creates new job 
| title     | agytitle         | designation | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact    | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer   | IT software | pune     | 400000 |      2 |  4     | 200000 | 370000 | pe1  | pe1@gmail.com | 9123456412 |   1             | Hirexpert    | rahitech        | java           |
And Click on add candidate
And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
When Candidate card is dragged to Job Offered column
Then Verify on Job Offerred menu Candidate should display in the Incomplete information column "<Name>"
And On Job Offerred tab click on Edit icon of candidate added "<Name>"
And Add Salary Offered value and save changes "<Salaryoffered3>"
And Logout from App
Given User logged in to HireXpert "<Username>" and "<Password>" 
Then Verify on Job Offerred menu Candidate should display in the Red column "<Name>"
Then Verify Count of Offered Salary count is increased on candidate card
Then Verify Count of Offer Taken After Your Offer on candidate card
Examples:
|Username       |Username2          |Password| CandidateEmail    | Name     |Name2    |ContactNumber|Designation    |Date       | Gender |OnNoticePeriod | NoticePeriod |experience | CTC    |expectedCTC | Country|City  |CityArea    |ZipCode |Communicationmode |Salaryoffered|Salaryoffered2|Salaryoffered3|distance|permanentAddress|relocate|OrganizationName|contactnumber|TimeZone                    				   |
|pemp@gmail.com |EmpNew02@gmail.com |12345   | hxcadv01@gmail.com| hxcadv01 |EmpNew02 |9120601966   |Software Tester|04/08/1999 | Male   |   No          |  30          |  2.5      | 300000 | 400000     | India  | Pune | Viman Nagar| 411014 |  SMS             |             |  380000      |400000        |4       | No             | No     | EmpOrg         |123456789    |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|


