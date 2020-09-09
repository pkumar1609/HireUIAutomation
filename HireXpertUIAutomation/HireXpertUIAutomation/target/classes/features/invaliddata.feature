Feature: User Management

@Bvtc @invalid
  Scenario Outline: Verify that User is not able to Login with invalid credentials
  
    Given User is on Home page of application
    
    When title of page is HireXpert
   	And Click on Employer-Agency Signin link
    And enter invalid user email address and invalid password which is not registered "<username>" and "<password>"
    Then User should not be able to login to application and error message should display 
    And enter valid user email address and invalid password which is registered to application "<username>" and "<password>"
    Then error message should display 
    And now keep Email address field blank and tab 
   	And observe error message for Email address field
   	And keep password field blank and tab
   	And observe error message for Password field
   	Then Sign in button should not get enabled without entering email address or password and User should get error message for mandatory fields
#   And close the browser
    
#TC ID - 7,8,9  
Examples:
|username           |password |  
|asdfghj@gmail.com  | asdfghj |
|pemp@gmail.com     | asdfghj |
	
