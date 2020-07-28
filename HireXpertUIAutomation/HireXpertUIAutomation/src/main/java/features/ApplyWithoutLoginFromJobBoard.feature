Feature: Job Board       

Scenario Outline: To Verify Apply Without Login functionality when candidate is not logged in to the system
	
Given User open browser
And Click on More Jobs link on Home Page
And Select all mandatory filters and click on search button "<industry>" "<designation>" "<role>" "<experience>" "<city>"
#And On the left side panel list of jobs will display with Job Details button
And Click on Job Details button of a respective job where you want to apply
#And Full information of the job will display with Apply button
And Click on Apply Button
And Dialog box window display with Login and Apply without Login button
And Click on Apply Without Login button
And fill all the mandatory details of candidate and click on Apply button "<CandidateEmail>" "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Communicationmode>" "<Experience>" "<CTC>" "<Expected CTC>" "<City>" "<CityArea>" "<ZipCode>" "<DateOfBirth>" "<ExpertiseLevel1>" "<ExpertiseLevel2>"
Then successful message should display as "Your application has been successfully sent to job publisher. Job publisher will review your application and you should see it status on your dashboard. We have sent you your login detail. Please login with your credentials." with Ok button
And login with the same employer of Job
And Go to job application
And Select the job from drop-down
Then Verify that candidate is displaying in the job on job application or not
    
Examples:

| industry    |  designation           | role   | experience | city | CandidateEmail | Name | ContactNumber | Designation   |  Gender | NoticePeriod | Communicationmode | Experience | CTC    | Expected CTC | City | CityArea    | ZipCode | DateOfBirth |ExpertiseLevel1 | ExpertiseLevel2 |
| IT-Software | Software Test Engineer | Tester | 3          | Pune | rock@gmail.com | Rock | 123456789     | Test Engineer |  Male   |   60         | Call              | 3.5        | 450000 | 550000       | Pune | Viman Nagar | 12345   | 01/05/1995  | Expert         | Expert          |
    
    # TC :- 462, 477 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
