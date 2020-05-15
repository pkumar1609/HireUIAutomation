Feature: HireXpert Questionary feature

Scenario Outline: Verify the functionality of Add Questionary and Edit question on questionary page

Given Open browser
When Login with Employer credential Who already have a Job added
And Go to Workbench tab and select one job from job drop down 
And Click on Questionnaire tab
And Enter a "<Question>" and enter "<Marks>" accordingly to that question
And Enter the answer "<answer1>" "<answer2>" "<answer3>" "<answer4>" "<answer5>" and enter Marks "<marks1>" "<marks2>" "<marks3>" "<marks4>" "<marks5>" accordingly to the answer 
And click on Save Changes button
And Enter the cutoff & rejection percentage "<cuttoffpercentage>" "<rejectionpercentage>" 
And click on submit
And Click on Questionnaire tab
And Click on edit button of question to edit the following question "<question>" and save the changes by clicking on Save Changes button
And click on submit
Then Collect Answer icon should reflect on candidates card for giving answers 

Examples:
|  Question         | Marks |  answer1  |   answer2  |   answer3   |  answer4  |   answer5         |  marks1 |  marks2 |  marks3 |  marks4 |  marks5 | cuttoffpercentage |  rejectionpercentage | question       |
| Total Experience  |   50  |  Fresher  |   0-1 Year |   1-2 Year  |  2-3 Year | more than 3 years |  5      |   5     |    10   |   10    | 20      |       70          |         30           | Work Experience|



Scenario Outline: Verify the functionality of Delete Questionnaire button and Delete icon.

Given Open browser
When Login with Employer credential Who already have a Job added
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
