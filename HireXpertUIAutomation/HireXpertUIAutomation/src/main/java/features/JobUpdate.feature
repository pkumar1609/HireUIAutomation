Feature: Job Management

@BVT 
  Scenario Outline: To verify user is able to add and edit job for Employer and Agency login
  
    Given User is on Home page of application
    When title of page is HireXpert
    And click on Login link
    And enter valid user "<email address>" and "<password>" for registered employer and agency and click on Sign in button
    And Go to Workbench 
     And click on Add Job button and fill all mandatory details on Add Job popup window "<JobTitle>" "<Industry>" "<JobDesignation>" "<MinSalary>" "<MaxSalary>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<CityArea>" "<ZipCode>" "<JobNoticePeriod>" "<JobSkill1>" "<JobSkill2>" 
    And click on Employers tab at the top and verify user able to delete the employer or not when agency is logged in
    And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
    And click on Edit Job button to make changes in job
    And make any changes in the job "<JobNoticePeriod1>"
    And click on submit button
    And click on Edit Job button to make changes in job
    And Now Click on Add Skill button to add more than ten skills
    Then Verify that user get an alert message as "User should not add more than 10 skills" for adding more than ten skills
    And click on Delete Skill button in front of any skill
    And click on close job button and delete the job
    And click on employer tab and delete the employer if login as agency.
    And close the browser
    
    
Examples:
|    email address            |  password  | JobTitle  | JobDesignation   | Industry    | MinSalary  | MaxSalary | MinExp | MaxExp | NoOfInterviews | JobNoticePeriod | CityArea    | ZipCode |  JobSkill1 | JobSkill2 | JobNoticePeriod1 | OrganizationName |
|  employermain01@gmail.com   |   12345    | SDET      | QA Analyst       | IT-Industry | 300000     | 500000    | 3      | 5      |   2            |  30             | Viman Nagar | 411014  | Agile      |  Java     |   60             |  EmpOrg          |
|  agencymain01@gmail.com     |   12345    | QA Engg   | Tester           | IT-Industry | 300000     | 600000    | 2      | 3      | 2              |  45             | Kharadi     | 12345   |  Java      |  Agile    |   45             |  EmpOrg     |

#TC ID - 15,21,22,46,74,76,94


# If DB clear, register the employer first = employermain01@gmail.com and agency = agencymain01@gmail.com . 
#otherwise no change required

