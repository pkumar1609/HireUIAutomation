Feature: HireXpert Reset password Feature. 


@resetPassword 
Scenario Outline: Verify change password for all users except candidate. 

	Given user login to HireXpert "<Username>","<Password>"
	When when the user clicks on the change password on the profile window 
	When The change password pop up window appears, and the user fills all the data "<curPassword>","<nPassword>","<conPassword>"
	And clicks on the submit button 
	And Successful pop-up message dispaly as "Your password has been successfully updated  " with OK button
	Then Logout from myAccount 
	And Users should not be able to login with an old password "<Username1>","<Password1>"
	And Users should be able to login with a new password "<Password>" 
	
	Examples: 
	|Username               |Password|curPassword|nPassword|conPassword|Username1             |Password1|
	|deepakemp@gmail.com    |12345678|12345678   |12345678 |12345678   |deepakemp@gmail.com   |12345    |
	|DeepakAgency@gmail.com |12345678|12345678   |12345678 |12345678   |DeepakAgency@gmail.com|12345    |