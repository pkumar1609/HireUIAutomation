Feature: HireXpert Forget Password feature

@Regression
Scenario Outline: Forgot password functionality for not registered user

Given User open browser
And click on Login link
#When click on Employer-Agency SignIn link
And Click on forgot password link
And Enter an email id which is not registered and click on submit button "<emailid>" 
Then Verify that user get an error message as "aa11bb@gmail.com is not registered with us. Please register first." or not

Examples:

| emailid         |
|aa11bb@gmail.com |

#TC:- 83

# No change is required. In email id there should be email on non registered user.