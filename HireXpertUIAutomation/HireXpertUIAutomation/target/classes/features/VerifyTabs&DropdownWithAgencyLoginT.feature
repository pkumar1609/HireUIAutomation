Feature: HireXpert Verify Tabs and Dropdown with Agency login feature

Scenario Outline: To verify that Questionnarie and Screening tab not displayed when log in with Agency and To verify 'Interviewer'dropdown 
on Schedule interview popup when login with Agency

Given Open browser
When login with Agency credential Who already have a Job added
And Click on Workbench tab and select job from job drop down
And Add Candidate to that job "<CandidateEmail>" "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Location>" "<Communicationmode>"
And Verify that Questionnarie and Screening tab is not displayed when login with Agency
And Click on Schedule interview icon 
And Click interviewer from Interviewer drop down "<interviewer>"
And Fill all mandatory details "<title>" "<scheduleon>" "<hour>" "<minute>" "<interviewduration>" "<timezone>"
And Click on submit.

Examples:

| interviewer | title     | scheduleon  | hour | minute | interviewduration | timezone             |   CandidateEmail        |  Name   |   ContactNumber  |   Designation     | Gender | NoticePeriod | Location    |  Communicationmode |
| emp         | Interview |  01/06/2020 | 11   | 30     |  1 hour           | Indian Standard Time | candidate0008@gmail.com | Can0008 |   912349699666   |   Software Tester | Male   |      30      | pune        |        SMS         |