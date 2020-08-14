Feature: Interview Management

@bvt @regression1_01
	Scenario Outline: To verify the functionality of scheduled interview with Employer and Agency login
	
	Given User is on Home page of application
    When title of page is HireXpert
    And click on Login link
    And click on Employer-Agency SignIn link
    And login with Employer credential
    And Go to Workbench 
    And Add a new Job as employer "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
    And Select the same job from job drop down
    And Click on Add Candidate button.
    And Enter valid "<CandidateEmail>" 
    And click on find button 
    And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
    And upload candidate resume
    And Click on save button 
    And observe candidate is getting added in New column
    And click on Schedule Interview icon from candidate card
    And fill all interview details and click on Submit button "<Title>" "<ScheduleOn>" "<Hour>" "<Minute>" "<Duration>" "<TimeZone>"
    And click on close button from Interview details page 
    And observe the interview date and time displayed on candidate card below Assign To field
    And click on Reload Candidate button and observe
    And click on Edit Interview icon in front of interview details like date and time
    And make some changes in interview details and click on Submit button "<hour>" "<duration>"
    Then User should be able to update scheduled interview details and updated details should display properly
    And click on Edit Interview icon present on the left corner just beside of Cancel Interview icon 
    And make some changes and click on Submit button "<scheduleon>"
    Then updated details should display properly
    And click on close button from Interview details page
    And click on Reload Candidate button and observe
    And click on Interviews tab
    And Select the filters for which you want candidate interview details and click on Search button
    | Automation1 | 25/10/2020 |
    Then Interview details should be reflect according to the filter applied
    And click on close job button and delete the job
    And close the browser
    
    Given User is on Home page of application
    When title of page is HireXpert
    And click on Login link
    And click on Employer-Agency SignIn link
    And login with Agency credential
    And Go to Workbench 
    And Add a new Job as agency "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
    And Select the same job from job drop down
    And Click on Add Candidate button.
    And Enter valid "<CandidateEmail>" 
    And click on find button 
    And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
    And Click on save button 
    And observe candidate is getting added in New column
    And click on Schedule Interview icon from candidate card
    And fill all interview details and click on Submit button "<Title>" "<ScheduleOn>" "<Hour>" "<Minute>" "<Duration>" "<TimeZone>"
    And click on close button from Interview details page 
    And observe the interview date and time displayed on candidate card below Assign To field
    And click on Reload Candidate button and observe
    And click on Edit Interview icon in front of interview details like date and time
    And make some changes in interview details and click on Submit button "<hour>" "<duration>"
    Then User should be able to update scheduled interview details and updated details should display properly
    And click on Edit Interview icon present on the left corner just beside of Cancel Interview icon 
    And make some changes and click on Submit button "<scheduleon>"
    Then updated details should display properly
    And click on close button from Interview details page
    And click on Reload Candidate button and observe
    And click on Interviews tab
    And Select the filters for which you want candidate interview details and click on Search button
    | Automation1 | 25/10/2020 |
    Then Interview details should be reflect according to the filter applied
    And click on close job button and delete the job
    And click on employer tab and delete the employer
    And close the browser
    
    
   Examples: 
     | Title       | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|   contactnumber   | Title      |ScheduleOn  | Hour | Minute |  Duration  | TimeZone             | hour | duration   | scheduleon | 
     | Automation1 | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              | candidate07@gmail.com   | Can07   |   9125671966     |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   123456789       | Interview1 | 25/10/2020 | 10   | 00     | 30 Minutes | Indian Standard Time |  11  | 45 Minutes | 30/06/2020 |



    
#TC ID:- 30 [Schedule Interview BVT TC]
#TC ID :- 105,108,110,224 [Interview Management BVT TC]
#Reg TC ID:- 311 [Job candidate Workflow REGRESSION TC]

# If DB clear, register the employer first = employermain01@gmail.com and agency = agencymain01@gmail.com . 
# otherwise no change required
