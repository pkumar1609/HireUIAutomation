Feature: Job Board       

Scenario Outline: To Verify Apply Without Login functionality when candidate is not logged in to the system
	
Given User open browser
And Login as employer "<EmployerEmailAddress>" "<Password>"
And Go to Workbench 
And Add a new Job as employer "<JobTitle>" "<JobDesignation>" "<Industry>" "<JobRole>" "<Location>" "<budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
And Select the same job from job drop down
And logout as employer
And login as support user and approve the job
And logout as support user
And Click on More Jobs link on Home Page
And Select all mandatory filters and click on search button "<industry>" "<jobdesignation>" "<role>" "<experience>" "<city>"
#And Verify the details on Job card displayed on left side pannel
And Click on Job Details button of a respective job where you want to apply
#And Verify all the details of the job after clicking on apply button
And Click on Apply Button
And Dialog box window display with Login and Apply without Login button
And Click on Apply Without Login button
And fill all the mandatory details of candidate and click on Apply button "<CandidateEmail>" "<Name>" "<ContactNumber>" "<Designation>" "<DateOfBirth>" "<Gender>" "<NoticePeriod>" "<Experience>" "<CTC>" "<ExpectedCTC>" "<City>" "<CityArea>" "<ZipCode>" "<Communicationmode>" "<ExpertiseLevel1>" "<ExpertiseLevel2>"
Then successful message should display as "Your application has been successfully sent to job publisher. Job publisher will review your application and you should see it status on your dashboard." with Ok button
And login with the same employer of Job "<EmployerEmailAddress>" "<Password>"
And Go to job application
And Select the job from drop-down "<Job>"
Then Verify that candidate data displayed on job applications section
    
Examples:

| JobTitle                |  JobDesignation        | Industry      | JobRole                 | Location |budget   | MinExp | MaxExp | NoOfInterviews | industry    | jobdesignation         | role                   | experience | city | CandidateEmail | Name | ContactNumber | Designation   | DateOfBirth |  Gender | NoticePeriod | Experience | CTC    | ExpectedCTC  | City | CityArea    | ZipCode | Communicationmode |ExpertiseLevel1 | ExpertiseLevel2 |EmployerEmailAddress      | Password | Job                             |
| Software Test Engineer  | Software Test Engineer |   IT-Software | Software Test Engineer  | Pune     |  700000 |   3    |  4     |         2      | IT-Software | Software Test Engineer | Software Test Engineer | 3          | Pune | rock@gmail.com | Rock | 123456789     | Test Engineer | 01/05/1995  | Male    |   60         | 3.5        | 450000 | 550000       | Pune | Viman Nagar | 12345   | Call              | Expert         | Expert          | employertrupti@gmail.com | 12345    | Software Test Engineer - Active |
    
    # TC :- 462, 477 
    
    
    
   
    
    
    
    
    
    
    
    
    
    
