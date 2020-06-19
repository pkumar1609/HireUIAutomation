Feature: Hirexpert Add, Edit & Delete Candidate feature

@BVT
Scenario Outline: Verify the functionality of Add, Edit & Delete Candidate with Employer login

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
And fill all the information "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Location>" "<Communicationmode>"
And Click on save button 
And Verify candidate is displayed on workbench
And Click on Edit Candidate icon on candidate card.
And Make the changes in "<contactnumber>" field
And Click on save button
Then click on Delete Candidate icon on Candidate card
And Verify candidate is displayed on workbench after deleting
And click on close job button and delete the job

Examples:
   | Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Gender | NoticePeriod | Location    |  Communicationmode |   contactnumber   | 
   | Engineer | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              | candidate02@gmail.com   | Can02   |   912349699666   |   Software Tester | Male   |      30      | pune        |        SMS         |   123456789       |
  
 # 232, 62,  24,  29 
 
 
 
 @BVT
Scenario Outline: Verify the functionality of Add, Edit & Delete Candidate with Agency login

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
And fill all the information "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Location>" "<Communicationmode>"
And Click on save button 
And Verify candidate is displayed on workbench
And Click on Edit Candidate icon on candidate card.
And Do changes in "<noticeperiod>" field
And Click on save button
Then click on Delete Candidate icon on Candidate card
And Verify candidate is displayed on workbench after deleting
And click on close job button and delete the job
And click on employer tab and delete the employer

Examples:
  | Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Gender | NoticePeriod | Location    |  Communicationmode |   noticeperiod  | 
  | Engineer | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              | candidate02@gmail.com   | Can02   |   912349699666   |   Software Tester | Male   |      30      | pune        |        SMS         |   60            |
  
#  55, 28, 233, 29
  
  
# If DB clear, register the employer first = employermain01@gmail.com and agency = agencymain02@gmail.com . 
#otherwise no change required
  
  
  
  
  
  
  
  
  