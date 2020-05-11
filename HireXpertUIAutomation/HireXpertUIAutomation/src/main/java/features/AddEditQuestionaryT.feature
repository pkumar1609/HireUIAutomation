Feature: HireXpert Add & Edit Questionary feature

Scenario Outline: Verify the functionality of Add Questionary and Edit question on questionary page

Given Open browser
When login with Employer credential Who already have a Job added
And Go to Workbench tab and select one job from job drop down 
And Click on Questionnaire tab
And Enter a "<Question>" and enter "<Marks>" accordingly to that question
And Enter the answer "<answer1>" "<answer2>" "<answer3>" "<answer4>" "<answer5>" and enter Marks "<marks1>" "<marks2>" "<marks3>" "<marks4>" "<marks5>" accordingly to the answer 
And click on Save Changes button
And Enter the cutoff & rejection percentage "<cuttoffpercentage>" "<rejectionpercentage>" .
And Click on submit.
And Click on Questionnaire tab
And Click on edit button of question to edit the following question "<question>" and save the changes by clicking on Save Changes button
And Click on submit.
Then Collect Answer icon should reflect on candidates card for giving answers 

Examples:
|  Question         | Marks |  answer1  |   answer2  |   answer3   |  answer4  |   answer5         |  marks1 |  marks2 |  marks3 |  marks4 |  marks5 | cuttoffpercentage |  rejectionpercentage | question       |
| Total Experience  |   50  |  Fresher  |   0-1 Year |   1-2 Year  |  2-3 Year | more than 3 years |  5      |   5     |    10   |   10    | 20      |       70          |         30           | Work Experience|