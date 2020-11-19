Feature: Job Board       

Scenario Outline: To Verify Apply Without Login functionality when candidate is not logged in to the system
	
	
Given Open browser
And click on Login link
And enter valid user "<emailaddress>" and "<password>" for registered employer and agency and click on Sign in button
And Go to Workbench 
And click on Add Job button and fill all mandatory details on Add Job popup window "<JobTitle>" "<Industry>" "<JobDesignation>" "<MinSalary>" "<MaxSalary>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>" "<CityArea>" "<ZipCode>" "<JobNoticePeriod>" "<JobSkill1>" "<JobSkill2>" 
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And logout from application
And login as support user and approve the job
And logout from application
And Click on More Jobs link on Home Page
And Select all mandatory filters and click on search button "<Industry>" "<JobDesignation>" "<MinExp>" "<JobCity>" "<CityArea>"
#And Verify the details on Job card displayed on left side pannel "<JobTitle>" "<OrganizationName>" "<CityArea>" "<JobCity>" "<JobCountry>" "<MinExp>" "<MaxExp>" "<MaxSalary>" "<Industry>" "<JobDesignation>" "<JobNoticePeriod>"
And Click on Job Details button of a respective job where you want to apply
#And Verify all the details of the job after clicking on Job Details button "<JobTitle>" "<JobDesignation>" "<CityArea>" "<JobCity>" "<JobCountry>" "<MinExp>" "<MaxExp>" "<MaxSalary>" "<Industry>"
And Click on Apply Button
And Dialog box window display with Login and Apply without Login button
And Click on Apply Without Login button
And fill all the information as a candidate from jobboard "<CandidateEmail>","<CandidateName>","<ContactNumber>","<CandidateDesignation>","<DateOfBirth>","<Gender>","<OnNoticePeriod>","<CandidateNoticePeriod>","<CandidateExperience>","<CandidateCTC>","<CandidateExpectedCTC>","<CandidateCity>","<CandidateCityArea>","<ZipCode>","<Communicationmode>","<distance>","<permanentAddress>","<relocate>", "<ExpertiseLevel1>", "<ExpertiseLevel2>"
And click on Apply button
Then successful message should display as "Your application has been successfully sent to job publisher. Job publisher will review your application and you should see it status on your dashboard." with Ok button
And login with the same user "<emailaddress>" and "<password>"
And Go to job application
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And Click on Search button
Then Verify that candidate data displayed on job applications section "<CandidateName>" "<CandidateDesignation>" "<CandidateCityArea>" "<CandidateCity>" "<CandidateCountry>" "<CandidateExperience>" "<CandidateCTC>" "<CandidateExpectedCTC>" "<CandidateNoticePeriod>" "<JobTitle>"
And click on View Details button
And click on Yes button of confirmation message
And Verify that candidate data displayed after clicking on View Details button "<CandidateName>" "<JobTitle>" "<CandidateDesignation>" "<CandidateCityArea>" "<CandidateCity>" "<CandidateCountry>" "<ZipCode>" "<CandidateExperience>" "<CandidateCTC>" "<CandidateExpectedCTC>" "<CandidateNoticePeriod>" "<ContactNumber>" "<DateOfBirth>" "<CandidateEmail>" "<Communicationmode>" "<Gender>"
And click on Add to Job button
And click on ok button of confirmation popup
And click on Save button 
And if confirmation popup is displayed click on ok button
And Go to Workbench 
And Select the same job from job drop down "<JobTitle>" "<OrganizationName>"
And verify candidate card is displaying or not in New column "<CandidateName>"
And Click Candidate details eye icon on candidate card "<CandidateName>"
#And Verify the details on candidate details icon "<CandidateName>","<JobTitle>","<CandidateEmail>","<ContactNumber>","<CandidateDesignation>","<CandidateExperience>" "<CandidateNoticePeriod>""<CandidateCTC>" "<CandidateExpectedCTC>" "<CandidateCountry>","<CandidateCity>","<CabdidateCityArea>" "<CandidateCountry>"
#And Click on close button
And Verify the details on candidate details icon "<CandidateName>","<JobTitle>","<CandidateEmail>","<ContactNumber>","<CandidateDesignation>","<CandidateExperience>" "<OnNoticePeriod>>" "<CandidateNoticePeriod>" "<emailaddress>" "<CandidateCTC>" "<CandidateExpectedCTC>" "<CandidateCountry>","<CandidateCity>","<CabdidateCityArea>" "<CandidateCountry>"
And Click on close button


 
Examples:
 
 | emailaddress              | password  | JobTitle    | JobDesignation          | Industry      | MinExp | MaxExp | MinSalary  | MaxSalary | NoOfInterviews  | JobNoticePeriod | JobSkill1  | JobSkill2  | JobCity | CityArea    | JobCountry   |experience |  CandidateEmail     | CandidateName | ContactNumber | CandidateDesignation   | DateOfBirth |  Gender | OnNoticePeriod | CandidateNoticePeriod | LastWorkingDay  | CandidateExperience | CandidateCTC  | CandidateExpectedCTC  | CandidateCity | CandidateCityArea  | ZipCode | Communicationmode |ExpertiseLevel1 | ExpertiseLevel2 | CandidateCountry | Salaryoffered | distance | permanentAddress | relocate  | OrganizationName | Job                                 |
 | employermain01@gmail.com  | 12345     | Engineer    | Software Test Engineer  | IT-Software   |   3    |  4     | 500000     | 700000    |         2       |      60         |     Agile  |     JAVA   |    Pune | Kharadi     |    India     | 3         |  rahuljha@gmail.com | Rahul Jha     | 123456789     | Tester                 | 1/5/1995    | Male    |       No       |    60                 |       1/10/2020 | 3.5                 | 450000        | 550000                | Pune          | Viman Nagar        | 12345   | Call              | Expert         | Expert          | India            |    550000     |  2       |   Yes            |    Yes    |  EmpOrg          | Engineer - EmpOrg - Active          |
# | agencymain01@gmail.com    | 12345     | Teacher     | Maths Teacher           | Teaching      |  2     | 3      | 350000     | 500000    | 2               |      60         | Maths1     |   Maths2   | Pune    | Viman Nagar |  India       | 2         |  sonujain@gmail.com | Sonu Jain     | 987456123     | Professor              |  1/5/1990   | Male    |       Yes      |   60                  |      1/10/2020  | 2.2                 | 350000        | 450000                | Pune          | Yerwada            | 54321   | Call              | Expert         | Intermediate    | India            |    480000     |  3       |   Yes            |   Yes     |  EmpOrg          |  Teacher - EmpOrg - Active     |      
    
    
    
    
    
    # TC :- 462, 477 
    
 
    
    
    
    
    
    
    
    
    
    
