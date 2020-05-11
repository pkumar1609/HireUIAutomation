Feature: HireXpert Verify Tabs and Dropdown with Agency login feature

Scenario Outline: To verify that Questionnarie and Screening tab not displayed when log in with Agency and To verify 'Interviewer'dropdown 
on Schedule interview popup when login with Agency

Given Open browser
When login with Agency credential Who already have a Job added
And Click on Workbench tab and select job from job drop down in which candidate is added
And Verify that Questionnarie and Screening tab is not displayed when login with Agency
And Click on Schedule interview icon 
And Click interviewer from Interviewer drop down "<interviewer>"
And Fill all mandatory details "<title>" "<scheduleon>" "<hour>" "<minute>" "<interviewduration>" "<timezone>"
And Click on submit.

Examples:

| interviewer | title     | scheduleon  | hour | minute | interviewduration | timezone             |
| emp         | Interview |  01/05/2020 | 11   | 30     |  1 hour           | Indian Standard Time |