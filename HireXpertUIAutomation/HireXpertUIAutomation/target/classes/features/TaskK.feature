Feature: Task Feature

@TC264_266 @BVT @task
Scenario: Verify functionality of adding general task and particular task from Employer login

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And Employer enters valid credentials
Given team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Select a job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to dashboard
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|genral task        |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And the task should display for employer
And Logout from App
And Click on Employer-Agency Signin link
And Login with employer team
And Task should also display for employer team member
And Logout from App
And Click on Employer-Agency Signin link
And Employer enters valid credentials
And Go to workbench
And Select a job
And Click on Add task button and enter all details employer
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|particular task    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Go to dashboard
And the task should display for employer
And Logout from App
And Click on Employer-Agency Signin link
And Login with employer team
Then Task should also display for employer team member


@TC265_267 @BVT @task
Scenario: Verify agency can add general task and particular task.

Given User must be registered

When title of login page is Home
And Click on Employer-Agency Signin link
And agency enters valid credentials
Given team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Select a job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to dashboard
And Click on Add task button and enter all details for agency
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|particular task    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
Then the task should display for agency
And Logout from App
And Click on Employer-Agency Signin link
And Login with agency team
Then Task should also display for agency team member 
And Logout from App
And Click on Employer-Agency Signin link
And agency enters valid credentials
And Go to workbench
And Select a job 
And Click on Add task button and enter all details for agency
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|particular task    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com         |
And Go to dashboard
Then the task should display for agency
And Logout from App
And Click on Employer-Agency Signin link
And Login with agency team
Then Task should also display for agency team member 



@TC275 @BVT @task
Scenario: Verify only creator of the general task can delete that general task

Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And user enters valid credentials
Given team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Select a job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to dashboard
And Click on Add task button and enter all details
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|Genral task      |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |Genral task      |pagy         |pa1         |Task should complete before time    |pagy   		    |pe1       |pe1@gmail.com        |
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And Click on Delete task
And observe the message
And Logout from App
And Click on Employer-Agency Signin link
And login as agency/employer
Then Delete the task

@TC282 @BVT @task
Scenario: Verify only creator of the particular task can delete the task

Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And user enters valid credentials
And team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Select a job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to workbench
And Select a job 
And Click on Add task button and enter all details 
|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|particular task    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
And Logout from App
And Click on Employer-Agency Signin link
And Login with team member
And Click on Delete task
And Logout from App
And Click on Employer-Agency Signin link
And user enters valid credentials
Then Delete the task




@TC302 @BVT @task
Scenario: verify the functionality of edit for general tasks

Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And user enters valid credentials
And team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Select a job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to dashboard
And Click on Add task button and enter all details
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|Genral task      |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |Genral task      |pagy         |pa1         |Task should complete before time    |pagy   		    |pe1       |pe1@gmail.com        |

And edit the task 
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task1            |pemp      |pe1      |complete before 1 pm             |pemp    		    |pe1       |pe1@gmail.com        |task1            |pagy         |pa1         |complete before 1 pm                |pagy   		    |pe1       |pe1@gmail.com        |

Then verify all the edited details 
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task1            |pemp      |pe1      |complete before 1 pm             |pemp    		    |pe1       |pe1@gmail.com        |task1            |pagy         |pa1         |complete before 1 pm                |pagy   		    |pe1       |pe1@gmail.com        |





@TC305 @BVT @task
Scenario: verify the functionality of edit for particular tasks

Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And user enters valid credentials
And team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Select a job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to workbench
And Select a job 
And Click on Add task button and enter all details
|Title for emp      |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|particular task    |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |Genral task      |pagy         |pa1         |Task should complete before time    |pagy   		    |pe1       |pe1@gmail.com        |
And Go to dashboard
And edit the task 
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task2            |pemp      |pe1      |complete before 1 pm             |pemp    		    |pe1       |pe1@gmail.com        |task1            |pagy         |pa1         |complete before 1 pm                |pagy   		    |pe1       |pe1@gmail.com        |

