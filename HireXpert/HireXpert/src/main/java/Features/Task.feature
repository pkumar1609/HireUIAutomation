Feature: Task Feature

@TC264_266
Scenario: Verify functionality of adding general task and particular task from Employer login

Given User must be registered as Employer profile 

When title of login page is Home
And Employer enters valid credentials 
And Go to dashboard
And In task section click on add task (+) icon
And In add task popup, Fill all the mandatory details 
|Title            |Note            |
|genral Task1     |gen Tast Note   |
And Click on submit
And the task should display for both employer
And Task should also display for team member
And Go to workbench
And Select a job and click on add task button
And In add task popup, Fill all the mandatory details and assign to Himeself
|Title            |Note        |
|particular task  |Task Note   |
And Click on submit 
Then the task added should display on employer 
Then the task should also display on team member login


@TC265_267
Scenario: Verify agency can add general task and particular task.

Given User must be registered as agency profile 

When title of login page is Home
And agency enters valid credentials 
And Go to dashboard
And In task section click on add task (+) icon
And In add task popup, Fill all the mandatory details 
|Title            |Note            |
|genral Task1     |gen Tast Note   |
And Click on submit
Then the task should display for both agency
Then Task should also display for team member
And Go to workbench
And Select a job and click on add task button
And In add task popup, Fill all the mandatory details and assign to Himeself
|Title            |Note        |
|particular task  |Task Note   |
And Click on submit 
Then the task added should display on agency 
Then the task should also display on team member login

