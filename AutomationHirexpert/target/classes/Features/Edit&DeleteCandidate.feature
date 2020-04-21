Feature: Hirexpert Edit & Delete Candidate feature

Scenario Outline: Verify the functionality of Edit Candidate & Delete Candidate with Employer login

Given Open the browser
When login with Employer credential.
And Go to Workbench and select the job from drop down for which candidate is added.
And Click on Edit Candidate icon on candidate card.
And Make the changes in "<ContactNumber" field
And Click on save button
Then click on Delete Candidate icon on Candidate card

Examples:
  |   ContactNumber   | 
  |   123456789       |