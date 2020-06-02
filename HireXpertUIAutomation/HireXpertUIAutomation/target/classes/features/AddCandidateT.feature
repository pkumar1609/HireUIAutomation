Feature: HireXpert Add Candidate feature

Scenario Outline: Verify the functionality of add candidate with Employer/Agency & 'Find'button.

Given Open browser
When click on Employer-Agency SignIn link
And login with Employer credential Who already have a Job added with skills
And Go to Workbench and select the job from drop down 
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information and keep the expertise level for skills as not answered "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Location>" "<Communicationmode>"
And Click on save button 
#And Verify that bell icon is displayed on candidate card as the expertise level for skills is not answered
#And Click on Edit Candidate icon on candidate card.
#And Select the expertise level for candidate skill
#And Click on save button 
#And Verify that bell icon is not displayed on candidate card as the expertise level for skills is answered
And Quit the browser

And Open browser
And click on Employer-Agency SignIn link
And login with Agency credential Who already have a Job added with skills
And Go to Workbench and select the job from drop down 
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information and keep the expertise level for skills as not answered "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Location>" "<Communicationmode>"
And Click on save button 
#And Verify that bell icon is displayed on candidate card as the expertise level for skills is not answered
#And Click on Edit Candidate icon on candidate card.
#And Select the expertise level for candidate skill
#And Click on save button 
#And Verify that bell icon is not displayed on candidate card as the expertise level for skills is answered
And Quit the browser

Examples:
|    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Gender | NoticePeriod | Location    |  Communicationmode |
| candidate01@gmail.com   | Can01   |   912349699666   |   Software Tester | Male   |      30      | pune        |        SMS         |

