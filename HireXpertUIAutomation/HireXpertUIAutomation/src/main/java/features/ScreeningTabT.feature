Feature: HireXpert Screening tab feature

Scenario Outline: Verify the functionality of Screening tab 

Given Open browser
When login with Employer credential Who already have a Job added and candidates are added for that job
And Go to Workbench tab and select the job from job drop down 
And Click on Add Questionnaire 
And Add question and click on save changes button "<QUESTION1>" "<QMARKS1>" "<ANSWER1>" "<ANSWER2>" "<MARKS1>" "<MARKS2>" 
And Enter the cutoff & rejection percentage "<cuttoffpercentage>" "<rejectionpercentage>"
And Click on submit
And Click on  Collect Answers icon on candidate card.
And Fill all the Questions answers 
And Click on submit
And Click on screening tab
Then  verify the status of candidate 

Examples:

| QUESTION1     | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | cuttoffpercentage | rejectionpercentage |
| NP Negotiable |  50     |  Yes    |   No    |  30    |  20    |   80              |      20             |