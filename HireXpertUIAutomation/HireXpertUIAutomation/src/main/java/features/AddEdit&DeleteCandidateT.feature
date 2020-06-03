Feature: Hirexpert Add, Edit & Delete Candidate feature

@BVT
Scenario Outline: Verify the functionality of Add, Edit & Delete Candidate with Employer login

Given Open browser
When click on Employer-Agency SignIn link
And login with Employer credential.
And Go to Workbench 
And Add a new Job as employer
And Select the same job from job drop down
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Location>" "<Communicationmode>"
And Click on save button 
And Click on Edit Candidate icon on candidate card.
And Make the changes in "<ContactNumber>" field
And Click on save button
Then click on Delete Candidate icon on Candidate card
And click on close job button and delete the job

Examples:
  |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Gender | NoticePeriod | Location    |  Communicationmode |   ContactNumber   | 
  | candidate01@gmail.com   | Can01   |   912349699666   |   Software Tester | Male   |      30      | pune        |        SMS         |   123456789       |
  
 # 232, 62,  24,  29 
 
 
Scenario Outline: Verify the functionality of Add, Edit & Delete Candidate with Agency login

Given Open browser
When click on Employer-Agency SignIn link
And login with Agency credential.
And Go to Workbench 
And Add a new Job as agency
And Select the same job from job drop down
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Location>" "<Communicationmode>"
And Click on save button 
And Click on Edit Candidate icon on candidate card.
And Do changes in "<NoticePeriod>" field
And Click on save button
Then click on Delete Candidate icon on Candidate card
And click on close job button and delete the job
And click on employer tab and delete the employer

Examples:
  |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Gender | NoticePeriod | Location    |  Communicationmode |   NoticePeriod  | 
  | candidate01@gmail.com   | Can01   |   912349699666   |   Software Tester | Male   |      30      | pune        |        SMS         |   60            |
  
#  55, 28, 233, 29
  
  
  
  
  
  
  
  
  
  
  
  