Feature: HireXpert Screening tab feature

@BVT
Scenario Outline: Verify the functionality of Screening tab 

Given Open browser
When click on Employer-Agency SignIn link
And login with Employer credential
And Go to Workbench 
And Add a new Job as employer "<Title>" "<Designation>" "<Industry>" "<JobRole>" "<Location>" "<Budget>" "<MinExp>" "<MaxExp>" "<NoOfInterviews>"
And Select the same job from job drop down
And Click on Add Candidate button.
And Enter valid "<CandidateEmail>" 
And click on find button 
And fill all the information "<Name>" "<ContactNumber>" "<Designation>" "<Gender>" "<NoticePeriod>" "<Location>" "<Communicationmode>"
And Click on save button 
And Verify candidate is displayed on workbench
And Click on Add Questionnaire 
And Add question and click on save changes button "<QUESTION1>" "<QMARKS1>" "<ANSWER1>" "<ANSWER2>" "<MARKS1>" "<MARKS2>" 
And Enter the cutoff & rejection percentage "<cuttoffpercentage>" "<rejectionpercentage>"
And Click on submit
And Click on  Collect Answers icon on candidate card.
And Fill all the Questions answers 
And Click on submit
And Click on screening tab
Then verify the status of candidate 
And click on close button
And click on close job button and delete the job

Examples:

| Title    | Designation   | Industry    | JobRole  | Location    | Budget | MinExp | MaxExp | NoOfInterviews |    CandidateEmail       |  Name   |   ContactNumber  |   Designation     | Gender | NoticePeriod | Location    |  Communicationmode | QUESTION1     | QMARKS1  | ANSWER1 | ANSWER2 | MARKS1  | MARKS2 | cuttoffpercentage | rejectionpercentage |
| Engineer | Test Engineer | IT-Software | Engineer | Viman Nagar | 500000 | 2      | 3      | 3              | candidate02@gmail.com   | Can02   |   912349699666   |   Software Tester | Male   |      30      | pune        |        SMS         | NP Negotiable |  100     |  Yes    |   No    |  100    |  0     |   80              |      20             |

# 125 





# If DB clear, register the employer first = employermain01@gmail.com. otherwise no change required