Then verify all the edited details 
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task2            |pemp      |pe1      |complete before 1 pm             |pemp    		    |pe1       |pe1@gmail.com        |task1            |pagy         |pa1         |complete before 1 pm                |pagy   		    |pe1       |pe1@gmail.com        |
Then verify all the edited details 
|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|task2            |pemp      |pe1      |complete before 1 pm             |pemp    		    |pe1       |pe1@gmail.com        |task1            |pagy         |pa1         |complete before 1 pm                |pagy   		    |pe1       |pe1@gmail.com        |


@TC294 @BVT @task
Scenario: to verify refresh button functionality
Given User must be registered
When title of login page is Home
And Click on Employer-Agency Signin link
And user enters valid credentials
And team member should be added
|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
And Go to workbench
And Select a job
And Share job with team member
|EmpTeam|Agyteam|
|pe1    |pa1    |
And Go to dashboard
And Click on Add task button and enter all details

|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
|Genral task      |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |Genral task      |pagy         |pa1         |Task should complete before time    |pagy   		    |pe1       |pe1@gmail.com        |
|task1            |pemp      |pemp     |note1                            |pemp    		    |pe1       |pe1@gmail.com        |task             |pagy         |pagy        |Task                                |pagy   		    |pe1       |pe1@gmail.com        |

And Click on My Task
Then Click on Reload Task button
And Click on Team Task
Then Click on Reload Task button


#regression task

