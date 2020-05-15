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
|Peter08        | peter08@gmail.com | 9564783126             | Candidate         | 12345    | Indian Standard Time | India   |