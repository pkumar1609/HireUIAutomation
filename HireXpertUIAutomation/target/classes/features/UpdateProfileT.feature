Feature: HireXpert Update Profile feature

Scenario Outline: Verify that Agency is not able to continue without completing the profile and Agency is able to update profile.

Given User open browser
When click on Register link 
And enter agency details "<AgencyName>" "<AgencyEmail>" "<AgencyContactNumber>" 
And Select value from dropdown for agency "<AgencyUserType>" "<timezone>" "<country>"
And click on Submit button
And User should get confirmation message and click on OK button
And enter agency email and password "<AgencyEmail>" "<password>" 
And click on Signin button
And Click on Close button on Agency Update Profile popup
And Click on Yes button on the confirmation message
And Click on Close button on Agency Update Profile popup
And Click on No button on the confirmation message
And Login with that agency "<AgencyEmail>" "<password>"
And click on Signin button
And Update Agency Profile  "<AgencyAddress>" "<AgencyOrganizationName>" "<AgencyWebsite>" "<AgencyCity>"
And click on Submit button
And Click on Update Profile tab
And Make changes in Agency profile "<organizationname>"
And click on Submit button

Examples:

| AgencyName | AgencyEmail        | AgencyContactNumber | AgencyUserType | timezone              | country | AgencyAddress | AgencyOrganizationName | AgencyWebsite     | AgencyCity | organizationname | password |
| Agency15   | agency15@gmail.com | 565566625           |   Agency       |  Indian Standard Time |  India  | Viman Nagar   | AgencyOrg              | www.agencyorg.com | Pune       | OrgAgency        | 12345    |


Scenario Outline: Verify that Employer is not able to continue without completing the profile and Employer is able to update profile.

Given User open browser
When click on Register link 
And enter employer details "<EmployerName>" "<EmployerEmail>" "<EmployerContactNumber>" 
And Select value from dropdown for employer "<EmployerUserType>" "<timezone>" "<country>"
And click on Submit button
And User should get confirmation message and click on OK button
And enter employer email and password "<EmployerEmail>" "<password>" 
And click on Signin button
And Click on Close button on Employer Update Profile popup
And Click on Yes button on the confirmation message
And Click on Close button on Employer Update Profile popup
And Click on No button on the confirmation message
And Login with that employer "<EmployerEmail>" "<password>"
And click on Signin button
And Update Employer Profile  "<EmployerAddress>" "<EmployerOrganizationName>" "<EmployerWebsite>" "<EmployerCity>"
And click on Submit button
And Click on Update Profile tab
And Make changes in Employer profile "<organizationname>"
And click on Submit button

Examples:

| EmployerName | EmployerEmail          | EmployerContactNumber | EmployerUserType | timezone              | country | EmployerAddress | EmployerOrganizationName | EmployerWebsite     | EmployerCity | organizationname | password |
|Employer03    | employer03@gmail.com   | 565566625             |   Employer       |  Indian Standard Time |  India  | Viman Nagar     | EmployerOrg              | www.employerorg.com | Pune         | OrgEmployer      | 12345    |






