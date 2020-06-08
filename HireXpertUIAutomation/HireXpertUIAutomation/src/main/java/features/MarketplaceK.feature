Feature: Marketplace Feature

@TC351 @BVT
Scenario: To verify the functionality to share job with market place.
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And Go to workbench
And Add job
|title              |designation |industry   |jobrole        |location |budget |minexp|maxexp|
|marketjob11        |developer   |IT software|java developer |pune     |400000 |1     |2     |
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
|title      |marketjob11 |
And Click on approve
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Go to agency marketplace tab
Then All shared job by any employer should be show for all register agencies
And Click on Apply button of job
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And click on Employer marketplace tab
And Select that job in filter on job proposal section
And Click on reject button of that proposal
And Job proposal area should show rejected status
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Go to agency marketplace tab
Then status of that request should show as rejected
And Click on Review button
Then Agreement popup should show request information in read only mode
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|Employer|Agency|
|8.33                 |30 Days       |60 Days      |90 Days           |pemp    |pagy  |
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And click on Employer marketplace tab
And Select that job in filter on job proposal section
And Click on Review button
And Now click on accept and sign button
Then the status should be change as Employer signed
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Go to agency marketplace tab
Then status should display as employer signed


#@TC359_357 @BVT
#Scenario: To check the functionality of Reject proposal and view button on Agency profile
#Given User must be registered
#And Click on Employer-Agency Signin link
#Given Job must be share to market place
#|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
#|8.33                 |30 Days       |60 Days      |90 Days           |
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And Go to agency marketplace tab
#And Click on Apply button of job
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And click on Employer marketplace tab
#And Select that job in filter on job proposal section
#And Click on reject button of that proposal
#And Job proposal area should show rejected status
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And Go to agency marketplace tab
#Then status of that request should show as rejected
#And Click on Review button
#Then Agreement popup should show request information in read only mode
#|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
#|8.33                 |30 Days       |60 Days      |90 Days           |


@TC361 @BVT
Scenario: To check the functionality of Review request
Given User must be registered
And Click on Employer-Agency Signin link
Given Job must be share to market place
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
|8.33                 |30 Days       |60 Days      |90 Days           |
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Go to agency marketplace tab
And Click on Apply button of job
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And click on Employer marketplace tab
And Select that job in filter on job proposal section
And Click on Review button
And Now click on accept and sign button
Then the status should be change as Employer signed
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Go to agency marketplace tab
Then status should display as employer signed



@TC363_375 @BVT
Scenario: To check the functionality of Review request and add candidate
Given User must be registered
And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And Go to workbench
And Add job
|title              |designation |industry   |jobrole        |location |budget |minexp|maxexp|
|marketjob12       |developer   |IT software|java developer |pune     |400000 |1     |2     |
#And Select a added job
#And Click on share job with market place
#And change information and click on submit
#|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
#|8.33                 |30 Days       |60 Days      |90 Days           |
#And Click on Employer marketplace tab 
#Then Job should be list out in market place page on employer side.
#And Logout from App
#And Click on Employer-Agency Signin link
#And login as a support user
#And verify shared job is displaying on support login
#|title      |marketjob11 |
#And Click on approve
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And Go to agency marketplace tab
#And Click on Apply button of job
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And click on Employer marketplace tab
#And Select that job in filter on job proposal section
#And Click on Review button
#And Now click on accept and sign button
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And Go to agency marketplace tab
#And Click on Review button
#And Now click on accept and sign button
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And click on Employer marketplace tab
#And Edit the job from marketplace job section 
#|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
#|9.0                  |30 Days       |60 Days      |90 Days           |
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And Go to workbench
#And Select a added job
#And Go to agreement and click on view button
#Then all terms and condition remain same for agency one
#|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|Employer|Agency|
#|8.33                 |30 Days       |60 Days      |90 Days           |pemp    |pagy  |
#And Click on add candidate
#And Enter All details of candidate
#Then User should be able to add candidate
#And Logout from App
#And Click on Employer-Agency Signin link
And Login with another agency 
And Go to agency marketplace tab
And Click on Apply button of job
And Click on Review button
Then All updated terms and condition should show for new agency
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|Employer|Agency|
|9                    |30 Days       |60 Days      |90 Days           |pemp    |pagy1 |



#@TC375
#Scenario: To check the functionality of Review request
#Given Job must be share to market place
#|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
#|8.33                 |30 Days       |60 Days      |90 Days           |
#And Login with agency one
#And click on marketplace tab
#And Click on Apply button of job
#And login with Employer
#And Go to marketplace tab
#And Select job proposal
#And Click on Accept and sign button from Employer
#And Again login with agency one
#And Click on marketplace tab for agency one
#And Click on Review button
#And Click on Accept and sign button from agency
#And Now Again login with Agency one
#And navigate to agency workbench tab
#And Select job from jobs drop down
#And Click on add candidate
#And Enter All details of candidate
#Then User should be able to add candidate