#@TC269_271
#Scenario: to verify Mark inprogress task functionality from employer employers team login
#Given User should be registered
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And Click on Add task button and enter all details employer
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task4              |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And the task should display for employer
#And Task should also display for employer team member
#And Click on mark in progress
#And Logout as emp/agency
#And Employer enters valid credentials
#And Go to dashboard
#And the task should display for employer
#And Logout as emp/agency
#And Employer enters valid credentials
#And Click on Add task button and enter all details employer
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task5              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And the task should display for employer
#And Click on mark in progress
#And Logout as emp/agency
#And Login with team member
#And Task should also display for employer team member
#
#@TC273
#Scenario: to verify Mark Completed task functionality from employer and employers team login
#Given User should be registered
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And Click on Add task button and enter all details employer
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task4              |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And the task should display for employer
#And Task should also display for employer team member
#And Click on Mark Complete
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And the task should not display on employer side 
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And Click on Add task button and enter all details employer
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task5              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And the task should display for employer
#And Task should also display for employer team member
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And the task should display for employer
#And Click on Mark Complete
#And Logout from App
#And Click on Employer-Agency Signin link
#And login as employer team
#And the task should not display on employer side
#
#
#@TC_270_272
#Scenario: Verify general task status changed on Agency side if task assignee put task in (in-progress) 
#Given User must be registered as agency profile
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And Click on Add task button and enter all details for agency
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task4              |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And the task should display for agency
#And Logout from App
#And Click on Employer-Agency Signin link
#And Login with agency team
#And Task should also display for agency team member
#And Click on mark in progress
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And the task should display for agency
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And Click on Add task button and enter all details for agency
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task5              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And the task should display for agency
#And Click on mark in progress
#And Logout from App
#And Click on Employer-Agency Signin link
#And Login with agency team
#And Task should also display for agency team member
#
#@TC274
#Scenario: verify general task is removed from Agency and team member dashboard if task mark as done
#Given User should be registered
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And Click on Add task button and enter all details for agency
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task6             |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And the task should display for agency
#And Logout from App
#And Click on Employer-Agency Signin link
#And Login with agency team
#And Task should also display for agency team member
#And Click on Mark Complete
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And the task should not display on agency side 
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And Click on Add task button and enter all details for agency
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task7              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And the task should display for agency
#And Task should also display for employer team member
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And the task should display for agency
#And Click on Mark Complete
#And Logout from App
#And Click on Employer-Agency Signin link
#And Login with agency team
#And the task should not display on agency side
#
#
#@TC276_278
#Scenario: Verify particular job task status changed in employer if task assignee put task in (in-progress)
#Given User should be registered
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And Go to workbench
#And Select a job 
#And Click on Add task button and enter all details employer
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task4              |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And the task should display for employer
#And Logout from App
#And Click on Employer-Agency Signin link
#And Login with employer team
#And Task should also display for employer team member
#And Click on mark in progress
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And Go to dashboard
#And the task should display for employer
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And Go to workbench
#And Select a job 
#And Click on Add task button and enter all details employer
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task5              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And the task should display for employer
#And Click on mark in progress
#And Logout from App
#And Click on Employer-Agency Signin link
#And login as employer team
#And Task should also display for employer team member
#
#
#@TC280
#Scenario: verify particular job task removed from employer and team member dashboard if task mark as done
#Given User should be registered
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And Go to workbench
#And Select a job 
#And Click on Add task button and enter all details employer
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task4              |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And the task should display for employer
#And Logout from App
#And Click on Employer-Agency Signin link
#And login as employer team
#And Task should also display for employer team member
#And Click on Mark Complete
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And the task should not display on employer side
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And Go to workbench
#And Select a job 
#And Click on Add task button and enter all details employer
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task5              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And the task should display for employer
#And Logout from App
#And Click on Employer-Agency Signin link
#And login as employer team
#And Task should also display for employer team member
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And the task should display for employer
#And Click on Mark Complete
#And Logout from App
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And the task should not display on employer side
#
#
#
#@TC277_279 
#Scenario: Verify particular job task status changed in Agency if task assignee put task in (in-progress)
#Given User must be registered as agency profile
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And Go to workbench
#And Select a job 
#And Click on Add task button and enter all details for agency
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task4              |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And Go to dashboard
#And the task should display for agency
#And Logout from App
#And Click on Employer-Agency Signin link
#And Login with agency team
#And Task should also display for agency team member
#And Click on mark in progress
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And the task should display for agency
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And Go to workbench
#And Select a job 
#And Click on Add task button and enter all details for agency
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task5              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And Go to dashboard
#And the task should display for agency
#And Click on mark in progress
#And Logout from App
#And Click on Employer-Agency Signin link
#And Login with agency team
#And Task should also display for agency team member
#
#@TC281
#Scenario: verify general task is removed from Agency and team member dashboard if task mark as done
#Given User should be registered
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And Go to workbench
#And Select a job 
#And Click on Add task button and enter all details for agency
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task8              |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And Go to dashboard
#And the task should display for agency
#And Logout from App
#And Click on Employer-Agency Signin link
#And Login with agency team
#And Task should also display for agency team member
#And Click on Mark Complete
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And the task should not display on agency side 
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And Go to workbench
#And Select a job 
#And Click on Add task button and enter all details for agency
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task9              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |task9            |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And Go to dashboard
#And the task should display for agency
#And Task should also display for employer team member
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And the task should display for agency
#And Click on Mark Complete
#And Logout from App
#And Click on Employer-Agency Signin link
#And Login with agency team
#And the task should not display on agency side
#
#
#@TC330
#Scenario: To verify third team member can make task in progress or in completed status
#Given User should be registered
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And team member should be added
#|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
#|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
#|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
#And Click on Add task button and enter all details employer
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task11             |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And the task should display for employer
#And Logout from App
#And Click on Employer-Agency Signin link
#And login as employer team
#And Task should also display for employer team member
#And Logout from App
#And Click on Employer-Agency Signin link
#And login as third employer team
#And Task should also display for employer team member
#And Click on mark in progress
#And third user should not able to put task in progress
#
#@TC330A
#Scenario: To verify third team member can make task in progress or in completed status
#Given User should be registered
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And team member should be added
#|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
#|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
#|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
#And Click on Add task button and enter all details for agency
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task11             |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And the task should display for agency
#And Logout from App
#And Click on Employer-Agency Signin link
#And Login with agency team
#And Task should also display for agency team member
#And Logout from App
#And Click on Employer-Agency Signin link
#And login as third agency team
#And Task should also display for agency team member
#And Click on mark in progress
#Then third user should not able to put task in progress
#
#
#@TC306
#Scenario: verify the functionality of edit for general task assign to team member
#Given User should be registered
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And team member should be added
#|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
#|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
#|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
#And Click on Add task button and enter all details employer
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task10             |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And the task should display for employer
#And Logout from App
#And Click on Employer-Agency Signin link
#And login as employer team
#And Task should also display for employer team member
#And Click on edit task
#And verify All previously added details of task
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task11             |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And edit the task 
#|Title for emp    |teamField |AssignTo |note                  |employer    |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |
#|task2            |pemp      |pe1      |complete before 1 pm  |pemp    	   |pe1       |pe1@gmail.com        |task1            |pagy         |pa1         |complete before 1 pm                |pagy   		     |pe1       |
#And Click on edit task
#Then verify all the edited details 
#|Title for emp    |teamField |AssignTo |note                             |employer          |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task1            |pemp      |pe1      |complete before 1 pm             |pemp    		    |pe1       |pe1@gmail.com        |task1            |pagy         |pa1         |complete before 1 pm                |pagy   		    |pe1       |pe1@gmail.com        |
#
#@TC336_350
#Scenario: Verify task added for agency owner by team member display in teamtask when owner mark in progres
#Given User should be registered
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And team member should be added
#|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
#|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
#|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
#And Logout from App
#And Click on Employer-Agency Signin link
#And Login with agency team
#And Click on Add task button and enter all details for agency
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task11             |pemp      |pe1      |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |particular task  |pagy         |pa1         |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And Task should also display for agency team member
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And the task should display for agency
#And Click on mark in progress
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And the task should display for agency
#And Logout from App
#And Click on Employer-Agency Signin link
#And Login with agency team
#And Go to workbench
#And Select a job 
#And Click on Add task button and enter all details for agency
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task9              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |task9            |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And Go to dashboard
#And Task should also display for agency team member
#And Logout from App
#And Click on Employer-Agency Signin link
#And agency enters valid credentials
#And the task should display for agency
#And Click on mark in progress
#And Logout from App
#And Click on Employer-Agency Signin link
#And Login with agency team
#And Task should also display for agency team member
#
#
#@TC_300
#Scenario: Verify task added for agency owner by team member display in teamtask when owner mark in progres
#Given User should be registered
#When title of login page is Home
#And Click on Employer-Agency Signin link
#And Employer enters valid credentials
#And team member should be added
#|Name|         Email   | contact  |Nameagy  |         Emailagy  | contactagy  |team  |agyteam |
#|pe1 | pe1@gmail.com   | 1234564  |pa1      |pa1@gmail.com		|1234556      |pe1   |pa1     |
#|pe2 | pe2@gmail.com   | 1234564  |pa2      |pa2@gmail.com		|1234566      |pe1   |pa1	  |
#And Go to workbench
#And Select a job 
#And Share job with team member
#|Team|Agyteam|
#|pe1 |pa1    |
##|pe2 |pa2   |
#And Click on Add task button and enter all details employer
#|Title for emp      |teamField |AssignTo |note                             |employer            |team      |teamid               |Title for agy    |agyteamField |agyAssignTo |agynote                             |agency           |agyteam   |agyteamid            |
#|task9              |pemp      |pemp     |Task should complete before time |pemp    		    |pe1       |pe1@gmail.com        |task9            |pagy         |pagy        |Task should complete before time    |pagy   		    |pa1       |pe1@gmail.com        |
#And verify the options present in teamfeild
#
