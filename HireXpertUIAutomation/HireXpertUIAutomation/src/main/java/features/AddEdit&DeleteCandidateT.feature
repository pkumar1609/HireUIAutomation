Feature: Hirexpert Edit & Delete Candidate feature

# 232, 233, 62, 28, 24, 55, 29 


Scenario Outline: Verify the functionality of Edit Candidate & Delete Candidate with Employer login

Given Open browser
When click on Employer-Agency SignIn link
And login with Employer credential.
And Go to Workbench and select the job from drop down 
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Location>" "<Communicationmode>"
And Click on save button 
And Click on Edit Candidate icon on candidate card.
And Make the changes in "<ContactNumber>" field
And Click on save button
Then click on Delete Candidate icon on Candidate card

Examples:
  |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Gender | NoticePeriod | Location    |  Communicationmode |   ContactNumber   | 
  | candidate01@gmail.com   | Can01   |   912349699666   |   Software Tester | Male   |      30      | pune        |        SMS         |   123456789       |
  
 
 
 
Scenario Outline: Verify the functionality of Edit Candidate & Delete Candidate with Agency login

Given Open browser
When click on Employer-Agency SignIn link
And login with Agency credential.
And Go to Workbench and select the job from drop down 
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information and keep the expertise level for skills as not answered "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Location>" "<Communicationmode>"
And Click on save button 
And Click on Edit Candidate icon on candidate card.
And Do changes in "<NoticePeriod>" field
And Click on save button
Then click on Delete Candidate icon on Candidate card

Examples:
  |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Gender | NoticePeriod | Location    |  Communicationmode |   NoticePeriod  | 
  | candidate01@gmail.com   | Can01   |   912349699666   |   Software Tester | Male   |      30      | pune        |        SMS         |   60            |
  
  
  
  
  
  
  
  
  
  
  
  
  
  