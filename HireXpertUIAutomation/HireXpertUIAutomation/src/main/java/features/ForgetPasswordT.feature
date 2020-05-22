Feature: HireXpert Forget Password feature

#TC:- 81, 10
Scenario Outline: Forgot password functionality for not registered user

Given User open browser
When Click on forgot password link
And Enter an email id which is not registered and click on submit button "<emailid>" 
Then Verify that user get an error message as "aa11bb@gmail.com is not registered with us. Please register first." or not

Examples:

| emailid         |
|aa11bb@gmail.com |