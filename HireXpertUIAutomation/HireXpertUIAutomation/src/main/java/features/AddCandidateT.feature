Feature: HireXpert Add Candidate feature

Scenario Outline: Verify the functionality of add candidate with Employer/Agency & 'Find'button.

Given Open browser
When login with Employer credential Who already have a Job added
And Go to Workbench and select the job from drop down 
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Location>" "<Communicationmode>"
Then Click on save button 
And Quit the browser
Then open browser
When login with Agency credential Who already have a Job added
And Go to Workbench and select the job from drop down 
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Location>" "<Communicationmode>"
Then Click on save button 
And Quit the browser

Examples:
|    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Gender | NoticePeriod | Location    |  Communicationmode |
| candidate0008@gmail.com | Can0008 |   912349699666   |   Software Tester | Male   |      30      | pune        |        SMS         |
