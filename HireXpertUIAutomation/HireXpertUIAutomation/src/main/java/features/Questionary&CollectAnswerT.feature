Feature: HireXpert Questionary feature

@BVT
Scenario Outline: Verify the functionality of Add Questionary, Edit question on questionary page and delete Questionary by Delete Questionnaire button and Delete icon.

Given Open browser
When click on Employer-Agency SignIn link
And login with Employer credential.
And Go to Workbench 
And Add a new Job as employer
And Select the same job from job drop down
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Location>" "<Communicationmode>"
And Click on save button 
And Verify candidate is displayed on workbench
And Verify Collect Answer icon when no questionary is added for that job
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
And Click on edit button of question to edit the following question "<question>" and save the changes by clicking on Save Changes button
And click on submit
Then Collect Answer icon should reflect on candidates card for giving answers 
And Click on Questionnaire tab
And click on delete icon to delete any one of question
And click on submit
And Click on Questionnaire tab
And Click on Delete Questionnarie button
And click on ReloadCandidate button
Then Collect Answer icon should reflect on candidates card for giving answers 
And click on close job button and delete the job

Examples:
| CandidateEmail | Name  | ContactNumber | Designation | Gender | NoticePeriod | Location | Communicationmode | QUESTION1     | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | QUESTION2    | QMARKS2 | ANSWER3 | ANSWER4 | MARKS3 | MARKS4 |QUESTION3  | QMARKS3 | ANSWER5 | ANSWER6     | MARKS5 | MARKS6 | cuttoffpercentage | rejectionpercentage | question      |
|rahul@gmail.com | Rahul |   918635241   | Tester      | Male   | 60           | Pune     | Call              | NP Negotiable |  50     |  Yes    |   No    |  30    |  20    |Can Relocate? | 50      |  Yes    |  No     |  50    |   0    | Work Exp  |  100    | Fresher | Experienced | 50     |  50    |   80              |      20             | NP Negotiable |  

#TC :- 120, 122, 138, 234, 136, 

# If DB clear, register the employer first = employermain01@gmail.com. otherwise no change required












#Scenario Outline: Verify the functionality of Delete Questionnaire button and Delete icon.
#
#Given Open browser
#When click on Employer-Agency SignIn link
#And login with Employer credential.
#And Go to Workbench 
#And Add a new Job as employer
#And Select the same job from job drop down
#And Click on Add Candidate button.
#And Enter valid "<CandidateEmail>" 
#And click on find button 
#And fill all the information "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Location>" "<Communicationmode>"
#And Click on save button 
#And Verify candidate is displayed on workbench
#And Click on Questionnaire tab
#And Enter first question "<QUESTION1>" and marks "<QMARKS1>" 
#And Enter the answer "<ANSWER1>" "<ANSWER2>"  and enter Marks "<MARKS1>" "<MARKS2>" for first question
#And click on Save Changes button
#And Enter second question "<QUESTION2>" and marks "<QMARKS2>" 
#And Enter the answer "<ANSWER3>" "<ANSWER4>"  and enter Marks "<MARKS3>" "<MARKS4>" for second question
#And click on Save Changes button
#And Enter thrid question "<QUESTION3>" and marks "<QMARKS3>" 
#And Enter the answer "<ANSWER5>" "<ANSWER6>" and enter Marks "<MARKS5>" "<MARKS6>"  for thrid question
#And click on Save Changes button
#And Enter the cutoff & rejection percentage "<cuttoffpercentage>" "<rejectionpercentage>"
#And click on submit
#And Click on Questionnaire tab
#And click on delete icon to delete any one of question
#And click on submit
#And Click on Questionnaire tab
#And Click on Delete Questionnarie button
#And click on ReloadCandidate button
#Then Collect Answer icon should reflect on candidates card for giving answers 
#
#
#Examples: 
#
#| CandidateEmail | Name  | ContactNumber | Designation | Gender | NoticePeriod | Location | Communicationmode | QUESTION1     | QMARKS1 | ANSWER1 | ANSWER2 | MARKS1 | MARKS2 | QUESTION2    | QMARKS2 | ANSWER3 | ANSWER4 | MARKS3 | MARKS4 |QUESTION3  | QMARKS3 | ANSWER5 | ANSWER6     | MARKS5 | MARKS6 | cuttoffpercentage | rejectionpercentage |
#|rahul@gmail.com | Rahul |   918635241   | Tester      | Male   | 60           | Pune     | Call              | NP Negotiable |  50     |  Yes    |   No    |  30    |  20    |Can Relocate? | 50      |  Yes    |  No     |  50    |   0    | Work Exp  |  100    | Fresher | Experienced | 50     |  50    |   80              |      20             |
#
#
#
#
#
#
#
#And Click on  Collect Answers icon on candidate card
#And answer the question by selecting the provided options 
#And verify if the answer is correct it should display pass icon on candidate card or it should display fail icon if the asnswer is wrong with the candidate card in screened column
#And click on logout tab
#And click on Job Seeker(Candidate) Sign In link
#And login as the same candidate "<CandidateEmail>" "<Password>" and click on Sign in 
#And verify on candidate dashboard that job is displayed with Questionnaire tab or not
#Then click on that Questionnaire tab and verify the answers given by employer
