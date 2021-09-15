Feature: Candidate Pool Test Scenario
@candidatePool
Scenario Outline:  User should be able to add new candidates to the candidate pool. 
Given An employer/agency user logged in to HireXpert "<Username>","<Password>"
When Employer visits Recruitment menu, selects Candidate Pool and clicks on ‘Add Candidate’ button.
Then AddCandidate pop-up is displayed. Employer fills all mandatory information and clicks ‘Submit’
	
	Examples: 
		|Username       |Password|Role              |Tag          |CTC   |ECTC  |
		|pemp@gmail.com |12345	 |Software Developer|New Candidate|400000|600000|






		