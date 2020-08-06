Feature: HireXpert Verify Tabs and Dropdown with Agency login feature

@BVT
Scenario Outline: To verify that Questionnarie and Screening tab not displayed when log in with Agency and To verify 'Interviewer'dropdown 
on Schedule interview popup when login with Agency

Given Open browser
And click on Login link
And click on Employer-Agency SignIn link
When login with Agency credential
And Go to Workbench 
And Add a new Job as agency "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
And Select the same job from job drop down
And Add Candidate to that job "<CandidateEmail>" "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Location>" "<Communicationmode>"
And upload candidate resume
And Click on save button
And Verify that Questionnarie and Screening tab is not displayed when login with Agency
And Click on Schedule interview icon 
And Click interviewer from Interviewer drop down "<interviewer>"
And Fill all mandatory details "<title>" "<scheduleon>" "<hour>" "<minute>" "<interviewduration>" "<timezone>"
And Click on submit.
And click on close button
And click on close job button and delete the job
And click on employer tab and delete the employer

Examples:
| Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews | interviewer | title     | scheduleon  | hour | minute | interviewduration | timezone             |   CandidateEmail        |  Name   |   ContactNumber  |   Designation     | Gender | NoticePeriod | Location    |  Communicationmode |
| Engineer | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              | emp         | Interview |  25/12/2020 | 11   | 30     |  1 hour           | Indian Standard Time | candidate01@gmail.com   | Can01   |   912349699666   |   Software Tester | Male   |      30      | pune        |        SMS         |

# 109, 137


#Change interview date and time
# If DB clear, register the agency first = agencymain01@gmail.com. otherwise no change required