Feature: Application User Registration after Database CleanUp

@ApplicationUserRegister
Scenario Outline: After database cleanup New Application User registration
Given User open browser
When click on Register link
And New HireXpert application user employer registration "<EmployerName>" "<EmployerEmail>" "<ContactNumber>" "Employer" "<Country>" "<TimeZone>" "<Password>" "<Address>" "<EmpOrgName>" "<EmpOrgWebsite>" "<City>"
And User adds new job
| JobTitle| Designation|Industry     |FunctionalArea     |Location | Budget | MinSal| MaxSal | MinExp | MaxExp|NoOfInterviews|NoticePeriod| City|CityArea| ZipCode|
| NewJob |  Developer  | IT software | Software Developer| Pune    | 800000 |350000 | 700000 |   3    |  6    | 2            |60          | Pune |VimanNagar| 42001|
And Add Manage Employee for loggedIn employer
          | Name    | Email         | contact | Role          |
          | pe1     | pe1@gmail.com | 1204564 | Interviewer   |
          | pe2     | pe2@gmail.com | 1214564 | Recruitment HR|
When click on Register link
And New HireXpert application user agency registration "<AgencyName>" "<AgencyEmail>" "<ContactNumber>" "Agency" "<Country>" "<TimeZone>" "<Password>" "<Address>""<AgcyOrgName>" "<AgcyOrgWebsite>" "<City>"
And Add Manage Employee for loggedIn agency
          | Nameagy  | Emailagy          | contact | Roleagy                 |
          | patmbr1  | patmbr1@gmail.com | 1204564 | Recruitment Agency Head |
          | patmbr2  | patmbr2@gmail.com | 1218564 | Recruitment Agency Head |
And Add Manage Vendors for loggedIn agency
          | Name    | Email            | contact |
          | pagvdr1 | pagvdr1@gmail.com| 1204564 |
          | pagvdr2 | pagvdr2@gmail.com| 1218564 |
Given User logged in to HireXpert "<EmployerEmail>" and "<Password>" 
And Add Manage Recruiters for loggedIn employee
          | Name    | Email         | contact  | Role          |
          | pagy    | pagy@gmail.com| 12304564 | Recruitment HR|
And Logout from App
Examples:
|EmployerName|EmployerEmail |EmpOrgName|EmpOrgWebsite|AgencyName|AgencyEmail   |AgcyOrgName|AgcyOrgWebsite|Password|ContactNumber|Country|City  |Address     | ZipCode|TimeZone                    				      |
|pemp        |pemp@gmail.com|pempORG   |pempORG.com  | pagy     |pagy@gmail.com|pagyORG    |pagyORG.com   |12345   |6820601966   | India | Pune | Viman Nagar| 411014 |(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi|


