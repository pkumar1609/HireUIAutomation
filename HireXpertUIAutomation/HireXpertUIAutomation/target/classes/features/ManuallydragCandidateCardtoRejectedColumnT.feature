Feature: Manually drag Candidate card to rejected column

@Regression
  Scenario Outline: Verify there is asking reason when user manually drag the candidate card in rejection column from employer login, employer team member login, agency login, agency team member login

Given Open browser
When click on Employer-Agency SignIn link
And login with Employer credential.
And Go to Workbench 
And Add a new Job as employer "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
And Verify that job is added or not
And Select the same job from job drop down
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And Click on save button 
And Verify candidate is displayed on workbench
And Drag the candidate card from that column to rejected column
And confirmation popup should diplay "Are you sure you want to reject Can02 ?" with Yes and No button and click on Yes buton
And select the reason of rejection and cick on submit button
Then drag the candidate card from rejected column to any other column
And click on close job button and delete the job
And add a team member to employer
And logout with employer and login as employer team member
And Go to Workbench 
And Add a new Job as employer "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
And Verify that job is added or not
And Select the same job from job drop down
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>" 
And Click on save button 
And Verify candidate is displayed on workbench
And Drag the candidate card from that column to rejected column
And confirmation popup should diplay "Are you sure you want to reject Can02 ?" with Yes and No button and click on Yes buton
And select the reason of rejection and cick on submit button
Then drag the candidate card from rejected column to any other column
And click on close job button and delete the job
And logout as employer team member and login as employer
And delete the team member

Given Open browser
When click on Employer-Agency SignIn link
And login with Agency credential.
And Go to Workbench 
And Add a new Job as agency "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
And Verify that job is added or not
And Select the same job from job drop down
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>" 
And Click on save button 
And Verify candidate is displayed on workbench
And Drag the candidate card from that column to rejected column
And confirmation popup should diplay "Are you sure you want to reject Can02 ?" with Yes and No button and click on Yes buton
And select the reason of rejection and cick on submit button
Then drag the candidate card from rejected column to any other column
And click on close job button and delete the job
And add a team member to agency
And logout with agency and login as agency team member
And Go to Workbench 
And Add a new Job as agency "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
And Verify that job is added or not
And Select the same job from job drop down
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And Click on save button 
And Verify candidate is displayed on workbench
And Drag the candidate card from that column to rejected column
And confirmation popup should diplay "Are you sure you want to reject Can02 ?" with Yes and No button and click on Yes buton
And select the reason of rejection and cick on submit button
Then drag the candidate card from rejected column to any other column
And click on close job button and delete the job
And logout as agency team member and login as agency
And delete the team member

Examples:
   | Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  contactnumber   | 
   | Engineer | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              | candidate02@gmail.com   | Can02   |   9128529666     |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   123456789      |
  

# TC = 533










