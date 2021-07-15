Feature: Database CleanUp New User Registration

@UserRegisterAfterDBCleanUp
Scenario Outline: After database cleanup New Application User registration
Given User open browser
When click on Register link
And New Application User registration to HireXpert "<EmployerName>" "<EmployerNameEmail>" "<ContactNumber>" "Employer" "<Country>" "<TimeZone>" "<Password>" "<Address>" "ehs4ORG" "ehs4ORG.com" "<City>"
And User adds new job
| JobTitle| Designation|Industry     |FunctionalArea     |Location | Budget | MinSal| MaxSal | MinExp | MaxExp|NoOfInterviews|NoticePeriod| City|CityArea| ZipCode|
| NewJob |  Developer  | IT software | Software Developer| Pune    | 800000 |350000 | 700000 |   3    |  6    | 2            |60          | Pune |VimanNagar| 42001|
And Add Manage Recruiters for loggedIn employee
          | Name   | Email           | contact | Role          |
          | tsmbr1 | tsmbr1@gmail.com| 1234564 | Recruitment HR|
#And Logout from App
Examples:
|EmployerName|EmployerNameEmail|AgencyName|AgencyEmail     |Password|ContactNumber|Country |City  |Address     | ZipCode|TimeZone                    				   |
|ehs4        |ehs4@gmail.com |  AAgcy10  |AAgcy10@gmail.com|12345   | 6820601966  | India  | Pune | Viman Nagar| 411014 |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|


