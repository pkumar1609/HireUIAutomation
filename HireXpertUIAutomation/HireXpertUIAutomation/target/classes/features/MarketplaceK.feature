Feature: Marketplace Feature

@TC351
Scenario: To verify the functionality to share job with market place.
Given user is registered 
When title of login page is Home
And Click on Employer-Agency Signin link
And Login with employer
And go to the workbench tab
And Select job from jobs drop down
And Click on share job with market place
And change information and click on submit
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
|8.33                 |30 Days       |60 Days      |90 Days           |
And Click on Employer marketplace tab 
Then Job should be list out in market place page on employer side.
And logout with employer and Login with agency
And Go to agency marketplace tab
Then All shared job by any employer should be show for all register agencies


@TC359_357
Scenario: To check the functionality of Reject proposal and view button on Agency profile
Given user is registered 
And Click on Employer-Agency Signin link
Given Job must be share to market place
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
|8.33                 |30 Days       |60 Days      |90 Days           |
And logout with employer and Login with agency
And Go to agency marketplace tab
And Click on Apply button of job
And logout with agency and Login with employer
And click on Employer marketplace tab
And Select that job in filter on job proposal section
And Click on reject button of that proposal
And Job proposal area should show rejected status
And logout with employer and Login with agency
And Go to agency marketplace tab
Then status of that request should show as rejected
And Click on Review button
Then Agreement popup should show request information in read only mode
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
|8.33                 |30 Days       |60 Days      |90 Days           |


@TC361
Scenario: To check the functionality of Review request
Given user is registered 
And Click on Employer-Agency Signin link
Given Job must be share to market place
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
|8.33                 |30 Days       |60 Days      |90 Days           |
And logout with employer and Login with agency
And Go to agency marketplace tab
And Click on Apply button of job
And logout with agency and Login with employer
And click on Employer marketplace tab
And Select that job in filter on job proposal section
And Click on Review button
And Now click on accept and sign button
Then the status should be change as Employer signed
And logout with employer and Login with agency
And Go to agency marketplace tab
Then status should display as employer signed



@TC363_375
Scenario: To check the functionality of Review request and add candidate
Given user is registered 
And Click on Employer-Agency Signin link
Given Job must be share to market place
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
|8.33                 |30 Days       |60 Days      |90 Days           |
And logout with employer and Login with agency
And Go to agency marketplace tab
And Click on Apply button of job
And logout with agency and Login with employer
And click on Employer marketplace tab
And Select that job in filter on job proposal section
And Click on Review button
And Now click on accept and sign button
And logout with employer and Login with agency
And Go to agency marketplace tab
And Click on Review button
And Now click on accept and sign button
And logout with agency and Login with employer
And click on Employer marketplace tab
And Edit the job from marketplace job section 
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
|9.0                  |30 Days       |60 Days      |90 Days           |
And logout with employer and Login with agency
And go to the workbench tab
And Select job from jobs drop down
And Go to agreement and click on view button
Then all terms and condition remain same for agency one
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
|8.33                 |30 Days       |60 Days      |90 Days           |
And Click on add candidate
And Enter All details of candidate
Then User should be able to add candidate
And logout with employer and Login with another agency 
And Go to agency marketplace tab
And Click on Apply button from new agency
And Click on Review button
Then All updated terms and condition should show for new agency
|Commission Percentage|Invoice Period|Payment Cycle|Replacement Period|
|9                    |30 Days       |60 Days      |90 Days           |



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
