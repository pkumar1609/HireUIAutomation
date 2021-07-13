Feature: Dashboard 

@Dashboard
Scenario Outline: To Verify user can able to search job,sort job, filters & Summary functionality 
on dashboard (Employer/agency)
Given User logged in to HireXpert "<Username>" and "<Password>" 
And On Dashboard open add dialog and enter all required fields
| title     | agytitle         | designation  | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer1   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
When Job provider clicks on the Submit button.
Then Added job should display in the Jobs section 
And Add Two-Three more jobs
| title     | agytitle         | designation  | industry    | location | budget | minexp | maxexp | minsal | maxsal | Name | Email         | contact | totalinterviews | organization | agyorganization | functionalArea |
| Developer | Agynew Developer | developer1   | IT software | pune     | 400000 |      1 |      2 | 450000 | 800000 | pe1  | pe1@gmail.com | 1234564 |               2 | Hirexpert    | rahitech        | java           |
And Job related updates should display in Latest Updates section on dashboard
And Search or enter any value/text related to job
Then Data should be display accordingly in “Latest job” section
And Now click on the “filters & Summary” icon
And Apply some filter criteria and hit the “Apply filter” button
Then Data should be display according to the filter set criteria
And Now click on the Clear filter icon
Then Default Job data should display
And Now search the job
Then Job which is searched should display in Jobs section
Examples: 
| Username         | Password | 
|pemp@gmail.com    | 12345    | 
|pagy@gmail.com    | 12345    |

#@JobDashboard
#Scenario Outline: Verify upcomings interviews on dashboard(Employer/agency)
#Given An employer/agency logged in to HireXpert
#And On Applicant Tracking,Open add job dailog and fill all details
#When User click on submit button
#Then Added job should display in Job drop-down
#And Add one candidate for that job
#Then Newly added candidate should display in applicant tracking page as well as in “Upcoming Interviews” section on dashboard 
#And User should be able to view all the interview details in read only mode after clicking on “View” link on dashboard
#And Click on the “More Interviews” link and edit the interview details
#Then Updated interview details should also display on interview tab, applicant tracking and on dashboard page
#And Now Share job with employer employee
#And At employee side, Add one candidate into that job which is shared by employer and move the candidate card into new column
#And Schedule one interview for that candidate
#Then At employer side,candidate added by employee member and Scheduled Interview details should be display on applicant tracking, Interviews tab and also on dashboard page 
#
#@JobDashboard
#Scenario Outline: To Verify Job Applications functionality on dashboard (Employer/agency)
#Given An employer/agency logged in to HireXpert
#And On Applicant Tracking,Open add job dailog and fill all details
#When User click on submit button
#Then Added job should display in Job drop-down
#And Added job automatically approves from support user login and displays in job board page
#And Candidate should be registered by himself and should enter all the details as per the job criteria once login.
#Then Once job is approved, then candidate should be apply for that job from job board
#And At employer side, on dashboard in “Job Applications” section, Job Application count for that job should be display as  1
#And After clicking on “View” link, candidate who applies for that particular job should be display in job applications page
#And After clicking on the “More applications”, then user should be redirects to the job application page in which user gets more candidates who applies for various jobs
#
#@JobDashboard
#Scenario Outline:To Verify user can able to view the newly added candidate and able to download CV on dashboard (Employer/agency)
#Given An employer/agency logged in to HireXpert
#And On Applicant Tracking,Open add job dailog and fill all details
#When User click on submit button
#Then Added job should display in Job drop-down
#And Add one candidate for that job
#Then Newly added candidate should display in applicant tracking page
#And Go to Dashboard and verify newly added candidate displays in “Submitted CVs Awaiting Review (ATS) - (1)” section
#And Now Share job with employer employee
#And At employee side, Add one candidate into that job which is shared by employer
#Then Candidate added by employer employee should be display “Submitted CVs Awaiting Review (ATS) - (1)” section on dashboard at employer side
#And Now click on the Candidate details link
#Then Candidate details should be display in read only mode
#And Click on the Download CV link for particular candidate
#Then Candidate CV should get downloaded
#And After clicking on the “View” link,User should be able to view the applicants for the selected job on applicant tracking page
#And After clicking on “More Candidates” link, User should be able to view more candidates added for that particular job on applicant tracking page
#
#
#@JobDashboard
#Scenario Outline:








