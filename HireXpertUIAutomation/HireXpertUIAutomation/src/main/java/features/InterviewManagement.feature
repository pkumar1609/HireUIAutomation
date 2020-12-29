Feature: Interview Management

@BVTC @Regression @interview
	Scenario Outline: To verify the functionality of scheduled interview with Employer and Agency login
	Given User must be registered

	When title of login page is Home
	And Click on Employer-Agency Signin link
	And Employer enters valid credentials "<Username>","<Password>"
    And Go to Workbench    
	And Add job
	|title          |agytitle        |designation  |industry   |jobrole         |location     |budget |minexp|maxexp|minsal|maxsal|totalinterviews|organization|functionalArea|
	|Interview Job  |Interview Agy Job| developer   |IT software|java developer  |Viman nagar  |400000 |1     |2     |400000|500000|4|talentxpert|java|
	And Select a added job
	And Click on add candidate
	And Enter All details of "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>","<Skill1>","<Skill2>","<Skill3>","<level1>","<level2>","<level3>","<Weightage1>","<Weightage2>","<Weightage3>","<certificate1>","<certificate2>","<certificate3>","<remark1>","<remark2>","<remark3>","<certificateforskill1>"and"<certificateforskill2>"
    And observe candidate is getting added in New column 
    And click on Schedule Interview icon from candidate card
    And fill all interview details and click on Submit button "<Title>" "<scheduleon>" "<Hour>" "<Minute>" "<Duration>" "<TimeZone>" "<interviewerName>" "<interviewerEmail>"
    And click on close button from Interview details page
    And Click on Reload job button
    And observe the interview date and time displayed on candidate card below Assign To field "<scheduleon>"    
    And click on Reload Candidate button and observe
    And click on Edit Interview icon in front of interview details like date and time
    And make some changes in interview details and click on Submit button "<hour>" "<duration>"
    Then User should be able to update scheduled interview details and updated details should display properly
    And click on close button from Interview details page
    And now click on Schedule interview icon on candiadte card
    And click on Edit Interview icon present on the left corner just beside of Cancel Interview icon "<Title>"
    And make some changes and click on Submit button "<scheduleon1>"
    And click on close button from Interview details page
    And click on Reload Candidate button and observe
    And observe the interview date and time displayed on candidate card below Assign To field "<scheduleon1>"
    And click on Reload Candidate button and observe
    And click on Interviews tab
    And Select the filters for which you want candidate interview details and click on Search button "<scheduleon1>"
    Then Interview details should be reflect according to the filter applied "<scheduleon1>" "<Name>"

    
   Examples: 
    |Username       |Password |		CandidateEmail      |  Name       |    ContactNumber |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  OrganizationName |   contactnumber   | Title      | Hour | Minute |  Duration  | TimeZone                     					    | hour | duration   | scheduleon   |scheduleon1 |interviewerName|interviewerEmail|
    |pemp@gmail.com | 12345   | hirecan15@gmail.com     | hirecan15   |   9125671966     |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789       | Interview1 | 20   | 00     | 30 Minutes |   (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi   |  20  | 45 Minutes | 1/1/2021   |3/1/2021  |pe1			  |pe1@gmail.com   |
    |pagy@gmail.com | 12345   | hirecan16@gmail.com     | hirecan16   |   9125671966     |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   EmpOrg          |   123456789       | Interview1 | 20   | 00     | 30 Minutes |   (GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi   |  20  | 45 Minutes | 1/1/2021   |3/1/2021  |pe1            |pe1@gmail.com   |


    
#TC ID:- 30 [Schedule Interview BVT TC]
#TC ID :- 105,108,110,224 [Interview Management BVT TC]
#Reg TC ID:- 311 [Job candidate Workflow REGRESSION TC]

# If DB clear, register the employer first = employermain01@gmail.com and agency = agencymain01@gmail.com . 
# otherwise no change required

