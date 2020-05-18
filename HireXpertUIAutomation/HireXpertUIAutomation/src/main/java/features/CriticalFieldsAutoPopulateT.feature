Feature: HireXpert Critical fields auto populate feature

Scenario Outline: To Verify that critical field while registering, auto populate on Update Candidate Profile.

Given User open browser
When click on Register link       
And enter candidate details "<CandidateName>" "<CandidateEmail>" "<CandidateContactNumber>" 
And Select value from dropdown for candidate "<CandidateUserType>" "<timezone>" "<country>"
And click on Submit button
And User should get confirmation message and click on OK button
And enter candidate email and password "<CandidateEmail>" "<password>" 
And click on Signin button
Then verify the Auto Populated fields on Candidate update profile popup window

Examples:

| CandidateName | CandidateEmail    | CandidateContactNumber | CandidateUserType | password | timezone             | country |
|Peta07         | peta07@gmail.com  | 9564783126             | Candidate         | 12345    | Indian Standard Time | India   |


Scenario Outline: To Verify that critical field while registering, auto populate on Update Agency Profile.

Given User open browser
When click on Register link       
And enter agency details "<AgencyName>" "<AgencyEmail>" "<AgencyContactNumber>" 
And Select value from dropdown for agency "<AgencyUserType>" "<timezone>" "<country>"
And click on Submit button
And User should get confirmation message and click on OK button
And enter agency email and password "<AgencyEmail>" "<password>" 
And click on Signin button
Then verify the Auto Populated fields on agency update profile popup window

Examples:

| AgencyName    | AgencyEmail       | AgencyContactNumber    | AgencyUserType    | password | timezone             | country |
|Peta03         | peta04@gmail.com  | 9564783126             | Agency            | 12345    | Indian Standard Time | India   |



Scenario Outline: To Verify that critical field while registering, auto populate on Update Employer Profile.

Given User open browser
When click on Register link       
And enter employer details "<EmployerName>" "<EmployerEmail>" "<EmployerContactNumber>" 
And Select value from dropdown for employer "<EmployerUserType>" "<timezone>" "<country>"
And click on Submit button
And User should get confirmation message and click on OK button
And enter employer email and password "<EmployerEmail>" "<password>" 
And click on Signin button
Then verify the Auto Populated fields on employer update profile popup window

Examples:

| EmployerName  | EmployerEmail     | EmployerContactNumber  | EmployerUserType  | password | timezone             | country |
|Peta05         | peta06@gmail.com  | 9564783126             | Employer          | 12345    | Indian Standard Time | India   |







