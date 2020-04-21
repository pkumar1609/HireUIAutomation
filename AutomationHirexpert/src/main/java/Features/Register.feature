Feature: HireXpert Registration feature

Scenario Outline: To verify the fields/button on Registration popup window and check functionality of Registration

Given User open browser
When click on Register link       
Then verify the fields and buttons present on the register dialog box
And click on Close button
When click on Register link
And enter "<Name>" "<Email>" "<Contact Number>"
And Select value from dropdown of "<User Type>" "<Time Zone>" "<Country>"
And click on Close button
And Click on Yes button of confirmation popup
When click on Register link
And enter "<Name>" "<Email>" "<Contact Number>"
And Select value from dropdown of "<User Type>" "<Time Zone>" "<Country>"
And click on Submit button
Then User should get confirmation message and click on OK button
And enter "<Email>" "<Password>" 
And click on Signin button


Examples: 
     | Name  |   Email           | Contact Number | User Type | Time Zone            | Country | Password | EmailAddress    |
     | Mac28 |  mac28@gmail.com  | 211394644      | Candidate | Indian Standard Time | India   | 12345    | mac28@gmail.com |
     | Mac29 |  mac29@gmail.com  | 211314644      | Agency    | Indian Standard Time | India   | 12345    | mac29@gmail.com |
     | Mac30 |  mac30@gmail.com  | 123456456      | Employer  | Indian Standard Time | India   | 12345    | mac30@gmail.com |
