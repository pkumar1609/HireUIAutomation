Feature: Job Management

@bvt 
  Scenario Outline: To verify user is able to add and edit job for Employer and Agency login
  
    Given User is on Home page of application
    
    When title of page is HireXpert
    And click on Login link
    And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
    And click on Workbench tab
    And click on Add Job button and fill all mandatory details on Add Job popup window "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
#    And Verify that job is added or not "<JobName>"
    And click on Employers tab at the top and verify user able to delete the employer or not when agency is logged in
    And click on Job drop down and select recently added job
    And click on Edit Job button to make changes in job
    And make any changes in the job "<Budget1>" "<Noticeperiod>"
    And click on submit button
    And again click on Edit Job button and observe the changes
    And Now Click on Add Skill button to add more than ten skills
    Then Verify that user get an alert message as "User should not add more than 10 skills" for adding more than ten skills
    And click on ok button
    And click on Delete Skill button in front of any skill
    And click on close job button and delete the job
    And click on employer tab and delete the employer if login as agency.
    And close the browser
    
Examples:
|    email address            |  password  | Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews | Budget1 | Noticeperiod |
|  employermain01@gmail.com   |   12345    | SDET     | QA Analyst    | IT-Industry | Tester   | Pune        | 700000 | 3      | 5      |   2            | 900000  |  30          |    
|  agencymain01@gmail.com     |   12345    | QA-1     | Tester        | IT-Industry | Tester   | Pune        | 500000 | 2      | 3      | 2              | 600000  |  45          | 

#TC ID - 15,21,22,46,74,76,94


# If DB clear, register the employer first = employermain01@gmail.com and agency = agencymain02@gmail.com . 
#otherwise no change required

