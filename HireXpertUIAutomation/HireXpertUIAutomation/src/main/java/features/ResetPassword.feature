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
@resetPassword 
Scenario Outline: Verify change password for candidate. 
				Given Candididate login to HireXpert "<Username>","<Password>" 
				When when the user clicks on the change password on the profile window 
				When The change password pop up window appears, and the user fills all the data "<curPassword>","<nPassword>","<conPassword>" 
				And clicks on the submit button 
				And Successful pop-up message dispaly as "Your password has been successfully updated  " with OK button 
				Then Logout from myAccount 
				And Users should not be able to login with an old password "<Username1>","<Password1>" 
				And Users should be able to login with a new password "<Password>" 
			
				Examples: 
				|Username              |Password|curPassword|nPassword|conPassword|Username1             |Password1|
				|candidate100@gmail.com|12345678|12345678   |12345678 |12345678   |candidate100@gmail.com|12345    |
				
@resetPassword 
Scenario Outline:verify  functionality of Change ChangeLoginEmail id (Non Candidate) 
					Given User login into HireXpert "<Username>","<Password>" 
					When User clicks the ChangeLoginEmail   option on the profile  window 
					And The Change  Login Email  pop up window appears , fill the  data click on submit button "<Username>","<Password>" 
					Then Successful pop-up message displayed as "Your login email has been changed. You will be redirected to the home page to login with a new login email." 
					And Users should not  be able to login with old Email id "<Username1>","<Password>" 
					And Users should be able to login with a new Email id "<Username>" 
					
					Examples: 
						|Username             |Username1         |Password|
						|employer101@gmail.com|employer@gmail.com|12345   |
						|agency101@gmail.com  |agency@gmail.com  |12345   |
@resetPassword 
Scenario Outline: verify  Cancel should close the pop up window.  (change password) 
				Given User login to HireXpert Application"<Username>","<Password>" 
				When  User clicks the Change Password   option on the profile  window. 
				And The Change password   pop up window appears. 
				Then Users should remain on a Dashboard page. 
							
				Examples: 
				|Username             |Password|
				|employer101@gmail.com|12345   |
				|agency101@gmail.com  |12345   |
								
@resetPassword 
Scenario Outline: verify  Cancel should close the pop up window.  (change Login Email ) 
				Given User login to HireXpert Application(change Login Email )"<Username>","<Password>" 
				When  User clicks the Change Login Email  option on the profile  window. 
				And The Change  Login Email    pop up window appears. 
				And When Users click the cancel button. 
				Then Users should remain on a Dashboard page. 
									
				Examples: 
				|Username             |Password|
				|employer101@gmail.com|12345   |
				|agency101@gmail.com  |12345   |						