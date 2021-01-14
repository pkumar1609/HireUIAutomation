Feature: Marketplace Feature

@TC351 @BVTC @market
Scenario Outline: To verify the functionality to share job with market place.
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And user enters valid credentials "<Employer>","<Password>"
And Go to workbench
And Add job
|title		   |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|Biii Developer|developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |Java|
And Select a added job
And Click on share job with market place
And change information and click on submit
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
|8.33                 |30 Days       |60 Days      |90 Days           |
And Click on Employer marketplace tab
Then Job should be list out in market place page on employer side.
And Logout from App
And Click on Employer-Agency Signin link
And login as a support user
And verify shared job is displaying on support login
And Click on approve
And Logout as a support user
And Click on Employer-Agency Signin link
And user enters valid credentials "<Agency>","<Password>"
And Go to agency marketplace tab
Then All shared job by any employer should be show for all register agencies
And Click on Apply button of job
And Logout from App
And Click on Employer-Agency Signin link
And user enters valid credentials "<Employer>","<Password>"
And click on Employer marketplace tab
And Select that job in filter on job proposal section
And Click on reject button of that proposal
And Job proposal area should show rejected status
And Logout from App
And Click on Employer-Agency Signin link
And user enters valid credentials "<Agency>","<Password>"
And Go to agency marketplace tab
Then status of that request should show as rejected
And Click on Review button
Then Agreement popup should show request information in read only mode
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|Employer|Agency|
|8.33                 |30 Days       |60 Days      |90 Days           |pemp    |pagy  |
And Logout from App
And Click on Employer-Agency Signin link
And user enters valid credentials "<Employer>","<Password>"
And click on Employer marketplace tab
And Select that job in filter on job proposal section
And Click on Review button
And Now click on accept and sign button
Then the status should be change as Employer signed
And Logout from App
And Click on Employer-Agency Signin link
And user enters valid credentials "<Agency>","<Password>"
And Go to agency marketplace tab
Then status should display as employer signed
Examples:
|Employer	   |Password |Agency         |Agency2        |
|pemp@gmail.com|12345    |pagy@gmail.com|pagy1@gmail.com|

#TC 351,359,357, 361

@TC363_375 @BVTC @market
Scenario Outline: To check the functionality of Review request and add candidate
Given User must be registered
And Click on Employer-Agency Signin link
And user enters valid credentials "<Employer>","<Password>"
And Go to workbench
And Add job
|title		     |designation      |industry    |location |budget |minexp|maxexp|minsal|maxsal|Name |         Email   | contact  |totalinterviews|organization|agyorganization|functionalArea|
|Uxn12 Developer  |developer        |IT software |pune     |400000 |1     |2     |450000|800000|pe1  | pe1@gmail.com   | 1234564  |2			   |Hirexpert |rahitech       |java|
And Select a added job
And Click on share job with market place
And change information and click on submit
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
|8.33                 |30 Days       |60 Days      |90 Days           |
And Click on Employer marketplace tab 
Then Job should be list out in market place page on employer side.
And Logout from App
And Click on Employer-Agency Signin link
And login as a support user
And verify shared job is displaying on support login
And Click on approve
And Logout as a support user
And Click on Employer-Agency Signin link
And user enters valid credentials "<Agency>","<Password>"
And Go to agency marketplace tab
And Click on Apply button of job
And Logout from App
And Click on Employer-Agency Signin link
And user enters valid credentials "<Employer>","<Password>"
And click on Employer marketplace tab
And Select that job in filter on job proposal section
And Click on Review button
And Now click on accept and sign button

And Logout from App
And Click on Employer-Agency Signin link
And user enters valid credentials "<Agency>","<Password>"
And Go to agency marketplace tab
And Click on Review button
And Now click on accept and sign button
And Logout from App
And Click on Employer-Agency Signin link
And user enters valid credentials "<Employer>","<Password>"
And click on Employer marketplace tab
And Edit the job from marketplace job section 
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
|9.0                  |30 Days       |60 Days      |90 Days           |
And Logout from App
And Click on Employer-Agency Signin link
And user enters valid credentials "<Agency>","<Password>"
And Go to workbench
And Select a added job
And Go to agreement and click on view button
Then all terms and condition remain same for agency one
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|Employer|Agency|
|8.33                 |30 Days       |60 Days      |90 Days           |pemp    |pagy  |
And Click on add candidate
And Enter basic details of candidate "<CandidateEmail>","<profiletitle>","<Name>","<ContactNumber>","<Designation>","<Date>","<Gender>","<OnNoticePeriod>","<NoticePeriod>","<LastWorkingDay>","<experience>","<CTC>","<expectedCTC>","<Country>","<City>","<CityArea>","<ZipCode>","<Communicationmode>","<Salaryoffered>","<distance>","<permanentAddress>","<relocate>"
Then User should be able to add candidate
And Logout from App
And Click on Employer-Agency Signin link
And user enters valid credentials "<Agency2>","<Password>"
And Go to agency marketplace tab
And Click on Apply button of job
And Click on Review button
Then All updated terms and condition should show for new agency
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|Employer|Agency|
|9                    |30 Days       |60 Days      |90 Days           |pemp    |pagy1 |

Examples:
|Employer	   |Password |Agency        |Agency2        |CandidateEmail      |profiletitle         |Name     |ContactNumber |Designation   |Date            |Gender  |OnNoticePeriod|NoticePeriod|LastWorkingDay|experience|CTC   |expectedCTC|Country|City  |CityArea   |ZipCode|Communicationmode|Salaryoffered|distance|permanentAddress|relocate|Skill1  |Skill2       |Skill3    |level1           |level2        |level3  |Weightage1 |Weightage2|Weightage3|certificate1|certificate2|certificate3|remark1            |remark2        |remark3         |certificateforskill1|certificateforskill2|
|pemp@gmail.com|12345    |kagy@gmail.com|pagy1@gmail.com|hirecan08@gmail.com |jr software developer|hirecan08|9890685538    |Sr.developer  |14/02/1995      |Female  |Yes           |25          |01/09/2021    |1.5       |800000|800000     | India |wardha|Arvi naka  |455966 |Call             |800000       |4       |No              |No      |JAVA    |advanced java|JavaScript|Basic Knowledge  | Intermediate | Expert | Mandatory |Preferred |Optional  |Yes         |No          |No          |provide certificate|spring,hybernet|advanced version|sun microsoft       |advanced version    |

