Feature: Job Board       

Scenario Outline: To Verify Apply Without Login functionality when candidate is not logged in to the system
	
	
Given Open browser
And click on Login link
And enter valid user "<emailaddress>" and "<password>" for registered employer and agency and click on Sign in button
And Go to Workbench 
And click on Add Job button and fill all mandatory details on Add Job popup window "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
And Select the same job from job drop down	
And logout from application
And login as support user and approve the job
And logout from application
And Click on More Jobs link on Home Page
And Select all mandatory filters and click on search button "<Industry>" "<Designation>" "<JobRole>" "<experience>" "<City>"
And Verify the details on Job card displayed on left side pannel "<Title>" "<OrganizationName>" "<Location>" "<City>" "<Country>" "<MinExp>" "<MaxExp>" "<Budget>" "<Industry>" "<Designation>"
And Click on Job Details button of a respective job where you want to apply
#And Verify all the details of the job after clicking on Job Details button "<Title>" "<Designation>" "<Location>" "<City>>" "<Country>" "<MinExp>" "<MaxExp>" "<Budget>" "<Industry>" "<JobRole>"
And Click on Apply Button
And Dialog box window display with Login and Apply without Login button
And Click on Apply Without Login button
And fill all the mandatory details of candidate and click on Apply button "<CandidateEmail>" "<CandidateName>" "<ContactNumber>" "<CandidateDesignation>" "<DateOfBirth>" "<Gender>" "<NoticePeriod>" "<Experience>" "<CTC>" "<ExpectedCTC>" "<City>" "<CityArea>" "<ZipCode>" "<Communicationmode>" "<ExpertiseLevel1>" "<ExpertiseLevel2>"
Then successful message should display as "Your application has been successfully sent to job publisher. Job publisher will review your application and you should see it status on your dashboard." with Ok button
And login with the same user "<emailaddress>" and "<password>"
And Go to job application
And Select the job from drop-down "<Job>"
Then Verify that candidate data displayed on job applications section "<CandidateName>" "<CandidateDesignation>" "<CityArea>" "<City>" "<Country>" "<Experience>" "<CTC>" "<ExpectedCTC>" "<NoticePeriod>" "<Title>"
And click on View Details button
And click on Yes button of confirmation message
And Verify that candidate data displayed after clicking on View Details button "<CandidateName>" "<Title>" "<CandidateDesignation>" "<CityArea>" "<City>" "<Country>" "<ZipCode>" "<Experience>" "<CTC>" "<ExpectedCTC>" "<NoticePeriod>" "<ContactNumber>" "<DateOfBirth>" "<CandidateEmail>" "<Communicationmode>" "<Gender>"


 
Examples:

 | emailaddress              | password  | Title    | Designation             | Industry      | JobRole             | Location    | Budget   | MinExp | MaxExp | NoOfInterviews  | experience |  CandidateEmail     | CandidateName | ContactNumber | CandidateDesignation   | DateOfBirth |  Gender | NoticePeriod | Experience | CTC    | ExpectedCTC  | City | CityArea    | ZipCode | Communicationmode |ExpertiseLevel1 | ExpertiseLevel2 | Job                        | Country | OrganizationName |
 | employermain01@gmail.com  | 12345     | Engineer | Software Test Engineer  | IT-Software   |  Test Engineer      | Viman Nagar |  700000  |   3    |  4     |         2       | 3          |  rahuljha@gmail.com | Rahul Jha     | 123456789     | Tester                 | 1/5/1995    | Male    |   60         | 3.5        | 450000 | 550000       | Pune | Viman Nagar | 12345   | Call              | Expert         | Expert          | Engineer - Emporg - Active | India   |  Emporg          | 
    
    # TC :- 462, 477 
    
 
    
    
    
    
    
    
    
    
    
    
