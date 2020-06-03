Feature: HireXpert Questionary feature

#TC :- 120, 122, 138, 234, 136, 124
Scenario Outline: Verify the functionality of Add Questionary and Edit question on questionary page. Verify the Collect Answer icon Functionality .

Given Open browser
When click on Employer-Agency SignIn link
And Login with Employer credential Who already have a Job added and a candidate added to that job
And Go to Workbench tab and select one job from job drop down 
And Verify Collect Answer icon when no questionary is added for that job
And Click on Questionnaire tab
And Enter a "<Question>" and enter "<Marks>" accordingly to that question
And Enter the answer "<answer1>" "<answer2>" and enter Marks "<marks1>" "<marks2>" accordingly to the answer 
And click on Save Changes button
And Enter the cutoff & rejection percentage "<cuttoffpercentage>" "<rejectionpercentage>" 
And click on submit
And Click on Questionnaire tab
And Click on edit button of question to edit the following question "<question>" and save the changes by clicking on Save Changes button
And click on submit
Then Collect Answer icon should reflect on candidates card for giving answers 
And Click on  Collect Answers icon on candidate card
And answer the question by selecting the provided options 
And verify if the answer is correct it should display pass icon on candidate card or it should display fail icon if the asnswer is wrong with the candidate card in screened column
And click on logout tab
And click on Job Seeker(Candidate) Sign In link
And login as the same candidate "candidate01@gmail.com" "12345" and click on Sign in 
And verify on candidate dashboard that job is displayed with Questionnaire tab or not
Then click on that Questionnaire tab and verify the answers given by employer

Examples:
|  Question               | Marks  |  answer1  |   answer2  |  marks1   |  marks2 | cuttoffpercentage |  rejectionpercentage | question              |
| Do you have Passport    |   100  |  Yes      |   No       |  100      |   0     |       70          |         30           | Do you have Passport ?|



Scenario Outline: Verify the functionality of Delete Questionnaire button and Delete icon.

Given Open browser
When click on Employer-Agency SignIn link
And Login with Employer credential Who already have a Job added and a candidate added to that job
And Go to Workbench tab and select one job from job drop down
And Click on Questionnaire tab
And Enter first question "<QUESTION1>" and marks "<QMARKS1>" 
And Enter the answer "<ANSWER1>" "<ANSWER2>"  and enter Marks "<MARKS1>" "<MARKS2>" for first question
And click on Save Changes button
And Enter second question "<QUESTION2>" and marks "<QMARKS2>" 
And Enter the answer "<ANSWER3>" "<ANSWER4>"  and enter Marks "<MARKS3>" "<MARKS4>" for second question
And click on Save Changes button
And Enter thrid question "<QUESTION3>" and marks "<QMARKS3>" 
And Enter the answer "<ANSWER5>" "<ANSWER6>" and enter Marks "<MARKS5>" "<MARKS6>"  for thrid question
And click on Save Changes button
And Enter the cutoff & rejection percentage "<cuttoffpercentage>" "<rejectionpercentage>"
And click on submit
And Click on Questionnaire tab
And click on delete icon to delete any one of question
And click on submit
And Click on Questionnaire tab
And Click on Delete Questionnarie button
And click on ReloadCandidate button
Then Collect Answer icon should reflect on candidates card for giving answers 


Examples: 

| QUESTION1     | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | QUESTION2    | QMARKS2 | ANSWER3 | ANSWER4 | MARKS3 | MARKS4 |QUESTION3  | QMARKS3 | ANSWER5 | ANSWER6     | MARKS5 | MARKS6 | cuttoffpercentage | rejectionpercentage |
| NP Negotiable |  50     |  Yes    |   No    |  30    |  20    |Can Relocate? | 50      |  Yes    |  No     |  50    |   0    | Work Exp  |  100    | Fresher | Experienced | 50     |  50    |   80              |      20             |
