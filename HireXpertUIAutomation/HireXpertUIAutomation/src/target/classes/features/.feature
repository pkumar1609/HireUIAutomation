Feature: Hirexpert Add, Edit & Delete Candidate feature

@BVT
Scenario Outline: Verify the functionality of Add, Edit & Delete Candidate with Employer login

Given Open browser
And click on Login link
When click on Employer-Agency SignIn link
And login with Employer credential.
And Go to Workbench 
And Add a new Job as employer "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
#And Verify that job is added or not "<JobName>"
And Select the same job from job drop down
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume
And Click on save button 
And Verify candidate is displayed on workbench
And Click on Edit Candidate icon on candidate card "<Name>"
And Make the changes in "<contactnumber>" field
And Click on save button to save the update details
Then click on Delete Candidate icon on Candidate card "<Name>"
And Verify candidate is displayed on workbench after deleting
And click on close job button and delete the job

Examples:
   | Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews |JobName                     |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Date        | Gender | OnNoticePeriod | NoticePeriod |experience | CTC    | expectedCTC | Country|City  | CityArea    |ZipCode |  Communicationmode |Salaryoffered|distance|permanentAddress|relocate|  contactnumber   | 
   | Engineer | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              | Engineer - EmpOrg - Active | candidate05@gmail.com   | Can05   |   912349699666   |   Software Tester |  04/08/1999 | Male   |     No         |     30       |      2.5  | 450000 |     600000  | India  | Pune |  Viman Nagar| 411014 |        SMS         | 700000      | 4      | No             | No     |   123456789      |
  
 # 232, 62,  24,  29 
 
 
 
@BVT
Scenario Outline: Verify the functionality of Add, Edit & Delete Candidate with Agency login

Given Open browser
And click on Login link
When click on Employer-Agency SignIn link
And login with Agency credential.
And Go to Workbench 
And Add a new Job as agency "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
#And Verify that job is added or not "<JobName>"
And Select the same job from job drop down
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<CandidateEmail>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>" and "<relocate>"
And upload candidate resume
And Click on save button 
And Verify candidate is displayed on workbench
And Click on Edit Candidate icon on candidate card "<Name>"
And Do changes in "<noticeperiod>" field
And Click on save button to save the update details
Then click on Delete Candidate icon on Candidate card "<Name>"
And Verify candidate is displayed on workbench after deleting
And click on close job button and delete the job
And click on employer tab and delete the employer

Examples:
  | Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Gender | NoticePeriod | Location    |  Communicationmode |   noticeperiod  | 
  | Engineer | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              | candidate06@gmail.com   | Can06   |   912349699666   |   Software Tester | Male   |      30      | pune        |        SMS         |   60            |
  
#  55, 28, 233, 29
  
  
# If DB clear, register the employer first = employermain01@gmail.com and agency = agencymain01@gmail.com . 
#otherwise no change required
  
  
  
  
  
  
  
  
  